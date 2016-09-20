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
#系统代码
create table SYS_CODE_B  (
   SYS_CODE_ID          varchar(40)                    not null,
   NAME                 varchar(100),
   PARENT_ID            varchar(40),
   PARENT_NAME          varchar(100),
   LAYER_NUM            INT,
   IS_LEAF              INT,
   QUOTE_NUM            INT,
   CNOTE                varchar(100),
   ICO                  varchar(20),
   ORDER_NO             INT,
   STATE                CHAR(1),
   CREATED_BY           varchar(40),
   CREATED_TIME         TIMESTAMP,
   UPDATED_BY           varchar(40),
   UPDATED_TIME         TIMESTAMP,
   constraint PK_SYS_CODE_B primary key (SYS_CODE_ID)
);
==============================================================
#历史购销合同
create table CONTRACT_HIS_C  (
   CONTRACT_ID          varchar(40)                    not null,
   OFFEROR              varchar(200),
   CONTRACT_NO          varchar(50),
   SIGNING_DATE         TIMESTAMP,
   INPUT_BY             varchar(30),
   CHECK_BY             varchar(30),
   INSPECTOR            varchar(30),
   TOTAL_AMOUNT         decimal(10,2),
   CREQUEST             varchar(2000),
   CUSTOM_NAME          varchar(200),
   SHIP_TIME            TIMESTAMP,
   IMPORT_NUM           INT,
   DELIVERY_PERIOD      TIMESTAMP,
   REMARK               varchar(600),
   PRINT_STYLE          CHAR(1),
   OLD_STATE            INT,
   STATE                INT,
   OUT_STATE            INT,
   TRADE_TERMS          varchar(30),
   CREATE_BY            varchar(40),
   CREATE_DEPT          varchar(40),
   CREATE_TIME          TIMESTAMP,
   constraint PK_CONTRACT_HIS_C primary key (CONTRACT_ID)
);
====================================================
#历史合同下附件
create table EXT_CPRODUCT_HIS_C  (
   EXT_CPRODUCT_ID      varchar(40)                    not null,
   FACTORY_ID           varchar(40),
   CONTRACT_PRODUCT_ID  varchar(40),
   CTYPE                INT,
   PRODUCT_NAME         varchar(200),
   PRODUCT_NO           varchar(50),
   PRODUCT_IMAGE        varchar(200),
   PRODUCT_DESC         varchar(600),
   LOADING_RATE         varchar(10),
   PACKING_UNIT         varchar(10),
   Cdecimal              INT,
   OUT_decimal           INT,
   FINISHED             INT,
   GROSS_WEIGHT         decimal(10,2),
   NET_WEIGHT           decimal(10,2),
   CSIZE                decimal(10,2),
   SIZE_LENGTH          decimal(10,2),
   SIZE_WIDTH           decimal(10,2),
   SIZE_HEIGHT          decimal(10,2),
   PRODUCT_REQUEST      varchar(2000),
   PRICE                decimal(10,2),
   AMOUNT               decimal(10,2),
   CUNIT                varchar(10),
   BOX_NUM              INT,
   EX_PRICE             decimal(10,2),
   EX_AMOUNT            decimal(10,2),
   EX_UNIT              varchar(10),
   NO_TAX               decimal(10,2),
   TAX                  decimal(10,2),
   COST_PRICE           decimal(10,2),
   COST_TAX             decimal(10,2),
   ORDER_NO             INT,
   constraint PK_EXT_CPRODUCT_HIS_C primary key (EXT_CPRODUCT_ID)
);
=====================================================
#历史合同下货物
create table CONTRACT_PRODUCT_HIS_C  (
   CONTRACT_PRODUCT_ID  varchar(40)                    not null,
   CONTRACT_ID          varchar(40),
   FACTORY_ID           varchar(40),
   PRODUCT_NAME         varchar(200),
   PRODUCT_NO           varchar(50),
   PRODUCT_IMAGE        varchar(200),
   PRODUCT_DESC         varchar(600),
   LOADING_RATE         varchar(10),
   PACKING_UNIT         varchar(10),
   Cdecimal              INT,
   OUT_decimal           INT,
   FINISHED             INT,
   GROSS_WEIGHT         decimal(10,2),
   NET_WEIGHT           decimal(10,2),
   CSIZE                decimal(10,2),
   SIZE_LENGTH          decimal(10,2),
   SIZE_WIDTH           decimal(10,2),
   SIZE_HEIGHT          decimal(10,2),
   PRODUCT_REQUEST      varchar(2000),
   PRICE                decimal(10,2),
   AMOUNT               decimal(10,2),
   CUNIT                varchar(10),
   BOX_NUM              INT,
   EX_PRICE             decimal(10,2),
   EX_AMOUNT            decimal(10,2),
   EX_UNIT              varchar(10),
   NO_TAX               decimal(10,2),
   TAX                  decimal(10,2),
   COST_PRICE           decimal(10,2),
   COST_TAX             decimal(10,2),
   ORDER_NO             INT,
   constraint PK_CONTRACT_PRODUCT_HIS_C primary key (CONTRACT_PRODUCT_ID)
);
===========================================
#购销合同
create table CONTRACT_C  (
   CONTRACT_ID          varchar(40)                    not null,
   OFFEROR              varchar(200),
   CONTRACT_NO          varchar(50),
   SIGNING_DATE         TIMESTAMP,
   INPUT_BY             varchar(30),
   CHECK_BY             varchar(30),
   INSPECTOR            varchar(30),
   TOTAL_AMOUNT         decimal(10,2),
   IMPORT_NUM           CHAR(6),
   CREQUEST             varchar(2000),
   CUSTOM_NAME          varchar(200),
   DELIVERY_PERIOD      TIMESTAMP,
   SHIP_TIME            TIMESTAMP,
   TRADE_TERMS          varchar(30),
   REMARK               varchar(600),
   PRINT_STYLE          CHAR(1),
   OLD_STATE            INT,
   STATE                INT,
   OUT_STATE            INT,
   CREATE_BY            varchar(40),
   CREATE_DEPT          varchar(40),
   CREATE_TIME          TIMESTAMP,
   constraint PK_CONTRACT_C primary key (CONTRACT_ID)
);
=========================================
#合同下货物
create table CONTRACT_PRODUCT_C  (
   CONTRACT_PRODUCT_ID  varchar(40)                    not null,
   CONTRACT_ID          varchar(40),
   FACTORY_ID           varchar(40),
   FACTORY_NAME         varchar(50),
   PRODUCT_NO           varchar(50),
   PRODUCT_IMAGE        varchar(200),
   PRODUCT_DESC         varchar(600),
   Cdecimal              INT,
   PACKING_UNIT         varchar(10),
   PRICE                decimal(10,2),
   AMOUNT               decimal(10,2),
   OUT_decimal           INT,
   FINISHED             INT,
   ORDER_NO             INT,
   constraint PK_CONTRACT_PRODUCT_C primary key (CONTRACT_PRODUCT_ID)
);
==================
#合同下附件
create table EXT_CPRODUCT_C  (
   EXT_CPRODUCT_ID      varchar(40)                    not null,
   CONTRACT_PRODUCT_ID  varchar(40),
   FACTORY_ID           varchar(40),
   FACTORY_NAME         varchar(50),
   CTYPE                INT,
   PRODUCT_NO           varchar(50),
   PRODUCT_IMAGE        varchar(200),
   PRODUCT_DESC         varchar(600),
   Cdecimal              INT,
   PACKING_UNIT         varchar(10),
   PRICE                decimal(10,2),
   AMOUNT               decimal(10,2),
   PRODUCT_REQUEST      varchar(2000),
   ORDER_NO             INT,
   constraint PK_EXT_CPRODUCT_C primary key (EXT_CPRODUCT_ID)
);