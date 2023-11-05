package shop.mtcoding.projectcoffeebackend.cart;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.NoArgsConstructor;

@Transactional(readOnly = true)
@NoArgsConstructor
@Service
public class CartService {

    public void addCartList() {

    }

}
