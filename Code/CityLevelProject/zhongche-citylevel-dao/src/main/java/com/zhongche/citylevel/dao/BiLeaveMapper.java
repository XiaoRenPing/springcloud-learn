package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.BiLeave;
import com.zhongche.citylevel.entity.BiLeaveExample;

public interface BiLeaveMapper {
    int countByExample(BiLeaveExample example);

    int deleteByExample(BiLeaveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BiLeave record);

    int insertSelective(BiLeave record);

    List<BiLeave> selectByExample(BiLeaveExample example);

    BiLeave selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BiLeave record, @Param("example") BiLeaveExample example);

    int updateByExample(@Param("record") BiLeave record, @Param("example") BiLeaveExample example);

    int updateByPrimaryKeySelective(BiLeave record);

    int updateByPrimaryKey(BiLeave record);
}