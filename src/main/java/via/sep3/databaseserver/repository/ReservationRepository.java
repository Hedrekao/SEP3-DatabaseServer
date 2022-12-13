package via.sep3.databaseserver.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import via.sep3.databaseserver.model.Reservation;

import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Integer> {

    @Query("select r from Reservation r where r.isAccepted is null")
    List<Reservation> findAllByAcceptedIsNull();
    List<Reservation> findAllByIsAcceptedTrueAndRideId(int id);
    @Query("select r from Reservation r where r.ride.id = ?1")
    List<Reservation> findAllByRideId(int id);


    @Query("select r from Reservation r where r.user.id = ?1")
    List<Reservation> findAllByUserId(int id);
}

