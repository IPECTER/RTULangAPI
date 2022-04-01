package com.github.ipecter.rtu.langAPI.manager;

import com.github.ipecter.rtu.langAPI.enums.EnumLang;

public class RTULangManager {
//    public String getEntityName(){
//
//    }
    public static String translateToLocal(String unlocalizedName, String locale) {
        String result = EnumLang.get(locale.toLowerCase()).getMap().get(unlocalizedName);
            return result;
    }
}
