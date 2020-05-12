package com.bz.controller.admin;

import com.bz.bean.QuYu;
import com.bz.bean.User;
import com.bz.service.QuYuService;
import com.bz.service.UserService;
import com.bz.util.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("admin")
public class UserConttroller {

    @Autowired
    private UserService userService;
    @Autowired
    private QuYuService quYuService;

    @RequestMapping("getuserlist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo , User user){
        Integer totalCount = userService.countByExample(user);
        Integer totalpage = Configuration.getTotalpage(totalCount);
        if(totalpage < pageNo){
            pageNo = totalpage;
        }
        List<User> list = userService.selectByExample(user);
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalpage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map.addAttribute("user",user);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("user-list",map);
    }

    @RequestMapping("getuser")
    public ModelAndView get(User user){
        if(user != null && user.getId() != null){
            user = userService.selectByPrimaryKey(user.getId());
        }
        List<QuYu> list = quYuService.selectByExample(null,null,null);
        ModelMap map = new ModelMap();
        map.addAttribute("user",user);
        map.addAttribute("quyulist",list);
        return new ModelAndView("user-edit",map);
    }

    @RequestMapping("updateuser")
    public String update(User user){
        if(user.getId() != null){
            if(userService.updateByPrimaryKeySelective(user) >0){
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            }else {
                return "{\"success\":\"false\",\"msg\":\"修改失败！\"}";
            }
        }else{
            if(userService.insert(user) > 0){
                return "{\"success\":\"true\",\"msg\":\"添加成功！\"}";
            }else{
                return "{\"success\":\"false\",\"msg\":\"添加失败！\"}";
            }
        }
    }

}
