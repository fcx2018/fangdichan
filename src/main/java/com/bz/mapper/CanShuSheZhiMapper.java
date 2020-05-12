package com.bz.mapper;

import com.bz.bean.CanShuSheZhi;
import com.bz.bean.CanShuSheZhiExample;

import java.util.List;

public interface CanShuSheZhiMapper {
    /**
     *
     * @mbggenerated 2020-04-22
     */
    int countByExample(CanShuSheZhiExample example);

    /**
     *
     * @mbggenerated 2020-04-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-22
     */
    int insert(CanShuSheZhi record);

    /**
     *
     * @mbggenerated 2020-04-22
     */
    int insertSelective(CanShuSheZhi record);

    /**
     *
     * @mbggenerated 2020-04-22
     */
    List<CanShuSheZhi> selectByExample(CanShuSheZhiExample example );

    /**
     *
     * @mbggenerated 2020-04-22
     */
    CanShuSheZhi selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-22
     */
    int updateByPrimaryKeySelective(CanShuSheZhi record);

    /**
     *
     * @mbggenerated 2020-04-22
     */
    int updateByPrimaryKey(CanShuSheZhi record);
}