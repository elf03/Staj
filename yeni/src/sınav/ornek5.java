
package sınav;

//5 random sayı al ve toplattır 

import java.util.Random;

public class ornek5 {
    public static void main(String[] args) {
        System.out.println("sınav.ornek5.main()");
        
        
        Random rnd = new Random();
        int toplam =0;
        
        for (int i = 0; i < 10; i++) {
            int sayi = rnd.nextInt();
            System.out.println(i+ ".sayı " + sayi);
            toplam +=sayi;
            
        }
        System.out.println("sayıların toplamı: "  +toplam );
        
    }
    
}
