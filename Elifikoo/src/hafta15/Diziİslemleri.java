
package hafta15;

import java.util.Arrays;


public class Diziİslemleri {
    public static void main(String[] args) {
        int[] kaynak={5,20,-50,70,12,99};
        System.out.println("kaynak ".concat("Dizi Elemanları: "));
        
        for (int i = 0; i < kaynak.length; i++) {
            System.out.println(kaynak[i]);
           
        }//for
        
        dizisirala(kaynak);
        
        
        
    }//main
    static void dizikopyala(int[] source){
        int[] yenidizi= Arrays.copyOfRange(source,2,source.length);
        System.out.println("KOPYALANAN DİZİ: ");
        
        for (int i = 0; i < yenidizi.length; i++) {
            System.out.println(yenidizi[i]);
        }//for
        
    }
    
    static void dizisirala(int[] dizi ){
        System.out.println("SIRALI DİZİ ELEMANLARI: ");
        Arrays.sort(dizi);
          for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
           
          }//for2
          
          //TERSTEN SIRALAMA
          
          int[] temp = new int[dizi.length];
          int max = dizi.length-1;//5
          int i =0;
          for (;max >= 0; max--) {
              temp[i]=dizi[max];
              i++;
            
        }
          System.out.println("TERSTEN SIRALI DİZİ: ");
        for (int j = 0; j < temp.length; j++) {
            System.out.println(temp[j]);
            
        }
    }
}
