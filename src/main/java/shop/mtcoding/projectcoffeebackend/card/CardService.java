package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;

import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception500;
import shop.mtcoding.projectcoffeebackend.card.CardResponse.CardDetailDTO;
import shop.mtcoding.projectcoffeebackend.user.User;

import java.util.stream.Collectors;

@Service
public class CardService {

    @Autowired
    CardJPARepository cardJPARepository;

    @Transactional
    public CardResponse.CardDetailDTO viewCardDetail(int userId) {

        Card cardPS = cardJPARepository.findById(userId).orElseThrow(() -> new Exception400("카드id가 없습니다"));
        System.out.println("레파지토리");
        CardResponse.CardDetailDTO cardDetailDTO = new CardResponse.CardDetailDTO(cardPS);
        System.out.println("여기됨?");
        return cardDetailDTO;
        // return new CardResponse.CardDetailDTO(cardPS);

        // CardResponse.CardDetailDTO
        // CardResponse.CardDetailDTO cardDetailDTO = new
        // CardResponse.CardDetailDTO(cardPS);
    }

    @Transactional
    public List<CardResponse.CardListDTO> viewCardList(int userId) {

        List<Card> cardListPS = cardJPARepository.findByUserId(userId);
        System.out.println("레파지토리안됨?");
        List<CardResponse.CardListDTO> cardListDTO = cardListPS.stream()
                .map(card -> new CardResponse.CardListDTO(card))
                .collect(Collectors.toList());
        System.out.println("여기안됨?");
        return cardListDTO;

    }

    @Transactional
    public CardResponse.CardRegistrationDTO cardRegistration(CardRequest.CardRegistrationDTO cardRegistrationDTO,
            int userId) {

        Card cardPS = cardJPARepository.findByCardNumber(cardRegistrationDTO.getCardNumber());
        System.out.println("입력한 핀번호" + cardRegistrationDTO.getPinNumber());

        if (cardPS == null) {
            System.out.println("db에 cardPS없음");
            String fail = "카드번호 또는 핀번호를 잘못 입력하였습니다";
            CardResponse.CardRegistrationDTO responseDTO = new CardResponse.CardRegistrationDTO(fail);

            return responseDTO;
        }
        if (cardRegistrationDTO.getPinNumber() != cardPS.getPinNumber()) {
            String fail = "카드번호 또는 핀번호를 잘못 입력하였습니다";
            CardResponse.CardRegistrationDTO responseDTO = new CardResponse.CardRegistrationDTO(fail);
            return responseDTO;
        }
        String fail = "";
        User user = User.builder().id(userId).build();
        cardPS.setUser(user);
        System.out.println("성공");
        CardResponse.CardRegistrationDTO responseDTO = new CardResponse.CardRegistrationDTO(cardPS, fail);
        return responseDTO;

    }

    // 1. DB에서 DTO에 받은 카드번호로 일치하는 카드 있는지 찾기
    // 1-1 없으면 return "카드가없습니다."

    // 1-2 있으면
    // 2. 찾은 카드 행의 user_id 에 유저번호 넣어주기
    // 3. return 디티오

    // List<Card> cardPS = cardJPARepository.findByUserId(userId);

    // List<CardResponse.CardRegistrationDTO> cardRegistrationDTOs = cardPS.stream()
    // .map(card -> new CardResponse.CardRegistrationDTO(card))
    // .collect(Collectors.toList());

}
