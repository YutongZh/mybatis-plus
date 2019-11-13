package com.yt.mybatis.entity;

import lombok.Data;

import java.util.List;

@Data
public class TRole extends BaseEntity {
    private Integer roleId;

    private String roleName;

    private List<TUser> user;


}