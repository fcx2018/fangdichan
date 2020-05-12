package com.bz.mapper;

import com.bz.bean.YinHang;
import com.bz.bean.YinHangExample;

import java.util.List;

public interface YinHangMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(YinHangExample example);

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
    List<YinHang> selectByExample(YinHangExample example);

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