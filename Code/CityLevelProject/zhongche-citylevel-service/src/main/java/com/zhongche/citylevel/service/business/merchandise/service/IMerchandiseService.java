package com.zhongche.citylevel.service.business.merchandise.service;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.dto.business.merchandise.BusMerchandiseOutDto;
import com.zhongche.citylevel.dto.business.merchandise.BusMerchandiseQryOutDto;
import com.zhongche.citylevel.dto.merchandise.MerchandiseAddDto;
import com.zhongche.citylevel.dto.merchandise.MerchandiseQueryDto;
import com.zhongche.citylevel.dto.merchandise.MerchandiseUpdateDto;

public interface IMerchandiseService {

	boolean addMerchandise(MerchandiseAddDto merchandiseDto);

	BusMerchandiseOutDto findMerchandiseById(Long id);

	boolean deleteMerchandise(Long id);

	PageInfo<BusMerchandiseQryOutDto> pageListMerchandise(MerchandiseQueryDto merchandiseQueryDto);

	boolean updateMerchandise(MerchandiseUpdateDto merchandiseDto);

}
