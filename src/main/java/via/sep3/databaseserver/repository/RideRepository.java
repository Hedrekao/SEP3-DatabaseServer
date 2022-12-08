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
    List<Ride> findAllByStartTimeIsBetweenAndCapacityIsGreaterThan(Long startTime, Long endTime, int capacity);

    @Query("select r from Ride r where r.capacity > ?1")
    List<Ride> findAllByCapacityIsGreaterThan(int capacity);

    List<Ride> findAllByDriverId(int id);


}
