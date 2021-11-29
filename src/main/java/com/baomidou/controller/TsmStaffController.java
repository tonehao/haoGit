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
import com.baomidou.service.TsmStaffService;
import com.baomidou.entity.TsmStaff;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;


/**
 *
 *@author Admin
 * @since 2021-11-29
 */
@Controller
@RequestMapping("/tsmStaff")
public class TsmStaffController {
    private final Logger logger = LoggerFactory.getLogger(TsmStaffController.class);

    @Autowired
    public TsmStaffService TsmStaffService;

    /**
     * 跳转列表页面
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(method= RequestMethod.GET,value = {"/tsmStaffIndex"})
    public String index(HttpServletRequest request, Model model) {
        return "tsmStaffListIndex";
    }

    /**
     * 分页查询数据
     *
     * @param bootStrapTable  分页信息
     * @param tsmStaff   查询条件
     * @return
     */
    @ResponseBody
    @GetMapping("/getTsmStaffPageList")
    public  Page<TsmStaff> getTsmStaffList(TsmStaff tsmStaff) {
        //Map<String,Object> result = new HashMap<String,Object>();
        Page<TsmStaff> result=null;
        try {
            result = TsmStaffService.selectPage(new Page() ,tsmStaff);
        } catch (Exception e) {
            logger.error("getTsmStaffList -=- {}",e.toString());
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
    
    @RequestMapping(method=RequestMethod.GET,value="/tsmStaffAdd")
    public String tsmStaffAdd(HttpServletRequest request,HttpServletResponse response,Model model) {
        try {


        }catch (Exception ex){
            logger.error("tsmStaffAdd -=- {}",ex.toString());
        }
        return "tsmStaffAdd";
    } */

    /**
     * 跳转修改页面
     * @param request
     * @param id  实体ID
     * @return
     */
    @RequestMapping(method=RequestMethod.GET,value="/tsmStaffUpdate")
    public String tsmStaffUpdate(HttpServletRequest request,Long id) {
        try {
            TsmStaff tsmStaff = TsmStaffService.selectById(id);
            request.setAttribute("tsmStaff",tsmStaff);
        }catch (Exception ex){
            logger.error("tsmStaffUpdate -=- {}",ex.toString());
        }
        return "tsmStaffUpd";
    }

    /**
     * 保存和修改公用的
     * @param tsmStaff  传递的实体
     * @return  0 失败  1 成功
     */
    @ResponseBody
    @RequestMapping(method=RequestMethod.POST,value="/tsmStaffSave")
    public int tsmStaffSave(TsmStaff tsmStaff) {
        int count = 0;
        try {
            count = TsmStaffService.insertOrUpdate(tsmStaff) ? 1 : 0;
        } catch (Exception e) {
            logger.error("tsmStaffSave -=- {}",e.toString());
        }
        return count;
    }

    /**
     * 根据id删除对象
     * @param id  实体ID
     * @return 0 失败  1 成功
     */
    @ResponseBody
    @RequestMapping(method= RequestMethod.POST,value="/tsmStaffDelete")
    public int tsmStaffDelete(Long id){
        int count = 0;
        try {
            count = TsmStaffService.deleteById(id) ? 1 : 0;
        }catch (Exception e){
            logger.error("tsmStaffDelete -=- {}",e.toString());
        }
        return count;
    }

    /**
     * 批量删除对象
     * @param item 实体集合ID
     * @return  0 失败  1 成功
     */
    @ResponseBody
    @RequestMapping(method= RequestMethod.POST,value="/tsmStaffBatchDelete")
    public int deleteBatchIds(String item){
        int count = 0;
        try {
            List<Long> ids = (List<Long>) JSON.parse(item);
            count = TsmStaffService.deleteBatchIds(ids) ? 1 : 0;
        }catch (Exception e){
            logger.error("tsmStaffBatchDelete -=- {}",e.toString());
        }
        return count;
    }


}
