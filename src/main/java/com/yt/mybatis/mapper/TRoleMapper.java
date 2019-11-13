package com.yt.mybatis.mapper;

import com.yt.mybatis.entity.TRole;

import java.util.List;

public interface TRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);

    List<TRole> selectByCollection();

    List<TRole> selectByRoleId(Integer integer);
}