package com.zhongche.citylevel.dto.job;

import java.io.Serializable;

import com.zhongche.citylevel.dto.PageDto;

public class SysJobsQueryDto extends PageDto implements Serializable{

	private String jobname;

	private String jobclass;

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getJobclass() {
		return jobclass;
	}

	public void setJobclass(String jobclass) {
		this.jobclass = jobclass;
	}
}
