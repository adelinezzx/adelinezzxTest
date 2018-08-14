package com.yc.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//将方法的返回值转换为字符串形式显示在页面
@SpringBootApplication
@Configuration
public class Helloworld {
	
	 @RequestMapping("/hello")
	    public static String index() {
	        return "Hello World";
	    }
	 
	 public static void main(String[] args) {
		 SpringApplication.run(Helloworld.class, args);
		index();
	}

}
