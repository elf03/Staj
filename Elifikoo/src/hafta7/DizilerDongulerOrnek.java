package hafta7;

//n elemanlı presonllerin ad,soyad,maas verilerini kullanıcıdan alıp saklayan ekrana yazdıran 
import java.util.Scanner;

//maaşların toplamını da ekrana yazdıran program 
public class DizilerDongulerOrnek {

    public static void main(String[] args) {
        System.out.println("hafta7.DizilerDongulerOrnek.main()");

        int n;//eleman sayısı
        Scanner sc = new Scanner(System.in);
        float maastoplam = 0;

        String[] adlar;
        int[] yaslar;
        float maaslar[];

        System.out.print("Eleman sayısı: ");
        n = sc.nextInt();

        adlar = new String[n];
        yaslar = new int[n];
        maaslar = new float[n];

        //alt+shift+f
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+". Eleman");
            System.out.print("AD: ");
            adlar[i] = sc.next();
            System.out.print("YAŞ: ");
            yaslar[i] = sc.nextInt();
            System.out.print("MAAŞ: ");
            maaslar[i] = sc.nextFloat();
        }//for

        //VERİ YAZDIRMA İŞLEMİ
        
        System.out.println("AD \t YAŞ \t MAAŞ");
        
        for (int i = 0; i < maaslar.length; i++) {
            System.out.println(adlar[i]+" \t " + yaslar[i] + " \t " + maaslar[i] );
            maastoplam = maastoplam + maaslar[i];
        }
        System.out.println("---------------------------------------\n");
        System.out.println("Top Maaş: " + maastoplam);
        
        
        
    }

}
