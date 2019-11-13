package com.yt.mybatis.entity;

import lombok.Data;

@Data
public class TRelation extends BaseEntity {
    private Integer id;

    private Integer userId;

    private Integer roleId;

}