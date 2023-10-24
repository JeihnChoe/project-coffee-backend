package shop.mtcoding.projectcoffeebackend.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception500;
import shop.mtcoding.projectcoffeebackend._core.utils.JwtTokenUtils;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;

    @Transactional
    public void join(UserRequest.JoinDTO requestDTO) {
        try {
            userJPARepository.save(requestDTO.toEntity());
        } catch (Exception e) {
            throw new Exception500("unknown server error");
        }
    }

    public String login(UserRequest.LoginDTO requestDTO) {
        User userPS = userJPARepository.findByEmail(requestDTO.getEmail())
                .orElseThrow(() -> new Exception400("email을 찾을 수 없습니다 : " + requestDTO.getEmail()));
        return JwtTokenUtils.create(userPS);
    }

    @Transactional
    public void pwdupdate(UserRequest.PwdUpdateDTO pwdUpdateDTO) {
        // 조회완료
        User user = userJPARepository.findByEmail(pwdUpdateDTO.getEmail())
                .orElseThrow(() -> new Exception400("email을 찾을 수 없습니다 : " + pwdUpdateDTO.getPassword()));
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
}