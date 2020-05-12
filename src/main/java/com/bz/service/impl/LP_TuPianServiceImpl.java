package com.bz.service.impl;

import com.bz.bean.LP_TuPian;
import com.bz.bean.LP_TuPianExample;
import com.bz.mapper.LP_TuPianMapper;
import com.bz.service.LP_TuPianService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LP_TuPianServiceImpl implements LP_TuPianService {

    @Autowired
    private LP_TuPianMapper lp_tuPianMapper;

    @Override
    public int countByExample(LP_TuPian lp_tuPian) {
        LP_TuPianExample example = new LP_TuPianExample();
        return lp_tuPianMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return lp_tuPianMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LP_TuPian record) {
        return lp_tuPianMapper.insert(record);
    }

    @Override
    public int insertSelective(LP_TuPian record) {
        return lp_tuPianMapper.insertSelective(record);
    }

    @Override
    public List<LP_TuPian> selectByExample(LP_TuPian lp_tuPian, Integer pageNo, Integer pageSize) {
        LP_TuPianExample example = new LP_TuPianExample();
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return lp_tuPianMapper.selectByExample(example);
    }

    @Override
    public LP_TuPian selectByPrimaryKey(Integer id) {
        return lp_tuPianMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LP_TuPian record) {
        return lp_tuPianMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LP_TuPian record) {
        return lp_tuPianMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delLouPanId(Integer lpid) {
        return lp_tuPianMapper.delLouPanId(lpid);
    }
}
