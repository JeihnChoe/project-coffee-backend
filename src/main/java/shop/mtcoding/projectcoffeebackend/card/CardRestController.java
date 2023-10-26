package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.user.User;

@RestController
@RequiredArgsConstructor
public class CardRestController {

    // @GetMapping("/card/detailview")
    // public CardResponse.CardDetailDTO cardDetail(@PathVariable Integer id) {
    // CardResponse.CardDetailDTO cardDetailDTO = card
    // }
    @Autowired
    CardService cardService;
    @Autowired
    private HttpSession session;

    @GetMapping("/card/viewdetailpage")
    public CardResponse.CardDetailDTO viewCardDetail() {
        System.out.println("실행됨?");
        // User sessionUser = (User) session.getAttribute("sessionUser"); // 로그인한사용자정보
        // if (sessionUser == null) {

        // }

        // int userId = sessionUser.getId();

        CardResponse.CardDetailDTO cardDetailDTO = cardService.viewCardDetail(1);

        return cardDetailDTO;
    }

    @GetMapping("/card/viewcardlistpage")
    public List<CardResponse.CardListDTO> viewCardList() {

        System.out.println("실행됨?");

        // User sessionUser = (User) session.getAttribute("sessionUser");
        // if (sessionUser == null) {

        // }

        // int userId = sessionUser.getId();
        System.out.println("userId" + 1);
        List<CardResponse.CardListDTO> responseDTO = cardService.viewCardList(1);

        return responseDTO;

    }

    @PostMapping("/card/cardregistrationpage")
    public List<CardRequest.CardRegistrationDTO> registerCard(
            @RequestBody @Valid CardRequest.CardRegistrationDTO cardRegistrationDTO) {

        // 1. 유효성검사(로그인이 되어있는지)
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {

        }

        int userId = sessionUser.getId();

        // 2. 서비스한테 비지니스메서드 소환
        // (서비스한테 줘야하는 매개변수 : RequestDTO, userId)
        cardService.cardRegistration(cardRegistrationDTO, userId);
        // 4. 서비스한테 전달받은 DTO 리턴하기

        return null;
    }
    // User sessionUser = (User) session.getAttribute("sessionUser");
    // int userId = sessionUser.getId();
    // cardService.cardRegistration(cardRegistrationDTO, userId);

}

// 0. 어떤 일을 할건지? - 그게 메소드 이름이됨
// 1. 어디로 요청을 받아야하는가? - 그게 겟메핑주소가됨
// 2. 프론트가 정보를 주나?? 주면 어디다받아야하지?? - 안줌, 주면 CardRequestDTO
// 3. 비지니스로직 작성
// 3-1. 유효성검사
// 3-2. 서비스한테 위임
// 4. 리턴 머할지? -
