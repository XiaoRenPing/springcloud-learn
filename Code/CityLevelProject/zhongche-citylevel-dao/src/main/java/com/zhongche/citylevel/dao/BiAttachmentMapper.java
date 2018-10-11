package com.zhongche.citylevel.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhongche.citylevel.entity.BiAttachment;
import com.zhongche.citylevel.entity.BiAttachmentExample;

public interface BiAttachmentMapper {
    int countByExample(BiAttachmentExample example);

    int deleteByExample(BiAttachmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BiAttachment record);

    int insertSelective(BiAttachment record);

    List<BiAttachment> selectByExample(BiAttachmentExample example);

    BiAttachment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BiAttachment record, @Param("example") BiAttachmentExample example);

    int updateByExample(@Param("record") BiAttachment record, @Param("example") BiAttachmentExample example);

    int updateByPrimaryKeySelective(BiAttachment record);

    int updateByPrimaryKey(BiAttachment record);
}