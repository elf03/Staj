
package hafta6;

// n kişiye ait ad,yaş ve maaş bilgilerini ekrana yazdıran program

import java.util.Scanner;

public class DizilerDongulerOrnek {
    public static void main(String[] args) {
        System.out.println("hafta6.DizilerDongulerOrnek.main()");
        
        Scanner input = new Scanner(System.in);
        
          System.out.print("Kaç kişi gireceksiniz: ");
        int n = input.nextInt();
        input.nextLine(); 
        
        String[] adlar = new String[n];
        int[] yaslar = new int[n];
        double[] maaslar = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " kişinin bilgilerini girin:");
            
            System.out.print("Ad: ");
            adlar[i] = input.nextLine();
            
            System.out.print("Yaş: ");
            yaslar[i] = input.nextInt();
            
            System.out.print("Maaş: ");
            maaslar[i] = input.nextDouble();
            input.nextLine(); 
        }
        
        
        System.out.println("\n Kişi Bilgileri ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d. Kişi -> Ad: %s | Yaş: %d | Maaş: %.2f %n", (i + 1), adlar[i], yaslar[i], maaslar[i]);
        }
    }
}