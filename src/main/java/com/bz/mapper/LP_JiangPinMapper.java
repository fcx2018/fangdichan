package com.bz.mapper;

import com.bz.bean.LP_JiangPin;
import com.bz.bean.LP_JiangPinExample;

import java.util.List;

public interface LP_JiangPinMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(LP_JiangPinExample example);

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
    List<LP_JiangPin> selectByExample(LP_JiangPinExample example);

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