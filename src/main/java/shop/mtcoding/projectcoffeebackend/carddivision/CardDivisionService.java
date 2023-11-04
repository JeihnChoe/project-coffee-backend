package shop.mtcoding.projectcoffeebackend.carddivision;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception500;
import shop.mtcoding.projectcoffeebackend._core.vo.MyPath;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.UUID;


@RequiredArgsConstructor
@Service
public class CardDivisionService {

    final private CardDivisionJPARepository cardDivisionJPARepository;

    public void registerCardDivision(CardDivisionRequest.RegisterCardDivisionDTO registerCardDivisionDTO) {

        System.out.println("야 여기 실행됨? 1");
        UUID uuid = UUID.randomUUID();

        String cardDivisionUrl = uuid+"_"+registerCardDivisionDTO.getPicUrl().getOriginalFilename();

        Path filePath = Paths.get(MyPath.IMG_PATH+cardDivisionUrl);

        try {
            Files.write(filePath, registerCardDivisionDTO.getPicUrl().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception500("파일쓰기 오류 : "+e.getMessage());
        }
        System.out.println("야 여기 실행됨? 2");
        cardDivisionJPARepository.save(CardDivision.builder()
                .cardName(registerCardDivisionDTO.getCardName())
                .cardMoney(registerCardDivisionDTO.getCardMoney())
                .cardDivisionPicUrl(cardDivisionUrl)
                .startAt(registerCardDivisionDTO.getStartAt())
                .build());

        System.out.println("야 여기 실행됨? 3");
    }

    public CardDivisionResponse.ActiveCardDivisionDTO findActiveCardDivision() {








        return null;
    }
}
