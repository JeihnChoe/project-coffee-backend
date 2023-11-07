package shop.mtcoding.projectcoffeebackend.promotion.api;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.promotion.Promotion;

public class PromotionRestResponse {

    @Getter
    @Setter
    public static class FindAllListDTO { // See All의 프로모션DTO List
        private int id;
        private String title;
        private String subContent;
        private LocalDate startDate;
        private LocalDate endDate;
        private String bigThumbnail;
        private String smallThumbnail;

        public FindAllListDTO(Promotion promotion) {
            this.id = promotion.getId();
            this.title = promotion.getTitle();
            this.subContent = promotion.getSubContent();
            this.startDate = promotion.getStartDate();
            this.endDate = promotion.getEndDate();
            this.bigThumbnail = promotion.getBigThumbnail();
            this.smallThumbnail = promotion.getSmallThumbnail();
        }

    }

    @Getter
    @Setter
    public static class FindByPromotionIdDTO { // 프로모션 상세보기DTO
        private int id;
        private String title;
        private LocalDate startDate;
        private LocalDate endDate;
        private String promotionPicUrl;
        private Boolean isOpen;

        public FindByPromotionIdDTO(Promotion promotion) {
            this.id = promotion.getId();
            this.title = promotion.getTitle();
            this.startDate = promotion.getStartDate();
            this.endDate = promotion.getEndDate();
            this.promotionPicUrl = promotion.getPicUrl();
            this.isOpen = promotion.getIsOpen();
        }

    }

}
