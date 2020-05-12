package com.bz.controller.admin;

import com.bz.bean.Message;
import com.bz.service.MessageService;
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
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("getmlist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo , Message message){
        Integer totalCount = messageService.countByExample(message);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        List<Message> list = messageService.selectByExample(message , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map.addAttribute("message",message);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("message_list",map);
    }

    @RequestMapping("getm")
    public ModelAndView get(Message message){
        if(message.getId() != null){
            message = messageService.selectByPrimaryKey(message.getId());
        }
        return new ModelAndView("message_edit","message",message);
    }

    @RequestMapping("updatem")
    @ResponseBody
    public String update(Message message){
        if(StringUtil.isNotNull(message.getId())){
            if(messageService.updateByPrimaryKeySelective(message)>=1)
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            message.setDate(new Date());
            message.setZhuangtai(0);
            if(messageService.insertSelective(message)>=1)
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("delm")
    @ResponseBody
    public String del(Message message){
        if(messageService.deleteByPrimaryKey(message.getId())>=1){
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("delms")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(messageService.deleteByPrimaryKey(i)>0){
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }
}
