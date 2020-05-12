package com.bz.util;

public class StringUtil {
    public static boolean isNotNull(String str){
        if(str != null){
            if(str != "" && !str.equals("")){
                return true;
            }
        }
        return false;
    }
    public static boolean isNotNull(Integer str){
        if(str != null){
            return true;
        }
        return false;
    }
    public static boolean isNotNull(Double str){
        if(str != null){
            if(str != 0.0){
                return true;
            }
        }
        return false;
    }

}
