package via.sep3.databaseserver.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sep3.databaseserver.model.Reservation;
import via.sep3.databaseserver.model.Ride;
import via.sep3.databaseserver.protobuff.*;
import via.sep3.databaseserver.repository.ReservationRepository;
import via.sep3.databaseserver.repository.RideRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@GRpcService()
public class ReservationsServiceImpl extends ReservationsGrpc.ReservationsImplBase {

    private ReservationRepository reservationRepository;
    private  RideRepository rideRepository;

    public ReservationsServiceImpl(ReservationRepository reservationRepository, RideRepository rideRepository)
    {
        this.reservationRepository = reservationRepository;
        this.rideRepository = rideRepository;
    }

    @Override
    public void getAllReservationsToAccept(IdMessage request, StreamObserver<ReservationsToAcceptCollection> responseObserver) {
        List<Reservation> reservations = reservationRepository.findAllByAcceptedIsNull();
        List<ReservationMessage> list = new ArrayList<>();
        for(Reservation reservation : reservations)
        {
            if(reservation.getRide().getDriver().getId() == request.getId())
            {
                ReservationMessage reservationMessage = createReservationMessage(reservation);
                list.add(reservationMessage);
            }

        }

        ReservationsToAcceptCollection collection = ReservationsToAcceptCollection.newBuilder().addAllReservationMessages(list).build();

        responseObserver.onNext(collection);
        responseObserver.onCompleted();
    }

    @Override
    public void acceptPassenger(AcceptMessage request, StreamObserver<ReservationMessage> responseObserver) {

        int id = request.getReservationId();
        Reservation reservation = reservationRepository.findById(id).get();

        reservation.setAccepted(request.getDidAccept());
        reservation.setStatus(request.getDidAccept() ? "Accepted" : "Rejected");
        reservationRepository.save(reservation);

        Ride ride = rideRepository.findById(reservation.getRide().getId()).get();
        ride.setCapacity(ride.getCapacity()-1);
        rideRepository.save(ride);
        ReservationMessage reservationMessage = createReservationMessage(reservation);
        responseObserver.onNext(reservationMessage);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllReservationsByUserId(IdMessage request, StreamObserver<ReservationsToAcceptCollection> responseObserver) {
        List<Reservation> reservations = reservationRepository.findAllByUserId(request.getId());
        List<ReservationMessage> list = new ArrayList<>();
        for(Reservation reservation : reservations)
        {

                ReservationMessage reservationMessage = createReservationMessage(reservation);
                list.add(reservationMessage);

        }

        ReservationsToAcceptCollection collection = ReservationsToAcceptCollection.newBuilder().addAllReservationMessages(list).build();

        responseObserver.onNext(collection);
        responseObserver.onCompleted();
    }

    @Override
    public void changeReservationStatus(ChangeReservStatusMessage request, StreamObserver<BoolValue> responseObserver) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(request.getId());

        if(optionalReservation.isPresent())
        {
            try {
                Reservation reservation = optionalReservation.get();
                reservation.setStatus(request.getStatus());
                reservation.setAccepted(null);
                Ride ride = rideRepository.findById(reservation.getRide().getId()).get();
                reservationRepository.save(reservation);
                ride.setCapacity(ride.getCapacity() + 1);
                rideRepository.save(ride);
                BoolValue boolValue = BoolValue.newBuilder().setValue(true).build();
                responseObserver.onNext(boolValue);
                responseObserver.onCompleted();
            }
            catch (Exception e)
            {
                BoolValue boolValue = BoolValue.newBuilder().setValue(false).build();
                responseObserver.onNext(boolValue);
                responseObserver.onCompleted();
            }
        }
        else
        {
            BoolValue boolValue = BoolValue.newBuilder().setValue(false).build();
            responseObserver.onNext(boolValue);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getAcceptedReservationsByRideId(IdMessage request, StreamObserver<ReservationsToAcceptCollection> responseObserver) {
        try {
            List<Reservation> iterable = reservationRepository.findAllByIsAcceptedTrueAndRideId(request.getId());

            List<ReservationMessage> reservations = new ArrayList<>();
            for (Reservation reservation : iterable)
            {
                ReservationMessage reservationMessage = createReservationMessage(reservation);
                reservations.add(reservationMessage);
            }
            ReservationsToAcceptCollection collection = ReservationsToAcceptCollection.newBuilder().addAllReservationMessages(reservations).build();
            responseObserver.onNext(collection);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }    }

    private ReservationMessage createReservationMessage(Reservation reservation)
    {
        ReservationMessage message;
        if(reservation.isAccepted() != null)
        {

             message = ReservationMessage.newBuilder().setName(reservation.getUser().getName())
                    .setPhone(Integer.toString(reservation.getUser().getPhone()))
                    .setDidAccept(BoolValue.newBuilder().setValue(reservation.isAccepted()).build())
                    .setRideId(reservation.getRide().getId()).
                     setId(reservation.getId()).setStatus(reservation.getStatus()).build();

        }
        else
        {

             message = ReservationMessage.newBuilder().setName(reservation.getUser().getName())
                     .setPhone(Integer.toString(reservation.getUser().getPhone()))
                    .setRideId(reservation.getRide().getId()).setId(reservation.getId()).setStatus(reservation.getStatus()).build();
        }


        return message;
    }
}
