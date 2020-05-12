package com.bz.service.impl;

import com.bz.bean.Admin;
import com.bz.bean.AdminExample;
import com.bz.mapper.AdminMapper;
import com.bz.service.AdminService;
import com.bz.util.SecuritySHA1Utils;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired(required=true)
    private AdminMapper adminMapper;

    @Override
    public int countByExample(Admin admin) {
        AdminExample example = new AdminExample();
        return adminMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return adminMapper.insertSelective(record);
    }

    @Override
    public List<Admin> selectByExample(Admin admin, Integer pageNo, Integer pageSize) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        if(admin != null){
            if(StringUtil.isNotNull(admin.getId())){
                criteria.andIdEqualTo(admin.getId());
            }
            if(StringUtil.isNotNull(admin.getZhanghao())){
                criteria.andZhanghaoEqualTo(admin.getZhanghao());
            }
            if(StringUtil.isNotNull(admin.getQuanxian())){
                criteria.andQuanxianEqualTo(admin.getQuanxian());
            }
        }
        if(StringUtil.isNotNull(pageSize) && StringUtil.isNotNull(pageNo)){
            example.setCount(pageSize);
            example.setLimitStart((pageNo-1)*pageSize);
        }
        return adminMapper.selectByExample(example);
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return adminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return adminMapper.updateByPrimaryKey(record);
    }

    @Override
    public Admin login(Admin record) {
        if(record != null){
            if(StringUtil.isNotNull(record.getZhanghao()) && StringUtil.isNotNull(record.getMima())){
                try {
                    System.out.println(SecuritySHA1Utils.shaEncode(record.getMima()));
                    record.setMima(SecuritySHA1Utils.shaEncode(record.getMima()));
                    AdminExample example = new AdminExample();
                    AdminExample.Criteria criteria = example.createCriteria();
                    criteria.andZhanghaoEqualTo(record.getZhanghao());
                    criteria.andMimaEqualTo(record.getMima());
                    List<Admin> list = adminMapper.selectByExample(example);
                    if (list != null && list.size()>0){
                        return list.get(0);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public Integer getZhangHao(String zhanghao) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andZhanghaoEqualTo(zhanghao);
        return adminMapper.selectByExample(example).size();
    }
}
