package shop.mtcoding.projectcoffeebackend.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import shop.mtcoding.projectcoffeebackend.product.option.Option;

import java.util.List;
import java.util.stream.Collectors;

public class ProductResponse {
    @Getter
    @Setter
    public static class MyProductDTO {
        private Integer id;
        private String categoryName;
        private String picUrl;
        private String productName;
        private String engName;
        private String description;
        private String tip;
        private Boolean isIced;
        private List<OptionDTO> optionList;

        public MyProductDTO(Product product) {
            this.id = product.getId();
            this.categoryName = product.getCategory().getName();
            this.picUrl = product.getPicUrl();
            this.productName = product.getName();
            this.engName = product.getEngName();
            this.description = product.getDescription();
            this.tip = product.getTip();
            this.isIced = product.getIsIced() == 1 ? true : false; // isIced가 1(iced)이면 true, 아니면(hot) false
            this.optionList = product.getOptions().stream().map(option -> new OptionDTO(option))
                    .collect(Collectors.toList());
        }

        @Getter
        @Setter
        public static class OptionDTO {
            private Integer price;
            private String size;

            public OptionDTO(Option option) {
                this.price = option.getPrice();
                this.size = option.getSize().getSize();

            }
        }


    }

}


