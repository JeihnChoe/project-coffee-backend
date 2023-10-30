package shop.mtcoding.projectcoffeebackend.card;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception401;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.user.User;
import shop.mtcoding.projectcoffeebackend.user.UserService;

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
    @Autowired
    UserService userService;

    @GetMapping("/api/cards/viewdetailpage")
    public ResponseEntity<?> viewCardDetail() {
        System.out.println("실행됨?");
        // User sessionUser = (User) session.getAttribute("sessionUser"); // 로그인한사용자정보
        // if (sessionUser == null) {

        // }

        // int userId = sessionUser.getId();

        CardResponse.CardDetailDTO cardDetailDTO = cardService.viewCardDetail(1);

        return ResponseEntity.ok().body(ApiUtils.success(cardDetailDTO));

    }

    @GetMapping("/api/cards/viewcardlistpage")
    public ResponseEntity<?> viewCardList() {
        User sessionUser = (User) session.getAttribute("sessionUser");
        System.out.println("세션있음아이디 : " + sessionUser.getId());
        System.out.println("세션있음매니저아이디 : " + sessionUser.getManager());
        System.out.println("세션있음이름 : " + sessionUser.getUserName());
        System.out.println("세션있음로그인아이디 : " + sessionUser.getLoginId());
        System.out.println("세션있음이메일 : " + sessionUser.getEmail());
        System.out.println("세션있음비밀번호 : " + sessionUser.getPassword());
        System.out.println("세션있음폰번호 : " + sessionUser.getPhoneNumber());
        System.out.println("세션있음생성일자 : " + sessionUser.getUserCreatedAt());

        List<CardResponse.CardListDTO> responseDTO = cardService.viewCardList(sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    @PostMapping("/api/cards/cardregistrationpage")
    public ResponseEntity<?> registerCard(
            @RequestBody @Valid CardRequest.CardRegistrationDTO cardRegistrationDTO) {

        // 1. 유효성검사(로그인이 되어있는지)
        // User sessionUser = (User) session.getAttribute("sessionUser");
        // if (sessionUser == null) {

        // }

        // int userId = sessionUser.getId();

        // 2. 서비스한테 비지니스메서드 소환
        // (서비스한테 줘야하는 매개변수 : RequestDTO, userId)
        CardResponse.CardRegistrationDTO responseDTO = cardService.cardRegistration(cardRegistrationDTO, 1);
        // 4. 서비스한테 전달받은 DTO 리턴하기

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    // @GetMapping("/api/cards/paycardchargepage")
    // public ResponseEntity<?> chargePayCardPage(@RequestBody @Valid
    // CardRequest.PayCardChargeDTO payCardChargeDTO) {

    // String jwt = "1";
    // CardRequest.PayCardChargeDTO responseDTO = cardService.
    // return ResponseEntity.ok().header("Authorization", "Bearer " +
    // jwt).body(ApiUtils.success(null));
    // }

    @GetMapping("/api/cards/viewcardchargepage")
    public ResponseEntity<?> viewCardChargePage(
            @RequestBody @Valid CardRequest.ViewCardChargeDTO payCardChargeDTO) {
        // 0. 주소 제대로 줬는지, 프론트가 주는게 있는지

        // 1. 유효성검사
        // 2. 서비스한테위임
        CardResponse.CardChargePageDTO cardChargePageDTO = cardService.viewCardChargePage(payCardChargeDTO, 1);

        return ResponseEntity.ok().body(ApiUtils.success(cardChargePageDTO));
    }

    @PostMapping("/api/cards/cardcharge")
    public ResponseEntity<?> cardCharge(@RequestBody @Valid CardRequest.CardChargeDTO CardChargeDTO) {

        // PayCardChargeDTO.builder().cardId(1).chargeMoney(5000).build();

        User sessionUser = (User) session.getAttribute("sessionUser");

        CardResponse.CardChargeDTO cardChargeDTO = cardService.cardCharge(CardChargeDTO, sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(cardChargeDTO));
    }

}
