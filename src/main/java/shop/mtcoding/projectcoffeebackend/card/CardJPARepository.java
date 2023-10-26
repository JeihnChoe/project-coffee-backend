package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import shop.mtcoding.projectcoffeebackend.user.User;

@Repository
public interface CardJPARepository extends JpaRepository<Card, Integer> {

    List<Card> findByUserId(int userId);


}
