package com.bz.service.impl;

import com.bz.bean.CanShuSheZhi;
import com.bz.bean.CanShuSheZhiExample;
import com.bz.mapper.CanShuSheZhiMapper;
import com.bz.service.CanShuShiZhiService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanShuShiZhiServiceImpl implements CanShuShiZhiService {

    @Autowired
    private CanShuSheZhiMapper canShuSheZhiMapper;

    @Override
    public int countByExample(CanShuSheZhi CanShuSheZhi) {
        CanShuSheZhiExample example = new CanShuSheZhiExample();
        return canShuSheZhiMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return canShuSheZhiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CanShuSheZhi record) {
        return canShuSheZhiMapper.insert(record);
    }

    @Override
    public int insertSelective(CanShuSheZhi record) {
        return canShuSheZhiMapper.insertSelective(record);
    }

    @Override
    public List<CanShuSheZhi> selectByExample(CanShuSheZhi CanShuSheZhi , Integer pageNo , Integer pageSize) {
        CanShuSheZhiExample example = new CanShuSheZhiExample();
        CanShuSheZhiExample.Criteria criteria = example.createCriteria();
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return canShuSheZhiMapper.selectByExample(example);
    }

    @Override
    public CanShuSheZhi selectByPrimaryKey(Integer id) {
        return canShuSheZhiMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CanShuSheZhi record) {
        return canShuSheZhiMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CanShuSheZhi record) {
        return canShuSheZhiMapper.updateByPrimaryKey(record);
    }
}
