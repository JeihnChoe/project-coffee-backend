package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.user.User;

public class CardResponse {

    @Setter
    @Getter
    public static class CardDetailDTO {
        private int id;
        private String cardPicUrl;
        private String cardName;
        private Integer cardMoney;
        private Integer cardNumber;
        private int userId;

        public CardDetailDTO(Card card) {
            this.id = card.getId();
            this.cardPicUrl = card.getCardPicUrl();
            this.cardName = card.getCardName();
            this.cardMoney = card.getCardMoney();
            this.cardNumber = card.getCardNumber();
            this.userId = card.getUser().getId();
        }

    }

    @Getter
    @Setter
    public static class CardListDTO {
        private int id;
        private String cardPicUrl;
        private String cardName;
        private Integer cardMoney;
        private int userId;

        public CardListDTO(Card card) {
            this.id = card.getId();
            this.cardPicUrl = card.getCardPicUrl();
            this.cardName = card.getCardName();
            this.cardMoney = card.getCardMoney();
            this.userId = card.getUser().getId();
        }

    }

    @Getter
    @Setter
    public static class CardRegistrationDTO {
        private String cardName;
        private Integer cardNumber;
        private Integer pinNumber;
        private String fail;

        public CardRegistrationDTO(Card card, String fail) {
            this.cardName = card.getCardName();
            this.cardNumber = card.getCardNumber();
            this.pinNumber = card.getPinNumber();
            this.fail = null;
        }

        public CardRegistrationDTO(String fail) {
            this.cardName = null;
            this.cardNumber = null;
            this.pinNumber = null;
            this.fail = fail;
        }

    }

    @Getter
    @Setter
    public static class CardChargePageDTO {
        private String cardPicUrl;
        private String cardName;
        private Integer cardMoney;
        private Integer userId;
        private Integer cardId;

        public CardChargePageDTO(Card card,
                Integer userId) {
            this.cardPicUrl = card.getCardPicUrl();
            this.cardName = card.getCardName();
            this.cardMoney = card.getCardMoney();
            this.userId = userId;
            this.cardId = card.getId();
        }

    }

    @Getter
    @Setter
    public static class CardChargeDTO {
        // private String cardPicUrl;
        // private String cardName;
        private Integer cardMoney;
        // private Integer chargeMoney;
        private Integer userId;
        private Integer cardId;

        public CardChargeDTO(Card card,
                Integer userId) {
            // this.cardPicUrl = card.getCardPicUrl();
            // this.cardName = card.getCardName();
            this.cardMoney = card.getCardMoney();
            // this.chargeMoney = chargeMoney;
            this.userId = userId;
            this.cardId = card.getId();
        }

    }

}
