package shop.mtcoding.projectcoffeebackend.promotion;

import java.time.LocalDate;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class PromotionResponse {

    @Getter
    @Setter
    public static class FindAllToHomeDTO {
        private int id;
        private String title;
        private String subContent;
        private String thumbnail;

        public FindAllToHomeDTO(Promotion promotion) {
            this.id = promotion.getId();
            this.title = promotion.getTitle();
            this.subContent = promotion.getSubContent();
            this.thumbnail = promotion.getThumbnail();
        }

    }

    @Getter
    @Setter
    public static class FindAllListDTO {
        private int id;
        private String title;
        private String subContent;
        private LocalDate startDate;
        private LocalDate endDate;
        private String thumbnail;

        public FindAllListDTO(Promotion promotion) {
            this.id = promotion.getId();
            this.title = promotion.getTitle();
            this.subContent = promotion.getSubContent();
            this.startDate = promotion.getStartDate();
            this.endDate = promotion.getEndDate();
            this.thumbnail = promotion.getThumbnail();
        }

    }

    @Getter
    @Setter
    public static class FindByPromotionIdDTO {
        private int id;
        private String title;
        private LocalDate startDate;
        private LocalDate endDate;
        private String picUrl;

        public FindByPromotionIdDTO(Promotion promotion) {
            this.id = promotion.getId();
            this.title = promotion.getTitle();
            this.startDate = promotion.getStartDate();
            this.endDate = promotion.getEndDate();
            this.picUrl = promotion.getPicUrl();
        }

    }

}
