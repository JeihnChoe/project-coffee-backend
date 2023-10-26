package shop.mtcoding.projectcoffeebackend.card;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

public class CardRequest {

    @Getter
    @Setter
    public class CardRegistrationDTO {

        private String cardName;

        private Integer cardNumber;

        private Integer pinNumber;

    }
    // 카드이름 카드번호 핀번호
}
