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

    }
    // 카드이름 카드번호 핀번호

    @Setter
    @Getter
    public static class PayCardChargeDTO {
        private int id;
        private String cardName;
        private String cardPicUrl;
        private int cardMoney; // 현재 잔액
        private int chargeMoney; // 충전 금액

    }
}
