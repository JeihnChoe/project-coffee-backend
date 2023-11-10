package shop.mtcoding.projectcoffeebackend.product.api;

import javax.persistence.Column;

public class ProductResponse {

    static class prodcutListAndPriceDTO{
        private int id;
        private String name;
        private String engName;
        private String description;
        private String tip;
        private Integer isIced; // 0 : hot, 1 : iced, 2 : both
        private String picUrl;
        private int price;
    }
}
