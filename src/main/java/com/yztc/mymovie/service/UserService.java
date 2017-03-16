package com.yztc.mymovie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yztc.mymovie.dao.UserDao;
import com.yztc.mymovie.entity.Users;

@Service("userService")
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void save(Users users){
		userDao.save(users);
	}
	
	public Users findByNameAndPassword(Users users){
		return userDao.findByNameAndPassword(users);
	}
	
	public void change(Users users){
		userDao.change(users);
	}
}
