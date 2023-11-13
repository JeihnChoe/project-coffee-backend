package shop.mtcoding.projectcoffeebackend.carddivision;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend._core.vo.MyPath;

import javax.transaction.Transactional;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;


@RequiredArgsConstructor
@Service
public class CardDivisionService {

    final private CardDivisionJPARepository cardDivisionJPARepository;

    @Transactional
    public void registerCardDivision(CardDivisionRequest.RegisterCardDivisionDTO requestDTO) {

        UUID uuid = UUID.randomUUID(); // 랜덤한 해시값을 만들어줌(충돌날 일 없음)
        String fileName = uuid + "_" + requestDTO.getPicUrl().getOriginalFilename();

        Path filePath = Paths.get(MyPath.IMG_PATH + fileName); // ./images/ 는 프로젝트 경로의 images폴더 안에(상대경로)
        try {
            Files.write(filePath, requestDTO.getPicUrl().getBytes()); // 버퍼에 쓴다.
        } catch (Exception e) {
            throw new Exception400("파일이 없습니다.");

        }

        try {
            cardDivisionJPARepository.save(requestDTO.toEntity(fileName));
        } catch (Exception e) {
            throw e;
        }

    }

    public CardDivisionResponse.CardDivisionListDTO 카드조회() {
        List<CardDivision> cardDivisionList = cardDivisionJPARepository.findAll();
        CardDivisionResponse.CardDivisionListDTO responseDTO= new CardDivisionResponse.CardDivisionListDTO(cardDivisionList);
        return responseDTO;
    }
}
