

#게시물 테이블 생성

create table article(
        id int(10) unsigned NOT NULL primary key auto_increment,
        title varchar(255) NOT NULL,
        `content` text NOT null,
        regDate dateTime NOT NULL,
        updateDate dateTime NOT NULL
);

INSERT INTO sb_app_2022_t.article
( title, content, regDate, updateDate)
VALUES( '제목', '내용', now(), now());

#게시물 , 테스트 데이터 생성
update article
set regdate =now(),
updateDate =now(),
title = '테스트',
content = '테스트' where  id=1  ;





