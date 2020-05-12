package com.bz.mapper;

import com.bz.bean.TiXianJiLu;
import com.bz.bean.TiXianJiLuExample;

import java.util.List;

public interface TiXianJiLuMapper {
    /**
     *
     * @mbggenerated 2020-04-30
     */
    int countByExample(TiXianJiLuExample example);

    /**
     *
     * @mbggenerated 2020-04-30
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-30
     */
    int insert(TiXianJiLu record);

    /**
     *
     * @mbggenerated 2020-04-30
     */
    int insertSelective(TiXianJiLu record);

    /**
     *
     * @mbggenerated 2020-04-30
     */
    List<TiXianJiLu> selectByExample(TiXianJiLuExample example);

    /**
     *
     * @mbggenerated 2020-04-30
     */
    TiXianJiLu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-30
     */
    int updateByPrimaryKeySelective(TiXianJiLu record);

    /**
     *
     * @mbggenerated 2020-04-30
     */
    int updateByPrimaryKey(TiXianJiLu record);
}