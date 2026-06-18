package com.yta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorsMain {
    public static void main(String[] args) {
        
         List<String> listPersonel= new ArrayList<String>();
         listPersonel.add("Zeki");
         listPersonel.add("Nevzat");
         listPersonel.add("Ercan");
         listPersonel.add("Zeynep");
         
         
         Iterator<String> iterator = listPersonel.iterator();
         while(iterator.hasNext()){
             System.out.println(iterator.next());
         }
         
    }

    
}
