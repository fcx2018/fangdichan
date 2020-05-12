package com.bz.mapper;

import com.bz.bean.QuanXian;
import com.bz.bean.QuanXianExample;

import java.util.List;

public interface QuanXianMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(QuanXianExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(QuanXian record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(QuanXian record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<QuanXian> selectByExample(QuanXianExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    QuanXian selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(QuanXian record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(QuanXian record);
}