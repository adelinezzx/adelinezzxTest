package com.neo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neo.entity.UserEntity;
import com.neo.mapper.UserMapper;

@Controller
public class UserController {
	
	@Value("${stuName}")
	private String stuName ; 
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/getUsers")
	@ResponseBody
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userMapper.getAll();
		return users;
	}
	
    @RequestMapping("/tojsp")
    @ResponseBody
    public String  tojsp(int id) {
    	int j = 1/id ;
        return "hello" + j;
    }
    
    @RequestMapping("/getName")
    @ResponseBody
    public String  hello( ) {
        return  stuName;
    }
    
}