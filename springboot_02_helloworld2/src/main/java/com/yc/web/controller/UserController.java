package com.yc.web.controller;

import java.util.List;

import javax.annotation.Resource;

 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.Users;
import com.yc.biz.UsersBiz;
import com.yc.biz.impl.UsersBizImpl;
import com.yc.dao.UserMapper;
import com.yc.dao.impl.UserService;

@RestController
public class UserController {
	
	@Resource(name="usersBizImpl")
	private UsersBiz  usersBiz;
	 
	
	@RequestMapping("/getUsers")
	public   Users  getUsers() {
		Users  user = new Users();
		user.setId(1);
         Users   u = 	usersBiz.getOne(user.getId());
		return u;
	}

}
