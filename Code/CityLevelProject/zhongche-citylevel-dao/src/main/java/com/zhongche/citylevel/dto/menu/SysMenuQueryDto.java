package com.zhongche.citylevel.dto.menu;

import com.zhongche.citylevel.dto.PageDto;

public class SysMenuQueryDto extends PageDto{
	
	private String menuname;

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	
	public SysMenuQueryDto() {
		super();
	}

}
