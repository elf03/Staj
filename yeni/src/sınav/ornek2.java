
package sınav;

import java.util.Scanner;
import javax.xml.transform.Source;


public class ornek2 {
    public static void main(String[] args) {
        System.out.println("sınav.ornek2.main()");
        
        int s1;
        
        do{
        Scanner sc;
        sc =new Scanner(System.in);
        
        System.out.print("BİR SAYI GİRİNİZ: " );
        s1 = sc.nextInt();
        
        
        if (s1%2==0){
            
            switch(s1){
            case 2:
                System.out.println("Sayı 2 ve çok küçük bir çift sayıdır");
                break;
            case 4:
                System.out.println("Sayı 4 ve küçük bir çift sayıdır");
                break;
            case 6:
                System.out.println("Sayı 6 ve orta büyüklükte bir çift sayıdır");
                break;
            case 8:
                System.out.println("Sayı 8 ve büyük bir çift sayıdır");
                break;       
            default:
                System.out.println("BAŞKA ÇİFT SAYI GİRİNİZ: ");
                continue;
        }
            
        }
        else 
            System.out.println("TEK");
        break;
        
        
    }while(true);
    
}
}
