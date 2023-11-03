package shop.mtcoding.projectcoffeebackend.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mtcoding.projectcoffeebackend.beverage.BeverageJPARepository;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionJPARepository;

@Service
public class ManagerService {

    @Autowired
    BeverageJPARepository beverageJPARepository;

    @Autowired
    PromotionJPARepository promotionJPARepository;

    @Transactional
    public void 음료추가(ManagerRequest.RegistrationBeverageDTO requestDTO) {

    }

}
