package com.yc.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yc.bean.User;

public interface UserMapper {
	
	@Select("select * from users where name = #{name}  ")
    public User  findByName(@Param("name") String name);

	@Insert("insert into users(name,age) values( #{name},#{age})")
	public int insert(@Param("name") String name ,@Param("age") Integer age);
}
