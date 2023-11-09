package shop.mtcoding.projectcoffeebackend.product.option;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import shop.mtcoding.projectcoffeebackend.product.Product;
import shop.mtcoding.projectcoffeebackend.product.option.size.Size;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "option_tb")
@ToString
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Product product;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Size size;
    @Column(nullable = false, length = 20)
    private Integer price;

    // TODO: 추가기능 - 영양정보 표시
    // @JsonIgnore
    // @OneToOne(fetch = FetchType.LAZY)
    // private Nutrition nutrition;

    @Builder
    public Option(int id, int price, Product product, Size size) {
        this.id = id;
        this.price = price;
        this.product = product;
        this.size = size;
    }

}