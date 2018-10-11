package com.zhongche.citylevel.log;

import com.zhongche.citylevel.entity.BiAuditlogs;

public interface IBiAuditlogsBase {

	int addLogs(BiAuditlogs logs);

	Long addAuditlogUrl(String url);

	Long addAuditlogAgent(String agent);
}
