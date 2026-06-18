
package staj;


import java.util.Scanner;


public class Fonksiyonlar1 {

    public static void konsoldaMesajGoruntule(int sayi1 , int sayi2,String metin1)
    {
        System.out.println("Merhaba");
        System.out.println(sayi1 + "   " +sayi2);
   
        
    }
    
    public static int dikdortgenAlanHesaplama(int kenar1,int kenar2)
    {
        int alan = kenar1*kenar2;
        return alan;
    }
    
    public static int kareAlanHesapla(int kenar){
        int alanKare=kenar*kenar;
        return alanKare;
    }
    
    public static double dikUcgeninAlaniniHesapla(int kenar1,int kenar2){
        double alanUcgen = (kenar1*kenar2)/2;
        return alanUcgen;
        
    }
    
    public static void main(String[] args) {
        
        int dikdortgenAlan = dikdortgenAlanHesaplama(20, 10);
        System.out.println("dikdörtgen alan: " + dikdortgenAlan);
        int alanKare = kareAlanHesapla(9);
        System.out.println("karenin alanı: " +alanKare);
        int kenar1=5;
        int kenar2=4;
        double dikUcgen = dikUcgeninAlaniniHesapla(kenar1,kenar2);
        System.out.println("alan = " + dikUcgen);
        
        
    }

    
}
