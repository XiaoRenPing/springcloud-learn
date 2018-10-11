package com.zhongche.citylevel.service.system.permission.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.dao.SysPermissionsMapper;
import com.zhongche.citylevel.dto.permission.PermissionAddDto;
import com.zhongche.citylevel.dto.permission.PermissionQueryDto;
import com.zhongche.citylevel.dto.permission.PermissionUpdateDto;
import com.zhongche.citylevel.entity.SysPermissions;
import com.zhongche.citylevel.entity.SysPermissionsExample;
import com.zhongche.citylevel.service.base.BaseService;
import com.zhongche.citylevel.service.system.permission.IPermissionService;

@Service("permissionService")
public class PermissionServiceImpl extends BaseService implements IPermissionService{

	@Autowired
	private SysPermissionsMapper permissionDao;
	
	public String addPermission(PermissionAddDto permissionDto) {
		SysPermissions permission = new SysPermissions();
		BeanUtils.copyProperties(permissionDto, permission);
		Integer result = permissionDao.insertSelective(permission);
		return result.toString();
	}

	public SysPermissions findPermissionById(Long id) {
		return permissionDao.selectByPrimaryKey(id);
	}

	public String deletePermission(Long id) {
		Integer result = permissionDao.deleteByPrimaryKey(id);
		return result.toString();
	}

	public PageInfo<SysPermissions> pageListPermission(PermissionQueryDto permissionQueryDto) {
		SysPermissionsExample permissionExample = new SysPermissionsExample();
		SysPermissionsExample.Criteria criteria = permissionExample.createCriteria();
		if(permissionQueryDto.getName() != null) {
			criteria.andNameLike("%" + permissionQueryDto.getName() + "%");
		}
		//this.startPage(permissionQueryDto);
		List<SysPermissions> permissionList = permissionDao.selectByExample(permissionExample);
		return new PageInfo<SysPermissions>(permissionList);
	}

	public boolean updatePermission(PermissionUpdateDto permissionDto) {
		SysPermissions permission = new SysPermissions();
		BeanUtils.copyProperties(permissionDto, permission);
		Integer result = permissionDao.updateByPrimaryKeySelective(permission);
		if(result == 1) {
			return true;
		}else {
			return false ;
		}
	}

}
