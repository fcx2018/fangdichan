package com.bz.controller.admin;

import com.bz.bean.FenLei;
import com.bz.service.FenLeiService;
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
public class FenlelController {

    @Autowired
    private FenLeiService fenleiService;

    @RequestMapping("getfllist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, FenLei fenlei){
        Integer totalCount = fenleiService.countByExample(fenlei);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<FenLei> list = fenleiService.selectByExample(fenlei , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("fenlei_list",map);
    }

    @RequestMapping("getfl")
    public ModelAndView get(FenLei fenlei){
        if(fenlei.getId() != null){
            fenlei = fenleiService.selectByPrimaryKey(fenlei.getId());
        }
        return new ModelAndView("fenlei_edit","fenlei",fenlei);
    }

    @RequestMapping("updatefl")
    @ResponseBody
    public String update(FenLei fenlei){
        if(StringUtil.isNotNull(fenlei.getId())){
            if(fenleiService.updateByPrimaryKeySelective(fenlei)>=1)
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(fenleiService.insertSelective(fenlei)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("delfl")
    @ResponseBody
    public String del(FenLei fenlei){
        if(fenleiService.deleteByPrimaryKey(fenlei.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("delfls")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(fenleiService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
}
