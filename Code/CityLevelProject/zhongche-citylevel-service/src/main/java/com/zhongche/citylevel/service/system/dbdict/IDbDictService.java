package com.zhongche.citylevel.service.system.dbdict;

import java.util.List;

import com.zhongche.citylevel.entity.BiDbDictDetail;

public interface IDbDictService {

	List<BiDbDictDetail> getDistinctDbDictDetailByCode(String key);

}
