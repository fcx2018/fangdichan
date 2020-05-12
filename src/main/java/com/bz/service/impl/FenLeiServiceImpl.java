package com.bz.service.impl;

import com.bz.bean.FenLei;
import com.bz.bean.FenLeiExample;
import com.bz.mapper.FenLeiMapper;
import com.bz.service.FenLeiService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FenLeiServiceImpl implements FenLeiService {

    @Autowired
    private FenLeiMapper fenLeiMapper;

    @Override
    public int countByExample(FenLei fenlei) {
        FenLeiExample example = new FenLeiExample();
        return fenLeiMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return fenLeiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FenLei record) {
        return fenLeiMapper.insert(record);
    }

    @Override
    public int insertSelective(FenLei record) {
        return fenLeiMapper.insertSelective(record);
    }

    @Override
    public List<FenLei> selectByExample(FenLei fenlei , Integer pageNo , Integer pageSize) {
        FenLeiExample example = new FenLeiExample();
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return fenLeiMapper.selectByExample(example);
    }

    @Override
    public FenLei selectByPrimaryKey(Integer id) {
        return fenLeiMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FenLei record) {
        return fenLeiMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FenLei record) {
        return fenLeiMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<FenLei> selectIndex() {
        FenLeiExample example = new FenLeiExample();
        return fenLeiMapper.selectByExample(example);
    }
}
