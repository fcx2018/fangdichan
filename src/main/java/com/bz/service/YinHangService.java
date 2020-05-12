package com.bz.service;

import com.bz.bean.YinHang;

import java.util.List;

public interface YinHangService {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(YinHang yinHang);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(YinHang record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(YinHang record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<YinHang> selectByExample(YinHang yinHang, Integer pageNo , Integer pageSize);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    YinHang selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(YinHang record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(YinHang record);
}