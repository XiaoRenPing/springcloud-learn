package com.zhongche.citylevel.service.business.merchandise.service;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.dto.business.merchandise.category.CategoryAddAndUpdateDto;
import com.zhongche.citylevel.dto.business.merchandise.category.CategoryQryInDto;
import com.zhongche.citylevel.entity.BusMerchandiseCategory;

public interface ICategoryService {

	boolean addCategory(CategoryAddAndUpdateDto categoryDto);

	boolean updateCategory(CategoryAddAndUpdateDto categoryDto);

	BusMerchandiseCategory findCategoryById(Long id);

	boolean deleteCategory(Long id);

	PageInfo<BusMerchandiseCategory> pageListCategory(CategoryQryInDto categoryQueryDto);
}
