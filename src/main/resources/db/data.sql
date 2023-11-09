INSERT INTO  user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (1, 'ssar', 'ssar@nate.com', 'a12345678!', '김쌀', '010-1212-1212', 1, '2020-02-02', '2020-02-02');
INSERT INTO user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (2, 'cos', 'cos@nate.com', 'a12345678!!', '코스', '010-1234-1234', 1, '2020-02-04', '2020-02-04');
INSERT INTO user_tb (`id`, `login_id`, `email`, `password`, `user_name`, `phone_number`, `manager`, `user_created_at`, `user_updated_at`)
 VALUES (3, 'love', 'love@nate.com', 'a12345678!!', '러브', '010-1234-1234', 1, '2020-02-04', '2020-02-04');



INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(1,'사진','스타벅스e카드',12000,123456780,123123,'2020-12-12',1,null);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(2,'사진','스타벅스e카드',12300,123456789,456789,'2020-12-12',2,2);
INSERT INTO card_tb (`id`,`pic_url`,`name`,`money`,`number`, `pin`, `created_at`,`status`,`user_id`) VALUES(3,'사진','스타벅스e카드',12300,123456788,456123,'2020-12-12',3,2);


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
 VALUES (2, '뜨 아메리카노', 'Caffe Americano', '진한 에스프레소에 개뜨거운 정수물을 넣어서 강렬한 맛을 선사합니다.', '블론드/디카페인 커피 Tab에서 블론드, 디카페인, 1/2 디카페인 아메리카노를 주문할 수 있습니다.',false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110563]_20210426095937808.jpg', 1);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (3, '아이스 카페라떼', 'Iced Caffe Latte', '진한 에스프레소에 차가운 우유와  얼음을 더하여 스타벅스의 깔끔하고 강렬한 에스프레소를 가장 부드럽고 시원하게 즐길 수 있는 커피','블론드/디카페인 커피 Tab에서 블론드, 디카페인, 1/2 디카페인 아메리카노를 주문할 수 있습니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110563]_20210426095937808.jpg', 1);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (4, '뜨 카페라떼', 'Caffe Latte', '진한 에스프레소에 뜨거운 우유를 넣어 부드러운 커피를 느낄 수 있습니다.','블론드/디카페인 커피 Tab에서 블론드, 디카페인, 1/2 디카페인 아메리카노를 주문할 수 있습니다.', true, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[110563]_20210426095937808.jpg', 1);
INSERT INTO product_tb (`id`, `name`, `eng_name`, `description`, `tip`, `is_iced`, `pic_url`, `category_id`)
 VALUES (5, '디카페인 카라멜 마키아또', 'DECAF Caramel Macchiato', '바닐라 시럽과 우유, 그리고 진한 에스프레소 샷과 달콤한 카라멜 드리즐이 어우러진 디카페인 카라멜 마키아또를 즐겨보세요!', '', false, 'https://image.istarbucks.co.kr/upload/store/skuimg/2021/04/[126197]_20210415154609863.jpg', 8);



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

