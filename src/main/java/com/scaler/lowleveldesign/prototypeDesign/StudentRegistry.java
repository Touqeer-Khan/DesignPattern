package com.scaler.lowleveldesign.prototypeDesign;

import java.util.HashMap;
import java.util.Map;

public  class StudentRegistry {
    public static Map<String , Student> registry=  new HashMap<>();

    public static void register(String key, Student student) {
        registry.put(key , student);

    }
    public static Student get(String key){
        return registry.get(key);
    }
}
