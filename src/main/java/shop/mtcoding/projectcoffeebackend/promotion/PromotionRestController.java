package shop.mtcoding.projectcoffeebackend.promotion;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PromotionRestController {

    private final PromotionService promotionService;

    // home화면의 이벤트 리스트
    @GetMapping("/")
    public List<PromotionResponse.FindAllToHomeDTO> index() {
        List<PromotionResponse.FindAllToHomeDTO> promotionList = promotionService.findAllPromotion();
        return promotionList;
    }

    // See All화면의 이벤트 리스트
    @GetMapping("/promotion/viewList")
    public List<PromotionResponse.FindAllListDTO> viewPromotionList() {
        List<PromotionResponse.FindAllListDTO> promotionList = promotionService.findAllListPromotion();
        return promotionList;
    }

    // 이벤트 상세 페이지
    @GetMapping("/promotion/{id}/detail")
    public PromotionResponse.FindByPromotionIdDTO detailPromotion(@PathVariable Integer id) {
        PromotionResponse.FindByPromotionIdDTO promotionList = promotionService.findById(id);
        return promotionList;
    }

}
