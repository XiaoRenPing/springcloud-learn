package com.chinesecar.citylevel.service;

import java.util.List;

import com.chinesecar.citylevel.entity.User;

public interface IUserService {

	public User getNameById(User user);

	public List<User> listAll();
}
