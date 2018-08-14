package com.neo.entity;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
public class Student {

	 
	private String stuName;

	private Integer age;

	 
	
	 public static void main(String[] args) {
		Student  stu = new Student() ;
		 
		stu.setAge(20);
		System.out.println(stu);
	}
}
