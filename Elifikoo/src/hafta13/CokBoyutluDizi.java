
package hafta13;

import java.util.Random;




public class CokBoyutluDizi {
    public static void main(String[] args) {
        System.out.println("hafta13.CokBoyutluDizi.main()");
        
        String[] kisiler={"Ali","Ayşe","Veli","Zehra","Ahmet"};
        double[] paralar=new double[kisiler.length];
        String[] hobiler={"yüzme","futbol","okumak","yürümek","basket","tenis"};
        String[][]kisihobileri = new String[kisiler.length][];
        
        int min=1;
        int max= (hobiler.length+1);
        int n;//hobi sayısı
        Random rnd =new Random();
        
        for (int i = 0; i < kisiler.length; i++) {
            n =rnd.nextInt(min,max);
            kisihobileri[i]=new String[n+1];
            kisihobileri[i][0]=kisiler[i];
            
            for (int j = 0; j < n; j++) {
                kisihobileri[i][j+1]=hobiler[j];
            }
            paralar[i]=rnd.nextInt(5000,10001);
            System.out.println(kisiler[i] + "("+n+") \t "+ paralar[i]);
          
            
            
        }//for ilk             
        
//ÇOK BOYUTLU DİZİ YAZDIRMA
         System.out.println("--------------------------------");
         for (int i = 0; i < kisihobileri.length; i++) {
          
             for (int j = 0; j < kisihobileri[i].length; j++) {

                 System.out.print(kisihobileri[i][j]+"\t");
             }
             System.out.println("");
        }
    }
}
