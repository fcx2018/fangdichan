package com.bz.service.impl;

import com.bz.bean.Message;
import com.bz.bean.MessageExample;
import com.bz.mapper.MessageMapper;
import com.bz.service.MessageService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;


    @Override
    public int countByExample(Message message) {
        MessageExample example = new MessageExample();
        MessageExample.Criteria criteria = example.createCriteria();
        if(message != null){
            if(StringUtil.isNotNull(message.getName())){
                criteria.andNameLike("%"+message.getName()+"%");
            }
            if(StringUtil.isNotNull(message.getZhuangtai())){
                criteria.andZhuangtaiEqualTo(message.getZhuangtai());
            }
        }
        return messageMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Message record) {
        return messageMapper.insert(record);
    }

    @Override
    public int insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public List<Message> selectByExample(Message message, Integer pageNo, Integer pageSize) {
        MessageExample example = new MessageExample();
        MessageExample.Criteria criteria = example.createCriteria();
        if(message != null){
            if(StringUtil.isNotNull(message.getName())){
                criteria.andNameLike("%"+message.getName()+"%");
            }
            if(StringUtil.isNotNull(message.getZhuangtai())){
                criteria.andZhuangtaiEqualTo(message.getZhuangtai());
            }
        }
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return messageMapper.selectByExample(example);
    }

    @Override
    public Message selectByPrimaryKey(Integer id) {
        return messageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Message record) {
        return messageMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Message> selectIndex() {
        return messageMapper.selectIndex();
    }
}
