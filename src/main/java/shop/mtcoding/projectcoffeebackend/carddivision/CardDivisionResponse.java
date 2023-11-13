package shop.mtcoding.projectcoffeebackend.carddivision;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.projectcoffeebackend.card.Card;

import java.util.List;
import java.util.stream.Collectors;


public class CardDivisionResponse {
    @Getter
    @Setter
    public static class CardDivisionListDTO {
        private List<CardDivisionDTO> cardDivisionDTOLists;

        public CardDivisionListDTO(List<CardDivision> cardDivisions) {
            this.cardDivisionDTOLists = cardDivisions.stream()
                    .map(cardDivision -> new CardDivisionDTO(cardDivision))
                    .collect(Collectors.toList());
        }

        @Getter
        @Setter
        public class CardDivisionDTO {
            private int id;
            private String picUrl;
            private String name;
            private int money; // 기본 잔액
            private int issuanceQuantity; // 발권 갯수
            private int saleQuantity; // 판매 갯수
            private int issuancePrice; // 발권 총액
            private int saleQuantityPrice; // 판매 총액
            private int status;
            private String startAt;
            private String endAt;

            public CardDivisionDTO(CardDivision cardDivision) {
                this.id = cardDivision.getId();
                this.picUrl = cardDivision.getPicUrl();
                this.name = cardDivision.getName();
                this.money = cardDivision.getMoney();
//                this.issuanceQuantity = cardDivision.get
            }


        }
    }
}
