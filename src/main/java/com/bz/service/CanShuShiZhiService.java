package com.bz.service;

import com.bz.bean.CanShuSheZhi;

import java.util.List;

public interface CanShuShiZhiService {
    /**
     *
     * @mbggenerated 2020-04-22
     */
    int countByExample(CanShuSheZhi CanShuSheZhi);

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
    List<CanShuSheZhi> selectByExample(CanShuSheZhi CanShuSheZhi , Integer pageNo , Integer pgeeSize);

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
