 

SET FOREIGN_KEY_CHECKS=0;

create database springboot;
-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(32) DEFAULT NULL COMMENT '用户名',
  `age` int  DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

delete from users;
insert into users (userName,passWord,user_sex,nick_name)  values('adeline','adeline','WOMAN','adeline');


select  * from users ;