package shop.mtcoding.projectcoffeebackend.carddivision;

import java.time.LocalDate;

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
@Table(name = "card_division_tb")
public class CardDivision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = true, length = 500)
    private String picUrl;
    @Column(nullable = false, length = 500)
    private String name;
    @Column(nullable = false)
    private int money;
    @Column(nullable = true)
    private int quantity;
    @Column(nullable = true)
    private boolean status; // true. 서비스중 / false.발급종료 /
    @Column(nullable = true)
    private String startAt;

    @Builder
    public CardDivision(int id, String picUrl, String name, int money, int quantity, boolean status, String startAt) {
        this.id = id;
        this.picUrl = picUrl;
        this.name = name;
        this.money = money;
        this.quantity = quantity;
        this.status = status;
        this.startAt = startAt;
    }

}
