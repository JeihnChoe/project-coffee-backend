package shop.mtcoding.projectcoffeebackend.order;

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
import shop.mtcoding.projectcoffeebackend.user.User;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "order_tb")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Builder
    public Order(int id, User user) {
        this.id = id;
        this.user = user;
    }

}

// TODO: 추가기능 - 매장 설정

// TODO: 추가기능 - postman 공격 막기(ex) 푸드-컵은 나올 수 없는 구조 등)