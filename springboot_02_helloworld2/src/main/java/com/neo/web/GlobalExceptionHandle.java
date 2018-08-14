package com.neo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages="com.neo.web") //异常切入点
public class GlobalExceptionHandle {
	
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)//捕获的类型为运行时异常
	public Map<String, Object>  getException(){
		Map<String, Object>  map = new HashMap<String,Object>();
		map.put("error","500");
		map.put("errorMsg", "全局捕获运行时异常");
		return map;
		
	}

}
