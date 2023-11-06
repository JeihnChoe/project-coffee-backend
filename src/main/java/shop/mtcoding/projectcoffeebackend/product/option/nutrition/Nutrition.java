package shop.mtcoding.projectcoffeebackend.product.option.nutrition;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.option.Option;

// TODO: 추가기능 - 영양정보 추가하기(엔티티만 만들어놨음)
@Getter
@NoArgsConstructor
@Entity
@Table(name = "nutrition_tb")
public class Nutrition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String calorie;
    @Column(nullable = false, length = 20)
    private String carbohydrate;
    @Column(nullable = true, length = 20)
    private String saccharides;
    @Column(nullable = false, length = 20)
    private String sodium;
    @Column(nullable = false, length = 20)
    private String protein;
    @Column(nullable = false, length = 20)
    private String fat;
    @Column(nullable = false, length = 20)
    private String cholesterol;
    @Column(nullable = false, length = 20)
    private String transFat;
    @Column(nullable = false, length = 20)
    private String saturatedFat;
    @Column(nullable = true, length = 1000)
    private String caution;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private Option option;

    @Builder
    public Nutrition(int id, String optionId, String calorie, String carbohydrate, String saccharides, String sodium,
            String protein, String fat, String cholesterol, String transFat, String saturatedFat, String caution,
            Option option) {
        this.id = id;
        this.calorie = calorie;
        this.carbohydrate = carbohydrate;
        this.saccharides = saccharides;
        this.sodium = sodium;
        this.protein = protein;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.transFat = transFat;
        this.saturatedFat = saturatedFat;
        this.caution = caution;
        this.option = option;
    }

}