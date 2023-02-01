use news_jsp_servlet;

insert into category(code, name) values('the-thao', 'Thể thao');
insert into category(code, name) values('the-gioi', 'Thế giới');
insert into category(code, name) values('chinh-tri', 'Chính trị');
insert into category(code, name) values('thoi-su', 'Thời sự');
insert into category(code, name) values('goc-nhin', 'Góc nhìn');

insert into role(code, name) values('ADMIN', 'Quản trị');
insert into role(code, name) values('USER', 'Người dùng');

insert into user(username, password, fullname, status, roleid) values('admin','123456','admin', 1, 1);
insert into user(username, password, fullname, status, roleid) values('nguyenvana','123456','Nguyễn Văn A', 1, 2);
insert into user(username, password, fullname, status, roleid) values('nguyenvanb','123456','Nguyễn Văn B', 1, 2);

