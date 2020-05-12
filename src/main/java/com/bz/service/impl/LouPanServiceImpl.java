package com.bz.service.impl;

import com.bz.bean.LouPan;
import com.bz.bean.LouPanExample;
import com.bz.mapper.LouPanMapper;
import com.bz.service.LouPanService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LouPanServiceImpl implements LouPanService {

    @Autowired
    private LouPanMapper louPanMapper;

    @Override
    public int countByExample(LouPan louPan) {
        LouPanExample example = new LouPanExample();
        LouPanExample.Criteria criteria = example.createCriteria();
        if(louPan != null){
            if(StringUtil.isNotNull(louPan.getName())){
                criteria.andNameLike("%"+louPan.getName()+"%");
            }
            if(StringUtil.isNotNull(louPan.getZhuangtai())){
                criteria.andZhuangtaiEqualTo(louPan.getZhuangtai());
            }
            if(StringUtil.isNotNull(louPan.getIskaipan())){
                criteria.andIskaipanEqualTo(louPan.getIskaipan());
            }
            if(StringUtil.isNotNull(louPan.getZhanghaoid())){
                criteria.andZhanghaoidEqualTo(louPan.getZhanghaoid());
            }
        }
        return louPanMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return louPanMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LouPan record) {
        return louPanMapper.insert(record);
    }

    @Override
    public int insertSelective(LouPan record) {
        return louPanMapper.insertSelective(record);
    }

    @Override
    public List<LouPan> selectByExample(LouPan louPan, Integer pageNo, Integer pageSize) {
        LouPanExample example = new LouPanExample();
        LouPanExample.Criteria criteria = example.createCriteria();
        if(louPan != null){
            if(StringUtil.isNotNull(louPan.getName())){
                criteria.andNameLike("%"+louPan.getName()+"%");
            }
            if(StringUtil.isNotNull(louPan.getZhuangtai())){
                criteria.andZhuangtaiEqualTo(louPan.getZhuangtai());
            }
            if(StringUtil.isNotNull(louPan.getIskaipan())){
                criteria.andIskaipanEqualTo(louPan.getIskaipan());
            }
            if(StringUtil.isNotNull(louPan.getZhanghaoid())){
                criteria.andZhanghaoidEqualTo(louPan.getZhanghaoid());
            }
        }
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return louPanMapper.selectByExample(example);
    }

    @Override
    public LouPan selectByPrimaryKey(Integer id) {
        return louPanMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LouPan record) {
        return louPanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LouPan record) {
        return louPanMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<LouPan> selectNotKaiPan() {
        LouPanExample example = new LouPanExample();
        LouPanExample.Criteria criteria = example.createCriteria();
        criteria.andIskaipanEqualTo(0);
        criteria.andKaipanLessThan(new Date());
        return louPanMapper.selectByExample(example);
    }

    /**
     *loupan查询条件
     * pageNo第几页
     * pageSize每页多少条
     * type排序类型
     */
    @Override
    public List<LouPan> selectLouPan(LouPan louPan, Integer pageNo, Integer pageSize, Integer type , String jiage) {
        LouPanExample example = new LouPanExample();
        LouPanExample.Criteria criteria = example.createCriteria();
        if(louPan != null){
            if(StringUtil.isNotNull(louPan.getName())){
                criteria.andNameLike("%"+louPan.getName()+"%");
            }
            if(StringUtil.isNotNull(louPan.getZhuangtai())){
                criteria.andZhuangtaiEqualTo(louPan.getZhuangtai());
            }
            if(StringUtil.isNotNull(louPan.getJianmian())){
                criteria.andJianMianSubString_IndexEquals(louPan.getJianmian());
            }
            if(StringUtil.isNotNull(louPan.getFenleiid())){
                criteria.andFenleiidEqualTo(louPan.getFenleiid());
            }
            if(StringUtil.isNotNull(louPan.getQuyuid())){
                criteria.andQuyuidEqualTo(louPan.getQuyuid());
            }
            if(StringUtil.isNotNull(jiage)){
                criteria.andShoujiaLessThanOrEqualTo(Double.parseDouble((jiage.split("-")[1]).toString()));
                criteria.andShoujiaGreaterThanOrEqualTo(Double.parseDouble((jiage.split("-")[0]).toString()));
            }
            if(StringUtil.isNotNull(louPan.getHuxing())){
                criteria.andHuxingLike("%"+louPan.getHuxing()+"%");
            }
        }
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        example.setOrderByClause("id desc");
        return louPanMapper.selectByExample(example);
    }
}
