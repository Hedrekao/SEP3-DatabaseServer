package via.sep3.databaseserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import via.sep3.databaseserver.model.Location;
import via.sep3.databaseserver.model.Ride;

import java.util.List;
import java.util.Optional;

@Repository
public interface RideRepository extends CrudRepository<Ride, Long> {

    List<Ride> findByStartLocation(Location location);
    List<Ride> findByDestination(Location location);
    List<Ride> findAllByStartTimeIsGreaterThanEqualAndEndTimeIsLessThanEqual(Long startTime, Long endTime);
    List<Ride> findAllByEndTime(Long epoch);

}
