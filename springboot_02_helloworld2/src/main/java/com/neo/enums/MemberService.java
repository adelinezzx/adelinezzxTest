package com.neo.enums;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberService {

	// @Async // 相当于重新开辟了新线程来执行 aop技术：在运行时单独开启一个线程来执行该方法
	public String memser() {

		/*
		 * log.info("2");
		 * 
		 * try { Thread.sleep(5000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } log.info("3"); return "adeline";
		 */

		// 加@Async注解的作用相当于
		new Thread(new Runnable() {

			public void run() {
				log.info("2");

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				log.info("3");

			}
		}).start();

		return "adeline";

	}
}
