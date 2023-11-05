INSERT INTO user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (1, 'ssar', 'ssar@nate.com', 'a12345678!', '김쌀', '010-1212-1212', 1, '2020-02-02', '2020-02-02');
 INSERT INTO user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (2, 'cos', 'cos@nate.com', 'a12345678!!', '코스', '010-1234-1234', 1, '2020-02-04', '2020-02-04');



INSERT INTO card_tb (`id`,`card_pic_url`,`card_name`,`card_money`,`card_number`, `pin_number`, `card_created_at`,`status`,`user_id`) VALUES(1,'사진','스타벅스e카드',12000,123456780,123123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`card_pic_url`,`card_name`,`card_money`,`card_number`,`pin_number`,`card_created_at`,`status`,`user_id`) VALUES(2,'사진','스타벅스e카드',12300,123456789,456789,'2020-12-12',2,2);
INSERT INTO card_tb (`id`,`card_pic_url`,`card_name`,`card_money`,`card_number`,`pin_number`,`card_created_at`,`status`,`user_id`) VALUES(3,'사진','스타벅스e카드',12300,123456788,456123,'2020-12-12',3,2);


INSERT INTO promotion_tb (`id`, `title`, `sub_content`, `start_date`, `end_date`, `is_open`, `promotion_pic_url`, `thumbnail`, `home_thumbnail`)
 VALUES (1, '10월 24일, AUTUMN PICNIC PICK!', '피크닉 픽 세트를 포장주문으로 구매하시고, 할인 혜택을 받아보세요.', '2023-10-24','2023-11-01', true, 'https://image.istarbucks.co.kr/img/event/2023/wn_autumnpicnic_231020.jpg', 'https://image.istarbucks.co.kr/upload/promotion/WEB_THUM_20231020154947805.jpg', 'https://image.istarbucks.co.kr/upload/promotion/WEB_THUM_20231020154947805.jpg');
INSERT INTO promotion_tb (`id`,`title`,`sub_content`,`start_date`,`end_date`, `is_open`, `promotion_pic_url`,`thumbnail`, `home_thumbnail`)
 VALUES (2, 'AUTUMN VIBE', '온라인 스토어에서 특별한 혜택을 만나보세요.', '2023-10-19', '2023-11-01', true, 'https://image.istarbucks.co.kr/img/event/2023/wn_autumnvibe_web_231018.jpg', 'https://image.istarbucks.co.kr/upload/promotion/WEB_THUM_20231018135754113.jpg', 'https://image.istarbucks.co.kr/upload/promotion/WEB_THUM_20231018135754113.jpg');
INSERT INTO promotion_tb (`id`,`title`, `sub_content`, `start_date`, `end_date`, `is_open`, `promotion_pic_url`, `thumbnail`, `home_thumbnail`)
 VALUES (3, '탄소중립포인트제 본인인증 고객대상 인센티브 지급일정 안내', '23년 7월 9일까지 본인인증 완료 고객 대상 인센티브 지급 일정 안내드립니다.', '2023-10-17', null, false, 'https://image.istarbucks.co.kr/img/event/2023/wn_cpoint_231010.jpg', 'https://image.istarbucks.co.kr/upload/news/aoZdnA_WEB_THUM_20231017082101133.jpg', 'https://image.istarbucks.co.kr/upload/news/aoZdnA_WEB_THUM_20231017082101133.jpg');



INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (1, '콜드브루', 'coldbrew', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/07/[9200000003661]_20230721170207026.jpg');
INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (2, '브루드커피', 'brewed', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[106509]_20210430111852870.jpg');
INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (3, '에스프레소', 'espresso', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[20]_20210415144112678.jpg');
INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (4, '프라푸치노', 'frappuccino', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[168016]_20210415154152122.jpg');
INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (5, '블렌디드', 'blended', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[169001]_20210419130701792.jpg');
INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (6, '리프레셔', 'refresher', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2022/08/[9200000003763]_20220803131322551.jpg');
INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (7, '피지오', 'fizzio', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/09/[9200000004751]_20230907153225204.jpg');
INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (8, '디카페인', 'decaffeine', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110563]_20210426095937808.jpg');
INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (9, '티(티바나)', 'tea', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[4004000000036]_20210415143933425.jpg');
INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (10, '병음료', 'others', 1, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/03/[5210008055]_20230331142558998.jpg');


INSERT INTO category_tb (`id`, `category_name`, `category_eng_name`, `code`, `category_pic_url`)
 VALUES (11, '브레드', 'Bread', 2, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9300000004824]_20231004111431349.jpg');



INSERT INTO beverage_tb (`id`,`beverage_name`,`beverage_eng_name`,`beverage_description`,`beverage_tip`,`hot_iced`, `beverage_pic_url`, `category_id`)
 VALUES (1, '카페 아메리카노', 'Caffe Americano', '진한 에스프레소와 뜨거운 물을 섞어 스타벅스의 깔끔하고 강렬한 에스프레소를 가장 부드럽게 잘 느낄 수 있는 커피', '블론드/디카페인 커피 Tab에서 블론드, 디카페인, 1/2디카페인 카페 아메리카노를 주문할 수 있습니다.',0, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[94]_20210430103337006.jpg', 1);




INSERT INTO size_tb (`id`, `size`, `liquid_amount`, `size_pic_url`)
 VALUES (1, 'tall', '355ml', 'Tall사진');
INSERT INTO size_tb (`id`, `size`, `liquid_amount`, `size_pic_url`)
 VALUES (2, 'grande', '473ml', 'Grande사진');
INSERT INTO size_tb (`id`, `size`, `liquid_amount`, `size_pic_url`)
 VALUES (3, 'venti', '591ml', 'Venti사진');
INSERT INTO size_tb (`id`, `size`, `liquid_amount`, `size_pic_url`)
 VALUES (4, 'trenta', '887ml', 'trenta사진');
INSERT INTO size_tb (`id`, `size`, `liquid_amount`, `size_pic_url`)
 VALUES (5, 'solo', '22ml', 'Grande사진');
INSERT INTO size_tb (`id`, `size`, `liquid_amount`, `size_pic_url`)
 VALUES (6, 'dopio', '44ml', 'Venti사진');
INSERT INTO size_tb (`id`, `size`, `liquid_amount`, `size_pic_url`)
 VALUES (7, 'short', '237ml', 'Venti사진');


INSERT INTO option_tb (`id`, `size_id`, `option_price`, `beverage_id`)
 VALUES (1, 1, 4500, 1);
INSERT INTO option_tb (`id`, `size_id`,`option_price`, `beverage_id`)
 VALUES (2, 2, 5000, 1);
INSERT INTO option_tb (`id`, `size_id`, `option_price`, `beverage_id`)
 VALUES (3, 3, 5500, 1);



INSERT INTO food_tb (`id`,`food_name`,`food_eng_name`,`food_description`,`food_tip`, `food_price`, `food_pic_url`, `category_id`)
 VALUES (1, '갈릭&올리브 브레드', 'Garlic&Olive Bread', '그린&블랙 올리브와 롤 치즈, 국내산 마늘이 고르게 분포된 식사대용 브레드 입니다.', '* 갈변된 마늘이 나올 수 있으나 구운 마늘로 품질 이상이 아닙니다. * 간혹 올리브 씨앗이 나올 수 있으니, 섭취시 주의 부탁드립니다.', 5000, 'https://image.istarbucks.co.kr/upload/store/skuimg/2023/10/[9300000004824]_20231004111431349.jpg', 2);


