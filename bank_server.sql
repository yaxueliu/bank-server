create table bank_account
(
    account_id        bigint       not null primary key comment '账户ID',
    id_card           char(18)     not null unique comment '身份证号',
    account_real_name varchar(50)  not null comment '真实姓名',
    account_password  varchar(255) not null comment '密码，已加密',
    account_phone     varchar(20)  not null comment '手机号码',
    account_address   varchar(255) not null default '' comment '地址'
) comment '银行账户信息';

create table bank_card
(
    card_id       bigint         not null primary key comment '银行卡信息ID',
    account_id    bigint         not null comment '用户ID',
    card_number   varchar(20)    not null unique comment '银行卡号',
    card_password varchar(255)   not null comment '银行卡密码',
    card_balance  decimal(10, 2) not null default 0.0 comment '余额',
    cancel_flag   tinyint(1)     not null comment '销卡标识，0:未销卡, 1:已销卡'
) comment '银行卡信息';

create table bank_admin
(
    admin_id         bigint       not null primary key comment 'Admin ID',
    admin_login_name varchar(25)  not null unique comment 'Admin登录名称',
    admin_password   varchar(255) not null comment '管理员密码',
    admin_real_name  varchar(50)  not null comment '真实姓名',
    admin_number     int          not null default 0 comment '管理员编号'
) comment '管理员信息';