/*
Navicat MySQL Data Transfer

Source Server         : 545
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : janebook

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2017-09-11 08:58:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_article
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `id` int(11) NOT NULL COMMENT '文章id',
  `title` varchar(50) DEFAULT NULL COMMENT '文章标题',
  `content` mediumtext COMMENT '文章内容',
  `hot` int(11) DEFAULT NULL COMMENT '热度',
  `author_name` varchar(11) DEFAULT NULL COMMENT '作者名字',
  `browse` int(11) DEFAULT NULL COMMENT '浏览数',
  `collection` int(11) DEFAULT NULL COMMENT '收藏数',
  `tag` varchar(50) DEFAULT NULL COMMENT '标签',
  `classify_id` int(50) DEFAULT NULL COMMENT '类别id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `ar_count` int(11) DEFAULT NULL COMMENT '文章字数',
  `reward` int(11) DEFAULT NULL COMMENT '打赏人数',
  PRIMARY KEY (`id`),
  KEY `classify_id` (`classify_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章表';

-- ----------------------------
-- Records of t_article
-- ----------------------------

-- ----------------------------
-- Table structure for t_blacklist
-- ----------------------------
DROP TABLE IF EXISTS `t_blacklist`;
CREATE TABLE `t_blacklist` (
  `id` int(11) NOT NULL COMMENT '唯一标识',
  `user_id` varchar(11) DEFAULT NULL COMMENT '用户id',
  `benned_id` varchar(11) DEFAULT NULL COMMENT '被禁ID',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='黑名单表';

-- ----------------------------
-- Records of t_blacklist
-- ----------------------------

-- ----------------------------
-- Table structure for t_classify
-- ----------------------------
DROP TABLE IF EXISTS `t_classify`;
CREATE TABLE `t_classify` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类别id',
  `classify_name` varchar(11) DEFAULT NULL COMMENT '类别名',
  `hot` int(11) DEFAULT NULL,
  `is_city` int(1) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `article_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='类别表';

-- ----------------------------
-- Records of t_classify
-- ----------------------------

-- ----------------------------
-- Table structure for t_collection
-- ----------------------------
DROP TABLE IF EXISTS `t_collection`;
CREATE TABLE `t_collection` (
  `id` int(11) NOT NULL COMMENT '编号',
  `user_id` varchar(11) DEFAULT NULL COMMENT '用户id',
  `article_id` varchar(11) DEFAULT NULL COMMENT '文章id',
  `collection_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `article_id` (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';

-- ----------------------------
-- Records of t_collection
-- ----------------------------

-- ----------------------------
-- Table structure for t_commentary_fir
-- ----------------------------
DROP TABLE IF EXISTS `t_commentary_fir`;
CREATE TABLE `t_commentary_fir` (
  `id` int(11) NOT NULL COMMENT '评论id',
  `reviewer_id` varchar(11) DEFAULT NULL COMMENT '评论作者',
  `comment_cont` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `review_time` datetime DEFAULT NULL COMMENT '评论时间',
  `favor` varchar(11) DEFAULT NULL COMMENT '赞赏评论',
  `be_reviewer_id` varchar(11) DEFAULT NULL,
  `reviewer_name` varchar(11) DEFAULT NULL,
  `be_reviewer_name` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `reviewer_id` (`reviewer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论管理表';

-- ----------------------------
-- Records of t_commentary_fir
-- ----------------------------

-- ----------------------------
-- Table structure for t_commentary_sec
-- ----------------------------
DROP TABLE IF EXISTS `t_commentary_sec`;
CREATE TABLE `t_commentary_sec` (
  `id` int(11) NOT NULL COMMENT '评论ID',
  `reviewer_name` varchar(11) DEFAULT NULL COMMENT '评论人',
  `be_reviewer_name` varchar(11) DEFAULT NULL COMMENT '被评论人',
  `comment_cont` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `create_time` datetime DEFAULT NULL COMMENT '评论时间',
  `reviewer_id` varchar(11) DEFAULT NULL,
  `be_reviewer_id` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `reviewer_id` (`reviewer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论表2';

-- ----------------------------
-- Records of t_commentary_sec
-- ----------------------------

-- ----------------------------
-- Table structure for t_message
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message` (
  `id` int(11) NOT NULL COMMENT '消息id',
  `type` varchar(11) DEFAULT NULL COMMENT '消息类型',
  `mes_content` varchar(255) DEFAULT NULL COMMENT '消息文本',
  `reviewer_id` varchar(11) DEFAULT NULL,
  `be_reviewer_id` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `reviewer_id` (`reviewer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='消息表';

-- ----------------------------
-- Records of t_message
-- ----------------------------

-- ----------------------------
-- Table structure for t_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission` (
  `id` int(11) NOT NULL,
  `permissionname` varchar(255) DEFAULT NULL,
  `permissionurl` varchar(255) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_permission
-- ----------------------------
INSERT INTO `t_permission` VALUES ('1', '查看和管理页面', '/admin/**', '1');
INSERT INTO `t_permission` VALUES ('2', '写文章', '/user/insert**', '2');
INSERT INTO `t_permission` VALUES ('3', '读文章', '/user/list**', '3');

-- ----------------------------
-- Table structure for t_relationship
-- ----------------------------
DROP TABLE IF EXISTS `t_relationship`;
CREATE TABLE `t_relationship` (
  `id` int(11) NOT NULL COMMENT '关系编号',
  `user_id` int(11) DEFAULT NULL COMMENT '关注人id',
  `friend_id` int(11) DEFAULT NULL COMMENT '被关注人id',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='关系表';

-- ----------------------------
-- Records of t_relationship
-- ----------------------------

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL,
  `rolename` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', 'admin');
INSERT INTO `t_role` VALUES ('2', 'member');
INSERT INTO `t_role` VALUES ('3', 'guest');

-- ----------------------------
-- Table structure for t_search
-- ----------------------------
DROP TABLE IF EXISTS `t_search`;
CREATE TABLE `t_search` (
  `id` int(11) DEFAULT NULL,
  `search_name` varchar(255) DEFAULT NULL COMMENT '搜索文本'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_search
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `username` varchar(11) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(18) DEFAULT NULL COMMENT '密码',
  `nickname` varchar(11) DEFAULT NULL COMMENT '昵称',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `info` varchar(255) DEFAULT NULL COMMENT '个人简介',
  `personal_website` varchar(255) DEFAULT NULL COMMENT '个人网站',
  `phone` varchar(11) DEFAULT NULL COMMENT '电话',
  `email` varchar(20) DEFAULT NULL COMMENT '电子邮件',
  `favor` int(11) DEFAULT NULL COMMENT '收获喜欢数',
  `birthday` datetime DEFAULT NULL COMMENT '生日日期',
  `wechat` varchar(20) DEFAULT NULL COMMENT '微信账号',
  `QQ` int(11) DEFAULT NULL COMMENT 'QQ账号',
  `image` varchar(255) DEFAULT NULL COMMENT '头像',
  `is_rec` int(1) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('guest', '123456', null, null, null, null, null, null, null, null, null, null, null, '0', '3');
INSERT INTO `t_user` VALUES ('jwei', '123456', 'jiawei', '男', '1222', '1231', '123456', '9281231', '41231', '2017-09-05 08:52:17', '8965', '9698', null, '0', '1');
INSERT INTO `t_user` VALUES ('vip', '123456', null, null, null, null, null, null, null, null, null, null, null, '0', '2');
