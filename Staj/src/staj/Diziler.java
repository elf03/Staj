
package staj;


public class Diziler {
    
      public static double dizininOrtalamasınıYazdir(int[]arr) {
          int toplam =0;
          for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
          }
         return toplam/arr.length;
          
    }
    public static void main(String[] args) {
        
        int x;
        x=7;
        
        int[]array = {2,30,14,7,5};
                
        //array tanımlama
        /*
        int[]array;
        array=new int[5];
        array[0]=2;
        array[1]=30;
        array[2]=14;
        array[3]=7;
        array[4]=5;    
        */
        System.out.println(dizininOrtalamasınıYazdir(array));
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
