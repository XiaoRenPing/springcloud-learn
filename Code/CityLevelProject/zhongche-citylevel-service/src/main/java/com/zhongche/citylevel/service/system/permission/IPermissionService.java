package com.zhongche.citylevel.service.system.permission;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.dto.permission.PermissionAddDto;
import com.zhongche.citylevel.dto.permission.PermissionQueryDto;
import com.zhongche.citylevel.dto.permission.PermissionUpdateDto;
import com.zhongche.citylevel.entity.SysPermissions;

public interface IPermissionService {

	String addPermission(PermissionAddDto permissionDto);

	SysPermissions findPermissionById(Long id);

	String deletePermission(Long id);

	PageInfo<SysPermissions> pageListPermission(PermissionQueryDto permissionQueryDto);

	boolean updatePermission(PermissionUpdateDto permissionDto);

}
