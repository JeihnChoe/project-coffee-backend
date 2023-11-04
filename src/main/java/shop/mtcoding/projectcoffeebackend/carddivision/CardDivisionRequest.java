package shop.mtcoding.projectcoffeebackend.carddivision;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

public class CardDivisionRequest {


    @Getter
    @Setter
    public static class RegisterCardDivisionDTO {

        private int id;
        private MultipartFile picUrl;
        private String cardName;
        private int cardMoney;
        private String startAt;

    }
}