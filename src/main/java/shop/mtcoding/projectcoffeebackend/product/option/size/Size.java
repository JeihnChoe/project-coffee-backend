package shop.mtcoding.projectcoffeebackend.product.option.size;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// TODO: 추가기능 - 영양정보 추가하기(엔티티만 만들어놨음)
@Getter
@NoArgsConstructor
@Entity
@Table(name = "size_tb")
@ToString
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 20)
    private String size; // 1 : Tall, 2 : Grande, 3 : Venti, 4 : Trenta, 5 : Solo, 6 : Dopio, 7 : Short

    @Builder
    public Size(int id, String size, String price) {
        this.id = id;
        this.size = size;
    }

}