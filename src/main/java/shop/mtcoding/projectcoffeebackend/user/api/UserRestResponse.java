package shop.mtcoding.projectcoffeebackend.user.api;

import java.text.SimpleDateFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import shop.mtcoding.projectcoffeebackend.user.User;

public class UserRestResponse {
    @Getter
    @Setter
    public static class FindById {
        private int id;
        private String userName;
        private String email;

        public FindById(User user) {
            this.id = user.getId();
            this.userName = user.getUserName();
            this.email = user.getEmail();
        }
    }

    @Getter
    @Setter
    public static class LoginResponseDTO {
        private String jwt;
        private UserDTO userDTO;

        public LoginResponseDTO(User user, String jwt) {
            this.jwt = jwt;
            this.userDTO = new UserDTO(user);
        }

        @Getter
        @Setter
        @ToString
        public static class UserDTO {
            private int id;
            private String loginId;
            private String userName;
            private String email;
            private String phoneNumber;
            private int manager;
            private String userCreatedAt;
            private String userUpdateAt;

            public UserDTO(User user) {
                this.id = user.getId();
                this.loginId = user.getLoginId();
                this.userName = user.getUserName();
                this.email = user.getEmail();
                this.phoneNumber = user.getPhoneNumber();
                this.manager = user.getManager();
                this.userCreatedAt = new SimpleDateFormat("yyyy-MM-dd").format(user.getUserCreatedAt());
                ;
                this.userUpdateAt = new SimpleDateFormat("yyyy-MM-dd").format(user.getUserUpdatedAt());
                ;
            }
        }
    }
}