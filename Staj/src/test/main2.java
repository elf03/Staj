package test;

import java.util.ArrayList;
import java.util.List;

public class main2 {
    
    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList<String>();
        
        
        arrayList.add("Ali");
        arrayList.add("Veli");
        arrayList.add("Ayşe");
        
        //for (int i = 0; i <arrayList.size(); i++) {
       //     System.out.println(arrayList.get(i));}
       
        //for (String mys : arrayList) {
          //  System.out.println(mys);}
          
          arrayList.remove(2);
          for (int i = 0; i <arrayList.size(); i++) {
              System.out.println(arrayList.get(i));
              
              if(arrayList.contains("Veli"))
                  System.out.println("mevcut");
              else
                  System.out.println("mevcut değil.");
            
        }
          
           
        
    }
    
}
