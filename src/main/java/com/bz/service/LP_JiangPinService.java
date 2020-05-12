package com.bz.service;

import com.bz.bean.LP_JiangPin;

import java.util.List;

public interface LP_JiangPinService {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(LP_JiangPin lp_jiangPin);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    int deleteloupanid(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(LP_JiangPin record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(LP_JiangPin record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<LP_JiangPin> selectByExample(LP_JiangPin lp_jiangPin , Integer pageNo , Integer pageSize);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    LP_JiangPin selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(LP_JiangPin record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(LP_JiangPin record);
}