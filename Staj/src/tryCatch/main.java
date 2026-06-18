package tryCatch;

import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {
        
        int x =100;
        int y=0;
        car otomobil =null;
        
        
        try {
              int z =x/y;
              System.out.println(otomobil.getModel());
                 
        } catch (ArithmeticException e) {
            System.out.println("Tamsayı sfırla bölünmeye çalışıyor! ");
            e.printStackTrace();
            
        }catch(NullPointerException e){
            System.out.println("Null pointer exception yedik!! ");
        }
        finally {
            System.out.println("Burası finally code bloğu ");
        }
        
        System.out.println("Programın tamamı çalıştı... ");
        
      
                
    }
    
}