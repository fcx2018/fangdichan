package com.bz.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class LouPan {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer zhanghaoid;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String bieming;

    /**
     * 
     */
    private String zhutu;

    /**
     * 
     */
    private Double shoujia;

    /**
     * 
     */
    private Double junjia;

    /**
     * 
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date kaipan;

    /**
     * 
     */
    private Integer iskaipan;

    /**
     * 
     */
    private String huxing;

    /**
     * 
     */
    private String jianmian;

    /**
     * 
     */
    private String dizhi;

    /**
     * 
     */
    private Double yongjin;

    /**
     * 
     */
    private Double fenxiang;

    /**
     * 
     */
    private String dianhua;

    /**
     * 
     */
    private String biaoqian;
    /**
     *
     */
    private String[] biaoqians ;

    /**
     *
     */
    private String jieshao;

    /**
     *
     */
    private String yongjinjieshao;

    /**
     *
     */
    private Integer zhuangtai;

    private List<LP_TuPian> LP_TP_list;

    private Admin faburen;

    private Integer fenleiid;

    private FenLei fenLei;

    private Integer quyuid;

    private QuYu quYu;

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
     * @return zhanghaoid 
     */
    public Integer getZhanghaoid() {
        return zhanghaoid;
    }

    public List<LP_TuPian> getLP_TP_list() {
        return LP_TP_list;
    }

    public void setLP_TP_list(List<LP_TuPian> LP_TP_list) {
        this.LP_TP_list = LP_TP_list;
    }

    /**
     * 
     * @param zhanghaoid 
     */
    public void setZhanghaoid(Integer zhanghaoid) {
        this.zhanghaoid = zhanghaoid;
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
     * @return bieming 
     */
    public String getBieming() {
        return bieming;
    }

    /**
     * 
     * @param bieming 
     */
    public void setBieming(String bieming) {
        this.bieming = bieming;
    }

    /**
     * 
     * @return zhutu 
     */
    public String getZhutu() {
        return zhutu;
    }

    /**
     * 
     * @param zhutu 
     */
    public void setZhutu(String zhutu) {
        this.zhutu = zhutu;
    }

    /**
     * 
     * @return shoujia 
     */
    public Double getShoujia() {
        return shoujia;
    }

    /**
     * 
     * @param shoujia 
     */
    public void setShoujia(Double shoujia) {
        this.shoujia = shoujia;
    }

    /**
     * 
     * @return junjia 
     */
    public Double getJunjia() {
        return junjia;
    }

    /**
     * 
     * @param junjia 
     */
    public void setJunjia(Double junjia) {
        this.junjia = junjia;
    }

    /**
     * 
     * @return kaipan 
     */
    public Date getKaipan() {
        return kaipan;
    }

    /**
     * 
     * @param kaipan 
     */
    public void setKaipan(Date kaipan) {
        this.kaipan = kaipan;
    }

    /**
     * 
     * @return iskaipan 
     */
    public Integer getIskaipan() {
        return iskaipan;
    }

    /**
     * 
     * @param iskaipan 
     */
    public void setIskaipan(Integer iskaipan) {
        this.iskaipan = iskaipan;
    }

    /**
     * 
     * @return huxing 
     */
    public String getHuxing() {
        return huxing;
    }

    /**
     * 
     * @param huxing 
     */
    public void setHuxing(String huxing) {
        this.huxing = huxing;
    }

    /**
     * 
     * @return jianmian 
     */
    public String getJianmian() {
        return jianmian;
    }

    /**
     * 
     * @param jianmian 
     */
    public void setJianmian(String jianmian) {
        this.jianmian = jianmian;
    }

    /**
     * 
     * @return dizhi 
     */
    public String getDizhi() {
        return dizhi;
    }

    /**
     * 
     * @param dizhi 
     */
    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    /**
     * 
     * @return yongjin 
     */
    public Double getYongjin() {
        return yongjin;
    }

    /**
     * 
     * @param yongjin 
     */
    public void setYongjin(Double yongjin) {
        this.yongjin = yongjin;
    }

    /**
     * 
     * @return fenxiang 
     */
    public Double getFenxiang() {
        return fenxiang;
    }

    /**
     * 
     * @param fenxiang 
     */
    public void setFenxiang(Double fenxiang) {
        this.fenxiang = fenxiang;
    }

    /**
     * 
     * @return dianhua 
     */
    public String getDianhua() {
        return dianhua;
    }

    /**
     * 
     * @param dianhua 
     */
    public void setDianhua(String dianhua) {
        this.dianhua = dianhua;
    }

    /**
     * 
     * @return biaoqian 
     */
    public String getBiaoqian() {
        return biaoqian;
    }

    /**
     * 
     * @param biaoqian 
     */
    public void setBiaoqian(String biaoqian) {
        this.biaoqian = biaoqian;
        this.biaoqians = biaoqian.split(",");
    }

    /**
     *
     * @return jieshao
     */
    public String getJieshao() {
        return jieshao;
    }

    /**
     *
     * @param jieshao
     */
    public void setJieshao(String jieshao) {
        this.jieshao = jieshao;
    }

    /**
     *
     * @return yongjinjieshao
     */
    public String getYongjinjieshao() {
        return yongjinjieshao;
    }

    /**
     *
     * @param yongjinjieshao
     */
    public void setYongjinjieshao(String yongjinjieshao) {
        this.yongjinjieshao = yongjinjieshao;
    }

    public Integer getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public Integer getFenleiid() {
        return fenleiid;
    }

    public void setFenleiid(Integer fenleiid) {
        this.fenleiid = fenleiid;
    }

    public FenLei getFenLei() {
        return fenLei;
    }

    public void setFenLei(FenLei fenLei) {
        this.fenLei = fenLei;
    }

    public Integer getQuyuid() {
        return quyuid;
    }

    public void setQuyuid(Integer quyuid) {
        this.quyuid = quyuid;
    }

    public QuYu getQuYu() {
        return quYu;
    }

    public void setQuYu(QuYu quYu) {
        this.quYu = quYu;
    }

    public String getlujing(){
        String lujing = "";
        if(LP_TP_list != null){
            for (int i = 0 ; i < LP_TP_list.size() ; i++){
                if(i == 0){
                    lujing += LP_TP_list.get(i).getLujing();
                }else{
                    lujing += ","+LP_TP_list.get(i).getLujing();
                }
            }
        }
        return lujing;
    }
    public String getConfigtp(){
        String lujing = "[";
        if(LP_TP_list != null){
            for (int i = 0 ; i < LP_TP_list.size() ; i++){
                if(i == 0){
                    lujing +="{\"showDelete\":\"true\",\"key\":\""+ LP_TP_list.get(i).getLujing()+"@"+LP_TP_list.get(i).getId()+"\"}";
                }else{
                    lujing += ",{\"showDelete\":\"true\",\"key\":\""+ LP_TP_list.get(i).getLujing()+"@"+LP_TP_list.get(i).getId()+"\"}";
                }
            }
        }
        return lujing+"]";
    }

    public Admin getFaburen() {
        return faburen;
    }

    public void setFaburen(Admin faburen) {
        this.faburen = faburen;
    }

    public String[] getBiaoqians() {
        return biaoqian.split(",");
    }

    public void setBiaoqians(String[] biaoqians) {
        this.biaoqians = biaoqians;
    }

}