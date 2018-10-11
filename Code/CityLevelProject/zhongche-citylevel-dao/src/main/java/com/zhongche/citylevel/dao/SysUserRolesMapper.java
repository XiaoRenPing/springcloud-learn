package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.SysUserRoles;
import com.zhongche.citylevel.entity.SysUserRolesExample;

public interface SysUserRolesMapper {
    int countByExample(SysUserRolesExample example);

    int deleteByExample(SysUserRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserRoles record);

    int insertSelective(SysUserRoles record);

    List<SysUserRoles> selectByExample(SysUserRolesExample example);

    SysUserRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserRoles record, @Param("example") SysUserRolesExample example);

    int updateByExample(@Param("record") SysUserRoles record, @Param("example") SysUserRolesExample example);

    int updateByPrimaryKeySelective(SysUserRoles record);

    int updateByPrimaryKey(SysUserRoles record);
}