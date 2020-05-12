package com.bz.mapper;

import com.bz.bean.Banner;
import com.bz.bean.BannerExample;

import java.util.List;

public interface BannerMapper {
    /**
     *
     * @mbggenerated 2020-05-09
     */
    int countByExample(BannerExample example);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int insert(Banner record);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int insertSelective(Banner record);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    List<Banner> selectByExample(BannerExample example);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    Banner selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int updateByPrimaryKeySelective(Banner record);

    /**
     *
     * @mbggenerated 2020-05-09
     */
    int updateByPrimaryKey(Banner record);
}