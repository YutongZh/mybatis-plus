package com.yt.mybatis.mapper;

import com.yt.mybatis.entity.TPosition;
import org.apache.ibatis.annotations.Param;

public interface TPositionMapper {
    int deleteByPrimaryKey(Integer positionId);

    int insert(TPosition record);

    int insertSelective(TPosition record);

    TPosition selectByPrimaryKey(Integer positionId);

    int updateByPrimaryKeySelective(TPosition record);

    int updateByPrimaryKey(TPosition record);
}