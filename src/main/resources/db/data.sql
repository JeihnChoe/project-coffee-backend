INSERT INTO  user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (1, 'ssar', 'ssar@nate.com', 'a12345678!', '김쌀', '010-1212-1212', 1, '2020-02-02', '2020-02-02');
INSERT INTO user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (2, 'cos', 'cos@nate.com', 'a12345678!!', '코스', '010-1234-1234', 1, '2020-02-04', '2020-02-04');
INSERT INTO user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (3, 'love', 'love@nate.com', 'a12345678!!', '러브', '010-1234-1234', 1, '2020-02-04', '2020-02-04');

INSERT INTO card_division_tb (`id`,`pic_url`,`name`,`money`,`quantity`,`status`, `start_at`) VALUES(1,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','블랙핑크 카드',50000,30,true,null);
INSERT INTO card_division_tb (`id`,`pic_url`,`name`,`money`,`quantity`,`status`, `start_at`) VALUES(2,'https://image.istarbucks.co.kr/cardImg/20230822/010468_WEB.png','스노우맨 카아-드',30000,30,true,null);


INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(1,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','블랙핑크카드',50000,123456780,123123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(2,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','블랙핑크카드',12300,223456789,456789,'2020-12-12',2,1);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(3,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','블랙핑크카드',50000,323456788,456123,'2020-12-12',2,2);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(4,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','블랙핑크카드',50000,423456188,456123,'2020-12-12',2,3);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(5,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','블랙핑크카드',50000,523456788,456123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(6,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','스노우맨 카아-드',30000,623456788,456123,'2020-12-12',2,1);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(7,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','스노우맨 카아-드',30000,723456788,456123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(8,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','스노우맨 카아-드',30000,823456788,456123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(9,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','스노우맨 카아-드',30000,923456788,456123,'2020-12-12',2,2);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(10,'https://image.istarbucks.co.kr/cardImg/20230519/010286_WEB.png','스노우맨 카아-드',30000,023456788,456123,'2020-12-12',2,2);


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
 VALUES (16, '피스타치오 아보카도 초콜릿 프라푸치노', 'Pistachio Avocado Chocolate Frappuccino', '고소한 피스타치오와 달콤한 초콜릿, 아보카도 텍스쳐의 완벽한 조화, 오트를 사용해 더 맛있는 프라푸치노', '고소한 피스타치오와 달콤한 초콜릿, 아보카도 텍스쳐의 완벽한 조화. 오트를 사용해 더 맛있는 프라푸치노를 즐겨보세요.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/05/[9200000004713]_20230524144814462.jpg', 4);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (17, '초콜릿 크림 칩 프라푸치노', 'Chocolate Cream Chip Frappuccino', '모카 소스와 진한 초콜릿 칩, 초콜릿 드리즐이 올라간 달콤한 크림 프라푸치노', '나만의 프라푸치노로 변경되어 우유 선택이 가능한 블렌디드 음료입니다. 신선한 우유와 크림 프라푸치노 특유의 풍미에달콤한 초콜릿 시럽과 초콜릿 칩이 더해져 오독오독 씹히는 맛이 특징적인 음료입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[168066]_20210415154429903.jpg', 4);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (18, '화이트 초콜릿 모카 프라푸치노', 'White Chocolate Mocha Frappuccino', '화이트 초콜릿, 커피와 우유가 조화로운 프라푸치노', '나만의 프라푸치노로 변경되어 우유 선택과 커피 농도 조절이 가능한 블렌디드 음료입니다. 시원한 커피와 화이트 초콜릿 모카 시럽, 달콤한 휘핑크림이 조화를 이루며 코코아 파우더로 마무리한 음료입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[168013]_20210415155746535.jpg', 4);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (19, '카라멜 프라푸치노', 'Caramel Frappuccino', '카라멜과 커피가 어우러진 프라푸치노','', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[168010]_20210415154711259.jpg', 4);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (20, '망고 바나나 블렌디드', 'Mango Banana Blended', '(Grande Only) 달콤한 망고 패션 프루트 주스에 바나나 1개가 통째로 들어간 신선한 블렌디드','', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[169001]_20210419130701935.jpg', 5);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (21, '피치 요거트 블렌디드', 'Peach Yogurt Blended', '달콤한 복숭아에 구름같은 요거트가 더해져 가볍고 상큼하게 즐길 수 있는 과일 블렌디드','매장별 음료 판매 상황은 상이할 수 있으며, 일부 매장에서는 판매하지 않습니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/05/[9200000004717]_20230524144903451.jpg', 5);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (22, '망고 패션 티 블렌디드', 'Mango Passion Tea Blended', '망고 패션 프루트 주스와 패션 탱고 티가 상큼하게 어우러진 과일 블렌디드','', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/02/[9200000004512]_20230207150514519.jpg', 5);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (23, '더 그린 쑥 블렌디드', 'The Green Mugwort Blended', '은은한 쑥과 곡물에 말차샷이 어우러져 고소하고 달콤하게 즐기는 블렌디드','더북한산,더양평DTR,더북한강R,경동1960,대구종로고택 매장에서만 판매하는 음료입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/02/[9200000004527]_20230206091612687.jpg', 5);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (24, '여수 바다 유자 블렌디드', 'Yeosu Sea Yuja Blended', '맑고 깨끗한 여수 경도의 낮 바다 풍경을 형상화한 음료로 상큼하게 즐길 수 있는 유자 블렌디드 음료 (유자:국내산)','더여수돌산DT점에서만 판매, 꿀함유', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/09/[9200000004870]_20230905110300704.jpg', 5);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (25, '망고 용과 레모네이드 스타벅스 리프레셔', 'Mango Dragonfruit with Lemonade Starbucks Refreshers™', '망고 용과와 레모네이드가 달콤 상큼하게 조화된 맛에 가볍게 에너지 부스팅을 할 수 있는 음료','음료의 검은 점은 용과 씨로 안심하고 드셔도됩니다., 토핑으로 들어간 망고의 크기는 조금씩 달라질 수 있습니다., 망고는 섬유질이 풍부한 과일로 실처럼 생긴 섬유질이 있을 수 있으나 외부에서 혼입된 이물질이 아니므로 안심하고 드셔도 됩니다., 취향에 따라 클래식 시럽을 무료로 추가 하실 수 있습니다', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/07/[9200000004439]_20230710134200155.jpg', 6);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (26, '퍼플 드링크 위드 망고 용과 스타벅스 리프레셔', 'Purple Drink with Mango Dragonfruit Starbucks Refreshers™', '망고 용과와 코코넛 밀크가 달콤하고 부드럽게 조화된 맛에 가볍게 에너지 부스팅을 할 수 있는 음료','음료의 검은 점은 용과 씨로 안심하고 드셔도됩니다., 토핑으로 들어간 망고의 크기는 조금씩 달라질 수 있습니다., 망고는 섬유질이 풍부한 과일로 실처럼 생긴 섬유질이 있을 수 있으나 외부에서 혼입된 이물질이 아니므로 안심하고 드셔도 됩니다., 취향에 따라 클래식 시럽을 무료로 추가 하실 수 있습니다', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/07/[9200000004439]_20230710134200155.jpg', 6);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (27, '딸기 아사이 레모네이드 스타벅스 리프레셔', 'Strawberry Acai with Lemonade Starbucks Refreshers™', '딸기, 아사이베리 주스와 레모네이드가 달콤 상큼하게 조화된 맛에 가볍게 에너지 부스팅을 할 수 있는 리프레셔 음료.','토핑으로 들어간 딸기의 양은 조금씩 달라질 수 있습니다. 클래식 시럽을 추가하여 더욱 달콤하게 즐길 수 있습니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/07/[9200000004753]_20230720103623518.jpg', 6);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (28, '핑크 드링크 위드 딸기 아사이 스타벅스 리프레셔', 'Pink Drink with Strawberry Acai Starbucks Refreshers™', '딸기, 아사이베리 주스와 코코넛 베이스가 달콤하고 부드럽게 조화된 맛에 가볍게 에너지 부스팅을 할 수 있는 리프레셔 음료','토핑으로 들어간 딸기의 양은 조금씩 달라질 수 있습니다. 클래식 시럽을 추가하여 더욱 달콤하게 즐길 수 있습니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/08/[9200000003766]_20220803130958263.jpg', 6);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (29, '유자 패션 피지오', 'Yuja Passion Starbucks Fizzio', '상콤달콤 고흥 유자와 스타벅스 시그니처 패션 탱고 티에 한 잔 한 잔 탄산을 넣어 제조하는 피지오 음료. 시트러스한 청량감을 가득 즐기세요!','음료 사이즈에 맞는 스파클링 주입이 필요한 음료입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/05/[9200000004121]_20220517102911830.jpg', 7);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (30, '쿨 라임 피지오', 'Cool Lime Starbucks Fizzio™', '그린 빈 추출액이 들어간 라임 베이스에 건조된 라임 슬라이스를 넣고 스파클링한 시원하고 청량감 있는 음료입니다. (카페인이 함유된 탄산음료입니다)','', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[107051]_20210419112152119.jpg', 7);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (31, '피치 딸기 피지오', 'Peach Strawberry Starbucks Fizzio', '상큼한 과일과 청량한 탄산의 조화. 피치 특유의 감각적인 색상과 무드를 탄산과 함께 즐길 수 있는 피지오','매장별 음료 판매 상황은 상이할 수 있으며, 일부 매장에서는 판매하지 않습니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/05/[9200000004567]_20230524144959959.jpg', 7);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (32, '여수 바다 자몽 피지오', 'Yeosu Sea Grapefruit Fizzio', '여수 돌산대교의 밤바다 풍경을 형상화한 음료로 알록달록 색상 조명의 토핑과 함께 여수의 풍경을 바라보며 즐길 수 있는 트로피컬 맛의 음료','더여수돌산DT점에서만 판매', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/09/[9200000004751]_20230907153225732.jpg', 7);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (33, '제주팔삭 셔벗 피지오', 'Jeju Hassaku Orange Frozen Fizzio', '제주송당의 소원나무에 걸린 제주 동백꽃을 형상화한 음료 제주의 자몽이라는 별명을 가진 제주 팔삭과 제주 한라봉으로 매장에서 직접 만든 셔벗과 함께 상큼하게 즐길 수 있는 피지오 음료','더제주송당파크R점에서만 판매, 전용잔 제공(일일 한정 제공), 전용잔 소진 시, 일반 매장용잔으로 제공', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9200000004946]_20231005084542458.jpg', 7);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (34, '디카페인 스타벅스 돌체 라떼', 'DECAF Stabucks Dolce Latte', '깊고 진한 에스프레소 샷과 깔끔한 무지방 우유, 달콤한 돌체 시럽이 부드럽게 어우러진 스타벅스 돌체 라떼를 카페인 부담을 줄인 디카페인으로 즐겨보세요!','디카페인 선택 300원이 추가된 금액입니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[128692]_20210426091933665.jpg', 8);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (35, '디카페인 스타벅스 아이스 돌체 라떼', 'DECAF Stabucks Ice Dolce Latte', '깊고 진한 에스프레소 샷과 깔끔한 무지방 우유, 달콤한 돌체 시럽이 부드럽게 어우러진 스타벅스 돌체 라떼를 카페인 부담을 줄인 디카페인으로 즐겨보세요!','디카페인 선택 300원이 추가된 금액입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[128695]_20210426092031969.jpg', 8);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (36, '디카페인 카라멜 마키아또', 'DECAF Caramel Macchiato', '바닐라 시럽과 우유, 그리고 진한 에스프레소 샷과 달콤한 카라멜 드리즐이 어우러진 디카페인 카라멜 마키아또를 즐겨보세요!','디카페인 선택 300원이 추가된 금액입니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[126197]_20210415154610012.jpg', 8);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (37, '디카페인 아이스 카라멜 마키아또', 'DECAF Ice Caramel Macchiato', '바닐라 시럽과 우유, 그리고 진한 에스프레소 샷과 달콤한 카라멜 드리즐이 어우러진 디카페인 카라멜 마키아또를 즐겨보세요!','디카페인 선택 300원이 추가된 금액입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[128695]_20210426092032110.jpg', 8);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (38, '디카페인 카페 라떼', 'DECAF Caffe Latte', '깊고 진한 에스프레소 샷과 따뜻한 우유가 어우러진 부드러운 디카페인 카페 라떼를 즐겨보세요!','디카페인 선택 300원이 추가된 금액입니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[41]_20210415133833879.jpg', 8);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (39, '디카페인 아이스 카페 라떼', 'DECAF Ice Caffe Latte', '깊고 진한 에스프레소 샷과 따뜻한 우유가 어우러진 부드러운 디카페인 카페 라떼를 즐겨보세요!','디카페인 선택 300원이 추가된 금액입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110569]_20210415143036138.jpg', 8);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (40, '디카페인 카페 아메리카노', 'DECAF Caffe Americano', '스타벅스의 깊고 강렬한 에스프레소의 풍미를 디카페인 카페 아메리카노로 즐겨보세요!','디카페인 선택 300원이 추가된 금액입니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[94]_20210430103337157.jpg', 8);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (41, '디카페인 아이스 카페 아메리카노', 'DECAF Ice Caffe Americano', '스타벅스의 깊고 강렬한 에스프레소의 풍미를 디카페인 카페 아메리카노로 즐겨보세요!','디카페인 선택 300원이 추가된 금액입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110563]_20210426095937947.jpg', 8);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (42, '말차 크림 브륄레 라떼', 'Malcha Cream Brulee Latte', '프랑스 디저트 크림 브륄레에서 영감을 받은 음료로 부드러운 버터, 바닐라 풍미와 쌉싸름한 말차의 맛이 조화롭게 어우러진 디저트 타입의 말차 라떼','', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9200000004872]_20231026091552883.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (43, '아이스 말차 크림 브륄레 라떼', 'Iced Malcha Cream Brulee Latte', '프랑스 디저트 크림 브륄레에서 영감을 받은 음료로 부드러운 버터, 바닐라 풍미와 쌉싸름한 말차의 맛이 조화롭게 어우러진 디저트 타입의 말차 라떼','', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9200000004875]_20231026091811557.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (44, '핑크 캐모마일 릴렉서', 'Pink Chamomile Relaxer', '크리스마스에 어울리는 샴페인 한 잔과 같은 핑크 캐모마일 릴렉서! 리치, 레몬그라스, 캐모마일의 차분하면서도 새콤달콤한 조합 유스베리 티가 추가되어 더욱 화사해진 향 크리스마스 리스를 닮은 로즈마리와 레드커런트로 크리스마스를 더욱 즐겁게!','리치 과육의 속 껍질이 있을 수 있지만 안심하고 드세요. 레드커런트에는 작은 씨앗이 있으니 취식 시 주의하세요. 사이즈별 미량의 카페인이 들어있습니다(1~3mg)', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9200000003681]_20231026092636054.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (45, '아이스 핑크 캐모마일 릴렉서', 'Iced Pink Chamomile Relaxer', '크리스마스에 어울리는 샴페인 한 잔과 같은 핑크 캐모마일 릴렉서! 리치, 레몬그라스, 캐모마일의 차분하면서도 새콤달콤한 조합 유스베리 티가 추가되어 더욱 화사해진 향 크리스마스 리스를 닮은 로즈마리와 레드커런트로 크리스마스를 더욱 즐겁게!','리치 과육의 속 껍질이 있을 수 있지만 안심하고 드세요. 레드커런트에는 작은 씨앗이 있으니 취식 시 주의하세요. 사이즈별 미량의 카페인이 들어있습니다(1~3mg)', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9200000003684]_20231026092810053.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (46, '스타벅스 클래식 밀크 티', 'Starbucks Classic Milk Tea', '스타벅스가 선보이는 클래식한 밀크 티로, 진하게 오래 우려낸 티바나 블랙 티의 깊은 풍미와 우유의 조화로움을 담아낸 맛에 집중한 밀크 티','상기 이미지는 연출된 사진으로 실제 제공되는 제품과 상이할 수 있습니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/09/[9200000004933]_20230914141718421.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (47, '아이스 스타벅스 클래식 밀크 티', 'Iced Starbucks Classic Milk Tea', '스타벅스가 선보이는 클래식한 밀크 티로, 진하게 오래 우려낸 티바나 블랙 티의 깊은 풍미와 우유의 조화로움을 담아낸 맛에 집중한 밀크 티','상기 이미지는 연출된 사진으로 실제 제공되는 제품과 상이할 수 있습니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/09/[9200000004936]_20230914141811832.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (48, '유자 민트 티', 'Yuja Mint Tea', '달콤한 국내산 고흥 유자와 알싸하고 은은한 진저, 우릴 수록 상쾌한 민트 티가 조화로운 유자 민트 티','', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/04/[9200000002956]_20220411155552087.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (49, '아이스 유자 민트 티', 'Iced Yuja Mint Tea', '달콤한 국내산 고흥 유자와 알싸하고 은은한 진저, 우릴 수록 상쾌한 민트 티가 조화로운 유자 민트 티','', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/04/[9200000002959]_20220411155905055.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (50, '얼 그레이 티', 'Earl Grey Brewed Tea', '꽃향 가득한 라벤더와 베르가못 향이 진한 홍차와 블렌딩된 향긋한 블랙 티','티백을 우리는 적정한 시간은 5분입니다.', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[4004000000036]_20210415143933578.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (51, '아이스 얼 그레이 티', 'Iced Earl Grey Brewed Tea', '꽃향 가득한 라벤더와 베르가못 향이 진한 홍차와 블렌딩된 향긋한 블랙 티','티백을 우리는 적정한 시간은 5분입니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[4004000000039]_20210415142056015.jpg', 9);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`) 
 VALUES (52, '필 더 그린 190ML', 'Fill The Green 190ML', '과일 및 채소를 착즙하여 만든 주스! 케일, 셀러리, 오이가 들어가 Green 색상의 과일&채소를 건강하게 즐길 수 있는 음료', '', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/09/[9300000004348]_20220921102420757.jpg', 10);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (53, '필 더 레드 190ML', 'Fill The Red 190ML', '과일 및 채소를 착즙하여 만든 주스! 사과, 비트, 당근이 들어가 Red 색상의 과일&채소를 달콤하게 즐길 수 있는 음료','', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/09/[9300000004346]_20220921130442407.jpg', 10);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (54, '필 더 옐로우 190ML', 'Fill The Yellow 190ML', '과일 및 채소를 착즙하여 만든 주스! 레몬, 생강이 들어가 Yellow 색상의 과일&채소를 상큼하게 즐길 수 있는 음료','', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/09/[9300000004347]_20220921130952614.jpg', 10);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (55, '딸기주스 190ML', 'Strawberry Juice 190ML', '달콤한 국내산 딸기의 과육이 듬뿍 느껴지는 주스','', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[5210008070]_20210426095035197.jpg', 10);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (56, '망고주스 190ML', 'Mango Juice 190ML', '노랗게 익은 열대과일 망고가 입안 가득 느껴지는 주스','', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[5210008061]_20210426095229497.jpg', 10);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (57, '토피 넛 팡도르', 'Toffee Nut Pandoro', '버터 풍미가 느껴지는 촉촉한 브리오쉬에 코팅 아몬드가 씹히는 토피넛 크림과 카라멜을 채운 달콤한 디저트 브레드입니다.','크림에 보이는 검은반점은 바닐라빈이며, 원재료(데코스노우, 밀가루)에 의해 포면이 하얗게 보일 수 있습니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9300000004971]_20231031083009825.jpg', 11);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (58, '탕종 플레인 베이글', 'Plain Bagel', '탕종법으로 반죽한 후 고온에서 데치고, 짧게 구워 내 쫄깃하고 촉촉한 식감이 특징인 플레인 베이글입니다.','탕종법이란 뜨거운 물과 밀가루를 혼합한 반죽을 추가하여 쫄깃한 식감을 강조한 반죽법입니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/09/[9300000004833]_20230911131305917.jpg', 11);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (59, '탕종 블루베리 베이글', 'Blueberry Bagel', '달콤한 블루베리와 탕종법으로 반죽한 후 고온에서 데치고, 짧게 구워 내 쫄깃하고 촉촉한 식감이 특징인 블루베리 베이글입니다.','탕종법이란 뜨거운 물과 밀가루를 혼합한 반죽을 추가하여 쫄깃한 식감을 강조한 반죽법입니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/09/[9300000004823]_20230911131337469.jpg', 11);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (60, '탕종 파마산 치즈 베이글', 'Parmesan Cheese Bagel', '파마산 치즈와 탕종법으로 반죽한 후 고온에서 데치고, 짧게 구워 내 쫄깃하고 촉촉한 식감이 특징인 파마산 치즈 베이글입니다.','탕종법이란 뜨거운 물과 밀가루를 혼합한 반죽을 추가하여 쫄깃한 식감을 강조한 반죽법입니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/09/[9300000004834]_20230911131406370.jpg', 11);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (61, '포테이토 어니언 크림치즈 베이글', 'Potato Onion Cream Cheese Bagel', '쫄깃한 탕종 베이글 사이에 어니언 칩으로 맛을 낸 크림치즈와 매쉬드 포테이토를 샌드한 베이글입니다.','원물(감자)의 특성상 매쉬드 포테이토가 쉽게 변질될 수 있사오니, 구매 즉시 바로 드시기 바랍니다. 감자와 양파의 원물을 가공하여 만든 제품 특성상 원물에서 유래된 껍질이 함유될 수 있습니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/05/[9300000004487]_20230515094824984.jpg', 11);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (62, '부드러운 생크림 카스텔라', 'Fresh Cream Castella', '부드러운 생크림이 듬뿍 들어있는 촉촉한 카스텔라입니다.', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[5110007181]_20210421164728664.jpg', 12);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (63, '마스카포네 티라미수 케이크', 'Mascarpone Tiramisu Cake', '고소한 마스카포네 치즈 크림에 촉촉한 커피 시트가 입안을 감싸는 기분 좋은 느낌의 떠먹는 티라미수입니다.','커피 리큐르에 카페인과 알코올이 소량 포함되어 있습니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/06/[9300000001907]_20230619130922529.jpg', 12);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (64, '부드러운 티라미수 롤', 'Tiramisu Roll Cake', '달콤한 초코 케이크 시트에 고소한 마스카포네 크림을 듬뿍 넣은 부드러운 롤 케이크입니다.','커피 리큐르에 카페인과 알코올이 소량 포함되어 있습니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/02/[9300000002926]_20210210172612813.jpg', 12);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (65, '7 레이어 가나슈 케이크', '7 Layer Ganache Cake', '초콜릿, 가나슈, 모카로 만든 시트와 크림이 7개의 층을 이루어 모양부터 매력적인 케이크입니다.',null , null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[9300000001179]_20210421164934809.jpg', 12);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (66, 'The 촉촉 초콜릿 생크림 케이크', 'The Chocolate Fresh Cream Cake', '달콤한 초콜릿 케이크 시트에 진한 가나슈 생크림을 넣고 측면에 다크 초콜릿을 듬뿍 토핑한 달콤하고 촉촉한 초콜릿 케이크입니다.',null , null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/05/[9300000003393]_20210520100142751.jpg', 12);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (67, '별의 별 샌드위치', 'Garlic Chicken Danish Sandwich', '데니쉬 식빵 사이에 케이준 치킨 패티, 베이컨, 로메인, 모차렐라 치즈를 넣고 갈릭 소스로 맛을 더한 단짠 맛이 매력적인 샌드위치입니다.','상품 특성 상 컷팅이 불가한 상품으로 컷팅 필요시 함께 드리는 나이프로 컷팅 하시어 취식을 부탁드립니다.' , null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9300000004995]_20231031083227956.jpg', 13);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (68, '멜팅 치즈 베이컨 샌드위치', 'Melting Cheese Bacon Sandwich', '고소한 참깨 사워도우에 베이컨과 콜비잭치즈, 모차렐라, 그라나파다노 등 다섯 가지 치즈를 듬뿍 넣어 풍부한 치즈 풍미가 매력인 샌드위치입니다.', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/11/[9300000004827]_20231102130550541.jpg', 13);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (69, '블랙 갈릭 에그 샌드위치', 'Black Garlic Egg Sandwich', '먹물 핫도그번에 스크램블 에그, 베이컨, 치즈, 치킨브레스트햄을 샌드하고 갈릭 소스로 풍미를 더한 샌드위치입니다.','해당 상품은 내열 트레이에 담아 데워서 제공되기에 뜨거울 수 있으니 주의해주세요.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9300000004752]_20231012084214353.jpg', 13);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (70, '플랜트 미트볼 치즈 샌드위치', 'Plant Meatball Cheese Sandwich', '소프트 바게트 사이에 토마토 소스가 더해진 베러미트(식물성 대체육) 미트볼과 모차렐라, 체더치즈를 넣은 샌드위치입니다.','베러미트란 대두단백, 식물성 오일, 식이섬유등 100% 식물성 원료로 고기 본연의 식감과 맛을 살린 대안육(플랜트 미트)입니다. 해당 상품의 모든 원료가 식물성으로 만들어진 비건 제품이 아닙니다. 해당 상품은 내열 트레이에 담아 데워서 제공되기에 뜨거울 수 있으니 주의해주세요.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/06/[9300000004775]_20230626125714617.jpg', 13);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (71, '치킨 클래식 샌드위치', 'Chicken Classic Sandwich', '닭가슴살, 베이컨, 계란, 토마토를 넣어 든든하게 즐길 수 있는 클래식한 샌드위치입니다.','구입 후 가급적 빠르게 취식하시기 바랍니다. 워밍 시 품질의 저하가 발생할 수 있습니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/03/[9300000004460]_20230322091331552.jpg', 13);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (72, '트러플 머쉬룸 수프', 'Truffle Mushroom Soup', '송로 버섯의 향과 양송이 버섯의 진한 풍미가 조화로운 수프입니다. ※ 수프 구매 시 통밀 토스트칩이 함께 제공됩니다.', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/05/[9900000000680]_20230519163033642.jpg', 14);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (73, '플랜트 미트볼 수프', 'Plant Meatball Soup', '잘게 다진 양파와 식물성 재료로 만든 플랜트 미트볼이 들어있는 새콤달콤한 맛의 토마토 수프입니다. ※ 수프 구매 시 통밀 토스트칩이 함께 제공됩니다.', '베러미트란 대두단백, 식물성 오일, 식이섬유등 100% 식물성 원료로 고기 본연의 식감과 맛을 살린 대안육(플랜트 미트)입니다. 해당 상품의 모든 원료가 식물성으로 만들어진 비건 제품이 아닙니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/06/[9900000001386]_20230626125948177.jpg', 14);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (74, '토마토 로제 수프', 'Tomato Rose Soup', '새콤한 토마토와 고소한 크림이 조화를 이루어 부드러운 식감이 매력적인 수프입니다. ※ 수프 구매 시 통밀 토스트칩이 함께 제공됩니다.', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/05/[9900000001201]_20230519163222552.jpg', 14);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (75, '단호박 크림 수프', 'Sweet Pumpkin Soup', '단호박과 증숙 고구마가 들어가 진한 풍미와 씹히는 식감이 매력적인 수프입니다. ※ 수프 구매 시 통밀 토스트칩이 함께 제공됩니다.', '일부 수량에 한해 판매 중인 상품으로 매장 사정에 따라 재고 수량이 다를 수 있습니다.' , null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/05/[9900000001200]_20230519163129148.jpg', 14);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (76, '복숭아 가득 핸디 젤리', 'Peach Handy Jelly', '국내산 복숭아를 가득 담은 달콤한 맛의 스타벅스 핸디 젤리', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/05/[9300000004508]_20230519162911806.jpg', 15);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (77, '한라봉 가득 핸디 젤리', 'Hallabong Handy Jelly', '제주도 특산물인 한라봉과 감귤을 가득 담은 상큼한 맛의 스타벅스 핸디 젤리', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[9300000001912]_20210422111311568.jpg', 15);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (78, '사과 가득 핸디 젤리', 'Apple Handy Jelly', '경북 특산물인 사과를 가득 담은 달콤한 맛의 스타벅스 핸디 젤리', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[9300000001911]_20210421164827717.jpg', 15);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (79, '오가닉 그릭 요거트 플레인', 'Organic Greek Yogurt Plain', '유기농 우유와 유산균으로 만든 정통 그릭 방식의 플레인 요거트 입니다.', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/08/[9300000003231]_20210826102030821.jpg', 15);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (80, '제주 녹차 푸딩', 'JEJU GREENTEA PUDDING', '제주 녹차의 깊은 맛을 부드럽게 즐길 수 있는 녹차 푸딩입니다. 냉장 보관이 필요한 상품입니다.', '상온 보관 시 변질 위험이 있으므로 구매 후 바로 취식하시기 바랍니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/04/[9300000004509]_20230406145005252.jpg', 15);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (81, '바움쿠헨 스틱', 'Baumkuchen Stick', '나무 결 모양의 바움쿠헨에 초콜릿을 입혀 커피와 곁들여 즐길 수 있는 스틱형 스낵입니다.', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/08/[9300000004822]_20230821101051337.jpg', 16);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (82, '칩 앤 데일 그래놀라 볼', 'Chip n Dale Granola ball', '귀리와 마카다미아를 넣어 고소하고 다크초콜릿 칩의 은은한 단 맛이 돋보이는 그래놀라 볼 스낵입니다.', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9300000004820]_20231004090028348.jpg', 16);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (83, '비스코티 크래커', 'Biscotti Cracker', '귀리, 건과, 견과류가 조화롭고 비 정제 원당과 메이플 시럽으로 은은한 단맛을 내어 바삭하게 즐길 수 있는 건강 스낵입니다.', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/08/[9300000004821]_20230823152549358.jpg', 16);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (84, '딸기&우리 밀 카스텔라', 'Strawberry&Wheat Castella', '동물복지 유정란, 우리 밀, 유기농 우유를 사용한 플레인 카스텔라와 딸기 카스텔라를 함께 즐길 수 있는 상품입니다.', '각 제품의 영양정보는 각 제품 상세페이지 또는 제품 포장재 표시사항을 확인 바랍니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/08/[9300000004634]_20230823153052789.jpg', 16);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (85, '한 입에 쏙 카스텔라', 'Castella Rusk', '국내산 달걀을 넣어 구운 카스텔라를 한 입 크기로 잘라 다시 한번 구워낸 바삭한 카스텔라 러스크입니다.', null, null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/10/[9300000002718]_20221020095146767.jpg', 16);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (86, '요거트 젤라또', 'Yogurt Gelato', '산뜻한 요거트 맛이 느껴지는 젤라또입니다.', '스푼은 뚜껑 안쪽에 있습니다. 구매 후 가급적 빨리 드시기 바라며 별도의 보냉팩은 준비되어 있지 않은 점 양해바랍니다. 젤라또는 준비 완료 이후 상온에서 보관되니 신속하게 수령하여 주시기 바랍니다. 원재료에 기인하여 검은색 점이 있을 수 있으나 이물이 아닙니다. 안심하고 드셔도 됩니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/08/[9300000004515]_20230817100837329.jpg', 17);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (87, '피스타치오 젤라또', 'Pistachio Gelato', '고소한 피스타치오 맛이 느껴지는 젤라또입니다.', '스푼은 뚜껑 안쪽에 있습니다. 구매 후 가급적 빨리 드시기 바라며 별도의 보냉팩은 준비되어 있지 않은 점 양해바랍니다. 젤라또는 준비 완료 이후 상온에서 보관되니 신속하게 수령하여 주시기 바랍니다. 원재료에 기인하여 검은색 점이 있을 수 있으나 이물이 아닙니다. 안심하고 드셔도 됩니다.', null, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/08/[9300000004514]_20230817100727753.jpg', 17);


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