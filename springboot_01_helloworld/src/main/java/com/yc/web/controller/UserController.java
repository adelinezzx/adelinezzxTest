package com.yc.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.Users;
import com.yc.dao.mapper.User1Mapper;

@RestController
public class UserController {
	
	
	@Resource(name="user1MapperImpl")
	 private User1Mapper  usermapper;
	
	
	@RequestMapping("/getUsers")
	public List<Users> getUsers() {
		List<Users> users=usermapper.getAll();
		return users;
	}

}
