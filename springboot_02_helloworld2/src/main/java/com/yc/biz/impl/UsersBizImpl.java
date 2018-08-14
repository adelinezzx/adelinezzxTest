package com.yc.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.Users;
import com.yc.biz.UsersBiz;
import com.yc.dao.UserDao;

@Service
public class UsersBizImpl  implements UsersBiz{
	
	@Resource(name="userService")
	private  UserDao  usersDao ;

	@Override
	public List<Users> getAll() {
		 
		return usersDao.getAll();
	}

	@Override
	public Users getOne(Integer id) {
		 
		return usersDao.getOne(id);
	}

}
