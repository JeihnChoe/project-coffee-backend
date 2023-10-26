package shop.mtcoding.projectcoffeebackend.promotion;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionResponse.FindAllListDTO;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionResponse.FindByAllHomeThumbnailDTO;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionResponse.FindByPromotionIdDTO;

@Transactional(readOnly = true)
@NoArgsConstructor
@Service
public class PromotionService {

    @Autowired
    PromotionJPARepository promotionJPARepository;

    public List<PromotionResponse.FindAllWhatsNewDTO> findAllWhatsNewPromotion() {
        List<Promotion> promotionPS = promotionJPARepository.findAll();
        List<PromotionResponse.FindAllWhatsNewDTO> responseDTOs = promotionPS.stream()
                .map(promotion -> new PromotionResponse.FindAllWhatsNewDTO(promotion))
                .collect(Collectors.toList());
        return responseDTOs;
    }

    public List<PromotionResponse.FindByAllHomeThumbnailDTO> findAllHomePromotion() {
        List<Promotion> promotionPS = promotionJPARepository.findAll();
        List<PromotionResponse.FindByAllHomeThumbnailDTO> responseDTOs = promotionPS.stream()
                .map(promotion -> new PromotionResponse.FindByAllHomeThumbnailDTO(promotion))
                .filter(promotion -> promotion.getHomeThumbnail() != null)
                .collect(Collectors.toList());
        return responseDTOs;
    }

    public List<PromotionResponse.FindAllListDTO> findAllListPromotion() {
        List<Promotion> promotionPS = promotionJPARepository.findAll();
        List<PromotionResponse.FindAllListDTO> responseDTOs = promotionPS.stream()
                .map(promotion -> new PromotionResponse.FindAllListDTO(promotion))
                .collect(Collectors.toList());
        return responseDTOs;
    }

    public PromotionResponse.FindByPromotionIdDTO findById(Integer id) {
        Promotion promotionPS = promotionJPARepository.findById(id)
                .orElseThrow(() -> new Exception400("프로모션id가 없습니다 : "));
        PromotionResponse.FindByPromotionIdDTO responseDTO = new PromotionResponse.FindByPromotionIdDTO(promotionPS);

        return responseDTO;
    }

}
