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
    private String picUrl;
    @Column(nullable = false, length = 500)
    private String name;
    @Column(nullable = false)
    private int money;
    @Column(nullable = false, unique = true)
    private int number;
    @Column(nullable = false)
    private int pinNumber;
    @Column(nullable = false)
    private Timestamp createdAt; // 카드 생성 시간(초 단위까지)
    @Column(nullable = false)
    private int status; // 1. 비어있음 2. 사용중 3. 분실중

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private User user;

    @Builder
    public Card(int id, String picUrl, String name, int money, int number, int pinNumber,
            Timestamp createdAt, int status, User user) {
        this.id = id;
        this.picUrl = picUrl;
        this.name = name;
        this.money = money;
        this.number = number;
        this.pinNumber = pinNumber;
        this.createdAt = createdAt;
        this.status = status;
        this.user = user;
    }

}
