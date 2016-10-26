/*******************************************************************************
 * Copyright (c) 2013, 2016 JK Young Entrepreneur Club. All rights reserved.
 * We will help people who want to help themselves.
 *******************************************************************************/
package com.jkyec.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jkyec.dao.users.UserDao;
import com.jkyec.model.User;

/**
 * 
 * UserService.java
 * TODO: comment here
 * @author <a href="vvip2u@126.com">JK</a>
 * @since 2016年10月27日
 */
@Service(value="userService")
public class UserService {
	
	@Resource(name="userDao")
	private UserDao userDao;

	public void addUser(User user) {
		System.out.println("UserService.addUser()");
		userDao.addUser(user);
	}
	
}
