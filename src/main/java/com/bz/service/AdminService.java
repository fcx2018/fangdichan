package com.bz.service;

import com.bz.bean.Admin;

import java.util.List;

public interface AdminService {
    /**
     *
     * @mbggenerated 2020-04-21
     */
    int countByExample(Admin admin);

    /**
     *
     * @mbggenerated 2020-04-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-21
     */
    int insert(Admin record);

    /**
     *
     * @mbggenerated 2020-04-21
     */
    int insertSelective(Admin record);

    /**
     *
     * @mbggenerated 2020-04-21
     */
    List<Admin> selectByExample(Admin admin , Integer pageNo, Integer pageSize);

    /**
     *
     * @mbggenerated 2020-04-21
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-21
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     *
     * @mbggenerated 2020-04-21
     */
    int updateByPrimaryKey(Admin record);

    Admin login(Admin record);

    Integer getZhangHao(String zhanghao);
}
