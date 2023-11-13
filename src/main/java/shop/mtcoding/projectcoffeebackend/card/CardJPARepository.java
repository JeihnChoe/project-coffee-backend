package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CardJPARepository extends JpaRepository<Card, Integer> {


    @Query(nativeQuery = true, value = "SELECT * FROM CARD_TB LEFT JOIN CARD_DIVISION_TB WHERE CARD_TB.USER_ID = 1")
    List<Card> findByUserId(int userId);

    Card findByNumber(int number);

}
