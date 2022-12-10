package via.sep3.databaseserver.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import via.sep3.databaseserver.model.Location;
import via.sep3.databaseserver.model.Ride;

import java.util.List;
import java.util.Optional;

@Repository
public interface RideRepository extends CrudRepository<Ride, Integer> {

    List<Ride> findAllByStartLocation(Location location);
    List<Ride> findAllByDestination(Location location);
    @Query("select r from Ride r where r.startTime between ?1 and ?2 and r.capacity > ?3 and r.startTime > ?4")
    List<Ride> findAllByStartTimeIsBetweenAndCapacityIsGreaterThanAndStartTimeIsGreaterThan(Long startTime, Long endTime, int capacity, Long epochNow);

    List<Ride> findAllByStartTimeIsGreaterThan(Long epoch);
    @Query("select r from Ride r where r.capacity > ?1 and r.startTime > ?2")
    List<Ride> findAllByCapacityIsGreaterThanAndStartTimeIsGreaterThan(int capacity, Long epoch);


    @Query("select r from Ride r where r.user.id= ?1")
    List<Ride> findAllByUserId(int id);


}
