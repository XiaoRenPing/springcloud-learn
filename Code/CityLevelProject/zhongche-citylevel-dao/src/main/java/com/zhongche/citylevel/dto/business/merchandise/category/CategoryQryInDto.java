package com.zhongche.citylevel.dto.business.merchandise.category;

import com.zhongche.citylevel.dto.PageDto;

public class CategoryQryInDto extends PageDto {

	private Long parentid;

	private String catename;

	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

}
