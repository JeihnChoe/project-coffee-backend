package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend.card.CardResponse.CardDetailDTO;
import java.util.stream.Collectors;

@Service
public class CardService {

    @Autowired
    CardJPARepository cardJPARepository;

    public CardResponse.CardDetailDTO viewCardDetail(int userId) {

        Card cardPS = cardJPARepository.findById(userId).orElseThrow(() -> new Exception400("카드id가 없습니다"));

        CardResponse.CardDetailDTO cardDetailDTO = new CardResponse.CardDetailDTO(cardPS);

        return cardDetailDTO;
        // return new CardResponse.CardDetailDTO(cardPS);

        // CardResponse.CardDetailDTO
        // CardResponse.CardDetailDTO cardDetailDTO = new
        // CardResponse.CardDetailDTO(cardPS);
    }

    public List<CardResponse.CardListDTO> viewCardList(int userId) {

        List<Card> cardListPS = cardJPARepository.findByUserId(userId);
        System.out.println("레파지토리안됨?");
        List<CardResponse.CardListDTO> cardListDTO = cardListPS.stream()
                .map(card -> new CardResponse.CardListDTO(card))
                .collect(Collectors.toList());
        System.out.println("여기안됨?");
        return cardListDTO;

    }

}
