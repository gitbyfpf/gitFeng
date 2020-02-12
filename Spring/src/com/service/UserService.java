package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.UserDao;

@Component("userService")
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void execute(){
		userDao.add();
		System.out.println("执行数据调用=============");
	}
}
