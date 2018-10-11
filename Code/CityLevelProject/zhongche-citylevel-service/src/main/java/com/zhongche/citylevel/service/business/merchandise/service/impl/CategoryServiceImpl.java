package com.zhongche.citylevel.service.business.merchandise.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.dao.BusMerchandiseCategoryMapper;
import com.zhongche.citylevel.dto.business.merchandise.category.CategoryAddAndUpdateDto;
import com.zhongche.citylevel.dto.business.merchandise.category.CategoryQryInDto;
import com.zhongche.citylevel.entity.BusMerchandiseCategory;
import com.zhongche.citylevel.entity.BusMerchandiseCategoryExample;
import com.zhongche.citylevel.service.base.BaseService;
import com.zhongche.citylevel.service.business.merchandise.service.ICategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends BaseService implements ICategoryService{

	@Autowired
	BusMerchandiseCategoryMapper merchandiseCategoryDao;
	
	public boolean addCategory(CategoryAddAndUpdateDto categoryDto) {
		BusMerchandiseCategory category = new BusMerchandiseCategory();
		BeanUtils.copyProperties(categoryDto, category);
		merchandiseCategoryDao.insertSelective(category);
		return true;
	}

	public boolean updateCategory(CategoryAddAndUpdateDto categoryDto) {
		BusMerchandiseCategory category = new BusMerchandiseCategory();
		BeanUtils.copyProperties(categoryDto, category);
		merchandiseCategoryDao.updateByPrimaryKeySelective(category);
		return true;
	}

	public BusMerchandiseCategory findCategoryById(Long id) {
		return merchandiseCategoryDao.selectByPrimaryKey(id);
	}

	public boolean deleteCategory(Long id) {
		merchandiseCategoryDao.deleteByPrimaryKey(id);
		return true;
	}

	public PageInfo<BusMerchandiseCategory> pageListCategory(CategoryQryInDto categoryQueryDto) {
		BusMerchandiseCategoryExample categoryExample = new BusMerchandiseCategoryExample();
		BusMerchandiseCategoryExample.Criteria categoryCriteria = categoryExample.createCriteria();
		if(categoryQueryDto.getCatename() != null) {
			categoryCriteria.andParentidEqualTo(categoryQueryDto.getParentid());
		}
		if(categoryQueryDto.getCatename() != null) {
			categoryCriteria.andCatenameLike(this.fullLike(categoryQueryDto.getCatename()));
		}
		//this.initPage(categoryQueryDto);
		List<BusMerchandiseCategory> categoryList = merchandiseCategoryDao.selectByExample(categoryExample);
		return new PageInfo<BusMerchandiseCategory>(categoryList);
	}

}
