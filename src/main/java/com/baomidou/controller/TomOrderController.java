package com.baomidou.controller;


import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.plugins.Page;
import com.alibaba.fastjson.JSON;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import com.baomidou.service.TomOrderService;
import com.baomidou.entity.TomOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;


/**
 *
 *@author Admin
 * @since 2021-11-29
 */
@Controller
@RequestMapping("/tomOrder")
public class TomOrderController {
    private final Logger logger = LoggerFactory.getLogger(TomOrderController.class);

    @Autowired
    public TomOrderService TomOrderService;

    /**
     * 跳转列表页面
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(method= RequestMethod.GET,value = {"/tomOrderIndex"})
    public String index(HttpServletRequest request, Model model) {
        return "tomOrderListIndex";
    }

    /**
     * 分页查询数据
     *
     * @param bootStrapTable  分页信息
     * @param tomOrder   查询条件
     * @return
     */
    @ResponseBody
    @GetMapping("/getTomOrderPageList")
    public  Page<TomOrder> getTomOrderList(TomOrder tomOrder) {
        //Map<String,Object> result = new HashMap<String,Object>();
        Page<TomOrder> result=null;
        try {
            result = TomOrderService.selectPage(new Page() ,tomOrder);
        } catch (Exception e) {
            logger.error("getTomOrderList -=- {}",e.toString());
           // result.put(Constant.BOOTSTAP_TABLE_ROWS, new ArrayList<>());
           // result.put(Constant.BOOTSTRAP_TABLE_TOTAL, 0);
        }
        return result;
    }

    /**
     * 跳转添加页面
     * @param request
     * @param response
     * @param model
     * @return
    
    @RequestMapping(method=RequestMethod.GET,value="/tomOrderAdd")
    public String tomOrderAdd(HttpServletRequest request,HttpServletResponse response,Model model) {
        try {


        }catch (Exception ex){
            logger.error("tomOrderAdd -=- {}",ex.toString());
        }
        return "tomOrderAdd";
    } */

    /**
     * 跳转修改页面
     * @param request
     * @param id  实体ID
     * @return
     */
    @RequestMapping(method=RequestMethod.GET,value="/tomOrderUpdate")
    public String tomOrderUpdate(HttpServletRequest request,Long id) {
        try {
            TomOrder tomOrder = TomOrderService.selectById(id);
            request.setAttribute("tomOrder",tomOrder);
        }catch (Exception ex){
            logger.error("tomOrderUpdate -=- {}",ex.toString());
        }
        return "tomOrderUpd";
    }

    /**
     * 保存和修改公用的
     * @param tomOrder  传递的实体
     * @return  0 失败  1 成功
     */
    @ResponseBody
    @RequestMapping(method=RequestMethod.POST,value="/tomOrderSave")
    public int tomOrderSave(TomOrder tomOrder) {
        int count = 0;
        try {
            count = TomOrderService.insertOrUpdate(tomOrder) ? 1 : 0;
        } catch (Exception e) {
            logger.error("tomOrderSave -=- {}",e.toString());
        }
        return count;
    }

    /**
     * 根据id删除对象
     * @param id  实体ID
     * @return 0 失败  1 成功
     */
    @ResponseBody
    @RequestMapping(method= RequestMethod.POST,value="/tomOrderDelete")
    public int tomOrderDelete(Long id){
        int count = 0;
        try {
            count = TomOrderService.deleteById(id) ? 1 : 0;
        }catch (Exception e){
            logger.error("tomOrderDelete -=- {}",e.toString());
        }
        return count;
    }

    /**
     * 批量删除对象
     * @param item 实体集合ID
     * @return  0 失败  1 成功
     */
    @ResponseBody
    @RequestMapping(method= RequestMethod.POST,value="/tomOrderBatchDelete")
    public int deleteBatchIds(String item){
        int count = 0;
        try {
            List<Long> ids = (List<Long>) JSON.parse(item);
            count = TomOrderService.deleteBatchIds(ids) ? 1 : 0;
        }catch (Exception e){
            logger.error("tomOrderBatchDelete -=- {}",e.toString());
        }
        return count;
    }


}
