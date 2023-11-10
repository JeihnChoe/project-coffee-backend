package shop.mtcoding.projectcoffeebackend.user;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import org.springframework.boot.context.properties.bind.DefaultValue;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20, nullable = false, unique = true)
    private String loginId;
    @Column(length = 100, nullable = false, unique = true)
    private String email; // 인증시 필요한 필드(인증용)
    @Column(length = 256, nullable = false)
    private String password;
    @Column(length = 256, nullable = false)
    private String userName;
    @Column(length = 256, nullable = false)
    private String phoneNumber;
    @Column
    @ColumnDefault("1")
    private int manager; // 1 : 유저 / 2 : 관리자
    @Column(length = 256)
    @CreationTimestamp
    private Timestamp userCreatedAt; // 가입일시
    @Column(length = 256)
    @UpdateTimestamp
    private Timestamp userUpdatedAt; // 수정일시

    @Builder
    public User(int id, String loginId, String email, String password, String userName, String phoneNumber, int manager,
            Timestamp userCreatedAt, Timestamp userUpdatedAt) {
        this.id = id;
        this.loginId = loginId;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.manager = manager;
        this.userCreatedAt = userCreatedAt;
        this.userUpdatedAt = userUpdatedAt;
    }

    // TODO : 추가 기능 - 등급, 포인트

}
