package com.chinesecar.citylevel.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chinesecar.citylevel.entity.User;


@Repository
public interface UserDao {
	
	public User getNameById(User user);
	
	public List<User> listAll();
 
}
