package com.bz.bean;

import java.util.Date;

public class Banner {
    /**
     * 
     */
    private Integer id;

    /**
     * 标题
     */
    private String name;

    /**
     * 图片路径
     */
    private String tupian;

    /**
     * 添加图片账号
     */
    private Integer zhanghao;

    /**
     * 添加时间
     */
    private Date date;

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
     * 标题
     * @return name 标题
     */
    public String getName() {
        return name;
    }

    /**
     * 标题
     * @param name 标题
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 图片路径
     * @return tupian 图片路径
     */
    public String getTupian() {
        return tupian;
    }

    /**
     * 图片路径
     * @param tupian 图片路径
     */
    public void setTupian(String tupian) {
        this.tupian = tupian;
    }

    /**
     * 添加图片账号
     * @return zhanghao 添加图片账号
     */
    public Integer getZhanghao() {
        return zhanghao;
    }

    /**
     * 添加图片账号
     * @param zhanghao 添加图片账号
     */
    public void setZhanghao(Integer zhanghao) {
        this.zhanghao = zhanghao;
    }

    /**
     * 添加时间
     * @return date 添加时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 添加时间
     * @param date 添加时间
     */
    public void setDate(Date date) {
        this.date = date;
    }
}