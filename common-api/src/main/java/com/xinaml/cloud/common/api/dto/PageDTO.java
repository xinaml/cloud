package com.xinaml.cloud.common.api.dto;

import java.io.Serializable;


public abstract class PageDTO implements Serializable {
    /**
     * 每显示数量
     */
    protected Integer limit = 10;
    /**
     * 当前页
     */
    protected Integer page = 1;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return (this.page - 1) >= 0 ? (this.page - 1) : 0;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
