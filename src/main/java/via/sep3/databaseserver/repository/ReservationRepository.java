package via.sep3.databaseserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import via.sep3.databaseserver.model.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Integer> {
}
