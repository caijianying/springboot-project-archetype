create database project_archetype;

use project_archetype;

create table t_user
(
    id        int auto_increment primary key,
    user_name varchar(32) null comment '用户名'
);