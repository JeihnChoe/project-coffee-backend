package shop.mtcoding.projectcoffeebackend.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {

    // $는 내부클래스 참조하기 위한 접근자
    // @Query(value = "SELECT new
    // shop.mtcoding.projectcoffeebackend.product.ProductResponse$MyProductDTO(o.id,
    // c.name , p.picUrl, p.name , p.engName, p.description, p.tip, p.isIced,
    // o.price, s.size)\r\n"
    // + "FROM Option o LEFT JOIN o.size s LEFT JOIN o.product p LEFT JOIN
    // p.category c ")
    // Page<MyProductDTO> findAllWithOptionAndSize(Pageable Page);

    List<Product> findAllByCategoryId(Integer id);

    // @Query(value = "SELECT new
    // shop.mtcoding.projectcoffeebackend.product.ProductResponse$MyProductDTO$ProductDTO(p.id,
    // c.name, p.picUrl, p.name, p.engName, p.description, p.tip, p.isIced, o.price,

    // s.size) " +
    // "FROM Product p LEFT JOIN p.options o LEFT JOIN o.size s LEFT JOIN p.category
    // c WHERE c.id = :id")
    // ProductResponse.MyProductDTO findAllByCategoryIdAndOptions(Integer id);

//    @Query(value = "select p from Product p left join p.options o left join o.size s left join fetch p.category c where c.code = :categoryCode order by p.id desc")
//    Page<Product> findAllByCategoryCode(Integer categoryCode, Pageable pageable);

    @Query("select pt from Product pt left join pt.options ot on pt.id = ot.product.id where pt.category.id = :categoryId")
    List<Product> findAllByCategoryIdWithOptionId(@Param("categoryId") Integer categoryId);

    @Query("select p from Product p left join Option o on p.id = o.product.id where o.product.id = :productId")
    List<Product> findProductAndOptionById(@Param("productId") Integer productId);
}
