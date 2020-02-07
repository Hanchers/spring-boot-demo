CREATE SCHEMA IF NOT EXISTS db_0;


DROP TABLE IF EXISTS db_0.`order_0`;
CREATE TABLE db_0.`order_0`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `one_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '一级分类code',
  `two_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二级分类code',
  `biz_code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务单号',
  `handler_code` int(50) NULL DEFAULT NULL COMMENT '处理人code',
  `timeout_time` timestamp(0) NULL DEFAULT NULL COMMENT '超时时间点',
  `status` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `is_timeout` int(2) NULL DEFAULT 0 COMMENT '是否超时 0否，1是',
  `order_desc` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `start_stamp` bigint(20) NULL DEFAULT NULL COMMENT '开始时间',
  `is_del` tinyint(4) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 432637738190110721 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_2
-- ----------------------------
DROP TABLE IF EXISTS db_0.`order_2`;
CREATE TABLE db_0.`order_2`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `one_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '一级分类code',
  `two_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二级分类code',
  `biz_code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务单号',
  `handler_code` int(50) NULL DEFAULT NULL COMMENT '处理人code',
  `timeout_time` timestamp(0) NULL DEFAULT NULL COMMENT '超时时间点',
  `status` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `is_timeout` int(2) NULL DEFAULT 0 COMMENT '是否超时 0否，1是',
  `order_desc` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `start_stamp` bigint(20) NULL DEFAULT NULL COMMENT '开始时间',
  `is_del` tinyint(4) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 432637498665992193 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_handle_0
-- ----------------------------
DROP TABLE IF EXISTS db_0.`order_handle_0`;
CREATE TABLE db_0.`order_handle_0`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单code',
  `handler_code` int(50) NOT NULL COMMENT '处理人code',
  `handler_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理人姓名',
  `center_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中心名称',
  `city_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市code',
  `is_del` tinyint(4) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单处理人信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_handle_2
-- ----------------------------
DROP TABLE IF EXISTS db_0.`order_handle_2`;
CREATE TABLE db_0.`order_handle_2`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单code',
  `handler_code` int(50) NOT NULL COMMENT '处理人code',
  `handler_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理人姓名',
  `center_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中心名称',
  `city_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市code',
  `is_del` tinyint(4) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单处理人信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_handle_record_0
-- ----------------------------
DROP TABLE IF EXISTS db_0.`order_handle_record_0`;
CREATE TABLE db_0.`order_handle_record_0`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `operator_role` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处理人角色',
  `operator_code` int(50) NOT NULL COMMENT '处理人编号',
  `operator_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理人名字',
  `handle_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '处理时间',
  `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理内容',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单操作记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_handle_record_2
-- ----------------------------
DROP TABLE IF EXISTS db_0.`order_handle_record_2`;
CREATE TABLE db_0.`order_handle_record_2`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `operator_role` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处理人角色',
  `operator_code` int(50) NOT NULL COMMENT '处理人编号',
  `operator_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理人名字',
  `handle_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '处理时间',
  `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理内容',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单操作记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_level
-- ----------------------------
DROP TABLE IF EXISTS db_0.`order_level`;
CREATE TABLE db_0.`order_level`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `level_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类编号',
  `level_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `level` int(11) NOT NULL DEFAULT 1 COMMENT '分类级别',
  `parent_level_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父分类编号',
  `is_del` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单分类' ROW_FORMAT = Dynamic;


CREATE SCHEMA IF NOT EXISTS db_1;

DROP TABLE IF EXISTS db_1.`order_1`;
CREATE TABLE db_1.`order_1`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `one_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '一级分类code',
  `two_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二级分类code',
  `biz_code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务单号',
  `handler_code` int(50) NULL DEFAULT NULL COMMENT '处理人code',
  `timeout_time` timestamp(0) NULL DEFAULT NULL COMMENT '超时时间点',
  `status` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `is_timeout` int(2) NULL DEFAULT 0 COMMENT '是否超时 0否，1是',
  `order_desc` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `start_stamp` bigint(20) NULL DEFAULT NULL COMMENT '开始时间',
  `is_del` tinyint(4) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 432635924531118081 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_3
-- ----------------------------
DROP TABLE IF EXISTS db_1.`order_3`;
CREATE TABLE db_1.`order_3`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `one_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '一级分类code',
  `two_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二级分类code',
  `biz_code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '业务单号',
  `handler_code` int(50) NULL DEFAULT NULL COMMENT '处理人code',
  `timeout_time` timestamp(0) NULL DEFAULT NULL COMMENT '超时时间点',
  `status` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `is_timeout` int(2) NULL DEFAULT 0 COMMENT '是否超时 0否，1是',
  `order_desc` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `start_stamp` bigint(20) NULL DEFAULT NULL COMMENT '开始时间',
  `is_del` tinyint(4) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 432637657277792257 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_handle_1
-- ----------------------------
DROP TABLE IF EXISTS db_1.`order_handle_1`;
CREATE TABLE db_1.`order_handle_1`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单code',
  `handler_code` int(50) NOT NULL COMMENT '处理人code',
  `handler_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理人姓名',
  `center_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中心名称',
  `city_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市code',
  `is_del` tinyint(4) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单处理人信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_handle_3
-- ----------------------------
DROP TABLE IF EXISTS db_1.`order_handle_3`;
CREATE TABLE db_1.`order_handle_3`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单code',
  `handler_code` int(50) NOT NULL COMMENT '处理人code',
  `handler_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理人姓名',
  `center_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中心名称',
  `city_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市code',
  `is_del` tinyint(4) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单处理人信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_handle_record_1
-- ----------------------------
DROP TABLE IF EXISTS db_1.`order_handle_record_1`;
CREATE TABLE db_1.`order_handle_record_1`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `operator_role` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处理人角色',
  `operator_code` int(50) NOT NULL COMMENT '处理人编号',
  `operator_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理人名字',
  `handle_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '处理时间',
  `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理内容',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单操作记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_handle_record_3
-- ----------------------------
DROP TABLE IF EXISTS db_1.`order_handle_record_3`;
CREATE TABLE db_1.`order_handle_record_3`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `order_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `operator_role` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处理人角色',
  `operator_code` int(50) NOT NULL COMMENT '处理人编号',
  `operator_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理人名字',
  `handle_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '处理时间',
  `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理内容',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单操作记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order_level
-- ----------------------------
DROP TABLE IF EXISTS db_1.`order_level`;
CREATE TABLE `order_level`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `level_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类编号',
  `level_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `level` int(11) NOT NULL DEFAULT 1 COMMENT '分类级别',
  `parent_level_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父分类编号',
  `is_del` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单分类' ROW_FORMAT = Dynamic;