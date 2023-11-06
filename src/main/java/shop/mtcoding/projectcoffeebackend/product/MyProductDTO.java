package shop.mtcoding.projectcoffeebackend.product;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MyProductDTO {
    private Integer id;
    private String categoryName;
    private String picUrl;
    private String productName;
    private String engName;
    private String description;
    private String tip;
    private Boolean isIced;
    private Integer price;
    private String size;

}
