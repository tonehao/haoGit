package com.baomidou.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.entity.TomOrder;
import com.baomidou.mapper.TomOrderMapper;
import com.baomidou.service.TomOrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
/**
 * <p>
 * tom_order (订单表); InnoDB free: 7168 kB 服务实现类
 * </p>
 *
 *@author Admin
 * @since 2021-11-29
 */
@Service
@Transactional
public class TomOrderServiceImpl extends ServiceImpl<TomOrderMapper, TomOrder> implements TomOrderService {


    @Autowired
    private TomOrderMapper tomOrderMapper;

    @Override
    public Page<TomOrder> selectPage( Pagination page,TomOrder tomOrder) {
        EntityWrapper<TomOrder> entityWrapper = new EntityWrapper<TomOrder>();
        //getEntityWrapper(entityWrapper,tomOrder);
        //return (Page<TomOrder>)super.selectPage(page,entityWrapper);
        return super.selectPage((Page<TomOrder>) page,entityWrapper);
    }

    @Override
    public List<TomOrder> selectList(TomOrder tomOrder) {
        EntityWrapper<TomOrder> entityWrapper = new EntityWrapper<TomOrder>();
       // getEntityWrapper(entityWrapper,tomOrder);
        return super.selectList(entityWrapper);
    }

    /**
     *  公共查询条件
     * @param entityWrapper
     * @return
     
    public EntityWrapper<TomOrder> getEntityWrapper(EntityWrapper<TomOrder> entityWrapper,TomOrder tomOrder){
        //条件拼接
        if (StringUtils.isEmpty(tomOrder.getApplicantName())){
            entityWrapper.like(TomOrder.APPLICANT_NAME,tomOrder.getApplicantName());
        }
        if (StringUtils.isEmpty(tomOrder.getStatus())){
            entityWrapper.like(TomOrder.STATUS,tomOrder.getStatus());
        }
        if (StringUtils.isEmpty(tomOrder.getCustomerInfoId())){
            entityWrapper.like(TomOrder.CUSTOMER_INFO_ID,tomOrder.getCustomerInfoId());
        }
        if (StringUtils.isEmpty(tomOrder.getApplyTime())){
            entityWrapper.like(TomOrder.APPLY_TIME,tomOrder.getApplyTime());
        }
        if (StringUtils.isEmpty(tomOrder.getContractNo())){
            entityWrapper.like(TomOrder.CONTRACT_NO,tomOrder.getContractNo());
        }
        if (StringUtils.isEmpty(tomOrder.getPeriodNum())){
            entityWrapper.like(TomOrder.PERIOD_NUM,tomOrder.getPeriodNum());
        }
        if (StringUtils.isEmpty(tomOrder.getSellerId())){
            entityWrapper.like(TomOrder.SELLER_ID,tomOrder.getSellerId());
        }
        if (StringUtils.isEmpty(tomOrder.getMerchantsId())){
            entityWrapper.like(TomOrder.MERCHANTS_ID,tomOrder.getMerchantsId());
        }
        if (StringUtils.isEmpty(tomOrder.getStoreId())){
            entityWrapper.like(TomOrder.STORE_ID,tomOrder.getStoreId());
        }
        if (StringUtils.isEmpty(tomOrder.getProductId())){
            entityWrapper.like(TomOrder.PRODUCT_ID,tomOrder.getProductId());
        }
        if (StringUtils.isEmpty(tomOrder.getSmType())){
            entityWrapper.like(TomOrder.SM_TYPE,tomOrder.getSmType());
        }
        if (StringUtils.isEmpty(tomOrder.getFundSideCode())){
            entityWrapper.like(TomOrder.FUND_SIDE_CODE,tomOrder.getFundSideCode());
        }
        if (StringUtils.isEmpty(tomOrder.getCommodityName())){
            entityWrapper.like(TomOrder.COMMODITY_NAME,tomOrder.getCommodityName());
        }
        if (StringUtils.isEmpty(tomOrder.getCommodityPrice())){
            entityWrapper.like(TomOrder.COMMODITY_PRICE,tomOrder.getCommodityPrice());
        }
        if (StringUtils.isEmpty(tomOrder.getLoanAmount())){
            entityWrapper.like(TomOrder.LOAN_AMOUNT,tomOrder.getLoanAmount());
        }
        if (StringUtils.isEmpty(tomOrder.getLoanPeriod())){
            entityWrapper.like(TomOrder.LOAN_PERIOD,tomOrder.getLoanPeriod());
        }
        if (StringUtils.isEmpty(tomOrder.getLoanDate())){
            entityWrapper.like(TomOrder.LOAN_DATE,tomOrder.getLoanDate());
        }
        if (StringUtils.isEmpty(tomOrder.getBankType())){
            entityWrapper.like(TomOrder.BANK_TYPE,tomOrder.getBankType());
        }
        if (StringUtils.isEmpty(tomOrder.getCustomerBankCardId())){
            entityWrapper.like(TomOrder.CUSTOMER_BANK_CARD_ID,tomOrder.getCustomerBankCardId());
        }
        if (StringUtils.isEmpty(tomOrder.getMonthAmount())){
            entityWrapper.like(TomOrder.MONTH_AMOUNT,tomOrder.getMonthAmount());
        }
        if (StringUtils.isEmpty(tomOrder.getFirstPayAmount())){
            entityWrapper.like(TomOrder.FIRST_PAY_AMOUNT,tomOrder.getFirstPayAmount());
        }
        if (StringUtils.isEmpty(tomOrder.getSuccessPayTime())){
            entityWrapper.like(TomOrder.SUCCESS_PAY_TIME,tomOrder.getSuccessPayTime());
        }
        if (StringUtils.isEmpty(tomOrder.getOrgOrderNo())){
            entityWrapper.like(TomOrder.ORG_ORDER_NO,tomOrder.getOrgOrderNo());
        }
        if (StringUtils.isEmpty(tomOrder.getCommitOrderDate())){
            entityWrapper.like(TomOrder.COMMIT_ORDER_DATE,tomOrder.getCommitOrderDate());
        }
        if (StringUtils.isEmpty(tomOrder.getMerchantSettlementAmount())){
            entityWrapper.like(TomOrder.MERCHANT_SETTLEMENT_AMOUNT,tomOrder.getMerchantSettlementAmount());
        }
        if (StringUtils.isEmpty(tomOrder.getCommitIp())){
            entityWrapper.like(TomOrder.COMMIT_IP,tomOrder.getCommitIp());
        }
        if (StringUtils.isEmpty(tomOrder.getConsultantPhone())){
            entityWrapper.like(TomOrder.CONSULTANT_PHONE,tomOrder.getConsultantPhone());
        }
        if (StringUtils.isEmpty(tomOrder.getConsultantName())){
            entityWrapper.like(TomOrder.CONSULTANT_NAME,tomOrder.getConsultantName());
        }
        if (StringUtils.isEmpty(tomOrder.getConsultantGroupPhoto())){
            entityWrapper.like(TomOrder.CONSULTANT_GROUP_PHOTO,tomOrder.getConsultantGroupPhoto());
        }
        if (StringUtils.isEmpty(tomOrder.getConsumerPhoto())){
            entityWrapper.like(TomOrder.CONSUMER_PHOTO,tomOrder.getConsumerPhoto());
        }
        if (StringUtils.isEmpty(tomOrder.getTicketId())){
            entityWrapper.like(TomOrder.TICKET_ID,tomOrder.getTicketId());
        }
        if (StringUtils.isEmpty(tomOrder.getIsHumanFace())){
            entityWrapper.like(TomOrder.IS_HUMAN_FACE,tomOrder.getIsHumanFace());
        }
        if (StringUtils.isEmpty(tomOrder.getLat())){
            entityWrapper.like(TomOrder.LAT,tomOrder.getLat());
        }
        if (StringUtils.isEmpty(tomOrder.getLng())){
            entityWrapper.like(TomOrder.LNG,tomOrder.getLng());
        }
        if (StringUtils.isEmpty(tomOrder.getChangeDate())){
            entityWrapper.like(TomOrder.CHANGE_DATE,tomOrder.getChangeDate());
        }
        if (StringUtils.isEmpty(tomOrder.getIsActive())){
            entityWrapper.like(TomOrder.IS_ACTIVE,tomOrder.getIsActive());
        }
        if (StringUtils.isEmpty(tomOrder.getReason())){
            entityWrapper.like(TomOrder.REASON,tomOrder.getReason());
        }
        if (StringUtils.isEmpty(tomOrder.getRemark())){
            entityWrapper.like(TomOrder.REMARK,tomOrder.getRemark());
        }
        if (StringUtils.isEmpty(tomOrder.getChangeBy())){
            entityWrapper.like(TomOrder.CHANGE_BY,tomOrder.getChangeBy());
        }
        if (StringUtils.isEmpty(tomOrder.getClientSource())){
            entityWrapper.like(TomOrder.CLIENT_SOURCE,tomOrder.getClientSource());
        }
        if (StringUtils.isEmpty(tomOrder.getCreateDate())){
            entityWrapper.like(TomOrder.CREATE_DATE,tomOrder.getCreateDate());
        }
        if (StringUtils.isEmpty(tomOrder.getTomOrder())){
            entityWrapper.like(TomOrder.TOM_ORDER,tomOrder.getTomOrder());
        }
        if (StringUtils.isEmpty(tomOrder.getCanReturn())){
            entityWrapper.like(TomOrder.CAN_RETURN,tomOrder.getCanReturn());
        }
        if (StringUtils.isEmpty(tomOrder.getInsideOrderStatus())){
            entityWrapper.like(TomOrder.INSIDE_ORDER_STATUS,tomOrder.getInsideOrderStatus());
        }
        return entityWrapper;
    }
     */
}
