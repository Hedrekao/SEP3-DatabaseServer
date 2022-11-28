package via.sep3.databaseserver.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.stereotype.Service;
import via.sep3.databaseserver.model.Driver;
import via.sep3.databaseserver.model.Location;
import via.sep3.databaseserver.model.Reservation;
import via.sep3.databaseserver.model.Ride;


import via.sep3.databaseserver.protobuff.*;
import via.sep3.databaseserver.repository.ReservationRepository;
import via.sep3.databaseserver.repository.RideRepository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@GRpcService
public class RidesServiceGrpcImpl extends RidesGrpc.RidesImplBase
{

    private RideRepository rideRepository;
    private ReservationRepository reservationRepository;

    public RidesServiceGrpcImpl(RideRepository repository, ReservationRepository reservationRepository)
    {
        rideRepository = repository;
        this.reservationRepository = reservationRepository;
    }


    @Override
    public void getRides(EpochTimelineMessage request, StreamObserver<RidesCollection> responseObserver)
    {
//        List<Ride> rides = rideRepository.findAllByStartTimeIsBetween(request.getEpochLowerBound(), request.getEpochUpperBound());
//    for future update!!
        Iterable<Ride> iterable = rideRepository.findAll();
        List<RidesCollection.RideMessage> rides = new ArrayList<>();
        for (Ride ride : iterable)
        {
            Location destination = ride.getDestination();
            Location startLocation = ride.getStartLocation();
            Driver driver = ride.getDriver();
            DriverMessage driverMessage = DriverMessage.newBuilder().setId(driver.getId()).setName(driver.getName()).setPhone(driver.getPhone()).build();
            LocationMessage startLocationMessage = LocationMessage.newBuilder().
                    setCity(startLocation.getCity()).
                    setCountry(startLocation.getCountry()).
                    setCoordinateX(startLocation.getCoordinateX()).
                    setCoordinateY(startLocation.getCoordinateY()).
                    setStreet(startLocation.getStreetName()).
                    setZipcode(startLocation.getZipCode()).build();
            LocationMessage destinationMessage = LocationMessage.newBuilder().
                    setCity(destination.getCity()).
                    setCountry(destination.getCountry()).
                    setCoordinateX(destination.getCoordinateX()).
                    setCoordinateY(destination.getCoordinateY()).
                    setStreet(destination.getStreetName()).
                    setZipcode(destination.getZipCode()).build();


            RidesCollection.RideMessage rideMessage = RidesCollection.RideMessage.newBuilder().
                    setStartTime(ride.getStartTime()).
                    setDriver(driverMessage).
                    setEndLocation(destinationMessage).
                    setStartLocation(startLocationMessage).setId(ride.getId()).
                    build();
            rides.add(rideMessage);
        }
        RidesCollection ridesCollection = RidesCollection.newBuilder().addAllRides(rides).build();
        responseObserver.onNext(ridesCollection);
        responseObserver.onCompleted();
    }

    @Override
    public void joinRide(JoinRideDto request, StreamObserver<ConfirmationMessage> responseObserver)
    {
        try
        {
            int rideId = request.getRideId();
            String passengerName = request.getPassengerName();
            String passengerPhone = request.getPassengerPhone();
            Optional<Ride> rideOptional = rideRepository.findById(rideId);
            if (rideOptional.isPresent())
            {
                Ride ride = rideOptional.get();
                Reservation reservation = new Reservation(ride, passengerName, passengerPhone);
                reservationRepository.save(reservation);
                ConfirmationMessage confirmation = ConfirmationMessage.newBuilder().setConfirmationMessage("Reservation was saved into database").build();
                responseObserver.onNext(confirmation);
                responseObserver.onCompleted();
            } else
            {
                throw new Exception("There is no ride with such id");
            }


        } catch (Exception e)
        {
            ConfirmationMessage confirmation = ConfirmationMessage.newBuilder().setConfirmationMessage(e.getMessage()).build();
            responseObserver.onNext(confirmation);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void createRide(CreateRideMessage createRideMessage, StreamObserver<RideMessage> rideMessage)
    {
        try
        {
            LocationMessage startLocation = createRideMessage.getStartLocation();
            LocationMessage destination = createRideMessage.getDestination();
            long startDate = createRideMessage.getStartDate();
            String driver = createRideMessage.getDriver();
            int capacity = createRideMessage.getCapacity();

            Location startLocationTemp = new Location(startLocation.getCountry(), startLocation.getCity(), startLocation.getStreet(), startLocation.getZipcode(),
                    startLocation.getCoordinateX(), startLocation.getCoordinateY());
            Location destinationTemp = new Location(destination.getCountry(), destination.getCity(), destination.getStreet(), destination.getZipcode(),
                    destination.getCoordinateX(), destination.getCoordinateY());
            //TODO @Hederkao fix it pls
            Driver driverTemp = new Driver(driver, "69420", null);

            Ride ride = new Ride(startLocationTemp, destinationTemp, startDate, 0, driverTemp);
            rideRepository.save(ride);

            Location destination1 = ride.getDestination();
            Location startLocation1 = ride.getStartLocation();
            Driver driver1 = ride.getDriver();
            LocationMessage startLocationMessage = LocationMessage.newBuilder().
                    setCity(startLocation1.getCity()).
                    setCountry(startLocation1.getCountry()).
                    setCoordinateX(startLocation1.getCoordinateX()).
                    setCoordinateY(startLocation1.getCoordinateY()).
                    setStreet(startLocation1.getStreetName()).
                    setZipcode(startLocation1.getZipCode()).build();
            LocationMessage destinationMessage = LocationMessage.newBuilder().
                    setCity(destination1.getCity()).
                    setCountry(destination1.getCountry()).
                    setCoordinateX(destination1.getCoordinateX()).
                    setCoordinateY(destination1.getCoordinateY()).
                    setStreet(destination1.getStreetName()).
                    setZipcode(destination1.getZipCode()).build();



            RideMessage rideMessage1 = RideMessage.newBuilder().
                    setStartDate(ride.getStartTime()).
                    setDriver(ride.getDriver().getName()).
                    setDestination(destinationMessage).
                    setStartLocation(startLocationMessage).setId(ride.getId()).
                    build();
            rideMessage.onNext(rideMessage1);
            rideMessage.onCompleted();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
