package com.xinaml.cloud.common.api.dto;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public abstract class BaseDTO extends PageDTO implements Serializable {
    private static final long serialVersionUID = -3558525794931360478L;
    /**
     * 排序字段 (有排序字段默认排序) "username=desc" 不指定 username (默认使用desc)
     */
    protected List<String> sorts = new ArrayList<>(0);
    /**
     * 类搜索条件
     */
    protected List<Condition> conditions = new ArrayList<Condition>(0);
    /**
     * js传递前encodeURI(url)
     * 类搜索条件Json {"field":"name","restrict":"EQ","value":"liguiqin"}
     * 多条件Json [{"field":"name","restrict":"EQ","value":"liguiqin"},{"field":"name","restrict":"IN","value":["liguiqin1","liguiqin2"]}]
     */
    protected String conditionsJson;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<String> getSorts() {
        return sorts;
    }

    public void setSorts(List<String> sorts) {
        this.sorts = sorts;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public String getConditionsJson() {
        return conditionsJson;
    }


}
