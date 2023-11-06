package shop.mtcoding.projectcoffeebackend.product.allergy.productallergy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import shop.mtcoding.projectcoffeebackend.product.Product;
import shop.mtcoding.projectcoffeebackend.product.allergy.Allergy;

import javax.persistence.*;

@Entity
@Table(name = "product_allergy_tb")
public class ProductAllergy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Allergy allergy;

}
