package com.yc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@MapperScan(basePackages="classpath*:com.yc.dao.mapper")*/
public class SpringBootApplication1 {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootApplication1.class, args);
		
}

}
