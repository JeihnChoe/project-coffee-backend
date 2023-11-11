package shop.mtcoding.projectcoffeebackend.product.allergy;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "allergy_tb")
public class Allergy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name; // 1. 우유 2. 복숭아~~~~~~~~~~~~~~~~~~~~
}
