package com.yc.biz;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.bean.Users;

@Repository
public interface UsersBiz {
	List<Users> getAll();

	public Users getOne(Integer id);
}
