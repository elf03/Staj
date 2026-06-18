package com.yta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {
    
    public static void main(String[] args) {

        
        // HashMap Sınıfı
        // Key -> Value
        
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        
        hashMap.put("Ali", 57);
        hashMap.put("Veli", 78);
        hashMap.put("Osman", 62);
        
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String isim = entry.getKey();
            Integer not = entry.getValue();
            
            System.out.println(isim + " isimli ogrencinin notu: " + not);
        }
    }
}
    

