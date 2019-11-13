package com.yt.mybatis.mapper;

import com.yt.mybatis.entity.TUser;

import java.util.List;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    List<TUser> selectByAssociation();

    List<TUser> selectByAssociationQuery();

    List<TUser> selectByCollectionQuery();

    List<Object> selectByDiscriminator();

}