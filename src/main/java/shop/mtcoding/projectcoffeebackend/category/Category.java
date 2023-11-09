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
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "category_tb")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String name; // 1~8 커피 //9.빵 10. 샌드위치
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