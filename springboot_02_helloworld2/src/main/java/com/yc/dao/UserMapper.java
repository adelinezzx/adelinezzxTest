package com.yc.dao;

import java.util.List;

import com.yc.bean.Users;

public interface UserMapper {
	List<Users> getAll();

	public Users getOne(Integer id);
}
