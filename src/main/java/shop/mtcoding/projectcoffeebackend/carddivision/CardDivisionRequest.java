package shop.mtcoding.projectcoffeebackend.carddivision;

import lombok.*;

import java.time.LocalDate;

public class CardDivisionRequest {


    @Getter
    @Setter
    public static class RegisterCardDivisionDTO {

        private int id;
        private String cardDivisionPicUrl;
        private String cardName;
        private int cardMoney;
        private String startAt;


        public CardDivision toEntity() {
            return CardDivision.builder()
                    .id(id)
                    .cardDivisionPicUrl(cardDivisionPicUrl)
                    .cardName(cardName)
                    .cardMoney(cardMoney)
                    .startAt(startAt).build();
        }
    }
}