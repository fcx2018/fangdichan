package com.bz.service;

import com.bz.bean.TiXianJiLu;

import java.util.List;

public interface TiXianJiLuService {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(TiXianJiLu tiXianJiLu);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(TiXianJiLu record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(TiXianJiLu record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<TiXianJiLu> selectByExample(TiXianJiLu tiXianJiLu , Integer pageNo , Integer pageSize);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    TiXianJiLu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(TiXianJiLu record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(TiXianJiLu record);
}