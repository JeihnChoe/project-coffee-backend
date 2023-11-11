package shop.mtcoding.projectcoffeebackend.card;

import lombok.Getter;
import lombok.Setter;

public class CardRequest {

    @Getter
    @Setter
    public static class RegistrationCardDTO {

        private String name;

        private Integer number;

        private Integer pin;

    }
    // 카드이름 카드번호 핀번호

    @Setter
    @Getter
    public static class ViewCardChargeDTO {
        private int id;
        private String name;
        private String picUrl;
        private int money; // 현재 잔액
        private int chargeMoney; // 충전 금액
        private Integer cardId;

    }

    @Getter
    @Setter
    public static class ChargeCardDTO {
        private Integer cardId;
        private Integer chargeMoney;

        public ChargeCardDTO(Integer cardId, Integer chargeMoney) {
            this.cardId = cardId;
            this.chargeMoney = chargeMoney;
        }
    }

    @Getter
    @Setter
    public static class DeleteCardDTO {
        private Integer cardId;

    }

}