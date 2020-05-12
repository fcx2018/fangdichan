package com.bz.service.impl;

import com.bz.bean.QuanXian;
import com.bz.bean.QuanXianExample;
import com.bz.mapper.QuanXianMapper;
import com.bz.service.QuanXianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuanXianServiceImpl implements QuanXianService {

    @Autowired
    private QuanXianMapper quanXianMapper;

    @Override
    public int countByExample(QuanXian quanXian) {
        QuanXianExample example = new QuanXianExample();
        return quanXianMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return quanXianMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(QuanXian record) {
        return quanXianMapper.insert(record);
    }

    @Override
    public int insertSelective(QuanXian record) {
        return quanXianMapper.insertSelective(record);
    }

    @Override
    public List<QuanXian> selectByExample(QuanXian quanXian, Integer pageNo, Integer pageSize) {
        QuanXianExample example = new QuanXianExample();
        return quanXianMapper.selectByExample(example);
    }

    @Override
    public QuanXian selectByPrimaryKey(Integer id) {
        return quanXianMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(QuanXian record) {
        return quanXianMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(QuanXian record) {
        return quanXianMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<QuanXian> getAll() {
        return quanXianMapper.selectByExample(null);
    }
}
