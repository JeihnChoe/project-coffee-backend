package shop.mtcoding.projectcoffeebackend.promotion.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionResponse;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionService;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class PromotionRestController {

    private final PromotionService promotionService;

    // home화면의 What's New 리스트 api
    @GetMapping("/promotion/WhatsNewList")
    public List<PromotionResponse.FindAllWhatsNewDTO> promotionHome() {
        List<PromotionResponse.FindAllWhatsNewDTO> promotionList = promotionService.findAllWhatsNewPromotion();
        return promotionList;
    }

    // home화면의 큰 썸네일 리스트 api
    @GetMapping("/promotion/homeThumbnail")
    public List<PromotionResponse.FindByAllHomeThumbnailDTO> findAllHomeThumbnail() {
        List<PromotionResponse.FindByAllHomeThumbnailDTO> promotionList = promotionService.findAllHomePromotion();
        return promotionList;

    }

    // See All화면의 이벤트 리스트
    @GetMapping("/promotion/viewListPage")
    public List<PromotionResponse.FindAllListDTO> viewPromotionList() {
        List<PromotionResponse.FindAllListDTO> promotionList = promotionService.findAllListPromotion();
        return promotionList;
    }

    // 이벤트 상세 페이지
    @GetMapping("/promotion/{id}/detailPage")
    public PromotionResponse.FindByPromotionIdDTO detailPromotion(@PathVariable Integer id) {
        PromotionResponse.FindByPromotionIdDTO promotionList = promotionService.findById(id);
        return promotionList;
    }

}
