package com.zhongche.citylevel.service.system.role;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.dto.role.QuerySysRoleDto;
import com.zhongche.citylevel.dto.role.SysRolesDto;
import com.zhongche.citylevel.dto.role.SysRolesQryOutDto;
import com.zhongche.citylevel.entity.SysRoles;

public interface ISysRoleService {

	//新增角色
    boolean saveRole(SysRolesDto dto);
    //删除角色
    public boolean deleteRole(int id);
    //角色列表
    public PageInfo<SysRolesQryOutDto> queryRoles(QuerySysRoleDto qdto);
    //单个详情
    public SysRoles queryRolesById(int id);
    //更新角色
    public boolean updateRolesInfo(SysRolesDto dto);
}
