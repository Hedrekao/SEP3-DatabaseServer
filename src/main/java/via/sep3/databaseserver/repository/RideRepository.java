package via.sep3.databaseserver.repository;

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
    List<Ride> findAllByStartTimeIsBetween(Long startTime, Long endTime);


}
