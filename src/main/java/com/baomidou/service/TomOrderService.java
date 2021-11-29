package com.baomidou.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.entity.TomOrder;
import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import java.util.List;

/**
 * <p>
 * tom_order (订单表); InnoDB free: 7168 kB 服务类
 * </p>
 *
 *@author Admin
 * @since 2021-11-29
 */
public interface TomOrderService extends IService<TomOrder> {

    /**
     *  分页查询
     * @param bootStrapTable
     * @param tomOrder
     * @return
     */
    Page<TomOrder> selectPage(Pagination page,TomOrder tomOrder);




    List<TomOrder> selectList(TomOrder tomOrder);
}
