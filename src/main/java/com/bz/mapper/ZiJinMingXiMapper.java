package com.bz.mapper;

import com.bz.bean.ZiJinMingXi;
import com.bz.bean.ZiJinMingXiExample;

import java.util.List;

public interface ZiJinMingXiMapper {
    /**
     *
     * @mbggenerated 2020-05-12
     */
    int countByExample(ZiJinMingXiExample example);

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
    List<ZiJinMingXi> selectByExample(ZiJinMingXiExample example);

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