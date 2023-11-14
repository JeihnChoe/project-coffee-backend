package shop.mtcoding.projectcoffeebackend.user.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.user.UserService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class UserRestController {

    private final UserService userService;
    private final HttpSession session;

    // 회원가입
    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody @Valid UserRestRequest.JoinDTO requestDTO, Errors errors) {

        System.out.println("테스트 : 회원가입 맵핑 확인");

        userService.join(requestDTO);
        return ResponseEntity.ok().body(ApiUtils.success(null));
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid UserRestRequest.LoginDTO requestDTO, Errors errors) {
        System.out.println("테스트 : 회원 로그인 맵핑 확인");
        UserRestResponse.LoginResponseDTO response = userService.login(requestDTO);
        System.out.println("테스트 : 회원 로그인 output 확인");
        return ResponseEntity.ok().header("Authorization",
                response.getJwt()).body(ApiUtils.success(response.getUserDTO()));
    }

    // 로그아웃
    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        session.invalidate();
        return ResponseEntity.ok().body(ApiUtils.success(null));
    }

    // 비밀번호 변경
    @PostMapping("/pwdupdate")
    public ResponseEntity<?> pwdupdate(@RequestBody @Valid UserRestRequest.PwdUpdateDTO pwdUpdateDTO, Errors errors) {
        System.out.println("패스워드 진입 전 ");
        userService.pwdupdate(pwdUpdateDTO);
        return ResponseEntity.ok().body(ApiUtils.success(null));
    }
}
