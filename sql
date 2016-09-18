SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `factory_c`
-- ----------------------------
DROP TABLE IF EXISTS `factory_c`;
CREATE TABLE `factory_c` (
  `FACTORY_ID` varchar(40) NOT NULL,
  `FULL_NAME` varchar(200) DEFAULT NULL,
  `FACTORY_NAME` varchar(50) DEFAULT NULL,
  `CONTACTS` varchar(30) DEFAULT NULL,
  `PHONE` varchar(20) DEFAULT NULL,
  `MOBILE` varchar(20) DEFAULT NULL,
  `FAX` varchar(20) DEFAULT NULL,
  `NOTE` varchar(1000) DEFAULT NULL,
  `INSPECTOR` varchar(30) DEFAULT NULL,
  `ORDER_NO` int(11) DEFAULT NULL,
  `STATE` char(1) DEFAULT NULL,
  `CREATE_BY` varchar(40) DEFAULT NULL,
  `CREATE_DEPT` varchar(40) DEFAULT NULL,
  `CREATE_TIME` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`FACTORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of factory_c
-- ----------------------------
INSERT INTO `factory_c` VALUES ('1', '111', '11', '11', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2016-09-18 10:35:35');




===========================================================