package com.zhongche.citylevel.service.system.sysconfig;

import javax.servlet.http.HttpServletRequest;

import com.zhongche.citylevel.entity.SysConfig;

public interface ISysConfigService {

	SysConfig getWebSiteConfig(HttpServletRequest request);
	
}
