package com.bz.controller.admin;

import com.bz.bean.QuYu;
import com.bz.service.QuYuService;
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
public class QuYuController {

    @Autowired
    private QuYuService QuYuService;

    @RequestMapping("getquyulist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, QuYu quYu){
        Integer totalCount = QuYuService.countByExample(quYu);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<QuYu> list = QuYuService.selectByExample(quYu , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("quyu_list",map);
    }

    @RequestMapping("getquyu")
    public ModelAndView get(QuYu quYu){
        if(quYu.getId() != null){
            quYu = QuYuService.selectByPrimaryKey(quYu.getId());
        }
        return new ModelAndView("quyu_edit","quyu",quYu);
    }

    @RequestMapping("updatequyu")
    @ResponseBody
    public String update(QuYu quYu){
        if(StringUtil.isNotNull(quYu.getId())){
            if(QuYuService.updateByPrimaryKeySelective(quYu)>=1)
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(QuYuService.insertSelective(quYu)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("delquyu")
    @ResponseBody
    public String del(QuYu quYu){
        if(QuYuService.deleteByPrimaryKey(quYu.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("delquyus")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(QuYuService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
}
