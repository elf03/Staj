
package staj;


public class Ornek1 {
    
    //1-100 asal sayıları bulma
     
    public static boolean sayiAsalmi(int sayi){
        if(sayi==1)
            return false; 
        
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i ==0 )
                return false;   
        }
        return true;
    }
    
     
    public static void main(String[] args) {
        
        System.out.println(sayiAsalmi(1));
        
        for (int i = 1; i <= 100; i++)
        {
         
            if (sayiAsalmi(i)==true ) {
                System.out.print(i + ",");
            
        }
        }
       
    }
    
    
}
