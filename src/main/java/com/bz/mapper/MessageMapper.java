package com.bz.mapper;

import com.bz.bean.Message;
import com.bz.bean.MessageExample;

import java.util.List;

public interface MessageMapper {
    /**
     *
     * @mbggenerated 2020-04-25
     */
    int countByExample(MessageExample example);

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
    List<Message> selectByExample(MessageExample example);

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