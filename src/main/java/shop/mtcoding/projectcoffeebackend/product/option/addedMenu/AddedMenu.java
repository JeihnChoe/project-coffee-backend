package shop.mtcoding.projectcoffeebackend.product.option.addedMenu;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "adde_menu_tb")
@ToString
public class AddedMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String menu; //1.루어팍 , 2. 크림치즈

}
