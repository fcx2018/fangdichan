package com.bz.util;

import org.springframework.ui.ModelMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class   Configuration {
    public static String ADMIN_SESSION = "admin_session";
    public static String QUANXIAN_SESSION = "quanxianMap";
    public static String SALTKEY="";
    public static Map<String , Object> canshu = null;

    /**
    * 获取canshu中的值转换为Integer
    * key: String canshu中的key值
    */
    public static Integer getInteger(String key){
        return Integer.parseInt(canshu.get(key).toString());
    }

    public static String getString(String key) {
        return canshu.get(key).toString();
    }

    public static List<Object> getList(String key){
        List<Object> list = new LinkedList<>();
        String[] strings = canshu.get(key).toString().split(",");
        for (String s : strings) {
            list.add(s);
        }
        return list;
    }
    public static ModelMap getPageNo(Integer totalPage , Integer pageNo , ModelMap map){
        Integer p5 = 5;
        if(totalPage < 6){
            p5 = totalPage;
        }else{
            if(pageNo < 3){
                p5 = 5;
            }else{
                if(totalPage >= pageNo + 2){
                    p5 = pageNo + 2;
                }else if(totalPage >= pageNo + 1){
                    p5 = pageNo + 1;
                }else if(totalPage == pageNo ){
                    p5 = totalPage;
                }
            }
        }
        map.put("p1",p5-4);
        map.put("p2",p5-3);
        map.put("p3",p5-2);
        map.put("p4",p5-1);
        map.put("p5",p5);
        return map;
    }

    public static Integer getTotalpage(Integer totalCount){
        if(totalCount != null && totalCount > 0 ){
            return (totalCount-1+Integer.parseInt(Configuration.canshu.get("pagesize").toString()))/Integer.parseInt(Configuration.canshu.get("pagesize").toString());
        }
        return 1;
    }

}
