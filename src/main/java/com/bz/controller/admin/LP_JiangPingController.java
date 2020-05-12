package com.bz.controller.admin;

import com.bz.bean.LP_JiangPin;
import com.bz.service.LP_JiangPinService;
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
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("admin")
public class LP_JiangPingController {

    @Autowired
    private LP_JiangPinService lp_jiangPinService;

    @RequestMapping("getlp_jplist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, LP_JiangPin lp_jiangPin){
        Integer totalCount = lp_jiangPinService.countByExample(lp_jiangPin);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<LP_JiangPin> list = lp_jiangPinService.selectByExample(lp_jiangPin , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map.addAttribute("jiangpin",lp_jiangPin);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("lp_jiangpin_list",map);
    }

    @RequestMapping("getlp_jp")
    public ModelAndView get(LP_JiangPin lp_jiangPin){
        if(lp_jiangPin.getId() != null){
            lp_jiangPin = lp_jiangPinService.selectByPrimaryKey(lp_jiangPin.getId());
        }
        return new ModelAndView("lp_jiangpin_edit","jiangpin",lp_jiangPin);
    }

    @RequestMapping("updatelp_jp")
    @ResponseBody
    public String update(LP_JiangPin lp_jiangPin){
        if(StringUtil.isNotNull(lp_jiangPin.getId())){
            if(lp_jiangPinService.updateByPrimaryKeySelective(lp_jiangPin)>=1)
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            lp_jiangPin.setDate(new Date());
            if(lp_jiangPinService.insertSelective(lp_jiangPin)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("dellp_jp")
    @ResponseBody
    public String del(LP_JiangPin lp_jiangPin){
        if(lp_jiangPinService.deleteByPrimaryKey(lp_jiangPin.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("dellp_jps")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(lp_jiangPinService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
}
