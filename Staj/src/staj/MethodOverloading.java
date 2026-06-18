
package staj;


import java.util.Scanner;


public class MethodOverloading {

    public static void konsoldaMesajGoruntule(int sayi1 , int sayi2,String metin1)
    {
        System.out.println("merhaba " + sayi1 + "   " + sayi2 + "   " + metin1 );
    }
    
    public static void konsoldaMesajGoruntule(int sayi, String metin) {
        System.out.println("Merhaba " + sayi + "   " + metin);
    }
    
    public static void konsoldaMesajGoruntule() {
        System.out.println("Merhaba");
    }
 
    public static void main(String[] args) {
        konsoldaMesajGoruntule(1, 2, "test");
        konsoldaMesajGoruntule(5, "Java");
        konsoldaMesajGoruntule();
    }

    
}
