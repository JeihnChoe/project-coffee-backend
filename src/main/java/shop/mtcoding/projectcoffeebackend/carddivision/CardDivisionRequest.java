package shop.mtcoding.projectcoffeebackend.carddivision;

import lombok.*;

import java.time.LocalDate;

public class CardDivisionRequest {


    @Getter
    @Setter
    public static class RegisterCardDivisionDTO {

        private String picUrl;
        private String name;
        private int money;
        private int issuanceQuantity; // 발권 갯수
        private String startAt;
        private String endAt;


        public CardDivision toEntity() {
            return CardDivision.builder()
                    .picUrl(picUrl)
                    .name(name)
                    .money(money)
                    .issuanceQuantity(issuanceQuantity)
                    .startAt(startAt)
                    .endAt(endAt)
                    .build();
        }
    }
}