package com.yt.mybatis.entity;

import lombok.Data;

import java.util.List;

@Data
public class TUser extends BaseEntity {
    private Integer id;

    private String userName;

    private String realName;

    private Byte sex;

    private String mobile;

    private String email;

    private String note;

    private TPosition position;

    private List<TRole> role;

}