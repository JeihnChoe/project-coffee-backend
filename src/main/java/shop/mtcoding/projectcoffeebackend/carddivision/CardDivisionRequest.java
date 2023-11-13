package shop.mtcoding.projectcoffeebackend.carddivision;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

public class CardDivisionRequest {


    @Getter
    @Setter
    public static class RegisterCardDivisionDTO {

        private MultipartFile picUrl;
        private String name;
        private int money;
        private int issuanceQuantity; // 발권 갯수
        private String startAt;
        private String endAt;
        private Boolean status;


        public CardDivision toEntity(String fileName) {
            return CardDivision.builder()
                    .picUrl(fileName)
                    .name(name)
                    .money(money)
                    .issuanceQuantity(issuanceQuantity)
                    .startAt(startAt)
                    .endAt(endAt)
                    .status(status)
                    .build();
        }
    }
}