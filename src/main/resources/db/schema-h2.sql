
DROP TABLE IF EXISTS user;

CREATE TABLE user
(
	test_id BIGINT(20) NOT NULL COMMENT '主键ID',
	tenant_id BIGINT(20) NOT NULL COMMENT '租户ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '名称',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	test_type INT(11) NULL DEFAULT NULL COMMENT '测试下划线字段命名类型',
	test_date DATETIME NULL DEFAULT NULL COMMENT '日期',
	role BIGINT(20) NULL DEFAULT NULL COMMENT '测试',
	phone VARCHAR(11) NULL DEFAULT NULL COMMENT '手机号码',
	PRIMARY KEY (test_id)
);

DROP TABLE IF EXISTS tsm_staff`;
CREATE TABLE `tsm_staff` (
  `id_` bigint(20) NOT NULL COMMENT 'id',
  `account` varchar(20) NOT NULL COMMENT '登录账号',
  `password` varchar(50) NOT NULL COMMENT '登录密码',
  `user_name` varchar(10) NOT NULL COMMENT '姓名',
  `sex` tinyint(1) NOT NULL COMMENT '性别，0男，1女，2其他',
  `id_card` varchar(18) NOT NULL COMMENT '身份证号码',
  `role_id` bigint(20) default NULL COMMENT '角色ID',
  `phone` varchar(11) default NULL COMMENT '手机号码',
  `status` tinyint(1) NOT NULL default '1' COMMENT '状态 1.正常 0.冻结 2.离职',
  `province` varchar(50) default NULL COMMENT '省份',
  `city` varchar(50) default NULL COMMENT '城市',
  `entry_date` datetime default NULL COMMENT '入职时间',
  `leave_date` datetime default NULL COMMENT '离职时间',
  `email` varchar(50) default NULL COMMENT '工作邮箱',
  `leader_id` bigint(20) default NULL COMMENT '上级Id',
  `is_admin` tinyint(1) default '0' COMMENT '是否为管理账号 1.是 0.否',
  `change_date` datetime default NULL COMMENT '最近修改时间',
  `change_by` bigint(20) default NULL COMMENT '人员唯一标识',
  `create_date` datetime default NULL COMMENT '创建时间',
  `create_by` bigint(20) default NULL COMMENT '创建人',
  `is_active` tinyint(1) default '1' COMMENT '是否有效 默认 1. 有效 0.无效',
  `category` tinyint(1) default NULL COMMENT '(人员类别：0门店,1商户,2.内部人员)',
  `is_setting_role` tinyint(1) default NULL COMMENT '(是否设置用户权限1：是，0：否)',
  PRIMARY KEY  (`id_`),
  UNIQUE KEY `index_staff_id` (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='tsm_staff (人员表)';


DROP TABLE IF EXISTS tsm_staff`;
CREATE TABLE `tom_order` (
  `id_` bigint(20) NOT NULL COMMENT 'id',
  `applicant_name` varchar(20) default NULL COMMENT '申请人名称',
  `status` tinyint(1) default NULL COMMENT '订单状态',
  `customer_info_id` bigint(20) NOT NULL COMMENT '客户信息ID',
  `apply_time` datetime default NULL COMMENT '申请时间',
  `contract_no` varchar(50) default NULL COMMENT '合同号',
  `period_num` smallint(6) default NULL COMMENT '合同期数',
  `seller_id` bigint(20) default NULL COMMENT '销售人员ID(办单人ID)',
  `merchants_id` bigint(20) default NULL COMMENT '商户ID',
  `store_id` bigint(20) NOT NULL COMMENT '门店ID',
  `product_id` bigint(20) NOT NULL COMMENT '产品ID',
  `sm_type` varchar(20) NOT NULL COMMENT '场景表中的品类',
  `fund_side_code` varchar(20) NOT NULL COMMENT '资金方code',
  `commodity_name` varchar(20) default NULL COMMENT '商品名称',
  `commodity_price` decimal(12,2) default NULL COMMENT '商品价格',
  `loan_amount` decimal(12,2) default NULL COMMENT '贷款金额',
  `loan_period` int(11) default NULL COMMENT '贷款期数',
  `loan_date` datetime default NULL COMMENT '放款时间',
  `bank_type` tinyint(1) default NULL COMMENT '银行卡类型 1.借记卡 2.信用卡',
  `customer_bank_card_id` bigint(20) default NULL COMMENT '还款卡表ID',
  `month_amount` decimal(12,2) default '0.00' COMMENT '每月还款',
  `first_pay_amount` decimal(12,2) default '0.00' COMMENT '首付金额',
  `success_pay_time` datetime default NULL COMMENT '成功支付时间',
  `org_order_no` varchar(50) default NULL COMMENT '资金方订单号',
  `commit_order_date` datetime default NULL COMMENT '提交订单时间',
  `merchant_settlement_amount` decimal(12,2) default NULL COMMENT '商户结算额',
  `commit_ip` varchar(30) default NULL COMMENT '提交订单的IP',
  `consultant_phone` varchar(11) default NULL COMMENT '咨询师电话',
  `consultant_name` varchar(20) default NULL COMMENT '咨询师姓名',
  `consultant_group_photo` tinyint(1) default '0' COMMENT '是否存在咨询师合照 1.存在 0.不存在',
  `consumer_photo` tinyint(1) default '0' COMMENT '是否存在消费凭证照片 1.存在 0.不存在',
  `ticket_id` bigint(20) default NULL COMMENT ' 标识一次认证任务的唯一 ID',
  `is_human_face` tinyint(1) default '0' COMMENT '是否已进行人脸识别 1.是 0.否 默认否',
  `lat` varchar(20) default NULL COMMENT '纬度',
  `lng` varchar(20) default NULL COMMENT '经度',
  `change_date` datetime default NULL COMMENT '修改时间',
  `is_active` tinyint(1) default '1' COMMENT '是否有效 （做逻辑删除处理） 1.有效 0.无效',
  `reason` varchar(255) default NULL COMMENT '退货原因',
  `remark` varchar(255) default NULL COMMENT '备注',
  `change_by` bigint(20) default NULL COMMENT '修改人',
  `client_source` varchar(10) default NULL COMMENT '客户端来源 h5/app',
  `create_date` datetime default NULL COMMENT '创建时间',
  `tom_order` varchar(255) default NULL,
  `can_return` tinyint(1) default '0' COMMENT '是否能退货0.否 1.是',
  `inside_order_status` tinyint(1) NOT NULL default '1' COMMENT '内部订单状态',
  PRIMARY KEY  (`id_`),
  KEY `index_commit_date` (`commit_order_date`),
  KEY `index_customer_info_id` (`customer_info_id`),
  KEY `index_store_id` (`store_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='tom_order (订单表)';


