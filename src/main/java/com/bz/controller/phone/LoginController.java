package com.bz.controller.phone;

import com.alibaba.fastjson.JSON;
import com.bz.bean.LouPan;
import com.bz.bean.MingXi;
import com.bz.bean.User;
import com.bz.service.LouPanService;
import com.bz.service.MingXiService;
import com.bz.service.UserService;
import com.bz.util.Configuration;
import com.bz.util.EncryptUtils;
import com.bz.util.HttpUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller("phone_LoginController")
@RequestMapping("phone")
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private LouPanService louPanService;
    @Autowired
    private MingXiService mingXiService;

    @RequestMapping("login")
    @ResponseBody
    public String login(String code , String userInfo , Integer userid , Integer louPanId){
        Map<String , Object> resmap = new HashMap<>();
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        String param = "appid="+ Configuration.getString("appid")+"&secret="+Configuration.getString("appsecret")+"&js_code="+code+"&grant_type=authorization_code";
        String result = HttpUtil.sendGet(url, param);
        System.out.println("====================result："+result);
        Map<String,String> resultMap = JSON.parseObject(result,Map.class);
        if(resultMap.containsKey("openid")){
            String openid = resultMap.get("openid")+"";
            String session_key = resultMap.get("session_key")+"";
            User user = userService.getOpenid(openid);
            String token = EncryptUtils.encryptToSHA(openid, session_key+Configuration.SALTKEY);
            System.out.println("token-----="+token);
            Map<String,String> map = JSON.parseObject(userInfo,Map.class);
            if(user != null) {//用户已存在
                user.setSession_key(session_key);
                user.setTouxiang(map.get("avatarUrl"));
                user.setNicheng(map.get("nickName"));
                int k = userService.updateByPrimaryKey(user);
                System.out.println("openid---1--="+openid);
                System.out.println("session_key-----1---="+session_key);
            }else {
                User user1 = new User();
                user1.setOpenid(openid);
                user1.setSession_key(session_key);
                user1.setTouxiang(map.get("avatarUrl"));
                user1.setNicheng(map.get("nickName"));
                if(userid != null){
                    User tuijianran = userService.selectByPrimaryKey(userid);
                    user1.setTuijianrenid(tuijianran.getId());
                    user1.setTuijianrenopenid(tuijianran.getOpenid());
                }
                user1.setDate(new Date());
                user1.setDongjiejine(0.00);
                user1.setIsweixin(0);
                user1.setIsyihang(0);
                user1.setIszhifubao(0);
                user1.setTixianjine(0.00);
                if(userService.insertSelective(user1)>0){
                    if(userid != null){
                        mingxi(userid,louPanId);
                    }
                    resmap.put("success","true");
                    resmap.put("msg","请求成功！");
                    resmap.put("token",token);
                    resmap.put("item",user1);
                    return new Gson().toJson(resmap);
                }else{
                    resmap.put("success","false");
                    resmap.put("msg","添加用户失败，请重试！");
                    return new Gson().toJson(resmap);
                }
            }
            resmap.put("success","true");
            resmap.put("msg","请求成功！");
            resmap.put("token",token);
            resmap.put("item",user);
            return new Gson().toJson(resmap);
        }else{
            resmap.put("success","false");
            resmap.put("msg",resultMap.get("errmsg"));
            return new Gson().toJson(resmap);
        }
    }

    public void mingxi(Integer userid , Integer louPanId){
        User user = userService.selectByPrimaryKey(userid);
        User tuiJianRen = user.getTuijianren();
        Double fenXiangJian = null;
        Double yongJin = null;
        LouPan louPan = louPanService.selectByPrimaryKey(louPanId);
        if(louPan != null ){
            yongJin = louPan.getYongjin();
            fenXiangJian = louPan.getFenxiang();
        }else{

        }
        MingXi mingXi = new MingXi();
        mingXi.setFanyongid(userid);
        mingXi.setFanyongname(user.getNicheng());
        mingXi.setFenxiangjin(fenXiangJian);
        mingXi.setYongjin(fenXiangJian);
        mingXi.setIsfxjzt(0);
        mingXi.setIsyjzt(0);
        mingXi.setShijian(new Date());
        mingXi.setUserid(tuiJianRen.getId());
        mingXi.setType(1);
        mingXi.setUsername(tuiJianRen.getNicheng());
        mingXiService.insert(mingXi);
    }
}
