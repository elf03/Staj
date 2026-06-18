
package sınav;

import java.util.Scanner;


public class ornek1 {
    public static void main(String[] args) {
        System.out.println("sınav.ornek1.main()");
        
        int sayi=7;
        
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("1-7 ARASI BİR SAYI GİRİNİZ: ");
        sayi = sc.nextInt();
        switch (sayi){
            
            case 1:
                System.out.println("PAZARTESİ");
            break;
            case 2:
                System.out.println("SALI");
            break;
            case 3:
                System.out.println("ÇARŞAMBA");
            break;
            case 4:
                System.out.println("PERŞEMBE");
            break;
            case 5:
                System.out.println("CUMA");
            break;
            case 6:
                System.out.println("CUMARTESİ");
            break;
            case 7:
                System.out.println("PAZAR");
            break;
                
                    
        }
        
    }
    
}
