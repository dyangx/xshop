/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : xshop

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-09-14 18:03:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `NUMBER` varchar(10) NOT NULL COMMENT '模块编码',
  `NAME` varchar(50) DEFAULT NULL COMMENT '名称',
  `ORDERD` int(11) DEFAULT NULL,
  `USED` varchar(1) DEFAULT '' COMMENT '是否使用',
  `l_size` int(11) NOT NULL,
  PRIMARY KEY (`NUMBER`),
  KEY `menu_pk` (`NUMBER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('M01', '手机 电话卡', '1', 'Y', '0');
INSERT INTO `menu` VALUES ('M02', '笔记本 平板', '2', 'Y', '0');
INSERT INTO `menu` VALUES ('M03', '电视 盒子', '3', 'Y', '0');
INSERT INTO `menu` VALUES ('M04', '路由器 智能硬件', '4', 'Y', '0');
INSERT INTO `menu` VALUES ('M05', '移动电源 电池 插线板', '5', 'Y', '0');
INSERT INTO `menu` VALUES ('M06', '耳机 音响', '6', 'Y', '0');
INSERT INTO `menu` VALUES ('M07', '保护套 贴膜', '7', 'Y', '0');
INSERT INTO `menu` VALUES ('M08', '线材 支架 储存卡', '8', 'Y', '0');
INSERT INTO `menu` VALUES ('M09', '箱包 服饰 鞋 眼镜', '9', 'Y', '0');
INSERT INTO `menu` VALUES ('M10', '米兔 生活周边', '10', 'Y', '0');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `ID` varchar(32) NOT NULL,
  `KIND` varchar(10) DEFAULT NULL COMMENT '分类',
  `NAME` varchar(255) DEFAULT NULL COMMENT '名称',
  `DESCRIBE` varchar(255) DEFAULT NULL COMMENT '描述',
  `PRICE` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `SDATE` datetime DEFAULT NULL COMMENT '上架时间',
  `IMGURL` varchar(255) DEFAULT NULL COMMENT '图片略缩图',
  `BIMGURL` varchar(255) DEFAULT NULL COMMENT '图片略缩图 大',
  `USED` varchar(1) DEFAULT '' COMMENT '使用标志',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('121s', 'M06', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('23', 'M04', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfas23', 'M01', '小米6', '	5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfas24', 'M01', '小米6', '	5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfas2f', 'M01', '小米6', '	5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfas5', 'M01', '小米6', '	5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfas6', 'M01', '小米6', '	5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfas7', 'M01', '小米6', '	5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfas8', 'M01', '小米6', '	5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfas9', 'M01', '小米6', '	5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfasd1f', 'M01', '小米6', '	5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfasdf', 'M01', '小米6', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfasdfsdf', 'M01', '小米7', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfasdfsds', 'M01', '小米10', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('adsfasdfssdf', 'M01', '小米9', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('dsd12sas', 'M08', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('dsd12sasd', 'M09', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('dsd12sasdsad', 'M10', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('dsdsas', 'M02', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('dsdsas1', 'M07', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('dsdsass', 'M03', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('dsdsasssa', 'M05', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');
INSERT INTO `product` VALUES ('dsdss', 'M02', '小米8', '5月9日-21日享花呗12期分期免息', '1999.90', '2018-09-12 14:37:33', '/static/image/xm6_80.png', '/xshop/static/image/pinpai2.png', 'Y');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` varchar(32) NOT NULL,
  `USERNAME` varchar(60) DEFAULT NULL,
  `NICK` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(50) DEFAULT NULL,
  `REGISTERIP` varchar(15) DEFAULT NULL,
  `REGISTERDATE` datetime DEFAULT NULL,
  `PHONE` varchar(11) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `user_name_unique` (`USERNAME`) COMMENT '用户名',
  KEY `user_primerykey` (`ID`) COMMENT '主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1234567890', 'yangjie', '', 'BBB01BE3D3611F4958BC62B2E0B4F458', '91.18.24.169', '2017-12-26 09:45:12', '13551102437', '');
INSERT INTO `user` VALUES ('408ca3f9ec7011e7ae7d28d24446e1cc', 'yangjiee', null, '123456', '91.18.24.169', '2017-12-29 16:13:47', '13551102437', 'yaabbccj@163.com');
INSERT INTO `user` VALUES ('8a594aa0eb9b11e7ae7d28d24446e1cc', 'yangji', 'dave', '123456', '91.18.24.169', '2017-12-28 14:51:08', '13551102437', '772847238@qq.com');
INSERT INTO `user` VALUES ('9874651237845612', 'kkA', null, null, null, null, null, null);
