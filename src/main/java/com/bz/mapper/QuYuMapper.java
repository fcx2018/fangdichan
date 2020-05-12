package com.bz.mapper;

import com.bz.bean.QuYu;
import com.bz.bean.QuYuExample;

import java.util.List;

public interface QuYuMapper {
    /**
     *
     * @mbggenerated 2020-04-26
     */
    int countByExample(QuYuExample example);

    /**
     *
     * @mbggenerated 2020-04-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-26
     */
    int insert(QuYu record);

    /**
     *
     * @mbggenerated 2020-04-26
     */
    int insertSelective(QuYu record);

    /**
     *
     * @mbggenerated 2020-04-26
     */
    List<QuYu> selectByExample(QuYuExample example);

    /**
     *
     * @mbggenerated 2020-04-26
     */
    QuYu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-26
     */
    int updateByPrimaryKeySelective(QuYu record);

    /**
     *
     * @mbggenerated 2020-04-26
     */
    int updateByPrimaryKey(QuYu record);
}