package com.zhongche.citylevel.dto.role;

import com.zhongche.citylevel.dto.PageDto;

public class QuerySysRoleDto extends PageDto {

	private String name;

	private String displayname;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	
	
}
