package shop.mtcoding.projectcoffeebackend.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend._core.vo.MyPath;
import shop.mtcoding.projectcoffeebackend.category.Category;
import shop.mtcoding.projectcoffeebackend.category.CategoryJPARepository;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.product.option.OptionJPARepository;
import shop.mtcoding.projectcoffeebackend.product.option.size.Size;
import shop.mtcoding.projectcoffeebackend.user.UserRequest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ProductService {

    final OptionJPARepository optionJPARepository;
    final CategoryJPARepository categoryJPARepository;



    @Transactional
    public void 음료추가(UserRequest.RegistrationProductDTO requestDTO) {
        System.out.println("테스트S : " + requestDTO.getCategoryName());
        Category categoryPS = categoryJPARepository.findByCategoryEngName(requestDTO.getCategoryName());
        Category category = Category.builder().id(categoryPS.getId()).build();

        UUID uuid = UUID.randomUUID(); // 랜덤한 해시값을 만들어줌(충돌날 일 없음)
        String fileName = uuid + "_" + requestDTO.getproductPicUrl().getOriginalFilename();

        Path filePath = Paths.get(MyPath.IMG_PATH + fileName); // ./images/ 는 프로젝트 경로의 images폴더 안에(상대경로)
        try {
            Files.write(filePath, requestDTO.getproductPicUrl().getBytes()); // 버퍼에 쓴다.
        } catch (Exception e) {
            throw new Exception400("파일이 없습니다.");

        }

        // 핫 만 체크되었을 때
        if (requestDTO.getHot() != null) {
            System.out.println("테스트S : 핫 만");
            Product product = Product.builder()
                    .name(requestDTO.get())
                    .productEngName(requestDTO.getproductEngName())
                    .productDescription(requestDTO.getproductDescription())
                    .productTip(requestDTO.getproductTip())
                    .hotIced(Integer.parseInt(requestDTO.getHot()))
                    .productPicUrl(fileName)
                    .category(category)
                    .build();
            productJPARepository.save(product);

            // 첫번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getOptionPrice1() != null) {
                System.out.println("테스트S : 핫 만 + 첫번째 사이즈");
                Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize1());
                Size size = Size.builder().id(sizePS.getId()).build();
                Option option = Option.builder()
                        .optionPrice(requestDTO.getOptionPrice1())
                        .product(product)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }

            // 두번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getOptionPrice2() != null) {
                System.out.println("테스트S : 핫 만 + 두번째 사이즈");
                Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize2());
                Size size = Size.builder().id(sizePS.getId()).build();
                Option option = Option.builder()
                        .optionPrice(requestDTO.getOptionPrice2())
                        .product(product)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }

            // 세번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getOptionPrice3() != null) {
                System.out.println("테스트S : 핫 만 + 세번째 사이즈");
                Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize3());
                Size size = Size.builder().id(sizePS.getId()).build();
                Option option = Option.builder()
                        .optionPrice(requestDTO.getOptionPrice3())
                        .product(product)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }
        }

        // 아이스 만 체크되었을 때
        else if (requestDTO.getIced() != null) {
            System.out.println("테스트S : 아이스 만");
            Product product = Product.builder()
                    .productName(requestDTO.getproductName())
                    .productEngName(requestDTO.getproductEngName())
                    .productDescription(requestDTO.getproductDescription())
                    .productTip(requestDTO.getproductTip())
                    .hotIced(Integer.parseInt(requestDTO.getIced()))
                    .productPicUrl(fileName)
                    .category(category)
                    .build();
            productJPARepository.save(product);

            // 첫번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getOptionPrice1() != null) {
                System.out.println("테스트S : 아이스 만 + 첫번째 사이즈");

                Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize1());
                Size size = Size.builder().id(sizePS.getId()).build();
                Option option = Option.builder()
                        .optionPrice(requestDTO.getOptionPrice1())
                        .product(product)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }

            // 두번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getOptionPrice2() != null) {
                System.out.println("테스트S : 아이스 만 + 두번째 사이즈");

                Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize2());
                Size size = Size.builder().id(sizePS.getId()).build();
                Option option = Option.builder()
                        .optionPrice(requestDTO.getOptionPrice2())
                        .product(product)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }

            // 세번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getOptionPrice3() != null) {
                System.out.println("테스트S : 아이스 만 + 세번째 사이즈");

                Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize3());
                Size size = Size.builder().id(sizePS.getId()).build();
                Option option = Option.builder()
                        .optionPrice(requestDTO.getOptionPrice3())
                        .product(product)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }
        } else {
            throw new Exception400("핫/아이스 선택해주세요");
        }

    }
}
