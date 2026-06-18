
package hafta6;
//verilen iki tam sayıdan büyük olandan küçük olanı çıkarıp sonucu bir değişkene atan ve ekrana yazdıran program

import java.util.Scanner;

public class TernaryOperator {
    
    public static void main(String[] args) {
        System.out.println("hafta6.TernaryOperator.main()");
        
        int s1,s2,sonuc;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("SAYI1: " );
        s1 = sc.nextInt();
        
         System.out.print("SAYI2: " );
        s2 = sc.nextInt();
       /* 
        if(s1>s2)
            sonuc= s1 - s2;
        else
            sonuc= s2-s1;
        */
       
       sonuc = (s1>s2)?(s1-s2):(s2-s1);
       
        System.out.println("s1:" + s1 + "s2: " + s2 );
        System.out.println("sonuc: " + sonuc );
    
               
       
               
    
        
        
        
       
    }
}
