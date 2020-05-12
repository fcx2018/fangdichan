package com.bz.bean;

import java.util.Date;

public class ZiJinMingXi {
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
    private String usernicheng;

    /**
     * 关联表id   返利为明细表 提现为提现表
     */
    private Integer keyid;

    /**
     * 
     */
    private Integer leixing;

    /**
     * 
     */
    private Double jine;

    /**
     * 审核账号id
     */
    private Integer adminid;

    /**
     * 
     */
    private Date shenheshijian;

    /**
     * 
     */
    private Date date;

    private Admin shenheren;

    private User user;

    private MingXi mingXi;

    private TiXianJiLu tiXianJiLu;

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

    public String getUsernicheng() {
        return usernicheng;
    }

    public void setUsernicheng(String usernicheng) {
        this.usernicheng = usernicheng;
    }

    /**
     * 关联表id   返利为明细表 提现为提现表
     * @return keyid 关联表id   返利为明细表 提现为提现表
     */
    public Integer getKeyid() {
        return keyid;
    }

    /**
     * 关联表id   返利为明细表 提现为提现表
     * @param keyid 关联表id   返利为明细表 提现为提现表
     */
    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }

    /**
     * 
     * @return leixing 
     */
    public Integer getLeixing() {
        return leixing;
    }

    /**
     * 
     * @param leixing 
     */
    public void setLeixing(Integer leixing) {
        this.leixing = leixing;
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
     * 审核账号id
     * @return adminid 审核账号id
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * 审核账号id
     * @param adminid 审核账号id
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * 
     * @return shenheshijian 
     */
    public Date getShenheshijian() {
        return shenheshijian;
    }

    /**
     * 
     * @param shenheshijian 
     */
    public void setShenheshijian(Date shenheshijian) {
        this.shenheshijian = shenheshijian;
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

    public Admin getShenheren() {
        return shenheren;
    }

    public void setShenheren(Admin shenheren) {
        this.shenheren = shenheren;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MingXi getMingXi() {
        return mingXi;
    }

    public void setMingXi(MingXi mingXi) {
        this.mingXi = mingXi;
    }

    public TiXianJiLu getTiXianJiLu() {
        return tiXianJiLu;
    }

    public void setTiXianJiLu(TiXianJiLu tiXianJiLu) {
        this.tiXianJiLu = tiXianJiLu;
    }
}