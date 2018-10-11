package com.ycxc.web.controller;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ycxc.web.model.User;
/**

 * 模板测试.
 
 * @author Administrator
 
 *
 
 */
 
@Controller
 
public class TemplateController {
	
	private final Logger logger = LogManager.getLogger(TemplateController.class);
    /**
 
     * 返回html模板.
 
     */
    @RequestMapping("/login")
    public String helloHtml(Map<String,Object> map){
       map.put("hello","from TemplateController.helloHtml");
       return"/login";

	}
    /**
	 * 登录处理
	 * @return
	 */
	@RequestMapping(value = "/user/login",method= RequestMethod.POST)
	public String toLogin(User user) {
		
		if("test1".equals(user.getName())) {
			logger.error("用户名错误");
			return "/login";
		}
		if("1111".equals(user.getPassword())) {
			logger.error("密码错误");
			return "/login";
		}
		return "redirect:/user/index";
	}
	@RequestMapping(value = "/user/index")
	public String toIndex() {
		return "/index";

	}
}