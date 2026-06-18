
//2 sayının toplam, çıkarma, çarpma, bölme ve bölümünden kalanını bulan
//Bu sayıları ve sonuçlarını ekrana yazdıran program 
public class Aritmetikoperatörler {

    public static void main(String[] args) {
        System.out.println("hafta3.Aritmetikoperatörler.main()");
        int s1, s2;
        float sonuc;

        s1 = 20;
        s2 = 6;

        //System.out.println("s1:" +s1 + s2);
        //System.out.println("s1:" +(s1 + s2));
        System.out.println("s1: " + s1 + "s2: " + s2);

        sonuc = s1 + s2;
        System.out.println("sonuc(s1+s2):" + sonuc);
        
        sonuc = s1 - s2;
        System.out.println("sonuc(s1-s2):" + sonuc);
        
        sonuc = s1 * s2;
        System.out.println("sonuc(s1*s2):" + sonuc);
        
        sonuc = s1 / s2;
        System.out.println("sonuc(s1/s2):" + sonuc);
        
        sonuc = s1 % s2;
        System.out.println("sonuc(s1%s2):" + sonuc);

    }

}
