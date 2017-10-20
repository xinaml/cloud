package com.xinaml.cloud.common.jpa.boot;


import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public class EntityToScanImpl<T> implements EntityToScan {
    protected String packageName;

    public EntityToScanImpl() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        packageName = ((Class<T>) params[0]).getPackage().toString();
        packageName = packageName.substring(8, packageName.lastIndexOf("."));
    }

    @Override
    public String[] entityScan() {

        return new String[]{packageName + ".entity"};
    }
}
