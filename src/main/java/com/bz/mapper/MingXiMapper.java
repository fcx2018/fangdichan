package com.bz.mapper;

import com.bz.bean.MingXi;
import com.bz.bean.MingXiExample;

import java.util.List;

public interface MingXiMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(MingXiExample example);

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
    List<MingXi> selectByExample(MingXiExample example);

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