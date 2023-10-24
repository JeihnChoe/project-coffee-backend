package shop.mtcoding.projectcoffeebackend.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100, nullable = true, unique = true)
    private String email; // 인증시 필요한 필드
    @Column(length = 256, nullable = true)
    private String password;
    @Column(length = 256, nullable = true)
    private String username;
    @Column(length = 256, nullable = false)
    private String phonenumber;
    @Column(length = 256, nullable = true)
    private int manager; // 1 : 유저 / 2 : 관리자
    @Column(length = 256, nullable = true)
    @CreationTimestamp
    private Timestamp createdAt; // 가입일시
    @Column(length = 256, nullable = true)
    @UpdateTimestamp
    private Timestamp updatedAt; // 수정일시

    @Builder
    public User(int id, String email, String password, String username, String phonenumber, int manager,
            Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.phonenumber = phonenumber;
        this.manager = manager;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // 추가 기능 개발에 필요한 것
    // 등급, 포인트

}
