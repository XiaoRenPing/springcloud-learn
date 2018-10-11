package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.BiDbDictDetail;
import com.zhongche.citylevel.entity.BiDbDictDetailExample;

public interface BiDbDictDetailMapper {
    int countByExample(BiDbDictDetailExample example);

    int deleteByExample(BiDbDictDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BiDbDictDetail record);

    int insertSelective(BiDbDictDetail record);

    List<BiDbDictDetail> selectByExample(BiDbDictDetailExample example);

    BiDbDictDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BiDbDictDetail record, @Param("example") BiDbDictDetailExample example);

    int updateByExample(@Param("record") BiDbDictDetail record, @Param("example") BiDbDictDetailExample example);

    int updateByPrimaryKeySelective(BiDbDictDetail record);

    int updateByPrimaryKey(BiDbDictDetail record);
}