package com.bz.service;

import com.bz.bean.Banner;

import java.util.List;

public interface BannerService {
    /**
     *
     * @mbggenerated 2020-05-09
     */
    int countByExample(Banner banner);

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
    List<Banner> selectByExample(Banner banner , Integer pageNo , Integer pageSize);

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
    /**
     *小程序首页图片查询
     * @mbggenerated 2020-05-09
     */
    List<Banner> selectIndex();
}