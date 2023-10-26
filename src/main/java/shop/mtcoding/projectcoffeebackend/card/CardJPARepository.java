package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CardJPARepository extends JpaRepository<Card, Integer> {

    List<Card> findByUserId(int userId);

    Card findByCardNumber(int cardNumber);

}
