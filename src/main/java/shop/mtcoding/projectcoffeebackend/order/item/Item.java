package shop.mtcoding.projectcoffeebackend.order.item;

import java.sql.Timestamp;

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
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.cart.cuptype.CupType;
import shop.mtcoding.projectcoffeebackend.order.Order;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "item_tb")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private Option option;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private CupType cupType;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private int totalAmount;
    @Column(nullable = false)
    private Timestamp paymentTime; // 결제 시간(초 단위까지)


    public Item(int id, Option option, Order order, CupType cupType, int quantity, int totalAmount, Timestamp paymentTime) {
        this.id = id;
        this.option = option;
        this.order = order;
        this.cupType = cupType;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.paymentTime = paymentTime;
    }
}