package com.yt.mybatis.mapper;

import com.yt.mybatis.entity.TRelation;
import com.yt.mybatis.entity.TRole;
import com.yt.mybatis.entity.TUser;

import java.util.List;

public interface TRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TRelation record);

    int insertSelective(TRelation record);

    TRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRelation record);

    int updateByPrimaryKey(TRelation record);

    List<TRole> selectByUid(Integer integer);

    List<TUser> selectByRoleId(Integer integer);
}