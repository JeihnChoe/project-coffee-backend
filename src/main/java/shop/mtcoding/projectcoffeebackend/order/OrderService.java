package shop.mtcoding.projectcoffeebackend.order;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend.user.User;

@Transactional(readOnly = true)
@NoArgsConstructor
@Service
public class OrderService {

    @Transactional
    public void saveOrder(User sessionUser) {


    }
}
