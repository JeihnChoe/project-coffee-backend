package shop.mtcoding.projectcoffeebackend.order.item;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend.order.Order;
import shop.mtcoding.projectcoffeebackend.product.option.Option;

import javax.persistence.*;
import java.sql.Timestamp;

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
    @Column
    private int cupType;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private int totalAmount;
    @Column(nullable = false)
    private Timestamp paymentTime; // 결제 시간(초 단위까지)


    @Builder
    public Item(int id, Option option, Order order, int cupType, int quantity, int totalAmount, Timestamp paymentTime) {
        this.id = id;
        this.option = option;
        this.order = order;
        this.cupType = cupType;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.paymentTime = paymentTime;
    }
}