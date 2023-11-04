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
    private String cardDivisionPicUrl;
    @Column(nullable = false, length = 500)
    private String cardName;
    @Column(nullable = false)
    private int cardMoney;
    @Column(nullable = true)
    private int quantity;
    @Column(nullable = true)
    private boolean isActive = true; // true. 서비스중 / false.발급종료 /
    @Column(nullable = false)
    private String startAt;

    @Builder
    public CardDivision(int id, String cardDivisionPicUrl, String cardName, int cardMoney, int quantity, boolean isActive, String startAt) {
        this.id = id;
        this.cardDivisionPicUrl = cardDivisionPicUrl;
        this.cardName = cardName;
        this.cardMoney = cardMoney;
        this.quantity = quantity;
        this.isActive = isActive;
        this.startAt = startAt;
    }
}
