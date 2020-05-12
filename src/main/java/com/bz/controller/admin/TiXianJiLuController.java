package com.bz.controller.admin;

import com.bz.bean.Admin;
import com.bz.bean.TiXianJiLu;
import com.bz.service.TiXianJiLuService;
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
import java.util.List;

@Controller
@RequestMapping("admin")
public class TiXianJiLuController {

    @Autowired
    private TiXianJiLuService tiXianJiLuService;

    @RequestMapping("gettxjllist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, TiXianJiLu tiXianJiLu){
        Integer totalCount = tiXianJiLuService.countByExample(tiXianJiLu);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<TiXianJiLu> list = tiXianJiLuService.selectByExample(tiXianJiLu , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map.addAttribute("tixian",tiXianJiLu);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("tixianjilu_list",map);
    }

    @RequestMapping("gettxjl")
    public ModelAndView get(TiXianJiLu tiXianJiLu){
        if(tiXianJiLu.getId() != null){
            tiXianJiLu = tiXianJiLuService.selectByPrimaryKey(tiXianJiLu.getId());
        }
        return new ModelAndView("tiXianJiLu_edit","tixianjilu",tiXianJiLu);
    }

    @RequestMapping("updatetxjl")
    @ResponseBody
    public String update(TiXianJiLu tiXianJiLu , HttpServletRequest request){
        if(StringUtil.isNotNull(tiXianJiLu.getId())){
            if(tiXianJiLu.getZhuangtai() == 1 || tiXianJiLu.getZhuangtai() ==2){
                Admin admin = (Admin)request.getSession().getAttribute(Configuration.ADMIN_SESSION);
                tiXianJiLu.setShenheid(admin.getId());
            }
            if(tiXianJiLuService.updateByPrimaryKeySelective(tiXianJiLu)>=1) {
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";

            }else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(tiXianJiLuService.insertSelective(tiXianJiLu)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("deltxjl")
    @ResponseBody
    public String del(TiXianJiLu tiXianJiLu){
        if(tiXianJiLuService.deleteByPrimaryKey(tiXianJiLu.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("deltxjls")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(tiXianJiLuService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
}
