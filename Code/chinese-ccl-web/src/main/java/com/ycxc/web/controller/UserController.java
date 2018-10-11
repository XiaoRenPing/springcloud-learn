package com.ycxc.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ycxc.web.model.User;
import com.ycxc.web.service.UserService;
import com.ycxc.web.service.UserServiceByFeign;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@Resource
	UserServiceByFeign userSeriveFeign;

	@RequestMapping(value = "/getAllUsers")
	@ResponseBody
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<List<User>>(userService.readUserInfo(), HttpStatus.OK);
	}

	@RequestMapping(value = "/getUsersFeign")
	@ResponseBody
	public ResponseEntity<List<User>> getUsersFeign() {
		List<User> userSeriveFeignList = userSeriveFeign.getAllUsers();
		return new ResponseEntity<List<User>>(userSeriveFeignList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/testPost", method=RequestMethod.POST) 
    public String postUser(@ModelAttribute User user) { 
        System.out.println("=====testPost:"); 
        return "success"; 
    } 
	/*@RequestMapping(value="/testPost/{id}", method=RequestMethod.PUT) 
    public String putUser(@PathVariable Long id, @ModelAttribute User user) { 
        // 处理"/users/{id}"的PUT请求，用来更新User信息 
		System.out.println("=带参数====testPost:"); 
        return "success"; 
    } */
	
}