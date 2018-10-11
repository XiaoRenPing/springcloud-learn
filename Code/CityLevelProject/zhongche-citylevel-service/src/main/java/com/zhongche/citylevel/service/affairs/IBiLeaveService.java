package com.zhongche.citylevel.service.affairs;

import javax.servlet.http.HttpServletRequest;

import com.zhongche.citylevel.entity.BiLeave;
import com.zhongche.citylevel.utils.ResponseResult;

public interface IBiLeaveService {

	//启动请假流程
	public ResponseResult addLeaveRestInfo(BiLeave leave, HttpServletRequest request);
}
