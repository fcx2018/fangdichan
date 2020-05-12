package com.bz.service.impl;

import com.bz.bean.MingXi;
import com.bz.bean.MingXiExample;
import com.bz.mapper.MingXiMapper;
import com.bz.service.MingXiService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MingXiServiceImpl implements MingXiService {
    
    @Autowired
    private MingXiMapper mingXiMapper;
    
    @Override
    public int countByExample(MingXi mingXi) {
        MingXiExample example = new MingXiExample();
        MingXiExample.Criteria criteria = example.createCriteria();
        if(mingXi != null){
            if (StringUtil.isNotNull(mingXi.getUsername())){
                criteria.andUsernameLike("%"+mingXi.getUsername()+"%");
            }
        }
        return mingXiMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mingXiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MingXi record) {
        return mingXiMapper.insert(record);
    }

    @Override
    public int insertSelective(MingXi record) {
        return mingXiMapper.insertSelective(record);
    }

    @Override
    public List<MingXi> selectByExample(MingXi mingXi , Integer pageNo , Integer pageSize) {
        MingXiExample example = new MingXiExample();
        MingXiExample.Criteria criteria = example.createCriteria();
        if(mingXi != null){
            if (StringUtil.isNotNull(mingXi.getUsername())){
                criteria.andUsernameLike("%"+mingXi.getUsername()+"%");
            }
        }
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return mingXiMapper.selectByExample(example);
    }

    @Override
    public MingXi selectByPrimaryKey(Integer id) {
        return mingXiMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MingXi record) {
        return mingXiMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MingXi record) {
        return mingXiMapper.updateByPrimaryKey(record);
    }
}
