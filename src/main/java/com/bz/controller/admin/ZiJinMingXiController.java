package com.bz.controller.admin;

import com.bz.bean.ZiJinMingXi;
import com.bz.service.ZiJinMingXiService;
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
public class ZiJinMingXiController {

    @Autowired
    private ZiJinMingXiService ziJinMingXiService;

    @RequestMapping("getzjmxlist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, ZiJinMingXi ziJinMingXi){
        Integer totalCount = ziJinMingXiService.countByExample(ziJinMingXi);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<ZiJinMingXi> list = ziJinMingXiService.selectByExample(ziJinMingXi , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map.addAttribute("zijinmingxi",ziJinMingXi);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("zijinmingxi_list",map);
    }

    @RequestMapping("getzjmx")
    public ModelAndView get(ZiJinMingXi ziJinMingXi){
        if(ziJinMingXi.getId() != null){
            ziJinMingXi = ziJinMingXiService.selectByPrimaryKey(ziJinMingXi.getId());
        }
        return new ModelAndView("zijinmingxi_edit","zijinmingxi",ziJinMingXi);
    }

    @RequestMapping("updatezjmx")
    @ResponseBody
    public String update(ZiJinMingXi ziJinMingXi){
        if(StringUtil.isNotNull(ziJinMingXi.getId())){
            if(ziJinMingXiService.updateByPrimaryKeySelective(ziJinMingXi)>=1)
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(ziJinMingXiService.insertSelective(ziJinMingXi)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("delzjmx")
    @ResponseBody
    public String del(ZiJinMingXi ziJinMingXi){
        if(ziJinMingXiService.deleteByPrimaryKey(ziJinMingXi.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("delzjmxs")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(ziJinMingXiService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
    
}
