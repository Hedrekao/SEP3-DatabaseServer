package via.sep3.databaseserver.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import via.sep3.databaseserver.model.Driver;
import via.sep3.databaseserver.model.Location;
import via.sep3.databaseserver.model.Ride;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {

    @Query("select d from Driver d where d.name = ?1")
    Optional<Driver> findByName(String name);

    //kuba's mocks please change tom
    Optional<Driver> saveAccount(Driver driver);
    Optional<Driver> findByEmailPassword(String email, String password);

    Optional<Driver> findDriverById(int id);




}
