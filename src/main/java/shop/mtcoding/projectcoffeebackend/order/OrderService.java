package shop.mtcoding.projectcoffeebackend.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception404;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception500;
import shop.mtcoding.projectcoffeebackend.cart.Cart;
import shop.mtcoding.projectcoffeebackend.cart.CartJPARepository;
import shop.mtcoding.projectcoffeebackend.order.api.OrderRestResponse;
import shop.mtcoding.projectcoffeebackend.order.item.Item;
import shop.mtcoding.projectcoffeebackend.order.item.ItemJPARepository;
import shop.mtcoding.projectcoffeebackend.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class OrderService {

    private final CartJPARepository cartJPARepository;
    private final OrderJPARepository orderJPARepository;
    private final ItemJPARepository itemJPARepository;


    @Transactional
    public void saveOrder(User sessionUser) {
        //1. 유저 장바구니 조회
        List<Cart> cartListPS = cartJPARepository.findByUserId(sessionUser.getId());

        if (cartListPS == null) {
            throw new Exception404("장바구니 내역이 없습니다.");
        }

        //2. 주문 생성
        Order orderPS = orderJPARepository.save(Order.builder().user(sessionUser).build());

        //3. 주문 아이템 저장
        List<Item> itemList = new ArrayList<>();
        for (Cart cartPS : cartListPS) {
            Item item = Item.builder()
                    .option(cartPS.getOption())
                    .order(orderPS)
                    .cupType(cartPS.getCupType())
                    .quantity(cartPS.getQuantity())
                    .totalAmount(cartPS.getQuantity() * cartPS.getOption().getPrice())
                    .build();
            itemList.add(item);
        }
        try {
            itemJPARepository.saveAll(itemList);
        } catch (Exception e) {
            throw new Exception500("알 수 없는 오류로 결제에 실패하였습니다. 잠시 후 다시 시도해주세요");
        }

        //4. 유저 장바구니 초기화
        try {
            cartJPARepository.deleteAllByUserId(sessionUser.getId());
        } catch (Exception e) {
            throw new Exception500("장바구니 비우기 실패하였습니다.");
        }

    }

    //주문내역전체조회
    public List<OrderRestResponse.FindAllOrderDTO> viewAllOrder(Integer userId) {
        List<Item> ItemPS = itemJPARepository.findAllOrderById(userId);

        List<OrderRestResponse.FindAllOrderDTO> response = ItemPS.stream()
                .map(item -> new OrderRestResponse.FindAllOrderDTO(item))
                .collect(Collectors.toList());

        return response;
    }
}
