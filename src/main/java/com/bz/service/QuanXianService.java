package com.bz.service;

import com.bz.bean.QuanXian;

import java.util.List;

public interface QuanXianService {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(QuanXian quanXian);

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
    List<QuanXian> selectByExample(QuanXian quanXian , Integer pageNo , Integer pageSize);

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

    List<QuanXian> getAll();
}