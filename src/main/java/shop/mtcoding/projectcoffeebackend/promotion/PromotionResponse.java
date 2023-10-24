package shop.mtcoding.projectcoffeebackend.promotion;

import java.time.LocalDate;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class PromotionResponse {

    @Getter
    @Setter
    public static class FindAllWhatsNewDTO { // 홈화면 What's New 프로모션DTO
        private int id;
        private String title;
        private String subContent;
        private String thumbnail;
        private Boolean isOpen;

        public FindAllWhatsNewDTO(Promotion promotion) {
            this.id = promotion.getId();
            this.title = promotion.getTitle();
            this.subContent = promotion.getSubContent();
            this.thumbnail = promotion.getThumbnail();
            this.isOpen = promotion.getIsOpen();
        }

    }

    @Getter
    @Setter
    public static class FindByAllHomeThumbnailDTO { // 홈화면에 대문짝만한 프로모션DTO
        private int id;
        private String homeThumbnail;
        private Boolean isOpen;

        public FindByAllHomeThumbnailDTO(Promotion promotion) {
            this.id = promotion.getId();
            this.homeThumbnail = promotion.getHomeThumbnail();
            this.isOpen = promotion.getIsOpen();
        }

    }

    @Getter
    @Setter
    public static class FindAllListDTO { // See All의 프로모션DTO List
        private int id;
        private String title;
        private String subContent;
        private LocalDate startDate;
        private LocalDate endDate;
        private String thumbnail;
        private Boolean isOpen;

        public FindAllListDTO(Promotion promotion) {
            this.id = promotion.getId();
            this.title = promotion.getTitle();
            this.subContent = promotion.getSubContent();
            this.startDate = promotion.getStartDate();
            this.endDate = promotion.getEndDate();
            this.thumbnail = promotion.getThumbnail();
            this.isOpen = promotion.getIsOpen();
        }

    }

    @Getter
    @Setter
    public static class FindByPromotionIdDTO { // 프로모션 상세보기DTO
        private int id;
        private String title;
        private LocalDate startDate;
        private LocalDate endDate;
        private String picUrl;
        private Boolean isOpen;

        public FindByPromotionIdDTO(Promotion promotion) {
            this.id = promotion.getId();
            this.title = promotion.getTitle();
            this.startDate = promotion.getStartDate();
            this.endDate = promotion.getEndDate();
            this.picUrl = promotion.getPicUrl();
            this.isOpen = promotion.getIsOpen();
        }

    }

}
