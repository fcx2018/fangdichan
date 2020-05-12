package com.bz.bean;

import java.util.HashMap;
import java.util.Map;

public class QuanXian {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String quanxian;

    /**
     *
     */
    private String miaoshu;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return quanxian 
     */
    public String getQuanxian() {
        return quanxian;
    }

    /**
     * 
     * @param quanxian 
     */
    public void setQuanxian(String quanxian) {
        this.quanxian = quanxian;
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }

    public Map<String , Object> getQuanXianMap(){
        Map<String , Object> map = new HashMap<>();
        for (String qx: quanxian.split(",")) {
            map.put(qx,qx);
        }
        return map;
    }
}