package com.bz.mapper;

import com.bz.bean.User;
import com.bz.bean.UserExample;

import java.util.List;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(UserExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(User record);
}