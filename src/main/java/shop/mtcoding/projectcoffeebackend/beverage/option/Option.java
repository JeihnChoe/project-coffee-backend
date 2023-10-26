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

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend.beverage.Beverage;
import shop.mtcoding.projectcoffeebackend.beverage.option.size.Size;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "option_tb")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 20)
    private int optionPrice;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Beverage beverage;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Size size;

    // TODO: 추가기능 - 영양정보 표시
    // @JsonIgnore
    // @OneToOne(fetch = FetchType.LAZY)
    // private Nutrition nutrition;

    @Builder
    public Option(int id, int optionPrice, Beverage beverage, Size size) {
        this.id = id;
        this.optionPrice = optionPrice;
        this.beverage = beverage;
        this.size = size;
    }

}