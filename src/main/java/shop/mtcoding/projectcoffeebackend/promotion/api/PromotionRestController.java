package shop.mtcoding.projectcoffeebackend.promotion.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionService;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class PromotionRestController {

    private final PromotionService promotionService;

    // See All화면의 이벤트 리스트
    @GetMapping("/promotion/viewpromotionlist")
    public List<PromotionRestResponse.FindAllListDTO> viewPromotionList() {
        List<PromotionRestResponse.FindAllListDTO> promotionList = promotionService.findAllListPromotion();
        return promotionList;
    }

    // 이벤트 상세 페이지
    @GetMapping("/promotion/{id}/detailPage")
    public PromotionRestResponse.FindByPromotionIdDTO detailPromotion(@PathVariable Integer id) {
        PromotionRestResponse.FindByPromotionIdDTO promotionList = promotionService.findById(id);
        return promotionList;
    }

}
