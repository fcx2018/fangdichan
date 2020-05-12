package com.bz.service.impl;

import com.bz.bean.YinHang;
import com.bz.bean.YinHangExample;
import com.bz.mapper.YinHangMapper;
import com.bz.service.YinHangService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YinHangSerivceImpl implements YinHangService {

    @Autowired
    private YinHangMapper yinHangMapper;

    @Override
    public int countByExample(YinHang yinHang) {
        YinHangExample example = new YinHangExample();
        return yinHangMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return yinHangMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(YinHang record) {
        return yinHangMapper.insert(record);
    }

    @Override
    public int insertSelective(YinHang record) {
        return yinHangMapper.insertSelective(record);
    }

    @Override
    public List<YinHang> selectByExample(YinHang yinHang , Integer pageNo , Integer pageSize) {
        YinHangExample example = new YinHangExample();
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return yinHangMapper.selectByExample(example);
    }

    @Override
    public YinHang selectByPrimaryKey(Integer id) {
        return yinHangMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(YinHang record) {
        return yinHangMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(YinHang record) {
        return yinHangMapper.updateByPrimaryKey(record);
    }
}
