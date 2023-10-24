package shop.mtcoding.projectcoffeebackend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserJPARepository extends JpaRepository<User, Integer> {

    // @Query(value = "select u from User u where email = :email")
    Optional<User> findByEmail(@Param("email") String email);
}
