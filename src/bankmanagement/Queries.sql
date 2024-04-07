create table accounts
(
acc_no bigint primary key,
name varchar(40) not null,
dob varchar(15), 
gender varchar(10) not null,
f_name varchar(40) not null,
m_no varchar(15),
aadhar bigint not null,
permanent_add varchar(150) not null,
pass varchar(20) not null,
doc varchar(15)
);

create table acc_nos(
acc_no bigint primary key
);

insert into acc_nos value(1211000000);

create table transaction(
acc_no bigint(12),
debit bigint(12),
credit bigint(12),
total bigint(15)
);