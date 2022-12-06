package via.sep3.databaseserver.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import via.sep3.databaseserver.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select u from User u where u.name = ?1")
    Optional<User> findByName(String name);
    Optional<User> findByEmailAndPassword(String email, String password);





}
