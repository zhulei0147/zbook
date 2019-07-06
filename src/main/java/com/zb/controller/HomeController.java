package com.zb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * RestController和Controller注解的区别是：RestController是返回的内容就是返回的内容，
 * <p>
 * 相当于加个@ResponseBody,而controller一般是返回的页面
 * 
 * @author 朱雷
 * @date 2019年7月6日
 */
@RestController
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Hello, Zbook!";
	}
}