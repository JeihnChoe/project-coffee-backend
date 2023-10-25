package shop.mtcoding.projectcoffeebackend.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserJPARepository extends JpaRepository<User, Integer> {

    // @Query(value = "select u from User u where email = :email")
    Optional<User> findByEmail(@Param("email") String email);
}
