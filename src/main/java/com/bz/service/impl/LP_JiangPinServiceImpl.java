package com.bz.service.impl;

import com.bz.bean.LP_JiangPin;
import com.bz.bean.LP_JiangPinExample;
import com.bz.mapper.LP_JiangPinMapper;
import com.bz.service.LP_JiangPinService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LP_JiangPinServiceImpl implements LP_JiangPinService {

    @Autowired
    private LP_JiangPinMapper lp_jiangPinMapper;

    @Override
    public int countByExample(LP_JiangPin lp_jiangPin) {
        LP_JiangPinExample example = new LP_JiangPinExample();
        LP_JiangPinExample.Criteria criteria = example.createCriteria();
        if(lp_jiangPin != null){
            if(StringUtil.isNotNull(lp_jiangPin.getLoupanid())){
                criteria.andLoupanidEqualTo(lp_jiangPin.getLoupanid());
            }
        }
        return lp_jiangPinMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return lp_jiangPinMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteloupanid(Integer id) {
        return lp_jiangPinMapper.deleteloupanid(id);
    }

    @Override
    public int insert(LP_JiangPin record) {
        return lp_jiangPinMapper.insert(record);
    }

    @Override
    public int insertSelective(LP_JiangPin record) {
        return lp_jiangPinMapper.insertSelective(record);
    }

    @Override
    public List<LP_JiangPin> selectByExample(LP_JiangPin lp_jiangPin, Integer pageNo, Integer pageSize) {
        LP_JiangPinExample example = new LP_JiangPinExample();
        LP_JiangPinExample.Criteria criteria = example.createCriteria();
        if(lp_jiangPin != null){
            if(StringUtil.isNotNull(lp_jiangPin.getLoupanid())){
                criteria.andLoupanidEqualTo(lp_jiangPin.getLoupanid());
            }
        }
        if(StringUtil.isNotNull(pageNo)&&StringUtil.isNotNull(pageSize)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return lp_jiangPinMapper.selectByExample(example);
    }

    @Override
    public LP_JiangPin selectByPrimaryKey(Integer id) {
        return lp_jiangPinMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LP_JiangPin record) {
        return lp_jiangPinMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LP_JiangPin record) {
        return lp_jiangPinMapper.updateByPrimaryKey(record);
    }
}
