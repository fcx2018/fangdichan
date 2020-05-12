package com.bz.bean;

import java.util.Date;

public class MingXi {
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
    private String zhanghao;

    /**
     * 分享金状态 0未激活 1已激活
     */
    private Integer isfxjzt;

    /**
     * 分享金金额
     */
    private Double fenxiangjin;

    /**
     * 佣金状态 0未激活 1已激活
     */
    private Integer isyjzt;

    /**
     * 佣金金额
     */
    private Double yongjin;

    /**
     * 金额 提现金额 /分享金+佣金总额
     */
    private Double jine;

    /**
     * 状态    提现       0未审核  1 未通过 2 已通过 分享金+佣金总额   0 未激活 1已激活
     */
    private Integer zhuangtai;

    /**
     * 1分享 2佣金 3提现
     */
    private Integer type;

    /**
     * 返佣人的id
     */
    private Integer fanyongid;

    /**
     * 返佣人的姓名
     */
    private String fanyongname;

    /**
     * 创建时间
     */
    private Date shijian;

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
     * @return zhanghao 
     */
    public String getZhanghao() {
        return zhanghao;
    }

    /**
     * 
     * @param zhanghao 
     */
    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao;
    }

    /**
     * 分享金状态 0未激活 1已激活
     * @return isfxjzt 分享金状态 0未激活 1已激活
     */
    public Integer getIsfxjzt() {
        return isfxjzt;
    }

    /**
     * 分享金状态 0未激活 1已激活
     * @param isfxjzt 分享金状态 0未激活 1已激活
     */
    public void setIsfxjzt(Integer isfxjzt) {
        this.isfxjzt = isfxjzt;
    }

    /**
     * 分享金金额
     * @return fenxiangjin 分享金金额
     */
    public Double getFenxiangjin() {
        return fenxiangjin;
    }

    /**
     * 分享金金额
     * @param fenxiangjin 分享金金额
     */
    public void setFenxiangjin(Double fenxiangjin) {
        this.fenxiangjin = fenxiangjin;
    }

    /**
     * 佣金状态 0未激活 1已激活
     * @return isyjzt 佣金状态 0未激活 1已激活
     */
    public Integer getIsyjzt() {
        return isyjzt;
    }

    /**
     * 佣金状态 0未激活 1已激活
     * @param isyjzt 佣金状态 0未激活 1已激活
     */
    public void setIsyjzt(Integer isyjzt) {
        this.isyjzt = isyjzt;
    }

    /**
     * 佣金金额
     * @return yongjin 佣金金额
     */
    public Double getYongjin() {
        return yongjin;
    }

    /**
     * 佣金金额
     * @param yongjin 佣金金额
     */
    public void setYongjin(Double yongjin) {
        this.yongjin = yongjin;
    }

    /**
     * 金额 提现金额 /分享金+佣金总额
     * @return jine 金额 提现金额 /分享金+佣金总额
     */
    public Double getJine() {
        return jine;
    }

    /**
     * 金额 提现金额 /分享金+佣金总额
     * @param jine 金额 提现金额 /分享金+佣金总额
     */
    public void setJine(Double jine) {
        this.jine = jine;
    }

    /**
     * 状态    提现       0未审核  1 未通过 2 已通过 分享金+佣金总额   0 未激活 1已激活
     * @return zhuangtai 状态    提现       0未审核  1 未通过 2 已通过 分享金+佣金总额   0 未激活 1已激活
     */
    public Integer getZhuangtai() {
        return zhuangtai;
    }

    /**
     * 状态    提现       0未审核  1 未通过 2 已通过 分享金+佣金总额   0 未激活 1已激活
     * @param zhuangtai 状态    提现       0未审核  1 未通过 2 已通过 分享金+佣金总额   0 未激活 1已激活
     */
    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    /**
     * 1分享 2佣金 3提现
     * @return type 1分享 2佣金 3提现
     */
    public Integer getType() {
        return type;
    }

    /**
     * 1分享 2佣金 3提现
     * @param type 1分享 2佣金 3提现
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 返佣人的id
     * @return fanyongid 返佣人的id
     */
    public Integer getFanyongid() {
        return fanyongid;
    }

    /**
     * 返佣人的id
     * @param fanyongid 返佣人的id
     */
    public void setFanyongid(Integer fanyongid) {
        this.fanyongid = fanyongid;
    }

    /**
     * 返佣人的姓名
     * @return fanyongname 返佣人的姓名
     */
    public String getFanyongname() {
        return fanyongname;
    }

    /**
     * 返佣人的姓名
     * @param fanyongname 返佣人的姓名
     */
    public void setFanyongname(String fanyongname) {
        this.fanyongname = fanyongname;
    }

    /**
     * 创建时间
     * @return shijian 创建时间
     */
    public Date getShijian() {
        return shijian;
    }

    /**
     * 创建时间
     * @param shijian 创建时间
     */
    public void setShijian(Date shijian) {
        this.shijian = shijian;
    }
}