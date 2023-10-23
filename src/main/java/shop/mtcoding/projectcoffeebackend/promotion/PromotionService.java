package shop.mtcoding.projectcoffeebackend.promotion;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionResponse.FindAllListDTO;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionResponse.FindByPromotionIdDTO;

@Transactional(readOnly = true)
@NoArgsConstructor
@Service
public class PromotionService {

    @Autowired
    PromotionJPARepository promotionJPARepository;

    public List<PromotionResponse.FindAllToHomeDTO> findAllPromotion() {
        List<Promotion> promotionPS = promotionJPARepository.findAll();
        List<PromotionResponse.FindAllToHomeDTO> responseDTOs = promotionPS.stream()
                .map(promotion -> new PromotionResponse.FindAllToHomeDTO(promotion))
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
