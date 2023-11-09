INSERT INTO  user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (1, 'ssar', 'ssar@nate.com', 'a12345678!', '김쌀', '010-1212-1212', 1, '2020-02-02', '2020-02-02');
INSERT INTO user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (2, 'cos', 'cos@nate.com', 'a12345678!!', '코스', '010-1234-1234', 1, '2020-02-04', '2020-02-04');
INSERT INTO user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (3, 'love', 'love@nate.com', 'a12345678!!', '러브', '010-1234-1234', 1, '2020-02-04', '2020-02-04');

INSERT INTO card_division_tb (`id`,`pic_url`,`name`,`money`,`quantity`,`status`, `start_at`) VALUES(1,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','블랙핑크 카드',50000,30,true,null);
INSERT INTO card_division_tb (`id`,`pic_url`,`name`,`money`,`quantity`,`status`, `start_at`) VALUES(2,'https://image.istarbucks.co.kr/cardImg/20230822/010468_WEB.png','스노우맨 카아-드',30000,30,true,null);


INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(1, '블랙핑크카드',50000,123456780,123123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(2, '블랙핑크카드',12300,223456789,456789,'2020-12-12',2,1);
INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(3, '블랙핑크카드',50000,323456788,456123,'2020-12-12',2,2);
INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(4, '블랙핑크카드',50000,423456188,456123,'2020-12-12',2,3);
INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(5, '블랙핑크카드',50000,523456788,456123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(6, '스노우맨 카아-드',30000,623456788,456123,'2020-12-12',2,1);
INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(7, '스노우맨 카아-드',30000,723456788,456123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(8, '스노우맨 카아-드',30000,823456788,456123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(9, '스노우맨 카아-드',30000,923456788,456123,'2020-12-12',2,2);
INSERT INTO card_tb (`id`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(10,'스노우맨 카아-드',30000,023456788,456123,'2020-12-12',2,2);


INSERT INTO promotion_tb (`id`, `title`, `sub_content`, `start_date`, `end_date`, `is_open`, `pic_url`, `small_thumbnail`, `big_thumbnail`)
 VALUES (1, '10월 24일, AUTUMN PICNIC PICK!', '피크닉 픽 세트를 포장주문으로 구매하시고, 할인 혜택을 받아보세요.', '2023-10-24','2023-11-01', true, 'https://image.istarbucks.co.kr/img/event/2023/wn_autumnpicnic_231020.jpg', 'https://image.istarbucks.co.kr/upload/promotion/WEB_THUM_20231020154947805.jpg', 'https://image.istarbucks.co.kr/upload/promotion/WEB_THUM_20231020154947805.jpg');
INSERT INTO promotion_tb (`id`,`title`,`sub_content`,`start_date`,`end_date`, `is_open`, `pic_url`,`small_thumbnail`, `big_thumbnail`)
 VALUES (2, 'AUTUMN VIBE', '온라인 스토어에서 특별한 혜택을 만나보세요.', '2023-10-19', '2023-11-01', true, 'https://image.istarbucks.co.kr/img/event/2023/wn_autumnvibe_web_231018.jpg', 'https://image.istarbucks.co.kr/upload/promotion/WEB_THUM_20231018135754113.jpg', 'https://image.istarbucks.co.kr/upload/promotion/WEB_THUM_20231018135754113.jpg');
INSERT INTO promotion_tb (`id`,`title`, `sub_content`, `start_date`, `end_date`, `is_open`, `pic_url`, `small_thumbnail`, `big_thumbnail`)
 VALUES (3, '탄소중립포인트제 본인인증 고객대상 인센티브 지급일정 안내', '23년 7월 9일까지 본인인증 완료 고객 대상 인센티브 지급 일정 안내드립니다.', '2023-10-17', null, false, 'https://image.istarbucks.co.kr/img/event/2023/wn_cpoint_231010.jpg', 'https://image.istarbucks.co.kr/upload/news/aoZdnA_WEB_THUM_20231017082101133.jpg', 'https://image.istarbucks.co.kr/upload/news/aoZdnA_WEB_THUM_20231017082101133.jpg');



INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (1, '콜드브루', 'coldbrew', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/07/[9200000003661]_20230721170207026.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (2, '브루드커피', 'brewed', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[106509]_20210430111852870.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (3, '에스프레소', 'espresso', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[20]_20210415144112678.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (4, '프라푸치노', 'frappuccino', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[168016]_20210415154152122.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (5, '블렌디드', 'blended', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[169001]_20210419130701792.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (6, '리프레셔', 'refresher', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/08/[9200000003763]_20220803131322551.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (7, '피지오', 'fizzio', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/09/[9200000004751]_20230907153225204.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (8, '디카페인', 'decaffeine', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110563]_20210426095937808.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (9, '티(티바나)', 'tea', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[4004000000036]_20210415143933425.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (10, '병음료', 'others', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/03/[5210008055]_20230331142558998.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (11, '브레드', 'id', 2, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9300000004824]_20231004111431349.jpg');
INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (12, '케이크&미니디저트', 'id', 2, 'https://sitem.ssgcdn.com/52/90/67/item/1000344679052_i1_750.jpg');
 INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (13, '샌드위치&샐러드', 'id', 2, 'https://cdn.foodnews.co.kr/news/photo/201310/47546_5119_5453.jpg');
 INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (14, '따뜻한푸드', 'id', 2, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[9300000002435]_20210421164422886.jpg');
 INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (15, '과일&요거트', 'id', 2, 'https://img.seoul.co.kr//img/upload/2015/03/27/SSI_20150327145713.jpg');
  INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (16, '스낵', 'id', 2, 'https://mblogthumb-phinf.pstatic.net/MjAxNzEwMDhfNjIg/MDAxNTA3NDcyNTgxMTM1.uCv80sfMMTNdqGDZjLn8i9jKrfOL6quV8RTNWYV7nCUg.K0f8Ad6V_2wnAJJED134wjtLZsL9rXwsm4Grcu1ZYnkg.PNG.etienne03/667.PNG?type=w800');
  INSERT INTO category_tb (`id`, `name`, `eng_name`, `code`, `pic_url`)
 VALUES (17, '아이스크림', 'id', 2, 'https://mblogthumb-phinf.pstatic.net/MjAxODAxMzBfMTE4/MDAxNTE3MzE3MjczNDA2.UBgWhfp1nY6iP00eHR6gXp0fJJ7d_sjSr-w264Vxmisg.AqE_V85EfIf6xDXckQZHDNBE8akIW9mNaCq_61Scxawg.JPEG.amera9128/IMG_2132.JPG?type=w800');




INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (1, '아이스 카페 아메리카노', 'Iced Caffe Americano', '진한 에스프레소에 시원한 정수물과 얼음을 더하여 스타벅스의 깔끔하고 강렬한 에스프레소를 가장 부드럽고 시원하게 즐길 수 있는 커피','블론드/디카페인 커피 Tab에서 블론드, 디카페인, 1/2 디카페인 아메리카노를 주문할 수 있습니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110563]_20210426095937808.jpg', 1);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (2, '디카페인 카라멜 마키아또', 'DECAF Caramel Macchiato', '바닐라 시럽과 우유, 그리고 진한 에스프레소 샷과 달콤한 카라멜 드리즐이 어우러진 디카페인 카라멜 마키아또를 즐겨보세요!', '', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[126197]_20210415154609863.jpg', 8);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (3, '콜드 브루', 'Cold Brew', '스타벅스 바리스타의 정성으로 탄생한 콜드 브루! 콜드 브루 전용 원두를 차가운 물로 추출하여 한정된 양만 제공됩니다. 깊은 풍미의 새로운 커피 경험을 즐겨보세요.', '', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[9200000000038]_20210430113202595.jpg', 1);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (4, '오트 콜드 브루', 'Oat Cold Brew', '콜드 브루의 풍미와 깔끔한 오트음료(식물성 대체유)가 어우러진 달콤 고소한 라떼. 식물성 대체유를 사용해 모든 고객이 부담없이 즐길 수 있는 콜드 브루 음료', '', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[9200000003285]_20210416154437226.jpg', 1);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (5, '돌체 콜드 브루', 'Dolce Cold Brew', '무더운 여름철, 동남아 휴가지에서 즐기는 커피를 떠오르게 하는 스타벅스 음료의 베스트 x 베스트 조합인 돌체 콜드 브루를 만나보세요!', '', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[9200000002081]_20210415133657016.jpg', 1);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (6, '바닐라 크림 콜드 브루', 'Vanilla Cream Cold Brew', '콜드 브루에 더해진 바닐라 크림으로 깔끔하면서 달콤한 콜드 브루를 새롭게 즐길 수 있는 음료입니다.', '', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[9200000000487]_20210430112319174.jpg', 1);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (7, '나이트로 콜드 브루', 'Nitro Cold Brew', '나이트로 커피 정통의 캐스케이딩과 부드러운 콜드크레마! 부드러운 목 넘김과 완벽한 밸런스에 커피 본연의 단맛을 경험할 수 있습니다.', '', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[9200000000479]_20210426091844065.jpg', 1);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (8, '아이스 커피', 'Iced Coffe', '케냐, 하우스 블렌드 등 약간의 산미가 있는 커피를 드립 방식으로 추출한 후 얼음과 함꼐 제공하는 커피 입니다. 아이스 커피로 적잡한 프리미엄 원두를 이용하여 깔끔하고 상큼한 맛을 느끼실 수 있습니다.', '크리스마스 프로모션 기간 중 메뉴 간소화로 일부 음료를 한시적 미판매하게 되었습니다. 이 음료는 크리스마스 시즌 종료 후 재판매 할 예정입니다. 양해의 말씀을 드리며, 아이스 커피 대신 아이스 아메리카노/콜드 브루를 추천드립니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[106509]_20210430111852999.jpg', 2);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (9, '오늘의 커피 - 크리스마스블론드 로스트', 'Brewd Coffee - Christmas Blonde Roast', '허브의 풍미와 무화과 콤포트 같은 밝은 산미, 그리고 메이플 시럽의 단맛이 느껴지는 크리스마스 블론드로스트는 아프리카와 아시아/태평양 원두가 어우러진 커피입니다. ', '준비 상황에 따라 약 5분 정도의 추출 시간이 소요될 수 있습니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[2]_20210430111934246.jpg', 2);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (10, '에스프레소', 'Espresso', '스타벅스 에스프레소는 향기로운 크레마 층과 바디 층, 하트 층으로 이루어져 있으며, 입안 가득히 커피와 달콤한 카라멜 향이 느껴지는 커피 음료', '스타벅스 에스프레소는 향기로운 크레마층과 바디층, 하트 층으로 이루어져 있으며, 입안 가득히 커피와 달콤한 카라멜 향이 느껴지는 커피 음료입니다. 스타벅스 에스프레소는 모든 커피 음료의 기본이 되며, 깊고 강렬한 커피를 좋아하는 ‘Coffee mania’에게 추천해 드리며, 에스프레소는 만들어지는 즉시 드시는 것이 가장 맛있습니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[20]_20210415144112850.jpg', 3);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (11, '에스프레소 마키아또', 'Espresso Macchiato', '신선한 에스프레소 샷에 우유 거품을 살짝 얹은 커피 음료로써, 강렬한 에스프레소의 맛과 우유의 부드러움을 같이 즐길 수 있는 커피 음료', '신선한 에스프레소 샷에 우유 거품을 살짝 얹은 커피 음료로써, 강렬한 에스프레소의 맛과 우유의 부드러움을 같이 느끼실 수 있습니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[25]_20210415144211354.jpg', 3);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (12, '에스프레소 콘 파나', 'Espresso Con Panna', '신선한 에스프레소 샷에 풍부한 휘핑크림을 얹은 커피 음료로서, 뜨거운 커피의 맛과 차갑고 달콤한 생크림의 맛을 같이 즐길 수 있는 커피 음료', '신선한 에스프레소 샷에 풍부한 휘핑크림을 얹은 커피 음료로서, 뜨거운 커피의 맛과 차갑고 달콤한 생크림의 맛을 동시에 즐기실 수 있습니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[30]_20210415144252425.jpg', 3);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (13, '커피 스타벅스 더블 샷', 'Coffee Starbucks Double Shot', '신선하게 제조된 더블 샷 믹스에 클래식 시럽을 넣고 에스프레소 샷, 얼음이 어우러져 핸드 쉐이킹한 음료', '신선하게 제조된 더블 샷 믹스에 커피, 바닐라, 카라멜, 헤이즐넛 4종류 중 선택된 시럽을 넣고 에스프레소 샷, 얼음이 어우러져 핸드 쉐이킹한 음료입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110611]_20210415132507692.jpg', 3);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (14, '바닐라 스타벅스 더블샷', 'Vanilla Starbucks Double Shot', '신선하게 제조된 더블 샷 믹스에 바닐라 시럽을 넣고 에스프레소 샷, 얼음이 어우러져 핸드 쉐이킹한 음료', '신선하게 제조된 더블 샷 믹스에 바닐라 시럽을 넣고 에스프레소 샷, 얼음이 어우러져 핸드 쉐이킹한 음료입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110612]_20210415133425513.jpg', 3);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (15, '자바 칩 프라푸치노', 'Java Chip Frappuccino', '커피, 모카 소스, 진한 초콜릿 칩이 입안 가득 느껴지는 스타벅스에서만 맛볼 수 있는 프라푸치노', '나만의 프라푸치노로 변경되어 우유 선택과 커피 농도 조절이 가능한 블렌디드 음료입니다. 초콜릿 모카 시럽 그리고 진한 초콜릿 칩이 입안에 느껴지는 스타벅스에서만 맛보실 수 있는 신개념 음료로 시원한 커피와 함께 초콜릿 칩의 씹히는 맛이 이색적입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[168016]_20210415154152277.jpg', 4);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (16, '자바 칩 프라푸치노', 'Java Chip Frappuccino', '커피, 모카 소스, 진한 초콜릿 칩이 입안 가득 느껴지는 스타벅스에서만 맛볼 수 있는 프라푸치노', '나만의 프라푸치노로 변경되어 우유 선택과 커피 농도 조절이 가능한 블렌디드 음료입니다. 초콜릿 모카 시럽 그리고 진한 초콜릿 칩이 입안에 느껴지는 스타벅스에서만 맛보실 수 있는 신개념 음료로 시원한 커피와 함께 초콜릿 칩의 씹히는 맛이 이색적입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[168016]_20210415154152277.jpg', 4);


INSERT INTO size_tb (`id`, `size`)
 VALUES (1, 'tall');
INSERT INTO size_tb (`id`, `size`)
 VALUES (2, 'grande');
INSERT INTO size_tb (`id`, `size`)
 VALUES (3, 'venti');
INSERT INTO size_tb (`id`, `size`)
 VALUES (4, 'trenta');
INSERT INTO size_tb (`id`, `size`)
 VALUES (5, 'solo');
INSERT INTO size_tb (`id`, `size`)
 VALUES (6, 'dopio');
INSERT INTO size_tb (`id`, `size`)
 VALUES (7, 'short');


INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (1, 1, 4500, 1);
INSERT INTO option_tb (`id`, `size_id`,`price`, `product_id`)
 VALUES (2, 2, 5000, 1);
INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (3, 3, 5500, 1);
INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (4, 1, 4500, 2);
INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (5, 6, 3300, 2);
INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (6, 1, 4500, 1);
INSERT INTO option_tb (`id`, `size_id`,`price`, `product_id`)
 VALUES (7, 2, 5000, 1);
INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (8, 3, 5500, 1);
INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (9, 5, 3000, 2);
INSERT INTO option_tb (`id`, `size_id`,`price`, `product_id`)
 VALUES (10, 6, 3300, 2);
INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (11, 1, 4500, 1);
INSERT INTO option_tb (`id`, `size_id`,`price`, `product_id`)
 VALUES (12, 2, 5000, 1);
INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (13, 3, 5500, 1);
INSERT INTO option_tb (`id`, `size_id`, `price`, `product_id`)
 VALUES (14, 5, 3000, 2);
INSERT INTO option_tb (`id`, `size_id`,`price`, `product_id`)
 VALUES (15, 6, 3300, 2);




INSERT INTO cart_tb(`id`, `option_id`, `quantity`, `total_price`, `cup_type`, `user_id`)
 VALUES (1,1,3,10500,'single',1);
INSERT INTO cart_tb(`id`, `option_id`, `quantity`, `total_price`, `cup_type`, `user_id`)
 VALUES (2,2,10,50000,'single',1);
INSERT INTO cart_tb(`id`, `option_id`, `quantity`, `total_price`, `cup_type`, `user_id`)
VALUES (3,4,3,12700,'personal',1);
INSERT INTO cart_tb(`id`, `option_id`, `quantity`, `total_price`, `cup_type`, `user_id`)
 VALUES (4,3,1,9000,'personal',2);
INSERT INTO cart_tb(`id`, `option_id`, `quantity`, `total_price`, `cup_type`, `user_id`)
 VALUES (5,3,1,6700,'shop',3);

