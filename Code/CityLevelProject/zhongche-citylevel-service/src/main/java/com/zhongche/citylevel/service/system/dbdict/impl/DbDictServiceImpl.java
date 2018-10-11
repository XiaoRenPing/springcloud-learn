package com.zhongche.citylevel.service.system.dbdict.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.zhongche.citylevel.constants.CommonConst;
import com.zhongche.citylevel.dao.BiDbDictDetailMapper;
import com.zhongche.citylevel.entity.BiDbDictDetail;
import com.zhongche.citylevel.entity.BiDbDictDetailExample;
import com.zhongche.citylevel.service.base.BaseService;
import com.zhongche.citylevel.service.system.dbdict.IDbDictService;
import com.zhongche.citylevel.utils.UWException;

/**
 * 数据自定业务服务
* @ClassName: DbDictServiceImpl
* @Description: 
* @author 肖仁枰
* @date 2018年8月13日
 */
@Service("dbDictService")
public class DbDictServiceImpl extends BaseService implements IDbDictService{
	
	@Autowired
	BiDbDictDetailMapper dbDictDao;

	/**
	 * 根据字典的码查询字典
	 */
	public List<BiDbDictDetail> getDistinctDbDictDetailByCode(String code) {
		BiDbDictDetailExample dbDictDetailExample = new BiDbDictDetailExample();
		dbDictDetailExample.createCriteria().andCodeEqualTo(code);
		List<BiDbDictDetail> dbDictDetailList = dbDictDao.selectByExample(dbDictDetailExample);
		//唯一性查询
		if(!CollectionUtils.isEmpty(dbDictDetailList) && dbDictDetailList.size() > CommonConst.NUM_1) { 
			throw new UWException("数据重复，有多个数据，无法匹配！");
		}
		return dbDictDetailList;
	}

}
