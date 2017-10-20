package com.xinaml.cloud.common.jpa.boot;

public interface EntityToScan<T> {

    /**
     * 扫描　返回值包　Entity
     *
     * @return　扫描包
     */
    default String[] entityScan() {
        return null;
    }
}
