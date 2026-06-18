
package sınav;

import java.util.Scanner;

public class uygulamasinavi {
    public static void main(String[] args) {
        System.out.println("sınav.uygulamasinavi.main()");
        
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("MARKET ALIŞVERİŞİ;  ");
        
        System.out.println("Babadan alınan para miktarı: ");
        float para = scanner.nextFloat();
        
        System.out.println("---------------------------------");
        
        String[] alisverislistesi ={"elma ", "çilek ","kiraz "};
        float[] adetfiyat = {50.0f,25.0f,30.0f};
        int[] istenenadetmiktari = {3,5,2};
        double toplamharcama =0.0;
             
        for(int i = 0; i<alisverislistesi.length; i++){
            String urunadi = alisverislistesi[i];
            float adetfiyati = adetfiyat[i];
            int adetmiktar = istenenadetmiktari[i];
            
            System.out.println("\n" +urunadi + "ALIŞVERİŞ: ");
            System.out.println("İSTENEN MİKTAR: " + adetmiktar + "ADET FİYATI: " + adetfiyati + "TL");
            
            double tamMaliyet = adetmiktar*adetfiyati;
            double alinanMiktar =0.0;
            
            
            if(para>=tamMaliyet){
                alinanMiktar = adetmiktar;
                para-=tamMaliyet;
                toplamharcama +=tamMaliyet;
                System.out.printf("");
                
             
            }   else if(para>0){
                        alinanMiktar = adetmiktar;
                         
                        double harcama = adetmiktar*adetfiyati;
                        para-=harcama;
                        toplamharcama+=harcama;
                        
                        }
            else{
                System.out.println("BAKİYE KALMADIĞI İÇİN ÜRÜN ALINAMADI.");
            }
            
            
        } 
                
    }
    
}
