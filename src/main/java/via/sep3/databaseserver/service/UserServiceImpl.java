package via.sep3.databaseserver.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
<<<<<<< HEAD
import via.sep3.databaseserver.model.User;
=======
import via.sep3.databaseserver.model.Driver;
import via.sep3.databaseserver.model.Reservation;
>>>>>>> 3380355895f89e37f68f33331609ad4a3a72448d
import via.sep3.databaseserver.protobuff.*;
import via.sep3.databaseserver.repository.UserRepository;

import java.util.ArrayList;
import java.util.Optional;

@GRpcService
public class UserServiceImpl extends UserGrpc.UserImplBase {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }


    @Override
    public void createAccount(CreateAccountMessage request,  StreamObserver<UserMessage> userMessage){
        try{
            User user = new User(
                    request.getName(),
                   request.getPhoneNumber(),
                    new ArrayList<>(),
                    request.getLicenseNo(),
                    request.getEmail(),
                    request.getPassword()
            );
            userRepository.save(user);
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
            Optional<User> optionalDriver = userRepository.findByEmailAndPassword(request.getEmail(), request.getPassword());
            if(optionalDriver.isPresent()){
                User user = optionalDriver.get();
                BoolMessage boolMessage1 = via.sep3.databaseserver.protobuff.BoolMessage.newBuilder().setDriverId(user.getId()).setStatus(true).build();
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
            Optional<User> optionalDriver = userRepository.findById(request.getDriverId());
            if(optionalDriver.isPresent()){
                User user = optionalDriver.get();
                UserMessage userMessage1 = via.sep3.databaseserver.protobuff.UserMessage.newBuilder()
                        .setName(user.getName())
                        .setPhoneNumber(user.getPhone())
                        .setEmail(user.getEmail())
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
