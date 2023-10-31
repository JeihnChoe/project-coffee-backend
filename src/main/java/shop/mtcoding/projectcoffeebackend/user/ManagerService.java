package shop.mtcoding.projectcoffeebackend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mtcoding.projectcoffeebackend.beverage.BeverageJPARepository;

@Service
public class ManagerService {

    @Autowired
    BeverageJPARepository beverageJPARepository;

    public void 음료추가() {
        beverageJPARepository.save(null);
    }

}
