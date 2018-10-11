package com.zhongche.citylevel.service.auditlog.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.zhongche.citylevel.constants.CommonConst;
import com.zhongche.citylevel.dao.BiAuditlogAgentMapper;
import com.zhongche.citylevel.dao.BiAuditlogUrlMapper;
import com.zhongche.citylevel.dao.BiAuditlogsMapper;
import com.zhongche.citylevel.entity.BiAuditlogAgent;
import com.zhongche.citylevel.entity.BiAuditlogAgentExample;
import com.zhongche.citylevel.entity.BiAuditlogUrl;
import com.zhongche.citylevel.entity.BiAuditlogUrlExample;
import com.zhongche.citylevel.entity.BiAuditlogs;
import com.zhongche.citylevel.service.auditlog.IAuditLogsService;

@Service("auditlogsService")
public class AuditlogsServiceImpl implements IAuditLogsService{

	Log logger = LogFactory.getLog(this.getClass());
	
    @Autowired
    BiAuditlogsMapper biAuditlogsdao;//注入dao
    
    @Autowired
    BiAuditlogUrlMapper auditlogUrlDao;
    
    @Autowired
    BiAuditlogAgentMapper auditlogAgentDao;
    
    public int addLogs(BiAuditlogs logs) {
    	return biAuditlogsdao.insert(logs);
    }
    
    public Long addAuditlogUrl(String url) {
		BiAuditlogUrlExample example = new BiAuditlogUrlExample();
		example.createCriteria().andUrlEqualTo(url);
		List<BiAuditlogUrl> list = auditlogUrlDao.selectByExample(example);
		if(CollectionUtils.isEmpty(list)) {
			BiAuditlogUrl record = new BiAuditlogUrl();
			record.setUrl(url);
			auditlogUrlDao.insertSelective(record);
			return record.getId();
		} else {
			return list.get(CommonConst.NUM_0).getId();
		}
	}

	public Long addAuditlogAgent(String agent) {
		BiAuditlogAgentExample example = new BiAuditlogAgentExample();
		example.createCriteria().andUseragentEqualTo(agent);
		List<BiAuditlogAgent> list = auditlogAgentDao.selectByExample(example);
		if(CollectionUtils.isEmpty(list)) {
			BiAuditlogAgent record = new BiAuditlogAgent();
			record.setUseragent(agent);
			auditlogAgentDao.insertSelective(record);
			return record.getId();
		} else {
			return list.get(CommonConst.NUM_0).getId();
		}
	}
}

