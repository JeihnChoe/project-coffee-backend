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
    private String calorie; // 칼로리
    @Column(nullable = false, length = 20)
    private String carbohydrate; // 탄수화물
    @Column(nullable = true, length = 20)
    private String saccharides; // 당류
    @Column(nullable = false, length = 20)
    private String sodium; // 나트륨
    @Column(nullable = false, length = 20)
    private String protein; // 단백질
    @Column(nullable = false, length = 20)
    private String fat; // 지방
    @Column(nullable = false, length = 20)
    private String cholesterol; // 콜레스테롤
    @Column(nullable = false, length = 20)
    private String transFat; // 트랜스지방
    @Column(nullable = false, length = 20)
    private String saturatedFat; // 카페인
    @Column(nullable = true, length = 1000)
    private String caution; // 포화지방

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