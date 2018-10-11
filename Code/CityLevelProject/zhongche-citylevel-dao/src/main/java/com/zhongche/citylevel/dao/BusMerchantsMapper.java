package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.BusMerchants;
import com.zhongche.citylevel.entity.BusMerchantsExample;

public interface BusMerchantsMapper {
    int countByExample(BusMerchantsExample example);

    int deleteByExample(BusMerchantsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BusMerchants record);

    int insertSelective(BusMerchants record);

    List<BusMerchants> selectByExample(BusMerchantsExample example);

    BusMerchants selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BusMerchants record, @Param("example") BusMerchantsExample example);

    int updateByExample(@Param("record") BusMerchants record, @Param("example") BusMerchantsExample example);

    int updateByPrimaryKeySelective(BusMerchants record);

    int updateByPrimaryKey(BusMerchants record);
}