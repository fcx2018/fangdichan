package com.bz.controller.admin;

import com.bz.bean.Banner;
import com.bz.service.BannerService;
import com.bz.util.Configuration;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("admin")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @RequestMapping("getblist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, Banner banner){
        Integer totalCount = bannerService.countByExample(banner);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<Banner> list = bannerService.selectByExample(banner , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("banner_list",map);
    }

    @RequestMapping("getb")
    public ModelAndView get(Banner banner){
        if(banner.getId() != null){
            banner = bannerService.selectByPrimaryKey(banner.getId());
        }
        return new ModelAndView("banner_edit","banner",banner);
    }

    @RequestMapping("updateb")
    @ResponseBody
    public String update(Banner banner){
        if(StringUtil.isNotNull(banner.getId())){
            if(bannerService.updateByPrimaryKeySelective(banner)>=1)
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(bannerService.insertSelective(banner)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("delb")
    @ResponseBody
    public String del(Banner banner){
        if(bannerService.deleteByPrimaryKey(banner.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("delbs")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(bannerService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
}
