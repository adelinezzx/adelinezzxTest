package com.yc.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.bean.Users;
import com.yc.dao.mapper.User1Mapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(basePackages="com.yc")
public class testUsers {
	

	@Resource(name="user1MapperImpl")
	 private User1Mapper  usermapper;
	
	
	@Test
	public  void addHouseInfo(){
		List<Users> users=usermapper.getAll();
		System.out.println(users);
	}
	

}
