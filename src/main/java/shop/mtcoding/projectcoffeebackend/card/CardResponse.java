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
}
