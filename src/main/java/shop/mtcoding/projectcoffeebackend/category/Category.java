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
    private String categoryName;
    @Column(nullable = false, length = 50)
    private String categoryEngName;
    @Column(nullable = false)
    private int code;

    @Builder
    public Category(int id, String categoryName, String categoryEngName, int code) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryEngName = categoryEngName;
        this.code = code;
    }

}