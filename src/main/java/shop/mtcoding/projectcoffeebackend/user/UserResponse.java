package shop.mtcoding.projectcoffeebackend.user;

import lombok.Getter;
import lombok.Setter;

public class UserResponse {

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

}
