package via.sep3.databaseserver.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sep3.databaseserver.model.Driver;
import via.sep3.databaseserver.model.Reservation;
import via.sep3.databaseserver.protobuff.*;
import via.sep3.databaseserver.repository.DriverRepository;
import via.sep3.databaseserver.repository.ReservationRepository;
import via.sep3.databaseserver.repository.RideRepository;

import java.util.ArrayList;
import java.util.Optional;

@GRpcService
public class UserServiceImpl extends UserGrpc.UserImplBase {

    private DriverRepository driverRepository;

    public UserServiceImpl(DriverRepository driverRepository)
    {
        this.driverRepository = driverRepository;
    }


    @Override
    public void createAccount(CreateAccountMessage request,  StreamObserver<UserMessage> userMessage){
        try{
            Driver driver = new Driver(
                    request.getName(),
                   request.getPhoneNumber(),
                    new ArrayList<>(),
                    //this line might throw an exception when creating a user without licenseNo
                    //we probably need to wrap driver object creation in if statement,
                    // check if it's null and use different constructors a'ight? tried to do that but couldn't check if licenseNo == null
                    request.getLicenseNo(),
                    request.getEmail(),
                    request.getPassword()
            );
            driverRepository.save(driver);
            UserMessage userMessage1 = UserMessage.newBuilder()
                    .setName(request.getName())
                    .setPhoneNumber(request.getPhoneNumber())
                    .setEmail(request.getEmail())
                    .build();
            userMessage.onNext(userMessage1);
            userMessage.onCompleted();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void login(LoginMessage request, StreamObserver<BoolMessage> boolMessage) {
        try{
            Optional<Driver> optionalDriver = driverRepository.findByEmailAndPassword(request.getEmail(), request.getPassword());
            if(optionalDriver.isPresent()){
                Driver driver = optionalDriver.get();
                BoolMessage boolMessage1 = via.sep3.databaseserver.protobuff.BoolMessage.newBuilder().setDriverId(driver.getId()).setStatus(true).build();
                boolMessage.onNext(boolMessage1);
                boolMessage.onCompleted();
            }
            else {
                BoolMessage boolMessage1 = via.sep3.databaseserver.protobuff.BoolMessage.newBuilder().setStatus(false).setDriverId(-1).build();

                //I'm not setting the driver id in that case idk if correct tomasz check pls
                boolMessage.onNext(boolMessage1);
                boolMessage.onCompleted();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getDriver(DriverMessageId request, StreamObserver<UserMessage> userMessage) {
        try{
            Optional<Driver> optionalDriver = driverRepository.findById(request.getDriverId());
            if(optionalDriver.isPresent()){
                Driver driver = optionalDriver.get();
                UserMessage userMessage1 = via.sep3.databaseserver.protobuff.UserMessage.newBuilder()
                        .setName(driver.getName())
                        .setPhoneNumber(driver.getPhone())
                        .setEmail(driver.getEmail())
                        .build();
                userMessage.onNext(userMessage1);
                userMessage.onCompleted();
            }
            else{
                throw new Exception("There is no driver with such id");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateLicense(LicenseMessage request, StreamObserver<StatusMessage> responseObserver) {
        Driver driver = driverRepository.findById(request.getDriverId()).get();
        if(driver != null){
            driver.setLicenseNo(request.getLicenseNo());
            driverRepository.save(driver);

            StatusMessage statusMessage1 = StatusMessage.newBuilder().setStatus(true).build();
            responseObserver.onNext(statusMessage1);
            responseObserver.onCompleted();
        }
        else{
            StatusMessage statusMessage1 = StatusMessage.newBuilder().setStatus(false).build();
            responseObserver.onNext(statusMessage1);
            responseObserver.onCompleted();
        }
    }
}
