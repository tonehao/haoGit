package com.baomidou.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.entity.User;
import com.baomidou.mapper.UserMapper;
import com.baomidou.service.IUserService;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}

	@Override
	public List<User> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

}