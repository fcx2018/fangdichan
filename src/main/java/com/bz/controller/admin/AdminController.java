package com.bz.controller.admin;

import com.bz.bean.Admin;
import com.bz.bean.QuanXian;
import com.bz.service.AdminService;
import com.bz.service.QuanXianService;
import com.bz.util.Configuration;
import com.bz.util.SecuritySHA1Utils;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private QuanXianService quanXianService;

    @RequestMapping("getindex")
    @ResponseBody
    public ModelAndView get(HttpServletRequest request){
        Admin admin = (Admin) request.getSession().getAttribute(Configuration.ADMIN_SESSION);
        admin = adminService.selectByPrimaryKey(admin.getId());
        return new ModelAndView("index","admin",admin);
    }

    @RequestMapping("getadmin")
    @ResponseBody
    public ModelAndView getAdmin(Admin admin){
        if(StringUtil.isNotNull(admin.getId())){
            admin = adminService.selectByPrimaryKey(admin.getId());
        }
        List<QuanXian> list = quanXianService.getAll();
        ModelMap map = new ModelMap();
        map.addAttribute("admin",admin);
        map.addAttribute("list",list);
        return new ModelAndView("admin_edit",map);
    }

    @RequestMapping("getadminlist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo,Admin admin){
        Integer totalCount = adminService.countByExample(admin);
        Integer totalpage = Configuration.getTotalpage(totalCount);
        if(totalpage < pageNo){
            pageNo = totalpage;
        }
        List<Admin> list = adminService.selectByExample(admin , pageNo,Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalpage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("admin-list",map);
    }
    @RequestMapping("updateadmin")
    @ResponseBody
    public String update(Admin admin , HttpServletRequest request) throws Exception {
        if(admin.getMima() != null && !admin.getMima().equals("")){
            admin.setMima(SecuritySHA1Utils.shaEncode(admin.getMima()));
        }
        if(admin.getId() != null){
            if(adminService.updateByPrimaryKeySelective(admin) >0){
                Admin sessionAdmin = (Admin) request.getSession().getAttribute(Configuration.ADMIN_SESSION);
                if(sessionAdmin.getId() == admin.getId()){
                    return "{\"success\":\"true\",\"msg\":\"修改成功！请重新登录！\",\"denglu\":\"true\"}";
                }else{
                    return "{\"success\":\"true\",\"msg\":\"修改成功！\",\"denglu\":\"false\"}";
                }
            }else {
                return "{\"success\":\"false\",\"msg\":\"修改失败！\"}";
            }
        }else{
            admin.setDate(new Date());
            if(adminService.insert(admin) > 0){
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            }else{
                return "{\"success\":\"false\",\"msg\":\"添加失败！\"}";
            }
        }
    }

    @RequestMapping("deladmin")
    @ResponseBody
    public String del(Integer id){
        if(adminService.deleteByPrimaryKey(id)>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除失败！\"}";
    }

    @RequestMapping("deladmins")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cw = new ArrayList<>();
        List<Integer> cg = new ArrayList<>();
        for (Integer i: ids) {
            if(adminService.deleteByPrimaryKey(i)>0)
                cg.add(i);
            else
                cw.add(i);
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功！\"}";
    }
    @RequestMapping("getzhanghao")
    @ResponseBody
    public String getZhangHao(String zhanghao){
        if(adminService.getZhangHao(zhanghao) > 0){
            return "{\"success\":\"false\",\"msg\":\"已有账号！\"}";
        }else{
            return "{\"success\":\"true\",\"msg\":\"\"}";
        }
    }

}
