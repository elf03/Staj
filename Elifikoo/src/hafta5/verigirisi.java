
package hafta5;

import java.util.Scanner;
import javax.imageio.ImageIO;


public class verigirisi {
    public static void main(String[] args) {
        System.out.println("hafta5.verigirisi.main()");
        //insana ait ad soyad,yaş bilgilerini klavyeden alan ve ekrana yazdıran program
        
        String ad,soyad;
        int yas;
        float maas;
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.print("ADINIZ: ");
        ad = sc.nextLine();
        
         System.out.print("SOYADINIZ: ");
        soyad = sc.next();
        
          System.out.print("YAŞINIZ: ");
        yas = sc.nextInt();
        
         System.out.print("MAAŞINIZ: ");
        maas = sc.nextFloat();
        
        System.out.println("AD: " + ad);
        System.out.println("SOYAD: " + soyad);
        System.out.println("YAŞ: " + yas);
        System.out.println("MAAŞ: " + maas);
        
        
        
        
        
        
       
        
    }
}
