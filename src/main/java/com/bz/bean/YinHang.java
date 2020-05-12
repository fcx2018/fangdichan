package com.bz.bean;

import java.util.Date;

public class YinHang {
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
    private Date date;

    /**
     * 0不显示 1 显示
     */
    private Integer zhuangtai;

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
     * @return date 
     */
    public Date getDate() {
        return date;
    }

    /**
     * 
     * @param date 
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 0不显示 1 显示
     * @return zhuangtai 0不显示 1 显示
     */
    public Integer getZhuangtai() {
        return zhuangtai;
    }

    /**
     * 0不显示 1 显示
     * @param zhuangtai 0不显示 1 显示
     */
    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }
}