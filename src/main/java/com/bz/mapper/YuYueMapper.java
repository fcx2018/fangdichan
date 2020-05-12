package com.bz.mapper;

import com.bz.bean.YuYue;
import com.bz.bean.YuYueExample;

import java.util.List;

public interface YuYueMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(YuYueExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(YuYue record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(YuYue record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<YuYue> selectByExample(YuYueExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    YuYue selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(YuYue record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(YuYue record);
}