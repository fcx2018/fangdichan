package com.bz.service;

import com.bz.bean.User;

import java.util.List;

public interface UserService {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(User user);

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
    List<User> selectByExample(User user);

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

    User getOpenid(String openid);
    /**
     *返回对象中有意向类型的字符串
     * @mbggenerated 2020-04-25
     */
    User getId(Integer id);
}