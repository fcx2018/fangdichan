package com.bz.service.impl;

import com.bz.bean.TiXianJiLu;
import com.bz.bean.TiXianJiLuExample;
import com.bz.mapper.TiXianJiLuMapper;
import com.bz.service.TiXianJiLuService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiXianJiLuServiceImpl implements TiXianJiLuService {

    @Autowired
    private TiXianJiLuMapper tiXianJiLuMapper;

    @Override
    public int countByExample(TiXianJiLu tiXianJiLu) {
        TiXianJiLuExample example = new TiXianJiLuExample();
        TiXianJiLuExample.Criteria criteria = example.createCriteria();
        if(tiXianJiLu !=null){
            if(StringUtil.isNotNull(tiXianJiLu.getUsername())){
                criteria.andUsernameLike("%"+tiXianJiLu.getUsername()+"%");
            }
        }
        return tiXianJiLuMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tiXianJiLuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TiXianJiLu record) {
        return tiXianJiLuMapper.insert(record);
    }

    @Override
    public int insertSelective(TiXianJiLu record) {
        return tiXianJiLuMapper.insertSelective(record);
    }

    @Override
    public List<TiXianJiLu> selectByExample(TiXianJiLu tiXianJiLu, Integer pageNo, Integer pageSize) {
        TiXianJiLuExample example = new TiXianJiLuExample();
        TiXianJiLuExample.Criteria criteria = example.createCriteria();
        if(tiXianJiLu !=null){
            if(StringUtil.isNotNull(tiXianJiLu.getUsername())){
                criteria.andUsernameLike("%"+tiXianJiLu.getUsername()+"%");
            }
        }
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return tiXianJiLuMapper.selectByExample(example);
    }

    @Override
    public TiXianJiLu selectByPrimaryKey(Integer id) {
        return tiXianJiLuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TiXianJiLu record) {
        return tiXianJiLuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TiXianJiLu record) {
        return tiXianJiLuMapper.updateByPrimaryKey(record);
    }
}
