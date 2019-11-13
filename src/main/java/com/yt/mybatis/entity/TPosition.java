package com.yt.mybatis.entity;

import lombok.Data;

@Data
public class TPosition extends BaseEntity {
    private Integer positionId;

    private String compName;

    private Integer years;

    private String title;
}