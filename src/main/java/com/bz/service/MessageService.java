package com.bz.service;

import com.bz.bean.Message;

import java.util.List;

public interface MessageService {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(Message message);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insert(Message record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int insertSelective(Message record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    List<Message> selectByExample(Message message , Integer pageNo , Integer pageSize);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    Message selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     *
     * @mbggenerated 2020-04-25
     */
    int updateByPrimaryKey(Message record);

    List<Message> selectIndex();
}