package com.yc.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.neo.entity.Student;
import com.yc.bean.Users;
import com.yc.biz.UsersBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = testUsers.class)
public class testUsers {

	@Resource(name = "usersBizImpl")
	private UsersBiz usersBiz;

	@Test
	public void addHouseInfo() {
		Users user = new Users();
		user.setId(1);
		Users u = usersBiz.getOne(user.getId());
		System.out.println(u);
		
	}
	

}
