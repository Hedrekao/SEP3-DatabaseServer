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

@GRpcService
public class ReservationsServiceImpl extends ReservationsGrpc.ReservationsImplBase {

    private ReservationRepository reservationRepository;
    private  RideRepository rideRepository;

    public ReservationsServiceImpl(ReservationRepository reservationRepository, RideRepository rideRepository)
    {
        this.reservationRepository = reservationRepository;
        this.rideRepository = rideRepository;
    }

    @Override
    public void getAllReservationsToAccept(NullMessage request, StreamObserver<ReservationsToAcceptCollection> responseObserver) {
        List<Reservation> reservations = reservationRepository.findAllByAcceptedIsNull();
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
    public void acceptPassenger(AcceptMessage request, StreamObserver<ReservationMessage> responseObserver) {

        int id = request.getReservationId();
        Reservation reservation = reservationRepository.findById(id).get();

        reservation.setAccepted(request.getDidAccept());
        reservationRepository.save(reservation);

        Ride ride = rideRepository.findById(reservation.getRide().getId()).get();
        ride.setCapacity(ride.getCapacity()-1);
        rideRepository.save(ride);
        ReservationMessage reservationMessage = createReservationMessage(reservation);
        responseObserver.onNext(reservationMessage);
        responseObserver.onCompleted();
    }

    private ReservationMessage createReservationMessage(Reservation reservation)
    {
        ReservationMessage message;
        if(reservation.isAccepted() != null)
        {

             message = ReservationMessage.newBuilder().setName(reservation.getPassengerName())
                    .setPhone(reservation.getPassengerPhone())
                    .setDidAccept(BoolValue.newBuilder().setValue(reservation.isAccepted()).build())
                    .setRideId(reservation.getRide().getId()).
                     setId(reservation.getId()).build();

        }
        else
        {

             message = ReservationMessage.newBuilder().setName(reservation.getPassengerName())
                    .setPhone(reservation.getPassengerPhone())
                    .setRideId(reservation.getRide().getId()).setId(reservation.getId()).build();
        }


        return message;
    }
}
