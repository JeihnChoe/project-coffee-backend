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
import shop.mtcoding.projectcoffeebackend.product.ProductResponse.MyProductDTO;
import shop.mtcoding.projectcoffeebackend.product.option.Option;
import shop.mtcoding.projectcoffeebackend.product.option.OptionJPARepository;
import shop.mtcoding.projectcoffeebackend.product.option.size.Size;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductJPARepository productJPARepository;
    private final OptionJPARepository optionJPARepository;

    public List<MyProductDTO> 음료조회() {
        System.out.println("음료조회 서비스 탐");
        // System.out.println("Product에서 options를 들고올 수 있을까" +
        // productJPARepository.findByAllOptions().get(0));
        List<MyProductDTO> beverageList = productJPARepository.findAllWithOptionAndSize();
        System.out.println("서비스 테스트1" + beverageList.get(0).getId());
        System.out.println("서비스 테스트2" + beverageList.get(0).getCategoryName());
        System.out.println("서비스 테스트3" + beverageList.get(0).getPrice());
        System.out.println("서비스 테스트4" + beverageList.get(0).getSize());

        return beverageList;
    }

    @Transactional
    public void 음료추가(ProductRequest.RegistrationBeverageDTO requestDTO) {
        // Category categoryPS =
        // categoryJPARepository.findByCategoryEngName(requestDTO.getCategoryName());
        Category category = Category.builder().id(requestDTO.getCategoryId()).build();

        System.out.println("음료추가 카테고리id : " + requestDTO.getCategoryId());
        System.out.println("음료추가 제품이름 : " + requestDTO.getName());
        System.out.println("음료추가 영문이름 : " + requestDTO.getEngName());
        System.out.println("음료추가 설명: " + requestDTO.getDescription());
        System.out.println("음료추가 팁: " + requestDTO.getTip());
        System.out.println("음료추가 핫./아이스 : " + requestDTO.getIsIced());
        System.out.println("음료추가 사진: " + requestDTO.getPicUrl());
        System.out.println("음료추가 크기1: " + requestDTO.getSize1());
        System.out.println("음료추가 크기2: " + requestDTO.getSize2());
        System.out.println("음료추가 크기3: " + requestDTO.getSize3());
        System.out.println("음료추가 가격1: " + requestDTO.getPrice1());
        System.out.println("음료추가 가격2: " + requestDTO.getPrice2());
        System.out.println("음료추가 가격3: " + requestDTO.getPrice3());

        UUID uuid = UUID.randomUUID(); // 랜덤한 해시값을 만들어줌(충돌날 일 없음)
        String fileName = uuid + "_" + requestDTO.getPicUrl().getOriginalFilename();

        Path filePath = Paths.get(MyPath.IMG_PATH + fileName); // ./images/ 는 프로젝트 경로의 images폴더 안에(상대경로)
        try {
            Files.write(filePath, requestDTO.getPicUrl().getBytes()); // 버퍼에 쓴다.
        } catch (Exception e) {
            throw new Exception400("파일이 없습니다.");

        }

        // 핫 만 체크되었을 때
        if (requestDTO.getIsIced() != null && !Boolean.parseBoolean(requestDTO.getIsIced())) {
            System.out.println("테스트S : 핫 만");
            Product beverage = Product.builder()
                    .name(requestDTO.getName())
                    .engName(requestDTO.getEngName())
                    .description(requestDTO.getDescription())
                    .tip(requestDTO.getTip())
                    .isIced(Boolean.parseBoolean(requestDTO.getIsIced()))
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
        else if (requestDTO.getIsIced() != null && Boolean.parseBoolean(requestDTO.getIsIced())) {
            System.out.println("테스트S : 아이스 만");
            Product beverage = Product.builder()
                    .name(requestDTO.getName())
                    .engName(requestDTO.getEngName())
                    .description(requestDTO.getDescription())
                    .tip(requestDTO.getTip())
                    .isIced(Boolean.parseBoolean(requestDTO.getIsIced()))
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

    @Transactional
    public void 푸드삭제(Integer id) {

        productJPARepository.deleteById(id);
    }

}
