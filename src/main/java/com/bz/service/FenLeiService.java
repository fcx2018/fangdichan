package com.bz.service;

import com.bz.bean.FenLei;

import java.util.List;

public interface FenLeiService {
    int countByExample(FenLei fenLei);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int insert(FenLei record);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int insertSelective(FenLei record);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    List<FenLei> selectByExample(FenLei fenlei , Integer pagtNo , Integer pageSize);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    FenLei selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int updateByPrimaryKeySelective(FenLei record);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int updateByPrimaryKey(FenLei record);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    List<FenLei> selectIndex();
}
