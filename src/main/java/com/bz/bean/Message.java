package com.bz.bean;

import java.util.Date;

public class Message {
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
    private String lianjie;

    /**
     * 
     */
    private Date date;

    /**
     * 1显示 0 不显示
     */
    private Integer zhuangtai;

    /**
     * 
     */
    private String value;

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
     * @return lianjie 
     */
    public String getLianjie() {
        return lianjie;
    }

    /**
     * 
     * @param lianjie 
     */
    public void setLianjie(String lianjie) {
        this.lianjie = lianjie;
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
     * 1显示 0 不显示
     * @return zhuangtai 1显示 0 不显示
     */
    public Integer getZhuangtai() {
        return zhuangtai;
    }

    /**
     * 1显示 0 不显示
     * @param zhuangtai 1显示 0 不显示
     */
    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    /**
     * 
     * @return value 
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value 
     */
    public void setValue(String value) {
        this.value = value;
    }
}