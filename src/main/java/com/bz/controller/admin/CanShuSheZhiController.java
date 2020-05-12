package com.bz.controller.admin;

import com.bz.bean.CanShuSheZhi;
import com.bz.service.CanShuShiZhiService;
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
public class CanShuSheZhiController {

    @Autowired
    private CanShuShiZhiService canShuShiZhiService;

    @RequestMapping("getcsszlist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, CanShuSheZhi canShuSheZhi){
        Integer totalCount = canShuShiZhiService.countByExample(canShuSheZhi);
        Integer totalpage = Configuration.getTotalpage(totalCount);
        if(totalpage < pageNo){
            pageNo = totalpage;
        }
        List<CanShuSheZhi> list = canShuShiZhiService.selectByExample(canShuSheZhi , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalpage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("canshushezhi_list", map );
    }

    @RequestMapping("getcssz")
    public ModelAndView get(CanShuSheZhi canShuSheZhi){
        if(canShuSheZhi.getId() != null){
            canShuSheZhi = canShuShiZhiService.selectByPrimaryKey(canShuSheZhi.getId());
        }
        return new ModelAndView("canshushezhi_edit","cssz",canShuSheZhi);
    }

    @RequestMapping("updatecssz")
    @ResponseBody
    public String update(CanShuSheZhi canShuSheZhi){
        if(StringUtil.isNotNull(canShuSheZhi.getId())){
            if(canShuShiZhiService.updateByPrimaryKeySelective(canShuSheZhi)>=1) {
                Configuration.canshu.put(canShuSheZhi.getName(),canShuSheZhi.getValue());
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            }
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(canShuShiZhiService.insertSelective(canShuSheZhi)>=1) {
                Configuration.canshu.put(canShuSheZhi.getName(),canShuSheZhi.getValue());
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            }
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("delcssz")
    @ResponseBody
    public String del(CanShuSheZhi canShuSheZhi){
        if(canShuShiZhiService.deleteByPrimaryKey(canShuSheZhi.getId())>=1){
           return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("delcsszs")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(canShuShiZhiService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
}
