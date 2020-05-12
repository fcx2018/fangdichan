package com.bz.service;

import com.bz.bean.MingXi;

import java.util.List;

public interface MingXiService {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(MingXi mingXi);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(MingXi record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(MingXi record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<MingXi> selectByExample(MingXi mingXi , Integer pageNo , Integer pageSize);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    MingXi selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(MingXi record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(MingXi record);
}