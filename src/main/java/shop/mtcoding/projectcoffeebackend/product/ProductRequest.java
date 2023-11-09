package shop.mtcoding.projectcoffeebackend.product;
import org.springframework.web.multipart.MultipartFile;
import lombok.Getter;
import lombok.Setter;
public class ProductRequest {
    @Getter
    @Setter
    public static class RegisterFoodDTO {
        private Integer categoryId;
        private MultipartFile picUrl;
        private String name;
        private String engName;
        private String description;
        private String tip;
    }


    @Getter
    @Setter
    public static class DeleteFoodDTO {
        private Integer id;
    }


    @Getter
    @Setter

  
    public static class RegistrationBeverageDTO {
        private int categoryId; // value를 categoryId로 바로 받음
        private MultipartFile picUrl;
        private String name;
        private String engName;
        private String description;
        private String tip;
        private String isIced; // 0 : hot, 1: iced
        private Integer size1;
        private Integer size2;
        private Integer size3;
        private Integer price1;
        private Integer price2;
        private Integer price3;
    }
}