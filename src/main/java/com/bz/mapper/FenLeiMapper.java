package com.bz.mapper;

import com.bz.bean.FenLei;
import com.bz.bean.FenLeiExample;

import java.util.List;

public interface FenLeiMapper {
    /**
     *
     * @mbggenerated 2020-05-09
     */
    int countByExample(FenLeiExample example);

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
    List<FenLei> selectByExample(FenLeiExample example);

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
}