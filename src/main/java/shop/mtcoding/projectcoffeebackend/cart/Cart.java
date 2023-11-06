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

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.Product;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.cart.cuptype.CupType;
import shop.mtcoding.projectcoffeebackend.user.User;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "cart_tb")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private Option option;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private int totalPrice; // Option에서 price 조회 * quantity
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private CupType cupType;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}