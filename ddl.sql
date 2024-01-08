

#게시물 테이블 생성

create table article(
    id int(10) unsigned NOT NULL primary key auto_increment,
    regDate dateTime NOT NULL,
    updateDate dateTime NOT NULL,
    title varchar(255) NOT NULL,
    'content' text NOT NULL
);


#게시물 , 테스트 데이터 생성
update article
set regdate =now(),
updateDate =now(),
title = '테스트',
content = '테스트' where  id=1  ;





