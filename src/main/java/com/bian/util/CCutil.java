package com.bian.util;

import org.springframework.stereotype.Component;

/**
 * @author bianzy
 * @create 2017-07-18 17:57
 **/
@Component
public class CCutil {
    ThreadLocal<String> currentCC = new ThreadLocal<>();

    public String get(){
        return currentCC.get();
    }

    public void set(String CC){
        currentCC.set(CC);
    }
}
