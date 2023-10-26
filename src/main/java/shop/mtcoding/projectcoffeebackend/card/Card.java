package shop.mtcoding.projectcoffeebackend.card;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.user.User;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "card_tb")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 500)
    private String cardPicUrl;
    @Column(nullable = false, length = 500)
    private String cardName;
    @Column(nullable = false)
    private int cardMoney;
    @Column(nullable = false, unique = true)
    private int cardNumber;
    @Column(nullable = false)
    private int pinNumber;
    @Column(nullable = false)
    private Timestamp cardCreatedAt; // 카드 생성 시간(초 단위까지)

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private User user;

    @Builder
    public Card(int id, String cardPicUrl, String cardName, int cardMoney, int cardNumber, int pinNumber,
            Timestamp cardCreatedAt, User user) {
        this.id = id;
        this.cardPicUrl = cardPicUrl;
        this.cardName = cardName;
        this.cardMoney = cardMoney;
        this.cardNumber = cardNumber;
        this.pinNumber = pinNumber;
        this.cardCreatedAt = cardCreatedAt;
        this.user = user;
    }

}
