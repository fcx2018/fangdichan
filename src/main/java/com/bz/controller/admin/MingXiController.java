package com.bz.controller.admin;

import com.bz.bean.MingXi;
import com.bz.service.MingXiService;
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
public class MingXiController {

    @Autowired
    private MingXiService mingXiService;

    @RequestMapping("getmxlist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, MingXi mingXi){
        Integer totalCount = mingXiService.countByExample(mingXi);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<MingXi> list = mingXiService.selectByExample(mingXi , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map.addAttribute("mingxi",mingXi);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("mingXi_list",map);
    }

    @RequestMapping("getmx")
    public ModelAndView get(MingXi mingXi){
        if(mingXi.getId() != null){
            mingXi = mingXiService.selectByPrimaryKey(mingXi.getId());
        }
        return new ModelAndView("mingXi_edit","mingXi",mingXi);
    }

    @RequestMapping("updatemx")
    @ResponseBody
    public String update(MingXi mingXi){
        if(StringUtil.isNotNull(mingXi.getId())){
            if(mingXiService.updateByPrimaryKeySelective(mingXi)>=1)
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(mingXiService.insertSelective(mingXi)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("delmx")
    @ResponseBody
    public String del(MingXi mingXi){
        if(mingXiService.deleteByPrimaryKey(mingXi.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("delmxs")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(mingXiService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
    
}
