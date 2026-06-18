
package hafta10;


public class HataYakalamaTryCatch {
    public static void main(String[] args) {
        System.out.println("hafta10.HataYakalamaTryCatch.main()");
        int a, b, c;
        a = 5;
        b = 0;
        
        System.out.println("a: "+a+"\nb: "+b);
        try {
             c = a / b;
             
        
        System.out.println("c(a/b): " +c);
        }
        catch (Exception e) {
            System.out.println("Bir hata oldu: " + e.toString());
            
        }
        
        System.out.println("PROGRAM BİTTİ");
        
        
        
                
    }
    
}
