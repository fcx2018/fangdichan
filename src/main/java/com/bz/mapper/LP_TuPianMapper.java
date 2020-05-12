package com.bz.mapper;

import com.bz.bean.LP_TuPian;
import com.bz.bean.LP_TuPianExample;

import java.util.List;

public interface LP_TuPianMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(LP_TuPianExample example);

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
    List<LP_TuPian> selectByExample(LP_TuPianExample example);

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
    /*
    *根据楼盘id查询楼盘图片
    */
    List<LP_TuPian> selectLouPanId(Integer lpid);

    /*
     *根据楼盘id删除楼盘图片
     */
    int delLouPanId(Integer lpid);
}