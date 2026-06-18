package test2;
import java.util.ArrayList;


public class Main {
    
    public static boolean paldinromMu(String s){
        
        String reverse="";
        for (int i =s.length()-1; i >= 0; i--) {
            reverse=reverse + s.charAt(i);
        }
        if(s.equals(reverse))
            return true;
        else 
            return false;
    }
    
    public static void main(String[] args) {
        
        System.out.println(paldinromMu("KAPAK"));
        
    }
   

    
           
}
