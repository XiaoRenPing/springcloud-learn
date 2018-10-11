package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.SysUserNotifications;
import com.zhongche.citylevel.entity.SysUserNotificationsExample;

public interface SysUserNotificationsMapper {
    int countByExample(SysUserNotificationsExample example);

    int deleteByExample(SysUserNotificationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserNotifications record);

    int insertSelective(SysUserNotifications record);

    List<SysUserNotifications> selectByExample(SysUserNotificationsExample example);

    SysUserNotifications selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserNotifications record, @Param("example") SysUserNotificationsExample example);

    int updateByExample(@Param("record") SysUserNotifications record, @Param("example") SysUserNotificationsExample example);

    int updateByPrimaryKeySelective(SysUserNotifications record);

    int updateByPrimaryKey(SysUserNotifications record);
}