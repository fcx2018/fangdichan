package com.bz.service;

import com.bz.bean.QuYu;

import java.util.List;

public interface QuYuService {
    /**
     *
     * @mbggenerated 2020-04-26
     */
    int countByExample(QuYu quYu);

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
    List<QuYu> selectByExample(QuYu quYu , Integer pageNo , Integer pageSize );

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
    List<QuYu> getAll();
}