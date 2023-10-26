package shop.mtcoding.projectcoffeebackend.card;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

public class CardRequest {

    @Getter
    @Setter
    public static class CardRegistrationDTO {

        private String cardName;

        private Integer cardNumber;

        private Integer pinNumber;

        public CardRegistrationDTO(String cardName, Integer cardNumber, Integer pinNumber) {
            this.cardName = cardName;
            this.cardNumber = cardNumber;
            this.pinNumber = pinNumber;
        }

        // public Card toEntity() {
        // return Card
        // .builder()
        // .email(email)
        // .password(password)
        // .userName(userName)
        // .phoneNumber(phoneNumber)
        // .build();
        // }

    }
    // 카드이름 카드번호 핀번호
}
