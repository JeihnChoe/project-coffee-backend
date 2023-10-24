package shop.mtcoding.projectcoffeebackend.promotion;

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

@Getter
@NoArgsConstructor
@Entity
@Table(name = "promotion_tb")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 256)
    private String title;
    @Column(nullable = false, length = 256)
    private String subContent;
    // @Temporal(TemporalType.DATE) // 시간까지 필요하면 TemporalType.TIMESTAMP로
    private LocalDate startDate;
    // @Temporal(TemporalType.DATE) // 시간까지 필요하면 TemporalType.TIMESTAMP로
    private LocalDate endDate;

    private String picUrl;
    private String thumbnail;

    @Builder
    public Promotion(int id, String title, String subContent, LocalDate startDate, LocalDate endDate, String picUrl,
            String thumbnail) {
        this.id = id;
        this.title = title;
        this.subContent = subContent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.picUrl = picUrl;
        this.thumbnail = thumbnail;
    }

}