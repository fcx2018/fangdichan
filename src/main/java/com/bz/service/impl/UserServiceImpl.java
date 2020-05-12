package com.bz.service.impl;

import com.bz.bean.User;
import com.bz.bean.UserExample;
import com.bz.mapper.FenLeiMapper;
import com.bz.mapper.UserMapper;
import com.bz.service.UserService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private FenLeiMapper fenLeiMapper;

    @Override
    public int countByExample(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (user != null ){
            if(StringUtil.isNotNull(user.getXingming())){
                criteria.andXingmingEqualTo(user.getXingming());
            }
            if(StringUtil.isNotNull(user.getShoujihao())){
                criteria.andShoujihaoEqualTo(user.getShoujihao());
            }
        }
        return userMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (user != null ){
            if(StringUtil.isNotNull(user.getXingming())){
                criteria.andXingmingEqualTo(user.getXingming());
            }
            if(StringUtil.isNotNull(user.getShoujihao())){
                criteria.andShoujihaoEqualTo(user.getShoujihao());
            }
        }
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User getOpenid(String openid) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andOpenidEqualTo(openid);
        List<User> list = userMapper.selectByExample(example);
        return list.size()>0 ? list.get(0) : null;
    }

    @Override
    public User getId(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        String yiXiangLeiXing = "";
        if(StringUtil.isNotNull(user.getYixiangleixing())){
            for (String i:user.getYixiangleixing().split(",")) {
                yiXiangLeiXing += fenLeiMapper.selectByPrimaryKey(Integer.parseInt(i)).getName();
            }
            user.setYixiangleixings(yiXiangLeiXing);
        }
        return user;
    }
}
