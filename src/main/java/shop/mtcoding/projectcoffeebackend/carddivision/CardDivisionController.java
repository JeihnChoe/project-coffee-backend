package shop.mtcoding.projectcoffeebackend.carddivision;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor

@Controller
public class CardDivisionController {

    final private CardDivisionService cardDivisionService;


    @GetMapping("/carddivision/registercarddivisionform")
    public String registerCardDivisionForm(CardDivisionRequest cardDivisionRequest, HttpServletRequest request) {
        // 1. 유효성검사
        // 2. 조회 ->
        //System.out.println("Con사진" + cardDivisionRequest.);
        return "cards/registerCardsDivisionForm";
    }

    @PostMapping("/carddivision/registercarddivision")
    public String registerCardDivision(CardDivisionRequest.RegisterCardDivisionDTO registerCardDivisionDTO) {


        // 1. 유효성검사
        // - 필터에서거를예정

        // 2. 카드등록

        cardDivisionService.registerCardDivision(registerCardDivisionDTO);

        return null;
    }

}
