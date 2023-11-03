package shop.mtcoding.projectcoffeebackend.beverage;

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
import lombok.ToString;
import shop.mtcoding.projectcoffeebackend.category.Category;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "beverage_tb")
@ToString
public class Beverage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String beverageName;
    @Column(nullable = false, length = 50)
    private String beverageEngName;
    @Column(nullable = false, length = 1000)
    private String beverageDescription;
    @Column(nullable = true, length = 1000)
    private String beverageTip;

    @Column(nullable = false, length = 500)
    private String beveragePicUrl;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    // TODO: 추가기능 - NEW/HOT/BEST

    // TODO: 추가기능 - 알러지(알러지tb 생성)

    @Builder
    public Beverage(int id, String beverageName, String beverageEngName, String beverageDescription, String beverageTip,
            String beveragePicUrl, Category category) {
        this.id = id;
        this.beverageName = beverageName;
        this.beverageEngName = beverageEngName;
        this.beverageDescription = beverageDescription;
        this.beverageTip = beverageTip;
        this.beveragePicUrl = beveragePicUrl;
        this.category = category;
    }

    // TODO: 비슷한 다른 메뉴 추천

}