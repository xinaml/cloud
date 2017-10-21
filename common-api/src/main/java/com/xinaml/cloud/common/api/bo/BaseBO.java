package com.xinaml.cloud.common.api.bo;

import java.io.Serializable;


public abstract class BaseBO implements Serializable {
    /**
     * 数据行id
     */
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
