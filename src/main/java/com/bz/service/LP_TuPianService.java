package com.bz.service;

import com.bz.bean.LP_TuPian;

import java.util.List;

public interface LP_TuPianService {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(LP_TuPian lp_tuPian);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(LP_TuPian record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(LP_TuPian record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<LP_TuPian> selectByExample(LP_TuPian lp_tuPian , Integer pageNo , Integer pageSize);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    LP_TuPian selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(LP_TuPian record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(LP_TuPian record);

    int delLouPanId(Integer lpid);
}