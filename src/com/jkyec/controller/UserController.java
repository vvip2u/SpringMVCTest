/*******************************************************************************
 * Copyright (c) 2013, 2016 JK Young Entrepreneur Club. All rights reserved.
 * We will help people who want to help themselves.
 *******************************************************************************/
package com.jkyec.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jkyec.dao.users.UserDao;
import com.jkyec.model.User;

/**
 * 
 * UserController.java
 * TODO: comment here
 * @author <a href="vvip2u@126.com">JK</a>
 * @since 2016年10月26日
 */
@Controller 
@RequestMapping("/users")
public class UserController {
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String view() {
		System.out.println("UserController.view()");
//		User user = new User();
//		user.setUserId(100);
//		user.setUserName("new User");
//		userDao.addUser(user);
		return "users.jsp";
	}
	
}
