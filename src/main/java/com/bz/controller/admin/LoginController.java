package com.bz.controller.admin;

import com.alibaba.druid.support.json.JSONUtils;
import com.bz.bean.Admin;
import com.bz.bean.QuanXian;
import com.bz.service.AdminService;
import com.bz.service.QuanXianService;
import com.bz.util.Configuration;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private QuanXianService quanXianService;


    @RequestMapping("login")
    @ResponseBody
    public String login(Admin admin , HttpServletRequest request){
        if (admin!=null && StringUtil.isNotNull(admin.getZhanghao()) && StringUtil.isNotNull(admin.getMima())){
            admin = adminService.login(admin);
            if(admin != null){
                admin.setIp(getIpAddr(request));
                adminService.updateByPrimaryKeySelective(admin);
                QuanXian quanXian = quanXianService.selectByPrimaryKey(admin.getQuanxian());
                request.getSession().setAttribute(Configuration.ADMIN_SESSION,admin);
                request.getSession().setAttribute(Configuration.QUANXIAN_SESSION,quanXian.getQuanXianMap());
                return "{\"success\":\"true\",\"msg\":\"登录成功！\",\"item\":"+ JSONUtils.toJSONString(admin.toString())+"}";
            }
            return "{\"success\":\"false\",\"msg\":\"账号密码错误！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"账号密码不能为空！\"}";
    }


    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if ("0:0:0:0:0:0:0:1".equals(ip)) {
            ip = "127.0.0.1";
        }
        if (ip.split(",").length > 1) {
            ip = ip.split(",")[0];
        }
        return ip;
    }
}
