package com.chinesecar.citylevel.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.chinesecar.citylevel.entity.User;
import com.chinesecar.citylevel.service.IUserService;

@RestController
public class UserController {
	
	@Resource
	private IUserService userService;
	
	
	 @RequestMapping("/hello")  
     public String index() {  
          return"Hello World";  
     } 
	 
	 
	 @RequestMapping("/get")  
	 @ResponseBody
     public String get(User user) {  
		 User u = userService.getNameById(user);
         return JSONObject.toJSONString(u);     
     }

	 @RequestMapping("/list")  
	 @ResponseBody
     public String list() {  
		 List<User> userList = userService.listAll();
         return JSONObject.toJSONString(userList);     
     }
}
