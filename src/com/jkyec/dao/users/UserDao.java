/*******************************************************************************
 * Copyright (c) 2013, 2016 JK Young Entrepreneur Club. All rights reserved.
 * We will help people who want to help themselves.
 *******************************************************************************/
package com.jkyec.dao.users;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jkyec.model.User;

/**
 * UserDao.java
 * TODO: comment here
 * @author <a href="vvip2u@126.com">JK</a>
 * @since 2016年10月26日
 */
@Repository(value="userDao")
public class UserDao {
	
	public void addUser(User user) {
		System.out.println("UserDao.addUser()");
		System.out.println(user.getUserId());
	}
	
}
