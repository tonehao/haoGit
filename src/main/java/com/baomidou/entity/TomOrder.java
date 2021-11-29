package com.baomidou.entity;


import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * tom_order (订单表); InnoDB free: 7168 kB
 * </p>
 *
 *@author Admin
 * @since 2021-11-29
 */
@TableName("tom_order")
public class TomOrder extends Model<TomOrder> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("id_")
   private Long id;
    /**
     * 申请人名称
     */
   @TableField("applicant_name")
   private String applicantName;
    /**
     * 订单状态
     */
   private Integer status;
    /**
     * 客户信息ID
     */
   @TableField("customer_info_id")
   private Long customerInfoId;
    /**
     * 申请时间
     */
   @TableField("apply_time")
   private Date applyTime;
    /**
     * 合同号
     */
   @TableField("contract_no")
   private String contractNo;
    /**
     * 合同期数
     */
   @TableField("period_num")
   private Integer periodNum;
    /**
     * 销售人员ID(办单人ID)
     */
   @TableField("seller_id")
   private Long sellerId;
    /**
     * 商户ID
     */
   @TableField("merchants_id")
   private Long merchantsId;
    /**
     * 门店ID
     */
   @TableField("store_id")
   private Long storeId;
    /**
     * 产品ID
     */
   @TableField("product_id")
   private Long productId;
    /**
     * 场景表中的品类
     */
   @TableField("sm_type")
   private String smType;
    /**
     * 资金方code
     */
   @TableField("fund_side_code")
   private String fundSideCode;
    /**
     * 商品名称
     */
   @TableField("commodity_name")
   private String commodityName;
    /**
     * 商品价格
     */
   @TableField("commodity_price")
   private BigDecimal commodityPrice;
    /**
     * 贷款金额
     */
   @TableField("loan_amount")
   private BigDecimal loanAmount;
    /**
     * 贷款期数
     */
   @TableField("loan_period")
   private Integer loanPeriod;
    /**
     * 放款时间
     */
   @TableField("loan_date")
   private Date loanDate;
    /**
     * 银行卡类型 1.借记卡 2.信用卡
     */
   @TableField("bank_type")
   private Integer bankType;
    /**
     * 还款卡表ID
     */
   @TableField("customer_bank_card_id")
   private Long customerBankCardId;
    /**
     * 每月还款
     */
   @TableField("month_amount")
   private BigDecimal monthAmount;
    /**
     * 首付金额
     */
   @TableField("first_pay_amount")
   private BigDecimal firstPayAmount;
    /**
     * 成功支付时间
     */
   @TableField("success_pay_time")
   private Date successPayTime;
    /**
     * 资金方订单号
     */
   @TableField("org_order_no")
   private String orgOrderNo;
    /**
     * 提交订单时间
     */
   @TableField("commit_order_date")
   private Date commitOrderDate;
    /**
     * 商户结算额
     */
   @TableField("merchant_settlement_amount")
   private BigDecimal merchantSettlementAmount;
    /**
     * 提交订单的IP
     */
   @TableField("commit_ip")
   private String commitIp;
    /**
     * 咨询师电话
     */
   @TableField("consultant_phone")
   private String consultantPhone;
    /**
     * 咨询师姓名
     */
   @TableField("consultant_name")
   private String consultantName;
    /**
     * 是否存在咨询师合照 1.存在 0.不存在
     */
   @TableField("consultant_group_photo")
   private Integer consultantGroupPhoto;
    /**
     * 是否存在消费凭证照片 1.存在 0.不存在
     */
   @TableField("consumer_photo")
   private Integer consumerPhoto;
    /**
     *  标识一次认证任务的唯一 ID
     */
   @TableField("ticket_id")
   private Long ticketId;
    /**
     * 是否已进行人脸识别 1.是 0.否 默认否
     */
   @TableField("is_human_face")
   private Integer isHumanFace;
    /**
     * 纬度
     */
   private String lat;
    /**
     * 经度
     */
   private String lng;
    /**
     * 修改时间
     */
   @TableField("change_date")
   private Date changeDate;
    /**
     * 是否有效 （做逻辑删除处理） 1.有效 0.无效
     */
   @TableField("is_active")
   private Integer isActive;
    /**
     * 退货原因
     */
   private String reason;
    /**
     * 备注
     */
   private String remark;
    /**
     * 修改人
     */
   @TableField("change_by")
   private Long changeBy;
    /**
     * 客户端来源 h5/app
     */
   @TableField("client_source")
   private String clientSource;
    /**
     * 创建时间
     */
   @TableField("create_date")
   private Date createDate;
   @TableField("tom_order")
   private String tomOrder;
    /**
     * 是否能退货0.否 1.是
     */
   @TableField("can_return")
   private Integer canReturn;
    /**
     * 内部订单状态
     */
   @TableField("inside_order_status")
   private Integer insideOrderStatus;


   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getApplicantName() {
      return applicantName;
   }

   public void setApplicantName(String applicantName) {
      this.applicantName = applicantName;
   }

   public Integer getStatus() {
      return status;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Long getCustomerInfoId() {
      return customerInfoId;
   }

   public void setCustomerInfoId(Long customerInfoId) {
      this.customerInfoId = customerInfoId;
   }

   public Date getApplyTime() {
      return applyTime;
   }

   public void setApplyTime(Date applyTime) {
      this.applyTime = applyTime;
   }

   public String getContractNo() {
      return contractNo;
   }

   public void setContractNo(String contractNo) {
      this.contractNo = contractNo;
   }

   public Integer getPeriodNum() {
      return periodNum;
   }

   public void setPeriodNum(Integer periodNum) {
      this.periodNum = periodNum;
   }

   public Long getSellerId() {
      return sellerId;
   }

   public void setSellerId(Long sellerId) {
      this.sellerId = sellerId;
   }

   public Long getMerchantsId() {
      return merchantsId;
   }

   public void setMerchantsId(Long merchantsId) {
      this.merchantsId = merchantsId;
   }

   public Long getStoreId() {
      return storeId;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getProductId() {
      return productId;
   }

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public String getSmType() {
      return smType;
   }

   public void setSmType(String smType) {
      this.smType = smType;
   }

   public String getFundSideCode() {
      return fundSideCode;
   }

   public void setFundSideCode(String fundSideCode) {
      this.fundSideCode = fundSideCode;
   }

   public String getCommodityName() {
      return commodityName;
   }

   public void setCommodityName(String commodityName) {
      this.commodityName = commodityName;
   }

   public BigDecimal getCommodityPrice() {
      return commodityPrice;
   }

   public void setCommodityPrice(BigDecimal commodityPrice) {
      this.commodityPrice = commodityPrice;
   }

   public BigDecimal getLoanAmount() {
      return loanAmount;
   }

   public void setLoanAmount(BigDecimal loanAmount) {
      this.loanAmount = loanAmount;
   }

   public Integer getLoanPeriod() {
      return loanPeriod;
   }

   public void setLoanPeriod(Integer loanPeriod) {
      this.loanPeriod = loanPeriod;
   }

   public Date getLoanDate() {
      return loanDate;
   }

   public void setLoanDate(Date loanDate) {
      this.loanDate = loanDate;
   }

   public Integer getBankType() {
      return bankType;
   }

   public void setBankType(Integer bankType) {
      this.bankType = bankType;
   }

   public Long getCustomerBankCardId() {
      return customerBankCardId;
   }

   public void setCustomerBankCardId(Long customerBankCardId) {
      this.customerBankCardId = customerBankCardId;
   }

   public BigDecimal getMonthAmount() {
      return monthAmount;
   }

   public void setMonthAmount(BigDecimal monthAmount) {
      this.monthAmount = monthAmount;
   }

   public BigDecimal getFirstPayAmount() {
      return firstPayAmount;
   }

   public void setFirstPayAmount(BigDecimal firstPayAmount) {
      this.firstPayAmount = firstPayAmount;
   }

   public Date getSuccessPayTime() {
      return successPayTime;
   }

   public void setSuccessPayTime(Date successPayTime) {
      this.successPayTime = successPayTime;
   }

   public String getOrgOrderNo() {
      return orgOrderNo;
   }

   public void setOrgOrderNo(String orgOrderNo) {
      this.orgOrderNo = orgOrderNo;
   }

   public Date getCommitOrderDate() {
      return commitOrderDate;
   }

   public void setCommitOrderDate(Date commitOrderDate) {
      this.commitOrderDate = commitOrderDate;
   }

   public BigDecimal getMerchantSettlementAmount() {
      return merchantSettlementAmount;
   }

   public void setMerchantSettlementAmount(BigDecimal merchantSettlementAmount) {
      this.merchantSettlementAmount = merchantSettlementAmount;
   }

   public String getCommitIp() {
      return commitIp;
   }

   public void setCommitIp(String commitIp) {
      this.commitIp = commitIp;
   }

   public String getConsultantPhone() {
      return consultantPhone;
   }

   public void setConsultantPhone(String consultantPhone) {
      this.consultantPhone = consultantPhone;
   }

   public String getConsultantName() {
      return consultantName;
   }

   public void setConsultantName(String consultantName) {
      this.consultantName = consultantName;
   }

   public Integer getConsultantGroupPhoto() {
      return consultantGroupPhoto;
   }

   public void setConsultantGroupPhoto(Integer consultantGroupPhoto) {
      this.consultantGroupPhoto = consultantGroupPhoto;
   }

   public Integer getConsumerPhoto() {
      return consumerPhoto;
   }

   public void setConsumerPhoto(Integer consumerPhoto) {
      this.consumerPhoto = consumerPhoto;
   }

   public Long getTicketId() {
      return ticketId;
   }

   public void setTicketId(Long ticketId) {
      this.ticketId = ticketId;
   }

   public Integer getIsHumanFace() {
      return isHumanFace;
   }

   public void setIsHumanFace(Integer isHumanFace) {
      this.isHumanFace = isHumanFace;
   }

   public String getLat() {
      return lat;
   }

   public void setLat(String lat) {
      this.lat = lat;
   }

   public String getLng() {
      return lng;
   }

   public void setLng(String lng) {
      this.lng = lng;
   }

   public Date getChangeDate() {
      return changeDate;
   }

   public void setChangeDate(Date changeDate) {
      this.changeDate = changeDate;
   }

   public Integer getIsActive() {
      return isActive;
   }

   public void setIsActive(Integer isActive) {
      this.isActive = isActive;
   }

   public String getReason() {
      return reason;
   }

   public void setReason(String reason) {
      this.reason = reason;
   }

   public String getRemark() {
      return remark;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public Long getChangeBy() {
      return changeBy;
   }

   public void setChangeBy(Long changeBy) {
      this.changeBy = changeBy;
   }

   public String getClientSource() {
      return clientSource;
   }

   public void setClientSource(String clientSource) {
      this.clientSource = clientSource;
   }

   public Date getCreateDate() {
      return createDate;
   }

   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   public String getTomOrder() {
      return tomOrder;
   }

   public void setTomOrder(String tomOrder) {
      this.tomOrder = tomOrder;
   }

   public Integer getCanReturn() {
      return canReturn;
   }

   public void setCanReturn(Integer canReturn) {
      this.canReturn = canReturn;
   }

   public Integer getInsideOrderStatus() {
      return insideOrderStatus;
   }

   public void setInsideOrderStatus(Integer insideOrderStatus) {
      this.insideOrderStatus = insideOrderStatus;
   }

   public static final String ID_ = "id_";

   public static final String APPLICANT_NAME = "applicant_name";

   public static final String STATUS = "status";

   public static final String CUSTOMER_INFO_ID = "customer_info_id";

   public static final String APPLY_TIME = "apply_time";

   public static final String CONTRACT_NO = "contract_no";

   public static final String PERIOD_NUM = "period_num";

   public static final String SELLER_ID = "seller_id";

   public static final String MERCHANTS_ID = "merchants_id";

   public static final String STORE_ID = "store_id";

   public static final String PRODUCT_ID = "product_id";

   public static final String SM_TYPE = "sm_type";

   public static final String FUND_SIDE_CODE = "fund_side_code";

   public static final String COMMODITY_NAME = "commodity_name";

   public static final String COMMODITY_PRICE = "commodity_price";

   public static final String LOAN_AMOUNT = "loan_amount";

   public static final String LOAN_PERIOD = "loan_period";

   public static final String LOAN_DATE = "loan_date";

   public static final String BANK_TYPE = "bank_type";

   public static final String CUSTOMER_BANK_CARD_ID = "customer_bank_card_id";

   public static final String MONTH_AMOUNT = "month_amount";

   public static final String FIRST_PAY_AMOUNT = "first_pay_amount";

   public static final String SUCCESS_PAY_TIME = "success_pay_time";

   public static final String ORG_ORDER_NO = "org_order_no";

   public static final String COMMIT_ORDER_DATE = "commit_order_date";

   public static final String MERCHANT_SETTLEMENT_AMOUNT = "merchant_settlement_amount";

   public static final String COMMIT_IP = "commit_ip";

   public static final String CONSULTANT_PHONE = "consultant_phone";

   public static final String CONSULTANT_NAME = "consultant_name";

   public static final String CONSULTANT_GROUP_PHOTO = "consultant_group_photo";

   public static final String CONSUMER_PHOTO = "consumer_photo";

   public static final String TICKET_ID = "ticket_id";

   public static final String IS_HUMAN_FACE = "is_human_face";

   public static final String LAT = "lat";

   public static final String LNG = "lng";

   public static final String CHANGE_DATE = "change_date";

   public static final String IS_ACTIVE = "is_active";

   public static final String REASON = "reason";

   public static final String REMARK = "remark";

   public static final String CHANGE_BY = "change_by";

   public static final String CLIENT_SOURCE = "client_source";

   public static final String CREATE_DATE = "create_date";

   public static final String TOM_ORDER = "tom_order";

   public static final String CAN_RETURN = "can_return";

   public static final String INSIDE_ORDER_STATUS = "inside_order_status";

   @Override
   protected Serializable pkVal() {
      return this.id;
   }

   @Override
   public String toString() {
      return "TomOrder{" +
         ", id=" + id +
         ", applicantName=" + applicantName +
         ", status=" + status +
         ", customerInfoId=" + customerInfoId +
         ", applyTime=" + applyTime +
         ", contractNo=" + contractNo +
         ", periodNum=" + periodNum +
         ", sellerId=" + sellerId +
         ", merchantsId=" + merchantsId +
         ", storeId=" + storeId +
         ", productId=" + productId +
         ", smType=" + smType +
         ", fundSideCode=" + fundSideCode +
         ", commodityName=" + commodityName +
         ", commodityPrice=" + commodityPrice +
         ", loanAmount=" + loanAmount +
         ", loanPeriod=" + loanPeriod +
         ", loanDate=" + loanDate +
         ", bankType=" + bankType +
         ", customerBankCardId=" + customerBankCardId +
         ", monthAmount=" + monthAmount +
         ", firstPayAmount=" + firstPayAmount +
         ", successPayTime=" + successPayTime +
         ", orgOrderNo=" + orgOrderNo +
         ", commitOrderDate=" + commitOrderDate +
         ", merchantSettlementAmount=" + merchantSettlementAmount +
         ", commitIp=" + commitIp +
         ", consultantPhone=" + consultantPhone +
         ", consultantName=" + consultantName +
         ", consultantGroupPhoto=" + consultantGroupPhoto +
         ", consumerPhoto=" + consumerPhoto +
         ", ticketId=" + ticketId +
         ", isHumanFace=" + isHumanFace +
         ", lat=" + lat +
         ", lng=" + lng +
         ", changeDate=" + changeDate +
         ", isActive=" + isActive +
         ", reason=" + reason +
         ", remark=" + remark +
         ", changeBy=" + changeBy +
         ", clientSource=" + clientSource +
         ", createDate=" + createDate +
         ", tomOrder=" + tomOrder +
         ", canReturn=" + canReturn +
         ", insideOrderStatus=" + insideOrderStatus +
         "}";
   }
}
