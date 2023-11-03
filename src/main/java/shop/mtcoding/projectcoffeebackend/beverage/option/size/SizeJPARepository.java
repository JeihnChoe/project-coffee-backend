package shop.mtcoding.projectcoffeebackend.beverage.option.size;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeJPARepository extends JpaRepository<Size, Integer> {

    Size findBySize(String size1);

}
