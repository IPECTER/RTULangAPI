package com.github.ipecter.rtu.langAPI;

import com.github.ipecter.rtu.langAPI.manager.RTULangManager;

public final class RTULangAPI {
    private static RTULangManager rtuLangManager = new RTULangManager();
    public static RTULangManager getManager(){
        return rtuLangManager;
    }
    

}
