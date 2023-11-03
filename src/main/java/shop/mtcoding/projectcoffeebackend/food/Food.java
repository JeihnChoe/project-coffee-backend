package shop.mtcoding.projectcoffeebackend.food;

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
import shop.mtcoding.projectcoffeebackend.category.Category;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "food_tb")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String foodName;
    @Column(nullable = false, length = 50)
    private String foodEngName;
    @Column(nullable = false, length = 1000)
    private String foodDescription;
    @Column(nullable = true, length = 1000)
    private String foodTip;
    @Column(nullable = false)
    private int foodPrice;
    @Column(nullable = false, length = 500)
    private String foodPicUrl;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    // TODO: 추가기능 - 상품정보제공고시
    // private FoodInfo foodInfo;

    // TODO: 추가기능 - NEW/HOT/BEST

    // TODO: 추가기능 - 워밍옵션(빵류)

    // TODO: 추가기능 - 메뉴 추가(루어팍버터, 크림치즈28g)

    @Builder
    public Food(int id, String foodName, String foodEngName, String foodDescription, String foodTip, int foodPrice,
            String foodPicUrl, Category category) {
        this.id = id;
        this.foodName = foodName;
        this.foodEngName = foodEngName;
        this.foodDescription = foodDescription;
        this.foodTip = foodTip;
        this.foodPrice = foodPrice;
        this.foodPicUrl = foodPicUrl;
        this.category = category;
    }

    // TODO: 추가기능 - 비슷한 다른 메뉴 추천

}

// TODO: 추가기능 - 상품관련(상품tb 생성)
// TODO: 추가기능 - 상품-원두(커피프로필)