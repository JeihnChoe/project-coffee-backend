package shop.mtcoding.projectcoffeebackend.card;

import lombok.Getter;
import lombok.Setter;

public class CardResponse {

    @Setter
    @Getter
    public static class CardDetailDTO {
        private int id;
        private String name;
        private Integer money;
        private Integer number;
        private int userId;

        public CardDetailDTO(Card card) {
            this.id = card.getId();
            this.name = card.getName();
            this.money = card.getMoney();
            this.number = card.getNumber();
            this.userId = card.getUser().getId();
        }

    }

    @Getter
    @Setter
    public static class CardListDTO {
        private int id;
        private String name;
        private Integer money;
        private int userId;

        public CardListDTO(Card card) {
            this.id = card.getId();
            this.name = card.getName();
            this.money = card.getMoney();
            this.userId = card.getUser().getId();
        }

    }

    @Getter
    @Setter
    public static class RegistrationCardDTO {
        private String name;
        private Integer number;
        private Integer pin;
        private String fail;

        public RegistrationCardDTO(Card card, String fail) {
            this.name = card.getName();
            this.number = card.getNumber();
            this.pin = card.getPin();
            this.fail = null;
        }

        public RegistrationCardDTO(String fail) {
            this.name = null;
            this.number = null;
            this.pin = null;
            this.fail = fail;
        }

    }

    @Getter
    @Setter
    public static class ChargeCardPageDTO {
        private String name;
        private Integer money;
        private Integer userId;
        private Integer cardId;

        public ChargeCardPageDTO(Card card,
                Integer userId) {
            this.name = card.getName();
            this.money = card.getMoney();
            this.userId = userId;
            this.cardId = card.getId();
        }

    }

    @Getter
    @Setter
    public static class CardChargeDTO {
        // private String cardPicUrl;
        // private String cardName;
        private Integer money;
        // private Integer chargeMoney;
        private Integer userId;
        private Integer cardId;

        public CardChargeDTO(Card card,
                Integer userId) {
            // this.cardPicUrl = card.getCardPicUrl();
            // this.cardName = card.getCardName();
            this.money = card.getMoney();
            // this.chargeMoney = chargeMoney;
            this.userId = userId;
            this.cardId = card.getId();
        }

    }

