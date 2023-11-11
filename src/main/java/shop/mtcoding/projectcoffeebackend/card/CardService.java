package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend.card.api.CardRestRequest;
import shop.mtcoding.projectcoffeebackend.card.api.CardRestResponse;
import shop.mtcoding.projectcoffeebackend.user.User;

@RequiredArgsConstructor
@Service
public class CardService {

    final private CardJPARepository cardJPARepository;

    @Transactional
    public CardRestResponse.CardDetailDTO viewCardDetail(int userId) {

        Card cardPS = cardJPARepository.findById(userId).orElseThrow(() -> new Exception400("카드id가 없습니다"));
        CardRestResponse.CardDetailDTO cardDetailDTO = new CardRestResponse.CardDetailDTO(cardPS);
        return cardDetailDTO;
        // return new CardResponse.CardDetailDTO(cardPS);

        // CardResponse.CardDetailDTO
        // CardResponse.CardDetailDTO cardDetailDTO = new
        // CardResponse.CardDetailDTO(cardPS);
    }

    @Transactional
    public List<CardRestResponse.CardListDTO> viewCardList(int userId) {

        List<Card> cardListPS = cardJPARepository.findByUserId(userId);
        List<CardRestResponse.CardListDTO> cardListDTO = cardListPS.stream()
                .map(card -> new CardRestResponse.CardListDTO(card))
                .collect(Collectors.toList());
        return cardListDTO;

    }

    @Transactional
    public CardRestResponse.RegistrationCardDTO registrationCard(
            CardRestRequest.RegistrationCardDTO cardRegistrationDTO,
            int userId) {

        Card cardPS = cardJPARepository.findByNumber(cardRegistrationDTO.getCardNumber());
        // System.out.println("입력한 핀번호" + cardRegistrationDTO.getPinNumber());

        if (cardPS == null) {
            System.out.println("db에 cardPS없음");
            String fail = "카드번호 또는 핀번호를 잘못 입력하였습니다";
            CardRestResponse.RegistrationCardDTO responseDTO = new CardRestResponse.RegistrationCardDTO(fail);

            return responseDTO;
        }

        if (cardRegistrationDTO.getPinNumber() != cardPS.getPin()) {
            String fail = "카드번호 또는 핀번호를 잘못 입력하였습니다";
            CardRestResponse.RegistrationCardDTO responseDTO = new CardRestResponse.RegistrationCardDTO(fail);
            return responseDTO;
        }
        if (cardPS.getStatus() == 2) {
            String fail = "사용중인 카드입니다";
            CardRestResponse.RegistrationCardDTO responseDTO = new CardRestResponse.RegistrationCardDTO(fail);
            return responseDTO;
        }
        if (cardPS.getStatus() == 3) {
            String fail = "분실중인 카드입니다";
            CardRestResponse.RegistrationCardDTO responseDTO = new CardRestResponse.RegistrationCardDTO(fail);
            return responseDTO;
        }

        String fail = "";
        User user = User.builder()
                .id(userId)
                .build();
        cardPS.setUser(user);
        cardPS.setStatus(2);
        System.out.println("성공");
        CardRestResponse.RegistrationCardDTO responseDTO = new CardRestResponse.RegistrationCardDTO(cardPS, fail);
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
    public CardRestResponse.ChargeCardPageDTO viewChargeCardPage(CardRestRequest.ViewCardChargeDTO viewPayCardChargeDTO,
            int userId) {
        // 1. DB에서 값 긁어오기(레파지토리에 위임) : 프론트가 준 유저 아이디로.
        Card cardPS = cardJPARepository.findById(viewPayCardChargeDTO.getCardId())
                .orElseThrow(() -> new Exception400("카드가 없습니다"));
        // 2. 값의 핀넘버랑 유저가 준 핀넘버 비교
        if (viewPayCardChargeDTO.getCardId().equals(cardPS.getId())) {
            CardRestResponse.ChargeCardPageDTO cardChargePageDTO = new CardRestResponse.ChargeCardPageDTO(cardPS,
                    userId);
            return cardChargePageDTO;
        }

        throw new Exception400("카드가 일치하지않습니다");

        // 3. 일치여부확인
        // 3-1. 일치 -> 리턴 ~~~~~~~~~~
        // 3-2. 일치하지않으면-> 리턴 ~~~~~~~~~

        // 4.

    }

    @Transactional
    public CardRestResponse.CardChargeDTO chargeCard(CardRestRequest.ChargeCardDTO chargeCardDTO, int userId) {

        Card cardPS = cardJPARepository.findById(chargeCardDTO.getCardId())
                .orElseThrow(() -> new Exception400("카드가 없습니다"));

        int currentBalance = cardPS.getMoney();
        cardPS.setMoney(currentBalance + chargeCardDTO.getChargeMoney());

        CardRestResponse.CardChargeDTO cardChargeDTO = new CardRestResponse.CardChargeDTO(cardPS, userId);
        return cardChargeDTO;

    }

    @Transactional
    public void deleteCard(CardRestRequest.DeleteCardDTO deleteCardDTO, int userId) {

        Card cardPS = cardJPARepository.findById(deleteCardDTO.getCardId())
                .orElseThrow(() -> new Exception400("카드가 없습니다"));

        if (cardPS.getMoney() == 0) {
            cardJPARepository.deleteById(cardPS.getId());
        } else {
            cardPS.setUser(null);
            cardPS.setStatus(1);

        }

    }

    // 관리자 카드 등록
    public Page<CardResponse.RegistrationCardDTO> 카드등록(Integer page) {
        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");

//        Page<CardResponse.AddDTO>

    return null;
    }
}
