package com.github.ipecter.rtu.langAPI;


import com.github.ipecter.rtu.langAPI.manager.RTULangManager;

public class RTULangAPI {
    
    private RTULangAPI(){
    }
    private static class LazyHolder {
        public static final RTULangManager INSTANCE = new RTULangManager();
    }
    public static RTULangManager getManager() {
        return RTULangAPI.LazyHolder.INSTANCE;
    }
    
}