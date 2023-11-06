package shop.mtcoding.projectcoffeebackend.user.api;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;
import shop.mtcoding.projectcoffeebackend.user.UserService;

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
        String jwt = userService.login(requestDTO);

        return ResponseEntity.ok().header("Authorization", "Bearer " + jwt).body(ApiUtils.success(null));
    }

    // 로그아웃
    @GetMapping("/logout")
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
