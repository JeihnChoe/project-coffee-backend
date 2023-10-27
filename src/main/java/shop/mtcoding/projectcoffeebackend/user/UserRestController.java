package shop.mtcoding.projectcoffeebackend.user;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.utils.ApiUtils;

@RequiredArgsConstructor
@RestController
public class UserRestController {

    private final UserService userService;
    private final HttpSession session;

    @GetMapping("/test")
    public String test(HttpServletResponse response) {
        session.setAttribute("hello", "hello");
        Cookie cookie = new Cookie("name", "ssar"); // 변수명 바껴서 안될때 name수정
        cookie.setHttpOnly(false);
        response.setStatus(200);
        response.addCookie(cookie);
        // email=cos
        return "ok";
    }

    // 회원가입
    @PostMapping("/api/join")
    public ResponseEntity<?> join(@RequestBody @Valid UserRequest.JoinDTO requestDTO, Errors errors) {
        userService.join(requestDTO);
        return ResponseEntity.ok().body(ApiUtils.success(null));
    }

    // 로그인
    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody @Valid UserRequest.LoginDTO requestDTO, Errors errors) {
        String jwt = userService.login(requestDTO);

        return ResponseEntity.ok().header("Authorization", "Bearer " + jwt).body(ApiUtils.success(null));
    }

    // 로그아웃
    @GetMapping("/api/logout")
    public ResponseEntity<?> logout() {
        session.invalidate();
        return ResponseEntity.ok().body(ApiUtils.success(null));
    }

    // 비밀번호 변경
    @PostMapping("/api/pwdupdate")
    public ResponseEntity<?> pwdupdate(@RequestBody @Valid UserRequest.PwdUpdateDTO pwdUpdateDTO, Errors errors) {
        System.out.println("패스워드 진입 전 ");
        userService.pwdupdate(pwdUpdateDTO);
        return ResponseEntity.ok().body(ApiUtils.success(null));
    }
}
