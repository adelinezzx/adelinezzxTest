package com.yc.dao;

import java.util.List;

import com.yc.bean.Users;

public interface UserDao {
	
	List<Users> getAll();

	public Users  getOne(Integer id) ;
}
