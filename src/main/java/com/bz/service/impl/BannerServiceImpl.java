package com.bz.service.impl;

import com.bz.bean.Banner;
import com.bz.bean.BannerExample;
import com.bz.mapper.BannerMapper;
import com.bz.service.BannerService;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    
    @Autowired
    private BannerMapper bannerMapper;
    
    @Override
    public int countByExample(Banner banner) {
        BannerExample example = new BannerExample();
        return bannerMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return bannerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Banner record) {
        return bannerMapper.insert(record);
    }

    @Override
    public int insertSelective(Banner record) {
        return bannerMapper.insertSelective(record);
    }

    @Override
    public List<Banner> selectByExample(Banner banner, Integer pageNo, Integer pageSize) {
        BannerExample example = new BannerExample();
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return bannerMapper.selectByExample(example);
    }

    @Override
    public Banner selectByPrimaryKey(Integer id) {
        return bannerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Banner record) {
        return bannerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Banner record) {
        return bannerMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Banner> selectIndex() {
        BannerExample example = new BannerExample();
        BannerExample.Criteria criteria = example.createCriteria();
        return bannerMapper.selectByExample(example);
    }
}
