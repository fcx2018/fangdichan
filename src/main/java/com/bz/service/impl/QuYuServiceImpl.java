package com.bz.service.impl;

import com.bz.bean.QuYu;
import com.bz.bean.QuYuExample;
import com.bz.mapper.QuYuMapper;
import com.bz.service.QuYuService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuYuServiceImpl implements QuYuService {

    @Autowired
    private QuYuMapper quYuMapper;

    @Override
    public int countByExample(QuYu quYu) {
        QuYuExample example = new QuYuExample();
        return quYuMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return quYuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(QuYu record) {
        return quYuMapper.insert(record);
    }

    @Override
    public int insertSelective(QuYu record) {
        return quYuMapper.insertSelective(record);
    }

    @Override
    public List<QuYu> selectByExample(QuYu quYu , Integer pageNo, Integer pageSize ) {
        QuYuExample example = new QuYuExample();
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return quYuMapper.selectByExample(example);
    }

    @Override
    public QuYu selectByPrimaryKey(Integer id) {
        return quYuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(QuYu record) {
        return quYuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(QuYu record) {
        return quYuMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<QuYu> getAll() {
        return quYuMapper.selectByExample(null);
    }
}
