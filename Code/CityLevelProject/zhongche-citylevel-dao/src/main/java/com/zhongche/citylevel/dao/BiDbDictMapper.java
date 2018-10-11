package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.BiDbDict;
import com.zhongche.citylevel.entity.BiDbDictExample;

public interface BiDbDictMapper {
    int countByExample(BiDbDictExample example);

    int deleteByExample(BiDbDictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BiDbDict record);

    int insertSelective(BiDbDict record);

    List<BiDbDict> selectByExample(BiDbDictExample example);

    BiDbDict selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BiDbDict record, @Param("example") BiDbDictExample example);

    int updateByExample(@Param("record") BiDbDict record, @Param("example") BiDbDictExample example);

    int updateByPrimaryKeySelective(BiDbDict record);

    int updateByPrimaryKey(BiDbDict record);
}