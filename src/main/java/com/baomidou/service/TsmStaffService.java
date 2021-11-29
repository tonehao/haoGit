package com.baomidou.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.entity.TsmStaff;
import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import java.util.List;

/**
 * <p>
 * tsm_staff (人员表); InnoDB free: 7168 kB 服务类
 * </p>
 *
 *@author Admin
 * @since 2021-11-29
 */
public interface TsmStaffService extends IService<TsmStaff> {

    /**
     *  分页查询
     * @param bootStrapTable
     * @param tsmStaff
     * @return
     */
    Page<TsmStaff> selectPage(Pagination page,TsmStaff tsmStaff);




    List<TsmStaff> selectList(TsmStaff tsmStaff);
}
