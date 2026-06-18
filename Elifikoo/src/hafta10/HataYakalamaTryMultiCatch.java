
package hafta10;


public class HataYakalamaTryMultiCatch {
    public static void main(String[] args) {
        System.out.println("hafta10.HataYakalamaTryMultiCatch.main()");
        
        int a, b, c;
        a = 5;
        b = 0;
        
         System.out.println("a: "+a+"\nb: "+b);
         
         int dizi[] ={20,0};
         System.out.println("dizi[0]: "+ dizi[0]);
         System.out.println("dizi[1]: " +dizi[1]);
        try {
            System.out.println("dizi [2]: " +dizi[2]);           
             c = a / b;
      
        System.out.println("c(a/b): " +c);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dizi INDEX bir hata oldu: " + e.toString());
        }
        catch (ArithmeticException e2) {
            System.out.println("Aritmetik Bir hata oldu: " + e2.toString());
            
        }
        
        System.out.println("PROGRAM BİTTİ");
        
        
         
    }
    
}
