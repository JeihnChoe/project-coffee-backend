package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardJPARepository extends JpaRepository<Card, Integer> {

    List<Card> findByUserId(int userId);

    Card findByNumber(int number);

}
