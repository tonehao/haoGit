package com.baomidou.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.entity.TsmStaff;
import com.baomidou.mapper.TsmStaffMapper;
import com.baomidou.service.TsmStaffService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
/**
 * <p>
 * tsm_staff (人员表); InnoDB free: 7168 kB 服务实现类
 * </p>
 *
 *@author Admin
 * @since 2021-11-29
 */
@Service
@Transactional
public class TsmStaffServiceImpl extends ServiceImpl<TsmStaffMapper, TsmStaff> implements TsmStaffService {


    @Autowired
    private TsmStaffMapper tsmStaffMapper;

    @Override
    public Page<TsmStaff> selectPage( Pagination page,TsmStaff tsmStaff) {
        EntityWrapper<TsmStaff> entityWrapper = new EntityWrapper<TsmStaff>();
        //getEntityWrapper(entityWrapper,tsmStaff);
        //return (Page<TsmStaff>)super.selectPage(page,entityWrapper);
        return super.selectPage((Page<TsmStaff>) page,entityWrapper);
    }

    @Override
    public List<TsmStaff> selectList(TsmStaff tsmStaff) {
        EntityWrapper<TsmStaff> entityWrapper = new EntityWrapper<TsmStaff>();
       // getEntityWrapper(entityWrapper,tsmStaff);
        return super.selectList(entityWrapper);
    }

    /**
     *  公共查询条件
     * @param entityWrapper
     * @return
     
    public EntityWrapper<TsmStaff> getEntityWrapper(EntityWrapper<TsmStaff> entityWrapper,TsmStaff tsmStaff){
        //条件拼接
        if (StringUtils.isEmpty(tsmStaff.getAccount())){
            entityWrapper.like(TsmStaff.ACCOUNT,tsmStaff.getAccount());
        }
        if (StringUtils.isEmpty(tsmStaff.getPassword())){
            entityWrapper.like(TsmStaff.PASSWORD,tsmStaff.getPassword());
        }
        if (StringUtils.isEmpty(tsmStaff.getUserName())){
            entityWrapper.like(TsmStaff.USER_NAME,tsmStaff.getUserName());
        }
        if (StringUtils.isEmpty(tsmStaff.getSex())){
            entityWrapper.like(TsmStaff.SEX,tsmStaff.getSex());
        }
        if (StringUtils.isEmpty(tsmStaff.getIdCard())){
            entityWrapper.like(TsmStaff.ID_CARD,tsmStaff.getIdCard());
        }
        if (StringUtils.isEmpty(tsmStaff.getRoleId())){
            entityWrapper.like(TsmStaff.ROLE_ID,tsmStaff.getRoleId());
        }
        if (StringUtils.isEmpty(tsmStaff.getPhone())){
            entityWrapper.like(TsmStaff.PHONE,tsmStaff.getPhone());
        }
        if (StringUtils.isEmpty(tsmStaff.getStatus())){
            entityWrapper.like(TsmStaff.STATUS,tsmStaff.getStatus());
        }
        if (StringUtils.isEmpty(tsmStaff.getProvince())){
            entityWrapper.like(TsmStaff.PROVINCE,tsmStaff.getProvince());
        }
        if (StringUtils.isEmpty(tsmStaff.getCity())){
            entityWrapper.like(TsmStaff.CITY,tsmStaff.getCity());
        }
        if (StringUtils.isEmpty(tsmStaff.getEntryDate())){
            entityWrapper.like(TsmStaff.ENTRY_DATE,tsmStaff.getEntryDate());
        }
        if (StringUtils.isEmpty(tsmStaff.getLeaveDate())){
            entityWrapper.like(TsmStaff.LEAVE_DATE,tsmStaff.getLeaveDate());
        }
        if (StringUtils.isEmpty(tsmStaff.getEmail())){
            entityWrapper.like(TsmStaff.EMAIL,tsmStaff.getEmail());
        }
        if (StringUtils.isEmpty(tsmStaff.getLeaderId())){
            entityWrapper.like(TsmStaff.LEADER_ID,tsmStaff.getLeaderId());
        }
        if (StringUtils.isEmpty(tsmStaff.getIsAdmin())){
            entityWrapper.like(TsmStaff.IS_ADMIN,tsmStaff.getIsAdmin());
        }
        if (StringUtils.isEmpty(tsmStaff.getChangeDate())){
            entityWrapper.like(TsmStaff.CHANGE_DATE,tsmStaff.getChangeDate());
        }
        if (StringUtils.isEmpty(tsmStaff.getChangeBy())){
            entityWrapper.like(TsmStaff.CHANGE_BY,tsmStaff.getChangeBy());
        }
        if (StringUtils.isEmpty(tsmStaff.getCreateDate())){
            entityWrapper.like(TsmStaff.CREATE_DATE,tsmStaff.getCreateDate());
        }
        if (StringUtils.isEmpty(tsmStaff.getCreateBy())){
            entityWrapper.like(TsmStaff.CREATE_BY,tsmStaff.getCreateBy());
        }
        if (StringUtils.isEmpty(tsmStaff.getIsActive())){
            entityWrapper.like(TsmStaff.IS_ACTIVE,tsmStaff.getIsActive());
        }
        if (StringUtils.isEmpty(tsmStaff.getCategory())){
            entityWrapper.like(TsmStaff.CATEGORY,tsmStaff.getCategory());
        }
        if (StringUtils.isEmpty(tsmStaff.getIsSettingRole())){
            entityWrapper.like(TsmStaff.IS_SETTING_ROLE,tsmStaff.getIsSettingRole());
        }
        return entityWrapper;
    }
     */
}
