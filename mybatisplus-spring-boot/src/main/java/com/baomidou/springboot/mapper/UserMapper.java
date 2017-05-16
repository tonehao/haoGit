package com.baomidou.springboot.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.springboot.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from user")
    public List<User> selectListBySQL();

}