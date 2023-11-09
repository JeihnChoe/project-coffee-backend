package shop.mtcoding.projectcoffeebackend.category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "category_tb")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String name; // 1. 콜드브루, 2. 브루드커피, 3. 에스프레소, 4. 프라푸치노, 5. 블렌디드, 6. 리프레시, 7.피지오, 8. 디카페인, 9.티,
                         // 10.병음료, 11.브레드
    @Column(nullable = false, length = 50)
    private String engName;
    @Column(nullable = false)
    private int code; // 음료 0, 푸드 1
    @Column(nullable = false, length = 500)
    private String picUrl;

    @Builder
    public Category(int id, String name, String engName, int code, String picUrl) {
        this.id = id;
        this.name = name;
        this.engName = engName;
        this.code = code;
        this.picUrl = picUrl;
    }
}