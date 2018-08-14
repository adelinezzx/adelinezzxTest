package com.yc.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.yc.bean.Users;

@Mapper
public interface User1Mapper {

	List<Users> getAll();

	Users getOne(Long id);

	void insert(Users user);

	void update(Users user);

	void delete(Long id);

}
