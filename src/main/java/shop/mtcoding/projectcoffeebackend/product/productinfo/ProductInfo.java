package shop.mtcoding.projectcoffeebackend.product.productinfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.mtcoding.projectcoffeebackend.product.Product;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "product_info_tb")
public class ProductInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 200)
    private String name; // 제품명
    @Column(nullable = false, length = 200)
    private String type; // 식품의 유형
    @Column(nullable = false, length = 200)
    private String producerAndLocation; // 생산자 및 소재지
    @Column(nullable = false, length = 200)
    private String importAndImporter; // 수입여부와 수입자
    @Column(nullable = false, length = 1000)
    private String expirationDate; // 유통/소비기한, 품질유지 기한
    @Column(nullable = false, length = 200)
    private String capacity; // 포장 단위별 내용물의 용량(중량), 수량
    @Column(nullable = false, length = 200)
    private String rawMaterialName; // 원재료명(원잔지 포함) 및 함량
    @Column(nullable = false, length = 200)
    private String nutrient; // 영양성분
    @Column(nullable = false, length = 200)
    private String geneticallyModifiedFood; // 유전자 변형식품 여부와 포함 내역
    @Column(nullable = false, length = 200)
    private String precautions; // 소비자 안전을 위한 주의사항
    @Column(nullable = false, length = 200)
    private String tel; // 소비자 상담 관련 전화번호
    @Column(nullable = false, length = 200)
    private String importDeclaration; // 수입식품안전관리특별법에 따른 수입신고 필함 여부

    private Product product;

}
