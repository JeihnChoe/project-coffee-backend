package shop.mtcoding.projectcoffeebackend.promotion.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionService;

import java.util.List;

@RequestMapping("/api/promotion")
@RestController
@RequiredArgsConstructor
public class PromotionRestController {

    private final PromotionService promotionService;

    // See All화면의 이벤트 리스트
    @GetMapping("/viewpromotionlist")
    public ResponseEntity<?> viewPromotionList() {
        List<PromotionRestResponse.FindAllListDTO> response = promotionService.findAllListPromotion();
        return ResponseEntity.ok().body(ApiUtils.success(response));
    }

    // 이벤트 상세 페이지
    @GetMapping("/{id}/detailpage")
    public ResponseEntity<?> detailPromotion(@PathVariable Integer id) {

        PromotionRestResponse.FindByPromotionIdDTO response = promotionService.findById(id);

        return ResponseEntity.ok().header(null).body(ApiUtils.success(response));
    }

}
