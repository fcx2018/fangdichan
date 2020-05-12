package com.bz.mapper;

import com.bz.bean.LouPan;
import com.bz.bean.LouPanExample;

import java.util.List;

public interface LouPanMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(LouPanExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(LouPan record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(LouPan record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<LouPan> selectByExample(LouPanExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    LouPan selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(LouPan record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(LouPan record);
}