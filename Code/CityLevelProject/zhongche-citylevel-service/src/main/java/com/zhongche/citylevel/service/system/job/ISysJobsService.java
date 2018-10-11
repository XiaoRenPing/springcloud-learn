package com.zhongche.citylevel.service.system.job;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.dto.job.SysJobsDto;
import com.zhongche.citylevel.dto.job.SysJobsQueryDto;
import com.zhongche.citylevel.entity.SysJobs;
import com.zhongche.citylevel.utils.ResponseResult;

public interface ISysJobsService {

	public Integer deleteSysJobs(Long id);

	public Boolean updateSysJobsInfo(SysJobsDto sysJobsDto);

	public SysJobs getSysJobsById(Long id);

	public PageInfo<SysJobs> findSysJobsInfoPage(SysJobsQueryDto sysJobsQueryDto);

	public Integer saveSysJobs(SysJobsDto sysJobsDto);

	public Integer startSysJob(String ids);

	public Integer stopJobs(String ids);

	public ResponseResult startSingleSysJob(Long id);

	public ResponseResult stopSingleSysJob(Long id);
}
