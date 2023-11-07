package shop.mtcoding.projectcoffeebackend.promotion;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend.promotion.api.PromotionRestResponse;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class PromotionService {

    final PromotionJPARepository promotionJPARepository;

    // 프로모션 리스트보기
    public List<PromotionRestResponse.FindAllListDTO> findAllListPromotion() { // 프로모션 리스트
        List<Promotion> promotionPS = promotionJPARepository.findAll();
        List<PromotionRestResponse.FindAllListDTO> responseDTOs = promotionPS.stream()
                .map(promotion -> new PromotionRestResponse.FindAllListDTO(promotion))
                .collect(Collectors.toList());
        return responseDTOs;
    }

    public PromotionRestResponse.FindByPromotionIdDTO findById(Integer id) {
        Promotion promotionPS = promotionJPARepository.findById(id)
                .orElseThrow(() -> new Exception400("프로모션id가 없습니다 : "));
        PromotionRestResponse.FindByPromotionIdDTO responseDTO = new PromotionRestResponse.FindByPromotionIdDTO(
                promotionPS);

        return responseDTO;
    }

}
