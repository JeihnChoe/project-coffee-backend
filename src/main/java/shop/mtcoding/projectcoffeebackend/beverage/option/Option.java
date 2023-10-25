package shop.mtcoding.projectcoffeebackend.beverage.option;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend.beverage.Beverage;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "option_tb")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 20)
    private String size; // 7개?
    @Column(nullable = false, length = 20)
    private int optionPrice;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Beverage beverage;

    // TODO: 추가기능 - 영양정보 표시
    // @JsonIgnore
    // @OneToOne(fetch = FetchType.LAZY)
    // private Nutrition nutrition;

    public Option(int id, String size, int optionPrice, String caution, Beverage beverage) {
        this.id = id;
        this.size = size;
        this.optionPrice = optionPrice;
        this.beverage = beverage;
    }

}