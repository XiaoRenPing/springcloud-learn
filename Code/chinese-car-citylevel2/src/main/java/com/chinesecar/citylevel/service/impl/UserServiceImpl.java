package com.chinesecar.citylevel.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinesecar.citylevel.dao.UserDao;
import com.chinesecar.citylevel.entity.User;
import com.chinesecar.citylevel.service.IUserService;

 
@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserDao userDao;
 
	public User getNameById(User user) {
		return userDao.getNameById(user);
	}

	@Override
	public List<User> listAll() {
		return userDao.listAll();
	}
	
	
 

}
