package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.BiAuditlogUrl;
import com.zhongche.citylevel.entity.BiAuditlogUrlExample;

public interface BiAuditlogUrlMapper {
    int countByExample(BiAuditlogUrlExample example);

    int deleteByExample(BiAuditlogUrlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BiAuditlogUrl record);

    int insertSelective(BiAuditlogUrl record);

    List<BiAuditlogUrl> selectByExample(BiAuditlogUrlExample example);

    BiAuditlogUrl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BiAuditlogUrl record, @Param("example") BiAuditlogUrlExample example);

    int updateByExample(@Param("record") BiAuditlogUrl record, @Param("example") BiAuditlogUrlExample example);

    int updateByPrimaryKeySelective(BiAuditlogUrl record);

    int updateByPrimaryKey(BiAuditlogUrl record);
}