package shop.mtcoding.projectcoffeebackend.user;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception500;
import shop.mtcoding.projectcoffeebackend._core.utils.JwtTokenUtils;
import shop.mtcoding.projectcoffeebackend._core.vo.MyPath;
import shop.mtcoding.projectcoffeebackend.product.Product;
import shop.mtcoding.projectcoffeebackend.product.ProductJPARepository;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.product.option.OptionJPARepository;
import shop.mtcoding.projectcoffeebackend.product.option.size.Size;
import shop.mtcoding.projectcoffeebackend.product.option.size.SizeJPARepository;
import shop.mtcoding.projectcoffeebackend.category.Category;
import shop.mtcoding.projectcoffeebackend.category.CategoryJPARepository;
import shop.mtcoding.projectcoffeebackend.promotion.PromotionJPARepository;
import shop.mtcoding.projectcoffeebackend.user.api.UserRestRequest;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;
    private final ProductJPARepository productJPARepository;
    private final CategoryJPARepository categoryJPARepository;
    private final SizeJPARepository sizeJPARepository;
    private final OptionJPARepository optionJPARepository;

    @Transactional
    public void join(UserRestRequest.JoinDTO requestDTO) {
        try {
            userJPARepository.save(requestDTO.toEntity());
        } catch (Exception e) {
            throw new Exception500("unknown server error");
        }
    }

    public String login(UserRestRequest.LoginDTO requestDTO) {
        User userPS = userJPARepository.findByLoginId(requestDTO.getLoginId())
                .orElseThrow(() -> new Exception400("아이디를 찾을 수 없습니다 : " + requestDTO.getLoginId()));
        // System.out.println("입력한 비번 : " + requestDTO.getPassword());
        // System.out.println("db 비번 : " + userPS.getPassword());
        if (requestDTO.getPassword().equals(userPS.getPassword())) {
            // System.out.println("아이디, 비밀번호 일치");
            return JwtTokenUtils.create(userPS);
        }
        throw new Exception400("비밀번호가 일치하지 않습니다.");
    }

    @Transactional
    public void pwdupdate(UserRestRequest.PwdUpdateDTO pwdUpdateDTO) {
        // 조회완료
        User user = userJPARepository.findByLoginId(pwdUpdateDTO.getLoginId())
                .orElseThrow(() -> new Exception400("아이디를 찾을 수 없습니다 : " + pwdUpdateDTO.getPassword()));
        System.out.println("유저 안에 머가있지? " + user.getEmail());
        System.out.println("유저 안에 머가있지? " + user.getPassword());

        // 현비밀번호 == 조회한거랑 같은지?
        if (!user.getPassword().equals(pwdUpdateDTO.getPassword())) {
            user.setPassword(pwdUpdateDTO.getPassword());
            userJPARepository.save(user);
        }
        // 다르면?
        // (다쓰고나면 받을거 있음?) == (return 있음?)

    }



    public List<Object[]> 음료조회() {
        System.out.println("음료조회 서비스 탐");
        List<Object[]> beverageList = beverageJPARepository.findAllWithOptionAndSize();

        int a = (int) beverageList.get(0)[0];
        String b = (String) beverageList.get(0)[1];
        System.out.println("음료조회1 id" + a);//
        System.out.println("음료조회1 카테고리이름" + b);//
        return beverageList;
    }

    @Transactional
    public void 푸드추가(UserRequest.ResgisterFoodDTO requestDTO) {

        productJPARepository.save(requestDTO.toEntity());

    }

}