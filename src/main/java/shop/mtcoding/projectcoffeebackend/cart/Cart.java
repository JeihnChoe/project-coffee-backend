package shop.mtcoding.projectcoffeebackend.cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.user.User;

@Getter
@RequiredArgsConstructor
@Entity
@Table(name = "cart_tb")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private Option option;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private int totalPrice; // Option에서 price 조회 * quantity
    @Column(nullable = false)
    private String cupType;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Builder
    public Cart(int id, Option option, int quantity, int totalPrice, String cupType, User user) {
        this.id = id;
        this.option = option;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.cupType = cupType;
        this.user = user;
    }
}