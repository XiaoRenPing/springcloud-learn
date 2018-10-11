package com.zhongche.citylevel.service.system.user;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.dto.user.UserQueryDto;
import com.zhongche.citylevel.dto.user.UserQueryOutDto;
import com.zhongche.citylevel.entity.SysUsers;
import com.zhongche.citylevel.utils.ResponseResult;

public interface IUserService {

	public String addUserInfo(SysUsers user);
	
	public PageInfo<UserQueryOutDto> queryUserList(UserQueryDto userQryDto);

	public ResponseResult login(String name, String password, String vcode, HttpServletRequest request);

	public SysUsers getUserIdByUserName(String name);

	public String logout(String token, HttpServletRequest request);

	public String updateUserInfo(SysUsers user);

	public String deleteUser(Long id);

}
