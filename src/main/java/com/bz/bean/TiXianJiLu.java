package com.bz.bean;

import java.util.Date;

public class TiXianJiLu {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer userid;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private Double jine;

    /**
     * 0未审核 1已通过 1未通过
     */
    private Integer zhuangtai;

    /**
     * 1支付宝 2微信 3银行
     */
    private Integer leixing;

    /**
     * 创建时间
     */
    private Date chuangjianshijian;

    /**
     * 审核时间
     */
    private Date shenheshijian;

    /**
     * 审核人id
     */
    private Integer shenheid;

    /**
     * 支付宝账号
     */
    private String zhanghao;

    /**
     * 微型收款码
     */
    private String tupian;

    /**
     * 银行总行id
     */
    private Integer yinhangid;

    /**
     * 银行名
     */
    private String yinhangming;

    /**
     * 支行名
     */
    private String zhihangming;

    /**
     * 银行卡号
     */
    private String yinhangka;

    /**
     * 预留姓名
     */
    private String yuliuxingming;

    /**
     * 预留姓名
     */
    private Admin shenheren;

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
     * @return userid 
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 
     * @param userid 
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 
     * @return username 
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return jine 
     */
    public Double getJine() {
        return jine;
    }

    /**
     * 
     * @param jine 
     */
    public void setJine(Double jine) {
        this.jine = jine;
    }

    /**
     * 0未审核 1已通过 1未通过
     * @return zhuangtai 0未审核 1已通过 1未通过
     */
    public Integer getZhuangtai() {
        return zhuangtai;
    }

    /**
     * 0未审核 1已通过 1未通过
     * @param zhuangtai 0未审核 1已通过 1未通过
     */
    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    /**
     * 1支付宝 2微信 3银行
     * @return leixing 1支付宝 2微信 3银行
     */
    public Integer getLeixing() {
        return leixing;
    }

    /**
     * 1支付宝 2微信 3银行
     * @param leixing 1支付宝 2微信 3银行
     */
    public void setLeixing(Integer leixing) {
        this.leixing = leixing;
    }

    /**
     * 创建时间
     * @return chuangjianshijian 创建时间
     */
    public Date getChuangjianshijian() {
        return chuangjianshijian;
    }

    /**
     * 创建时间
     * @param chuangjianshijian 创建时间
     */
    public void setChuangjianshijian(Date chuangjianshijian) {
        this.chuangjianshijian = chuangjianshijian;
    }

    /**
     * 审核时间
     * @return shenheshijian 审核时间
     */
    public Date getShenheshijian() {
        return shenheshijian;
    }

    /**
     * 审核时间
     * @param shenheshijian 审核时间
     */
    public void setShenheshijian(Date shenheshijian) {
        this.shenheshijian = shenheshijian;
    }

    /**
     * 审核人id
     * @return shenheid 审核人id
     */
    public Integer getShenheid() {
        return shenheid;
    }

    /**
     * 审核人id
     * @param shenheid 审核人id
     */
    public void setShenheid(Integer shenheid) {
        this.shenheid = shenheid;
    }

    /**
     * 支付宝账号
     * @return zhanghao 支付宝账号
     */
    public String getZhanghao() {
        return zhanghao;
    }

    /**
     * 支付宝账号
     * @param zhanghao 支付宝账号
     */
    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao;
    }

    /**
     * 微型收款码
     * @return tupian 微型收款码
     */
    public String getTupian() {
        return tupian;
    }

    /**
     * 微型收款码
     * @param tupian 微型收款码
     */
    public void setTupian(String tupian) {
        this.tupian = tupian;
    }

    /**
     * 银行总行id
     * @return yinhangid 银行总行id
     */
    public Integer getYinhangid() {
        return yinhangid;
    }

    /**
     * 银行总行id
     * @param yinhangid 银行总行id
     */
    public void setYinhangid(Integer yinhangid) {
        this.yinhangid = yinhangid;
    }

    /**
     * 银行名
     * @return yinhangming 银行名
     */
    public String getYinhangming() {
        return yinhangming;
    }

    /**
     * 银行名
     * @param yinhangming 银行名
     */
    public void setYinhangming(String yinhangming) {
        this.yinhangming = yinhangming;
    }

    /**
     * 支行名
     * @return zhihangming 支行名
     */
    public String getZhihangming() {
        return zhihangming;
    }

    /**
     * 支行名
     * @param zhihangming 支行名
     */
    public void setZhihangming(String zhihangming) {
        this.zhihangming = zhihangming;
    }

    /**
     * 银行卡号
     * @return yinhangka 银行卡号
     */
    public String getYinhangka() {
        return yinhangka;
    }

    /**
     * 银行卡号
     * @param yinhangka 银行卡号
     */
    public void setYinhangka(String yinhangka) {
        this.yinhangka = yinhangka;
    }

    /**
     * 预留姓名
     * @return yuliuxingming 预留姓名
     */
    public String getYuliuxingming() {
        return yuliuxingming;
    }

    /**
     * 预留姓名
     * @param yuliuxingming 预留姓名
     */
    public void setYuliuxingming(String yuliuxingming) {
        this.yuliuxingming = yuliuxingming;
    }

    public Admin getShenheren() {
        return shenheren;
    }

    public void setShenheren(Admin shenheren) {
        this.shenheren = shenheren;
    }
}