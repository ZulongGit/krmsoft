package com.krm.web.testcdu.mapper;

import java.util.List;
import java.util.Map;

import com.krm.common.base.CommonEntity;
import com.krm.web.testcdu.model.Testdev01;

import tk.mybatis.mapper.common.Mapper;

/**
 * @author zhaozulong
 * 报告DAO层
 * 2018-12-06
 */
public interface Testdev01Mapper extends Mapper<Testdev01> {

    /**
     * 列表查询,返回的是通用实体，不受实体属性限制，相当于map
     */
    List<CommonEntity> queryPageInfo(Map<String, Object> params);

    /**
     * 列表查询,返回的是实体
     */
    List<Testdev01> entityList(Map<String, Object> params);

    /**
     * 查询单条数据,返回的是实体
     */
    Testdev01 queryOne(Map<String, Object> params);

    /**
     * 查询单条数据,返回的是通用实体，不受实体属性限制，相当于map
     */
    CommonEntity queryOneCommon(Map<String, Object> params);

    /**
     * 批量插入数据
     */
    int insertBatch(List<Testdev01> list);

    /**
     * 根据不同条件删除数据，条件可组合
     */
    int deleteByParams(Map<String, Object> params);
}