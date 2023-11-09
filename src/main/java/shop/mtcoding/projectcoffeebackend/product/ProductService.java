package shop.mtcoding.projectcoffeebackend.product;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.projectcoffeebackend._core.errors.exception.Exception400;
import shop.mtcoding.projectcoffeebackend._core.vo.MyPath;
import shop.mtcoding.projectcoffeebackend.category.Category;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.product.option.OptionJPARepository;
import shop.mtcoding.projectcoffeebackend.product.option.size.Size;
import shop.mtcoding.projectcoffeebackend.user.UserRequest;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductJPARepository productJPARepository;
    private final OptionJPARepository optionJPARepository;

    public List<MyProductDTO> 음료조회() {
        System.out.println("음료조회 서비스 탐");
        List<MyProductDTO> beverageList = productJPARepository.findAllWithOptionAndSize();
        System.out.println("서비스 테스트 : " + beverageList.get(0).getPrice());
        return beverageList;
    }

    @Transactional
    public void 음료추가(UserRequest.RegistrationBeverageDTO requestDTO) {
        // Category categoryPS =
        // categoryJPARepository.findByCategoryEngName(requestDTO.getCategoryName());
        Category category = Category.builder().id(requestDTO.getCategoryId()).build();

        UUID uuid = UUID.randomUUID(); // 랜덤한 해시값을 만들어줌(충돌날 일 없음)
        String fileName = uuid + "_" + requestDTO.getPicUrl().getOriginalFilename();

        Path filePath = Paths.get(MyPath.IMG_PATH + fileName); // ./images/ 는 프로젝트 경로의 images폴더 안에(상대경로)
        try {
            Files.write(filePath, requestDTO.getPicUrl().getBytes()); // 버퍼에 쓴다.
        } catch (Exception e) {
            throw new Exception400("파일이 없습니다.");

        }

        // 핫 만 체크되었을 때
        if (requestDTO.getHot() != null) {
            System.out.println("테스트S : 핫 만");
            Product beverage = Product.builder()
                    .name(requestDTO.getName())
                    .engName(requestDTO.getEngName())
                    .description(requestDTO.getDescription())
                    .tip(requestDTO.getTip())
                    .isIced(Boolean.parseBoolean(requestDTO.getHot()))
                    .picUrl(fileName)
                    .category(category)
                    .build();
            productJPARepository.save(beverage);

            // 첫번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getPrice1() != null) {
                System.out.println("테스트S : 핫 만 + 첫번째 사이즈");
                // Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize1());
                Size size = Size.builder().id(requestDTO.getSize1()).build();
                Option option = Option.builder()
                        .price(requestDTO.getPrice1())
                        .product(beverage)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }

            // 두번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getPrice2() != null) {
                System.out.println("테스트S : 핫 만 + 두번째 사이즈");
                // Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize2());
                Size size = Size.builder().id(requestDTO.getSize2()).build();
                Option option = Option.builder()
                        .price(requestDTO.getPrice2())
                        .product(beverage)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }

            // 세번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getPrice3() != null) {
                System.out.println("테스트S : 핫 만 + 세번째 사이즈");
                // Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize3());
                Size size = Size.builder().id(requestDTO.getSize3()).build();
                Option option = Option.builder()
                        .price(requestDTO.getPrice3())
                        .product(beverage)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }
        }

        // 아이스 만 체크되었을 때
        else if (requestDTO.getIced() != null) {
            System.out.println("테스트S : 아이스 만");
            Product beverage = Product.builder()
                    .name(requestDTO.getName())
                    .engName(requestDTO.getEngName())
                    .description(requestDTO.getDescription())
                    .tip(requestDTO.getTip())
                    .isIced(Boolean.parseBoolean(requestDTO.getIced()))
                    .picUrl(fileName)
                    .category(category)
                    .build();
            productJPARepository.save(beverage);

            // 첫번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getPrice1() != null) {
                System.out.println("테스트S : 아이스 만 + 첫번째 사이즈");

                // Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize1());
                Size size = Size.builder().id(requestDTO.getSize1()).build();
                Option option = Option.builder()
                        .price(requestDTO.getPrice1())
                        .product(beverage)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }

            // 두번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getPrice2() != null) {
                System.out.println("테스트S : 아이스 만 + 두번째 사이즈");

                // Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize2());
                Size size = Size.builder().id(requestDTO.getSize2()).build();
                Option option = Option.builder()
                        .price(requestDTO.getPrice2())
                        .product(beverage)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }

            // 세번째 사이즈/금액 칸 입력됐을 때
            if (requestDTO.getPrice3() != null) {
                System.out.println("테스트S : 아이스 만 + 세번째 사이즈");

                // Size sizePS = sizeJPARepository.findBySize(requestDTO.getSize3());
                Size size = Size.builder().id(requestDTO.getSize3()).build();
                Option option = Option.builder()
                        .price(requestDTO.getPrice3())
                        .product(beverage)
                        .size(size)
                        .build();
                optionJPARepository.save(option);

            }
        } else {
            throw new Exception400("핫/아이스 선택해주세요");
        }

    }

    @Transactional
    public void 푸드추가(ProductRequest.RegisterFoodDTO resgisterFoodDTO) {

        Category.builder().id(resgisterFoodDTO.getCategoryId()).build();

        Category category = new Category();
        category.setId(resgisterFoodDTO.getCategoryId());

        UUID uuid = UUID.randomUUID(); // 랜덤한 해시값을 만들어줌(충돌날 일 없음)
        String fileName = uuid + "_" + resgisterFoodDTO.getPicUrl();

        Path filePath = Paths.get(MyPath.IMG_PATH + fileName); // ./images/ 는 프로젝트 경로의 images폴더 안에(상대경로)
        try {
            Files.write(filePath, resgisterFoodDTO.getPicUrl().getBytes()); // 버퍼에 쓴다.
        } catch (Exception e) {
            throw new Exception400("파일이 없습니다.");

        }
        Product production = Product.builder()
                .category(category)
                .description(resgisterFoodDTO.getDescription())
                .engName(resgisterFoodDTO.getEngName())
                .name(resgisterFoodDTO.getName())
                .picUrl(fileName)
                .tip(resgisterFoodDTO.getTip())
                .build();

        productJPARepository.save(production);

    }

}
