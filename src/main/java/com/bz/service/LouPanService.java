package com.bz.service;

import com.bz.bean.LouPan;

import java.util.List;

public interface LouPanService {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(LouPan louPan);

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
    List<LouPan> selectByExample(LouPan louPan , Integer pageNo , Integer pageSize);

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

    List<LouPan> selectNotKaiPan();

    List<LouPan> selectLouPan(LouPan louPan , Integer pageNo , Integer pageSize , Integer type , String jiage);
}