package com.bz.controller.admin;

import com.bz.bean.Admin;
import com.bz.bean.QuanXian;
import com.bz.service.QuanXianService;
import com.bz.util.Configuration;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class QuanXianController {

    @Autowired
    private QuanXianService quanXianService;

    @RequestMapping("getqxlist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, QuanXian quanXian){
        Integer totalCount = quanXianService.countByExample(quanXian);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<QuanXian> list = quanXianService.selectByExample(quanXian , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("quanXian_list",map);
    }

    @RequestMapping("getqx")
    public ModelAndView get(QuanXian quanXian){
        Map<String , Object> m = new HashMap<String , Object>();
        if(quanXian.getId() != null){
            quanXian = quanXianService.selectByPrimaryKey(quanXian.getId());
            String[] qxs = quanXian.getQuanxian().split(",");
            for (String qx:qxs) {
                m.put(qx,qx);
            }
        }
        ModelMap map = new ModelMap();
        map.addAttribute("quanxian",quanXian);
        map.addAttribute("qxmap",m);
        return new ModelAndView("quanXian_edit",map);
    }

    @RequestMapping("updateqx")
    @ResponseBody
    public String update(QuanXian quanXian , HttpServletRequest request){
        if(StringUtil.isNotNull(quanXian.getId())){
            if(quanXianService.updateByPrimaryKeySelective(quanXian)>=1) {
                Admin sessionAdmin = (Admin) request.getSession().getAttribute(Configuration.ADMIN_SESSION);
                if(sessionAdmin.getQuanxian() == quanXian.getId()){
                    request.getSession().setAttribute(Configuration.QUANXIAN_SESSION,quanXian.getQuanXianMap());
                    return "{\"success\":\"true\",\"msg\":\"修改成功！\",\"reload\":\"true\"}";
                }
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            }else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(quanXianService.insertSelective(quanXian)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("delqx")
    @ResponseBody
    public String del(QuanXian quanXian){
        if(quanXianService.deleteByPrimaryKey(quanXian.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("delqxs")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(quanXianService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
}
