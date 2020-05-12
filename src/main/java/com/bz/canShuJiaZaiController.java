package com.bz;

import com.bz.bean.CanShuSheZhi;
import com.bz.service.CanShuShiZhiService;
import com.bz.util.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class canShuJiaZaiController {

    @Autowired
    private CanShuShiZhiService canShuShiZhiService;

    @PostConstruct
    public void get(){
        Map<String , Object> map = new HashMap<>();
        List<CanShuSheZhi> list = canShuShiZhiService.selectByExample(null,null,null);
        for (CanShuSheZhi cs:list) {
            map.put(cs.getName(),cs.getValue());
        }
        Configuration.canshu = map;
        baoyou();
    }
    public void baoyou(){
        String fozu =
                "                   _ooOoo_"+"\n"+
                "                  o8888888o"+"\n"+
                "                  88\" . \"88"+"\n"+
                "                  (| -_- |)"+"\n"+
                "                  O\\  =  /O"+"\n"+
                "               ____/`---'\\____"+"\n"+
                "             .'  \\\\|     |//  `."+"\n"+
                "            /  \\\\|||  :  |||//  \\"+"\n"+
                "           /  _||||| -:- |||||-  \\"+"\n"+
                "           |   | \\\\\\  -  /// |   |"+"\n"+
                "           | \\_|  ''\\---/''  |   |"+"\n"+
                "           \\  .-\\__  `-`  ___/-. /"+"\n"+
                "         ___`. .'  /--.--\\  `. . __"+"\n"+
                "      .\"\" '<  `.___\\_<|>_/___.'  >'\"\"."+"\n"+
                "     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |"+"\n"+
                "     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /"+"\n"+
                "======`-.____`-.___\\_____/___.-`____.-'======"+"\n"+
                "                   `=---='"+"\n"+
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+"\n"+
                "                 佛祖保佑       永无BUG";
        System.out.println(fozu);
    }
}
