-- 用户表
CREATE TABLE `tb_user` (
  `user_id` int(32) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(32) DEFAULT NULL COMMENT '用户登录名',
  `password` varchar(32) NOT NULL COMMENt '用户密码',
  `nickname` varchar(120) NOT NULL COMMENT '用户昵称',
  `sex` char(2) NOT NULL DEFAULT '男' COMMENT '用户性别',
  `birthday` date NOT NULL DEFAULT '1990-01-01' COMMENT '出生日期',
  `user_icon` varchar(255) NOT NULL DEFAULT 'default.ico' COMMENT '用户头像图片地址,
  `email` varchar(120) DEFAULT NULL COMMENT '用户邮箱',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '用户注册时间',
  PRIMARY KEY (`user_id`), 
  UNIQUE KEY `user_name` (`user_name`),
  KEY `login_index` (`password`,`nickname`),
  KEY `info_index` (`sex`,`birthday`,`reg_time`),
  KEY `other_index` (`user_icon`,`email`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
  
  
  -- 帖子表
  CREATE TABLE `tb_post` (
  `post_id` int(32) unsigned NOT NULL AUTO_INCREMENT COMMENT '',
  `user_id` int(32) unsigned NOT NULL,
  `post_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `hot` int(11) NOT NULL DEFAULT '0',
  `src` varchar(255) NOT NULL,
  `type` varchar(20) NOT NULL DEFAULT '学习',
  `title` varchar(120) NOT NULL,
  PRIMARY KEY (`post_id`),
  KEY `user_id` (`user_id`,`post_time`,`hot`,`src`,`type`,`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  
  -- 评论表
  CREATE TABLE `tb_comment` (
  `comment_id` int(32) unsigned NOT NULL AUTO_INCREMENT,
  `post_id` int(32) unsigned NOT NULL,
  `user_id` int(32) unsigned NOT NULL,
  `content` varchar(20000) NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `agree` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`comment_id`),
  KEY `post_id` (`post_id`,`user_id`,`time`,`agree`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  

  CREATE TABLE `tb_collecion` (
  `collectio_id` int(32) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(32) unsigned NOT NULL,
  `post_id` int(32) unsigned NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`collectio_id`),
  KEY `user_id` (`user_id`,`post_id`,`time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
