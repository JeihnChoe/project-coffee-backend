package shop.mtcoding.projectcoffeebackend.card;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.user.User;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "card_tb")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 500)
    private String cardPicUrl;
    @Column(length = 100, nullable = false)
    private String cardName;
    @Column(length = 500)
    private Integer cardMoney;
    @Column(length = 100, nullable = false)
    private Integer cardNumber;
    @Column(length = 200, nullable = false)
    private Timestamp cardCreateDate;

    @ManyToOne
    private User user;

    @Builder
    public Card(int id, String cardPicUrl, String cardName, Integer cardMoney, Integer cardNumber,
            Timestamp cardCreateDate, User user) {
        this.id = id;
        this.cardPicUrl = cardPicUrl;
        this.cardName = cardName;
        this.cardMoney = cardMoney;
        this.cardNumber = cardNumber;
        this.cardCreateDate = cardCreateDate;
        this.user = user;
    }

}
