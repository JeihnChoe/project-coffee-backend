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
import shop.mtcoding.projectcoffeebackend.beverage.option.Option;
import shop.mtcoding.projectcoffeebackend.cart.cuptype.CupType;
import shop.mtcoding.projectcoffeebackend.food.Food;
import shop.mtcoding.projectcoffeebackend.user.User;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "cart_tb")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int cartQuantity;
    @Column(nullable = false)
    private int cartPrice;
    @Column(nullable = false)
    private Boolean isChecked;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Food food;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private Option option;
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private CupType cupType;

    @Builder
    public Cart(int id, int cartQuantity, int cartPrice, Boolean isChecked, Food food, User user, Option option,
            CupType cupType) {
        this.id = id;
        this.cartQuantity = cartQuantity;
        this.cartPrice = cartPrice;
        this.isChecked = isChecked;
        this.food = food;
        this.user = user;
        this.option = option;
        this.cupType = cupType;
    }

}