create sequence subj_seq start with 1000;
create table subject(
	subj_seq int primary key,
	major varchar2(10),
	subject varchar2(100),
	id varchar2(20),
	constraint subject_member_fk foreign key (id)
	references member(id) on delete cascade
);

alter table grade add exam_date varchar2(10);
-- create
insert into subject(subj_seq,major,subject,id)
values(
	subj_seq.nextval,'Computer','java,sql','kim');
-- read : list
select * from subject;
select * from subject_member;

create or replace view subject_member
as
select
m.id as id,
m.pw as pw,
m.name as name,
m.ssn as ssn,
m.email as email,
m.profile_img as img,
m.phone,s.major,s.subject
from member m , subject s
where m.id=s.id;