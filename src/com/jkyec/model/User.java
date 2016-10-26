/*******************************************************************************
 * Copyright (c) 2013, 2016 JK Young Entrepreneur Club. All rights reserved.
 * We will help people who want to help themselves.
 *******************************************************************************/
package com.jkyec.model;

import java.io.Serializable;

/**
 * User.java
 * TODO: comment here
 * @author <a href="vvip2u@126.com">JK</a>
 * @since 2016年10月26日
 */
public class User implements Serializable{

	private static final long serialVersionUID = 7274666247011151069L;

	private Integer userId;
	
	private String userName;

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
