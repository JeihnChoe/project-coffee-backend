package shop.mtcoding.projectcoffeebackend.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.product.option.Option;

import java.util.List;
import java.util.stream.Collectors;

public class ProductResponse {
//    @Getter
//    @Setter
//    public static class MyProductDTO {
//        private List<ProductDTO> products;


//        public MyProductDTO(List<Product> products) {
//            this.products = products.stream().map(product -> new ProductDTO(product)).collect(Collectors.toList());
//        }
//        @Getter
//        @Setter
//        public class ProductDTO{
//            private Integer id;
//            private String categoryName;
//            private String picUrl;
//            private String productName;
//            private String engName;
//            private String description;
//            private String tip;
//            private int isIced;
//            private List<OptionDTO> optionList;
//
//            public ProductDTO(Product product) {
//                this.id = product.getId();
//                this.categoryName = product.getCategory().getName();
//                this.picUrl = product.getPicUrl();
//                this.productName = product.getName();
//                this.engName = product.getEngName();
//                this.description = product.getDescription();
//                this.tip = product.getTip();
//                this.isIced = product.getIsIced();
//                this.optionList = product.getOptions().stream().map(option -> new OptionDTO(option)).collect(Collectors.toList());
//            }
//
//            @Getter
//            @Setter
//            public class OptionDTO{
//                private Integer price;
//                private List<SizeDTO> sizes;
//
//
//                public OptionDTO(Option option) {
//                    this.price = option.getPrice();
//                    this.size = option.getSize().;
//                }
//                @Getter
//                @Setter
//                public class SizeDTO{
//                    private Integer price;
//                    private List<SizeDTO> sizes;
//
//
//                    public SizeDTO(Option option) {
//                        this.price = option.getPrice();
//                        this.sizes = option.getSize();
//
//                    }
//        }
//    }

}
