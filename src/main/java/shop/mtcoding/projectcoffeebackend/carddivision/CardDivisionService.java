package shop.mtcoding.projectcoffeebackend.carddivision;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class CardDivisionService {

    final private CardDivisionJPARepository cardDivisionJPARepository;

    public void registerCardDivision(CardDivisionRequest.RegisterCardDivisionDTO registerCardDivisionDTO) {

        try {
            cardDivisionJPARepository.save(registerCardDivisionDTO.toEntity());
        } catch (Exception e) {
            throw e;
        }
        ;
    }

    public CardDivisionResponse.CardDivisionListDTO 카드조회() {
        List<CardDivision> cardDivisionList = cardDivisionJPARepository.findAll();
        CardDivisionResponse.CardDivisionListDTO responseDTO= new CardDivisionResponse.CardDivisionListDTO(cardDivisionList);
        return responseDTO;
    }
}
