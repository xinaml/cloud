package com.xinaml.cloud.common.api.service;


import com.xinaml.cloud.common.api.dto.BaseDTO;
import com.xinaml.cloud.common.api.entity.BaseEntity;
import com.xinaml.cloud.common.api.exception.SerException;

import java.util.Collection;
import java.util.List;


public interface Ser<BE extends BaseEntity, BD extends BaseDTO> {

    /**
     * 查询所有数据
     *
     * @return
     * @throws SerException
     */
    default List<BE> findAll() throws SerException {
        return null;
    }

    /**
     * 查询分页数据
     *
     * @param dto
     * @return
     * @throws SerException
     */
    default List<BE> findByPage(BD dto) throws SerException {
        return null;
    }

    /**
     * 查询数据量
     *
     * @param dto
     * @return
     * @throws SerException
     */
    default Long count(BD dto) throws SerException {
        return null;
    }

    /**
     * 查询第一个对象
     *
     * @param dto
     * @return
     * @throws SerException
     */
    default BE findOne(BD dto) throws SerException {
        return null;
    }

    /**
     * 根据条件询对象列表
     * 是否分页
     *
     * @param dto
     * @param page 分页
     * @return
     * @throws SerException
     */
    default List<BE> findByCis(BD dto, Boolean page) throws SerException {
        return null;
    }

    /**
     * 根据条件询对象列表
     * 默认不分页排序
     *
     * @param dto
     * @return
     * @throws SerException
     */
    default List<BE> findByCis(BD dto) throws SerException {
        return null;
    }


    /**
     * 通过id查询某个对象
     *
     * @param id
     * @return
     * @throws SerException
     */
    default BE findById(String id) throws SerException {
        return null;
    }


    /**
     * 保存对象
     *
     * @param entity
     * @throws SerException
     */
    default BE save(BE entity) throws SerException {
        return null;
    }


    /**
     * 保存对象列表
     *
     * @param entities
     * @throws SerException
     */
    default void save(Collection<BE> entities) throws SerException {

    }

    /**
     * 通过id删除对象
     *
     * @param id
     * @throws SerException
     */
    default void remove(String id) throws SerException {

    }

    /**
     * 删除对象
     *
     * @param entity
     * @throws SerException
     */
    default void remove(BE entity) throws SerException {

    }

    /**
     * 删除对象列表
     *
     * @param entities
     * @throws SerException
     */
    default void remove(Collection<BE> entities) throws SerException {

    }


    /**
     * 更新对象
     *
     * @param entity
     * @throws SerException
     */
    default void update(BE entity) throws SerException {

    }

    /**
     * 更新对象
     *
     * @param entities
     * @throws SerException
     */
    default void update(Collection<BE> entities) throws SerException {

    }

    /**
     * 通过id查询对象是否存在
     *
     * @param id
     * @return
     * @throws SerException
     */
    default Boolean exists(String id) throws SerException {
        return null;
    }

    /**
     * 查询最大值字段
     *
     * @param field
     * @return
     * @throws SerException
     */
    default String findByMaxField(String field, Class clazz) throws SerException {
        return null;
    }

    /**
     * 查询最小值字段
     *
     * @param field
     * @return
     * @throws SerException
     */
    default String findByMinField(String field, Class clazz) throws SerException {
        return null;
    }

    /**
     * sql查询
     *
     * @param sql    sql语句
     * @param clazz  查询结果映射类
     * @param fields 查询的字段
     * @param
     * @return
     * @throws SerException
     */
    default <T> List<T> findBySql(String sql, Class clazz, String[] fields) throws SerException {
        return null;
    }

    /**
     * sql原生查询,执行结果需要自己解析
     *
     * @param sql sql语句
     * @return
     * @throws SerException
     */
    default List<Object> findBySql(String sql) throws SerException {
        return null;
    }


    /**
     * 执行sql语句
     *
     * @param sql
     * @throws SerException
     */
    default void executeSql(String sql) throws SerException {
    }

    /**
     * 获取表名
     *
     * @param clazz
     * @return
     */
    default String getTableName(Class clazz) throws SerException {
        return null;
    }

}
