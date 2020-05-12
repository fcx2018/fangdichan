package com.bz.controller.admin;

import com.bz.bean.YinHang;
import com.bz.service.YinHangService;
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
public class yinHangController {

    @Autowired
    private YinHangService yinHangService;

    @RequestMapping("getyhlist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, YinHang yinHang){
        Integer totalCount = yinHangService.countByExample(yinHang);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<YinHang> list = yinHangService.selectByExample(yinHang , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("yinhang_list",map);
    }

    @RequestMapping("getyh")
    public ModelAndView get(YinHang yinHang){
        if(yinHang.getId() != null){
            yinHang = yinHangService.selectByPrimaryKey(yinHang.getId());
        }
        return new ModelAndView("yinhang_edit","quyu",yinHang);
    }

    @RequestMapping("updateyh")
    @ResponseBody
    public String update(YinHang yinHang){
        if(StringUtil.isNotNull(yinHang.getId())){
            if(yinHangService.updateByPrimaryKeySelective(yinHang)>=1)
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(yinHangService.insertSelective(yinHang)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("delyh")
    @ResponseBody
    public String del(YinHang yinHang){
        if(yinHangService.deleteByPrimaryKey(yinHang.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("delyhs")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(yinHangService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
}
