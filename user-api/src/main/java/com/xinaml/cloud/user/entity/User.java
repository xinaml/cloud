package com.xinaml.cloud.user.entity;


import com.xinaml.cloud.common.api.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseEntity {
    @Column(nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '编号'")
    String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
