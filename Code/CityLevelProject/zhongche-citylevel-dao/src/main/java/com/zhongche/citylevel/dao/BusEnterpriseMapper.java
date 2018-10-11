package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.BusEnterprise;
import com.zhongche.citylevel.entity.BusEnterpriseExample;

public interface BusEnterpriseMapper {
    int countByExample(BusEnterpriseExample example);

    int deleteByExample(BusEnterpriseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BusEnterprise record);

    int insertSelective(BusEnterprise record);

    List<BusEnterprise> selectByExample(BusEnterpriseExample example);

    BusEnterprise selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BusEnterprise record, @Param("example") BusEnterpriseExample example);

    int updateByExample(@Param("record") BusEnterprise record, @Param("example") BusEnterpriseExample example);

    int updateByPrimaryKeySelective(BusEnterprise record);

    int updateByPrimaryKey(BusEnterprise record);
}