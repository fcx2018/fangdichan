package com.bz.service.impl;

import com.bz.bean.ZiJinMingXi;
import com.bz.bean.ZiJinMingXiExample;
import com.bz.mapper.ZiJinMingXiMapper;
import com.bz.service.ZiJinMingXiService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZiJinMingXiServiceImpl implements ZiJinMingXiService {

    @Autowired
    private ZiJinMingXiMapper ziJinMingXiMapper;

    @Override
    public int countByExample(ZiJinMingXi ziJinMingXi) {
        ZiJinMingXiExample example = new ZiJinMingXiExample();
        ZiJinMingXiExample.Criteria criteria = example.createCriteria();
        if(ziJinMingXi != null){
            if(StringUtil.isNotNull(ziJinMingXi.getUsernicheng())){
                criteria.andUsernichengNotEqualTo(ziJinMingXi.getUsernicheng());
            }
        }
        return ziJinMingXiMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ziJinMingXiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ZiJinMingXi record) {
        return ziJinMingXiMapper.insert(record);
    }

    @Override
    public int insertSelective(ZiJinMingXi record) {
        return ziJinMingXiMapper.insertSelective(record);
    }

    @Override
    public List<ZiJinMingXi> selectByExample(ZiJinMingXi ziJinMingXi, Integer pageNo, Integer pageSize) {
        ZiJinMingXiExample example = new ZiJinMingXiExample();
        ZiJinMingXiExample.Criteria criteria = example.createCriteria();
        if(ziJinMingXi != null){
            if(StringUtil.isNotNull(ziJinMingXi.getUsernicheng())){
                criteria.andUsernichengNotEqualTo(ziJinMingXi.getUsernicheng());
            }
            if(StringUtil.isNotNull(ziJinMingXi.getUserid())){
                criteria.andUseridEqualTo(ziJinMingXi.getUserid());
            }
        }
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return ziJinMingXiMapper.selectByExample(example);
    }

    @Override
    public ZiJinMingXi selectByPrimaryKey(Integer id) {
        return ziJinMingXiMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ZiJinMingXi record) {
        return ziJinMingXiMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ZiJinMingXi record) {
        return ziJinMingXiMapper.updateByPrimaryKey(record);
    }
}
