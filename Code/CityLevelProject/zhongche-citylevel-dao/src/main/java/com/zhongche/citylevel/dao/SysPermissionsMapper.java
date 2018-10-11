package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.SysPermissions;
import com.zhongche.citylevel.entity.SysPermissionsExample;

public interface SysPermissionsMapper {
    int countByExample(SysPermissionsExample example);

    int deleteByExample(SysPermissionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPermissions record);

    int insertSelective(SysPermissions record);

    List<SysPermissions> selectByExample(SysPermissionsExample example);

    SysPermissions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPermissions record, @Param("example") SysPermissionsExample example);

    int updateByExample(@Param("record") SysPermissions record, @Param("example") SysPermissionsExample example);

    int updateByPrimaryKeySelective(SysPermissions record);

    int updateByPrimaryKey(SysPermissions record);
}