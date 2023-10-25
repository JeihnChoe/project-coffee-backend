package shop.mtcoding.projectcoffeebackend.beverage.option.size;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// TODO: 추가기능 - 영양정보 추가하기(엔티티만 만들어놨음)
@Getter
@NoArgsConstructor
@Entity
@Table(name = "size_tb")
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 20)
    private String size;
    @Column(nullable = false, length = 20)
    private String liquid_amount;
    @Column(nullable = false, length = 500)
    private String size_pic_url;

    @Builder
    public Size(int id, String size, String liquid_amount, String size_pic_url) {
        this.id = id;
        this.size = size;
        this.liquid_amount = liquid_amount;
        this.size_pic_url = size_pic_url;
    }

}