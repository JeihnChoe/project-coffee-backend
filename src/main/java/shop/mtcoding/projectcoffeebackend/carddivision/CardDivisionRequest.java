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
        private String startAt;


        public CardDivision toEntity() {
            return CardDivision.builder()
                    .picUrl(picUrl)
                    .name(name)
                    .money(money)
                    .startAt(startAt).build();
        }
    }
}