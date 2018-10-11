package com.zhongche.citylevel.dto.merchandise;

import com.zhongche.citylevel.dto.PageDto;

public class MerchandiseQueryDto extends PageDto {

	private String merchandisename;

	public String getMerchandisename() {
		return merchandisename;
	}

	public void setMerchandisename(String merchandisename) {
		this.merchandisename = merchandisename;
	}
	
}
