INSERT INTO user_tb (`id`,`email`,`password`,`username`,`phonenumber`,`manager`,`created_at`,`updated_at`) VALUES ('1', 'ssar@nate.com', 'a12345678!', 'ssar','01022222222',1,null,null); -- ssar 유저 id 임
INSERT INTO user_tb (`id`,`email`,`password`,`username`,`phonenumber`,`manager`,`created_at`,`updated_at`) VALUES ('2', 'cos@nate.com', 'a12345678!', 'cos','01022221122',2,null,null); -- cos 관리자 id 임


        -- this.id = id;
        -- this.email = email;
        -- this.password = password;
        -- this.username = username;
        -- this.phoneNumber = phoneNumber;
        -- this.manager = manager;
        -- this.createdAt = createdAt;
        -- this.updatedAt = updatedAt;



INSERT INTO promotion_tb (`id`,`title`,`sub_content`,`start_date`,`end_date`, `is_open`,`pic_url`,`thumbnail`, `home_thumbnail`) VALUES (1, '10월 24일, AUTUMN PICNIC PICK!', '피크닉 픽 세트를 포장주문으로 구매하시고, 할인 혜택을 받아보세요.','2023-10-24','2023-11-01', true, '사진1', '썸네일1', '홈썸네일1');
INSERT INTO promotion_tb (`id`,`title`,`sub_content`,`start_date`,`end_date`, `is_open`, `pic_url`,`thumbnail`, `home_thumbnail`) VALUES (2, 'AUTUMN VIBE', '온라인 스토어에서 특별한 혜택을 만나보세요.','2023-10-19','2023-11-01', true, '사진2', '썸네일2', '홈썸네일2');
INSERT INTO promotion_tb (`id`,`title`,`sub_content`,`start_date`,`end_date`, `is_open`, `pic_url`,`thumbnail`, `home_thumbnail`) VALUES (3, '탄소중립포인트제 본인인증 고객대상 인센티브 지급일정 안내', '23년 7월 9일까지 본인인증 완료 고객 대상 인센티브 지급 일정 안내드립니다.','2023-10-17',null, false, '사진3', '썸네일3', null);


--     private int id;
--     private String title;
--     private String subContent;
--     private LocalDate startDate;
--     private LocalDate endDate;
--     private String picUrl;
--     private String thumbnail;