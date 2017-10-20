package com.xinaml.cloud.common.api.dto;


import com.xinaml.cloud.common.api.type.RestrictionType;

import java.io.Serializable;

public class Condition implements Serializable {
    /**
     * field（字段） 包含 "." 则默认会设置成左连接，左连接set 集合 命名必须为Set结束
     * 如：Set<User>userSet List<User>userList
     */
    private String field; //字段
    private Object value;//字段值
    private RestrictionType restrict; //限制表达式

    public Condition(String field, Object value, RestrictionType restrict) {
        this.field = field;
        this.value = value;
        this.restrict = restrict;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public RestrictionType getRestrict() {
        return restrict;
    }

    public void setRestrict(RestrictionType restrict) {
        this.restrict = restrict;
    }
}
