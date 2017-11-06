package com.xinaml.cloud.common.api.to;

import com.xinaml.cloud.common.api.entity.DEL;
import com.xinaml.cloud.common.api.entity.EDIT;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

public abstract class BaseTO implements Serializable {
    /**
     * 数据行id
     */
    @NotBlank(message = "id不能为空", groups = {EDIT.class, DEL.class})
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
