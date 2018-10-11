package com.zhongche.citylevel.web.controller.affairs;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhongche.citylevel.entity.BiLeave;
import com.zhongche.citylevel.service.affairs.IBiLeaveService;
import com.zhongche.citylevel.utils.ResponseResult;


@Controller
@RequestMapping("/leave/*")
public class BiLeaveController {

	@Autowired
	private IBiLeaveService biLeaveService;
	
	@RequestMapping(method=RequestMethod.GET, value="/toapplyrest")
	public String toApplyRest() {
		return "/view/leave/applyrest";
	}
	
	
	/**
	 * 请假申请
	 * @param leave
	 * @param request
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/applyrest")
	@ResponseBody
	public ResponseResult startApplyRestProcess(@ModelAttribute BiLeave leave, HttpServletRequest request) {
		return biLeaveService.addLeaveRestInfo(leave, request);
	}
	
	
}
