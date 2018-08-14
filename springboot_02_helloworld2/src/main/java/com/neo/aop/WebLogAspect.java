package com.neo.aop;

 
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class WebLogAspect {
	
	private static final  Logger  logger = LoggerFactory.getLogger(WebLogAspect.class);
	
	@Pointcut("execution(public * com.neo.web.*.*(..) )")  //日志拦截的位置  切入点
	public void  webLog(){
		
	}
	
	@Before("webLog()")//前置增强
	public void doBefore(JoinPoint fointPoint){
		//收到请求，请求记录内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		
		HttpServletRequest  request = attributes.getRequest();
		//请求记录一下内容
		logger.info("URL:" +request.getRequestURL().toString());
		logger.info("HTTP_METHOD:" + request.getMethod());
		logger.info("IP:" + request.getRemoteAddr());
		Enumeration<String> emunm =  request.getParameterNames();
		while(emunm.hasMoreElements()){
			String name = emunm.nextElement();
			logger.info("name:{},value:{}",name,request.getParameter(name));
		}
	}

	@AfterReturning(returning="ret",pointcut="webLog()")//后置增强
	public  void  doAfterReturning(Object  ret){
		//处理完成请求返回的内容
		logger.info("RESPONSE:" + ret);
	}
}
