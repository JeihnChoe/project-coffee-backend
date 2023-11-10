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

    // 카드 등록 페이지
    @GetMapping("/resgisterform")
    public String viewCards(@RequestParam(defaultValue = "0") Integer page, HttpServletRequest request) {

        return "/cards/registerCardsForm";
    }
}
