package com.bz.mapper;

import com.bz.bean.Admin;
import com.bz.bean.AdminExample;

import java.util.List;

public interface AdminMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(AdminExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(Admin record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(Admin record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<Admin> selectByExample(AdminExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(Admin record);
}