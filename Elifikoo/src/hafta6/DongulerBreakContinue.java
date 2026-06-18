
package hafta6;

//50 den başlayıp azalarak pozitif tam sayıların toplamlarını bulan ve toplam 375 den küçük oluncaya kadar işleme devam eden ekrana yazdıran program
public class DongulerBreakContinue {
    
    public static void main(String[] args) {
        System.out.println("hafta6.DongulerBreakContinue.main()");

           int t=0;
        //cevap1:
        for (int i = 50; i >0; i--) {
            t += i; //t = t + i;
            System.out.println("i: " + i + "t: " + t);
            if(t >= 375);
               break; //dçngüden çık / döngüyü sonlandır
            
        }
        System.out.println("\nYÖNTEM2");
        //2. yöntem
                for (int i = 50; i >0 && t < 375; i--) {
            t += i; //t = t + i;
            System.out.println("i: " + i + "t: " + t);
            if(t >= 375);
               break; //dçngüden çık / döngüyü sonlandır
            
        }
    }
    
} 
            
            
