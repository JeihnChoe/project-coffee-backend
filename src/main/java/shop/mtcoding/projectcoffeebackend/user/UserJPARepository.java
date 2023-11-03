package shop.mtcoding.projectcoffeebackend.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserJPARepository extends JpaRepository<User, Integer> {

    Optional<User> findByLoginId(@Param("login_id") String loginId);

}
