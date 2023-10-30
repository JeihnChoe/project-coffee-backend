package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend.user.User;

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
    public CardResponse.RegistrationCardDTO registrationCard(CardRequest.RegistrationCardDTO cardRegistrationDTO,
            int userId) {

        Card cardPS = cardJPARepository.findByCardNumber(cardRegistrationDTO.getCardNumber());
        // System.out.println("입력한 핀번호" + cardRegistrationDTO.getPinNumber());

        if (cardPS == null) {
            System.out.println("db에 cardPS없음");
            String fail = "카드번호 또는 핀번호를 잘못 입력하였습니다";
            CardResponse.RegistrationCardDTO responseDTO = new CardResponse.RegistrationCardDTO(fail);

            return responseDTO;
        }

        if (cardRegistrationDTO.getPinNumber() != cardPS.getPinNumber()) {
            String fail = "카드번호 또는 핀번호를 잘못 입력하였습니다";
            CardResponse.RegistrationCardDTO responseDTO = new CardResponse.RegistrationCardDTO(fail);
            return responseDTO;
        }
        if (cardPS.getStatus() == 2) {
            String fail = "사용중인 카드입니다";
            CardResponse.RegistrationCardDTO responseDTO = new CardResponse.RegistrationCardDTO(fail);
            return responseDTO;
        }
        if (cardPS.getStatus() == 3) {
            String fail = "분실중인 카드입니다";
            CardResponse.RegistrationCardDTO responseDTO = new CardResponse.RegistrationCardDTO(fail);
            return responseDTO;
        }

        String fail = "";
        User user = User.builder()
                .id(userId)
                .build();
        cardPS.setUser(user);
        cardPS.setStatus(2);
        System.out.println("성공");
        CardResponse.RegistrationCardDTO responseDTO = new CardResponse.RegistrationCardDTO(cardPS, fail);
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

    @Transactional
    public CardResponse.CardChargePageDTO viewCardChargePage(CardRequest.ViewCardChargeDTO viewPayCardChargeDTO,
            int userId) {
        // 1. DB에서 값 긁어오기(레파지토리에 위임) : 프론트가 준 유저 아이디로.
        Card cardPS = cardJPARepository.findById(viewPayCardChargeDTO.getCardId())
                .orElseThrow(() -> new Exception400("카드가 없습니다"));
        // 2. 값의 핀넘버랑 유저가 준 핀넘버 비교
        if (viewPayCardChargeDTO.getCardId().equals(cardPS.getId())) {
            CardResponse.CardChargePageDTO cardChargePageDTO = new CardResponse.CardChargePageDTO(cardPS, userId);
            return cardChargePageDTO;
        }

        throw new Exception400("카드가 일치하지않습니다");

        // 3. 일치여부확인
        // 3-1. 일치 -> 리턴 ~~~~~~~~~~
        // 3-2. 일치하지않으면-> 리턴 ~~~~~~~~~

        // 4.

    }

    @Transactional
    public CardResponse.CardChargeDTO chargeCard(CardRequest.ChargeCardDTO chargeCardDTO, int userId) {

        Card cardPS = cardJPARepository.findById(chargeCardDTO.getCardId())
                .orElseThrow(() -> new Exception400("카드가 없습니다"));

        int currentBalance = cardPS.getCardMoney();
        cardPS.setCardMoney(currentBalance + chargeCardDTO.getChargeMoney());

        CardResponse.CardChargeDTO cardChargeDTO = new CardResponse.CardChargeDTO(cardPS, userId);
        return cardChargeDTO;

    }

    @Transactional
    public void deleteCard(CardRequest.DeleteCardDTO deleteCardDTO, int userId) {

        Card cardPS = cardJPARepository.findById(deleteCardDTO.getCardId())
                .orElseThrow(() -> new Exception400("카드가 없습니다"));

        if (cardPS.getCardMoney() == 0) {
            cardJPARepository.deleteById(cardPS.getId());
        } else {
            cardPS.setUser(null);

        }

    }

}
