package com.yc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.bean.Users;
import com.yc.dao.UserDao;
import com.yc.dao.UserMapper;

@Service
public class UserService  implements  UserDao{
	
	@Autowired
	private SqlSession  sqlSession;

	@Override
	public List<Users> getAll() {
		return  sqlSession.selectList("com.yc.dao.mapper.UsersMapper.getAll");
	}

	@Override
	public Users getOne(Integer id) {
		 
		return sqlSession.selectOne("com.yc.dao.mapper.UsersMapper.getOne", id);
	}
	
	

}
