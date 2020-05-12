package com.bz.service;

import com.bz.bean.ZiJinMingXi;

import java.util.List;

public interface ZiJinMingXiService {
    /**
     *
     * @mbggenerated 2020-05-12
     */
    int countByExample(ZiJinMingXi ziJinMingXi);

    /**
     *
     * @mbggenerated 2020-05-12
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-05-12
     */
    int insert(ZiJinMingXi record);

    /**
     *
     * @mbggenerated 2020-05-12
     */
    int insertSelective(ZiJinMingXi record);

    /**
     *
     * @mbggenerated 2020-05-12
     */
    List<ZiJinMingXi> selectByExample(ZiJinMingXi ziJinMingXi , Integer pageNo , Integer pageSize);

    /**
     *
     * @mbggenerated 2020-05-12
     */
    ZiJinMingXi selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-05-12
     */
    int updateByPrimaryKeySelective(ZiJinMingXi record);

    /**
     *
     * @mbggenerated 2020-05-12
     */
    int updateByPrimaryKey(ZiJinMingXi record);
}