package shop.mtcoding.projectcoffeebackend.card.api;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.card.CardRequest;
import shop.mtcoding.projectcoffeebackend.card.CardResponse;
import shop.mtcoding.projectcoffeebackend.card.CardService;
import shop.mtcoding.projectcoffeebackend.user.User;
import shop.mtcoding.projectcoffeebackend.user.UserService;

@RequestMapping("/api/card")
@RestController
@RequiredArgsConstructor
public class CardRestController {

    final private CardService cardService;
    final private HttpSession session;
    final private UserService userService;

    @GetMapping("/viewdetailpage")
    public ResponseEntity<?> viewCardDetail() {
        User sessionUser = (User) session.getAttribute("sessionUser"); // 로그인한사용자정보
        CardResponse.CardDetailDTO cardDetailDTO = cardService.viewCardDetail(sessionUser.getId());
        return ResponseEntity.ok().body(ApiUtils.success(cardDetailDTO));
    }

    @GetMapping("/viewcardlistpage")
    public ResponseEntity<?> viewCardList() {
        User sessionUser = (User) session.getAttribute("sessionUser");

        List<CardResponse.CardListDTO> responseDTO = cardService.viewCardList(sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    @PostMapping("/cardregistrationpage")
    public ResponseEntity<?> registerIndividualCard(
            @RequestBody @Valid CardRequest.RegistrationCardDTO registrationCardDTO) {

        // 1. 유효성검사(로그인이 되어있는지)
        User sessionUser = (User) session.getAttribute("sessionUser");
        // if (sessionUser == null) {

        // }

        // int userId = sessionUser.getId();

        // 2. 서비스한테 비지니스메서드 소환
        // (서비스한테 줘야하는 매개변수 : RequestDTO, userId)
        CardResponse.RegistrationCardDTO responseDTO = cardService.registrationCard(registrationCardDTO,
                sessionUser.getId());
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

    @GetMapping("/api/cards/viewchargecardpage")
    public ResponseEntity<?> viewCardChargePage(
            @RequestBody @Valid CardRequest.ViewCardChargeDTO payCardChargeDTO) {
        // 0. 주소 제대로 줬는지, 프론트가 주는게 있는지
        User sessionUser = (User) session.getAttribute("sessionUser");
        // 1. 유효성검사
        // 2. 서비스한테위임
        CardResponse.ChargeCardPageDTO cardChargePageDTO = cardService.viewChargeCardPage(payCardChargeDTO,
                sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(cardChargePageDTO));
    }

    @PostMapping("/api/cards/chargeindividualcard")
    public ResponseEntity<?> chargeIndividualCard(@RequestBody @Valid CardRequest.ChargeCardDTO chargeCardDTO) {

        // PayCardChargeDTO.builder().cardId(1).chargeMoney(5000).build();

        User sessionUser = (User) session.getAttribute("sessionUser");

        CardResponse.CardChargeDTO cardChargeDTO = cardService.chargeCard(chargeCardDTO, sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(cardChargeDTO));
    }

    @PostMapping("/api/cards/deletecard")
    public ResponseEntity<?> deleteIndividualCard(@RequestBody @Valid CardRequest.DeleteCardDTO deleteCardDTO) {

        User sessionUser = (User) session.getAttribute("sessionUser");

        cardService.deleteCard(deleteCardDTO, sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(null));
    }

}
