package shop.mtcoding.projectcoffeebackend.card;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RequestMapping("/cards")
@Controller
public class CardController {
    private final CardService cardService;

    @GetMapping("/resgisterform")
    public String viewBeverage(@RequestParam(defaultValue = "0") Integer page, HttpServletRequest request) {
//        Page<CardResponse.RegistrationCardDTO> beveragePG = cardService.카드등록(page);
//        request.setAttribute("page", page);
//        request.setAttribute("beveragePG", beveragePG);
//        request.setAttribute("prevPage", beveragePG.getNumber() - 1);
//        request.setAttribute("nextPage", beveragePG.getNumber() + 1);

        return "/cards/registerCardsForm";
    }
}
