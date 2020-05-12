package com.bz.controller.admin;

import com.bz.bean.*;
import com.bz.service.*;
import com.bz.util.Configuration;
import com.bz.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Controller
@RequestMapping("admin")
@EnableScheduling
public class LouPanController {

    @Autowired
    private LouPanService louPanService;
    @Autowired
    private LP_TuPianService lp_tuPianService;
    @Autowired
    private LP_JiangPinService lp_jiangPinService;
    @Autowired
    private FenLeiService fenLeiService;
    @Autowired
    private QuYuService quYuService;

    @RequestMapping("getlplist")
    public ModelAndView getList(@RequestParam(required = false,defaultValue = "1")Integer pageNo, LouPan louPan, HttpServletRequest request){
        Integer totalCount = louPanService.countByExample(louPan);
        Integer totalPage = Configuration.getTotalpage(totalCount);
        if(totalPage < pageNo){
            pageNo = totalPage;
        }
        Admin admin = (Admin) request.getSession().getAttribute(Configuration.ADMIN_SESSION);
        if(admin.getQuanxian() != 1){
            louPan.setZhanghaoid(admin.getId());
        }
        List<LouPan> list = louPanService.selectByExample(louPan , pageNo , Integer.parseInt(Configuration.canshu.get("pagesize").toString()));
        ModelMap map = new ModelMap();
        map.addAttribute("totalpage",totalPage);
        map.addAttribute("list",list);
        map.addAttribute("pageNo",pageNo);
        map.addAttribute("loupan",louPan);
        map = Configuration.getPageNo(Configuration.getTotalpage(totalCount),pageNo , map);
        return new ModelAndView("loupan_list",map);
    }

    @RequestMapping("getlp")
    public ModelAndView get(LouPan louPan, HttpServletRequest request){
        ModelMap map = new ModelMap();
        if(louPan.getId() != null){
            louPan = louPanService.selectByPrimaryKey(louPan.getId());
            Admin admin = (Admin)request.getSession().getAttribute(Configuration.ADMIN_SESSION);
            if(admin.getId() != louPan.getZhanghaoid()){
                map.addAttribute("msg",true);
                map.addAttribute("loupan",new LouPan());
                map.addAttribute("lj",null);
                map.addAttribute("configtp",null);
                return new ModelAndView("loupan_edit",map);
            }
        }
        List<FenLei> list = fenLeiService.selectIndex();
        List<QuYu> list1 = quYuService.selectByExample(null,null,null);
        map.addAttribute("msg",false);
        map.addAttribute("loupan",louPan);
        map.addAttribute("lj",louPan.getlujing());
        map.addAttribute("configtp",louPan.getConfigtp());
        map.addAttribute("fenleilist",list);
        map.addAttribute("quyulist",list1);
        return new ModelAndView("loupan_edit",map);
    }

    @RequestMapping("updatelp")
    @ResponseBody
    public String update(LouPan louPan, String[] imgs, HttpServletRequest request){
        Admin admin = (Admin)request.getSession().getAttribute(Configuration.ADMIN_SESSION);
        if(StringUtil.isNotNull(louPan.getId())){
            if(louPan.getKaipan().getTime() > new Date().getTime()){
                louPan.setIskaipan(0);
            }else{
                louPan.setIskaipan(1);
            }
            louPan.setZhanghaoid(((Admin)request.getSession().getAttribute(Configuration.ADMIN_SESSION)).getId());
            if(louPanService.updateByPrimaryKeySelective(louPan)>=1)
                return "{\"success\":\"true\",\"msg\":\"修改成功！\"}";
            else
                return "{\"success\":\"false\",\"msg\":\"修改失败，请重试！\"}";
        }else{
            if(louPan.getKaipan().getTime() > new Date().getTime()){
                louPan.setIskaipan(0);
            }else{
                louPan.setIskaipan(1);
            }
            louPan.setZhuangtai(0);
            if(louPanService.insertSelective(louPan)>=1) {
                return "{\"success\":\"true\",\"msg\":\"添加成功！\",\"id\":\""+louPan.getId()+"\"}";
            }else
                return "{\"success\":\"false\",\"msg\":\"添加失败，请重试！\"}";
        }
    }

    @RequestMapping("dellp")
    @ResponseBody
    public String del(LouPan louPan){
        if(louPanService.deleteByPrimaryKey(louPan.getId())>=1){
            lp_tuPianService.delLouPanId(louPan.getId());
            lp_jiangPinService.deleteloupanid(louPan.getId());
            return "{\"success\":\"true\",\"msg\":\"删除成功！\"}";
        }
        return "{\"success\":\"false\",\"msg\":\"删除成功！\"}";
    }

    @RequestMapping("dellps")
    @ResponseBody
    public String dels(Integer[] ids){
        List<Integer> cg = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        for (Integer i:ids) {
            if(louPanService.deleteByPrimaryKey(i)>0){
                lp_tuPianService.delLouPanId(i);
                lp_jiangPinService.deleteloupanid(i);
                cg.add(i);
            }else{
                sb.add(i);
            }
        }
        return "{\"success\":\"true\",\"msg\":\"执行成功,成功删除"+cg.size()+"个，失败"+sb.size()+"个！\"}";
    }

    public void insertLP_TP(String[] imgs , Integer lpid){
        for (String img:imgs) {
            LP_TuPian lp_tuPian = new LP_TuPian();
            lp_tuPian.setLoupanid(lpid);
            lp_tuPian.setLujing(img);
            lp_tuPianService.insert(lp_tuPian);
        }
    }

    @Scheduled(cron = "0 */1 * * * ? ")
    public void kaipan(){
        List<LouPan> list = louPanService.selectNotKaiPan();
        System.out.println("list:"+list.size());
        for (LouPan lp :list) {
            lp.setIskaipan(1);
            louPanService.updateByPrimaryKeySelective(lp);
        }
    }

}
