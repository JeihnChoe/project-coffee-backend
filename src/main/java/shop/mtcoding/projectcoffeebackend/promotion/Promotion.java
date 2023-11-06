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
    @Column(nullable = false)
    private LocalDate startDate; // 이벤트 시작 날짜
    // @Temporal(TemporalType.DATE) // 시간까지 필요하면 TemporalType. TIMESTAMP로
    @Column(nullable = true)
    private LocalDate endDate; // 이벤트 종료 날짜
    @Column(nullable = false)
    private Boolean isOpen; // 공개 여부
    @Column(nullable = false, length = 500)
    private String picUrl;
    @Column(nullable = false, length = 500)
    private String thumbnail; // 홈 화면의 What's New / See All 썸네일
    @Column(nullable = true, length = 500)
    private String homeThumbnail; // 홈 화면에서 큼지막한 썸네일

    @Builder
    public Promotion(int id, String title, String subContent, LocalDate startDate, LocalDate endDate,
            String picUrl,
            String thumbnail, String homeThumbnail, Boolean isOpen) {
        this.id = id;
        this.title = title;
        this.subContent = subContent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.picUrl = picUrl;
        this.thumbnail = thumbnail;
        this.homeThumbnail = homeThumbnail;
        this.isOpen = isOpen;
    }

}
