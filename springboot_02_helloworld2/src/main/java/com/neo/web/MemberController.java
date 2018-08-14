package com.neo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neo.enums.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemberController {
	
	@Autowired
	private MemberService member ;
	
	@RequestMapping("/member")
	@ResponseBody
	public String member(){
		log.info("1");
		String result = member.memser();
		log.info("4");
		return result;
		
	}

}
