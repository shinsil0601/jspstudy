create table guestbook2(
    idx number not null primary key,
    name varchar2(50),
    subject varchar2(50),
    content varchar2(4000),
    email varchar2(50),
    pwd varchar2(50), 
    f_name varchar2(50),
    regdate date
  );
  
  create sequence guestbook2_seq
  increment by 1
  start with 1
  maxvalue 9999999
  nocycle;

    commit;
  
 insert into guestbook2 values(guestbook2_seq.nextval, '홍길동', '첫번째연습','첫번째연습 내용~~~','hong@nave.com','1111',sysdate);
  select * from guestbook;
  commit;