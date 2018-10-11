package com.zhongche.citylevel.service.system.sysconfig.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.zhongche.citylevel.constants.CommonConst;
import com.zhongche.citylevel.dao.SysConfigMapper;
import com.zhongche.citylevel.entity.SysConfig;
import com.zhongche.citylevel.entity.SysConfigExample;
import com.zhongche.citylevel.service.base.BaseService;
import com.zhongche.citylevel.service.system.sysconfig.ISysConfigService;

@Service("sysConfigService")
public class SysConfigServiceImpl extends BaseService implements ISysConfigService{

	@Autowired
	SysConfigMapper sysConfigDao;
	
	public SysConfig getWebSiteConfig(HttpServletRequest request) {
		SysConfigExample sysConfigExample = new SysConfigExample();
		List<SysConfig> sysConfigList = sysConfigDao.selectByExample(sysConfigExample);
		if(!CollectionUtils.isEmpty(sysConfigList)) {
			return sysConfigList.get(CommonConst.NUM_0);
		}
		return null;
	}

}
