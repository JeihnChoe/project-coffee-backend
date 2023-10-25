package shop.mtcoding.projectcoffeebackend.food;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.NoArgsConstructor;

@Transactional(readOnly = true)
@NoArgsConstructor
@Service
public class FoodService {

}
