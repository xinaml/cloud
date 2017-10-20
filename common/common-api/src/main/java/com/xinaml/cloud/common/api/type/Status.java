package com.xinaml.cloud.common.api.type;


public enum Status {
    /**
     * 解冻
     */
    THAW(0),
    /**
     * 冻结
     */
    CONGEAL(1),
    /**
     * 删除
     */
    DELETE(2),
    /**
     * 未激活
     */
    NOACTIVE(3),
    /**
     * 未审核
     */
    UNREVIEW(4);

    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
