
package hafta10;


public class HataYakalamaTryCatchFinaly {
    public static void main(String[] args) {
        System.out.println("hafta10.HataYakalamaTryCatchFinaly.main()");
        int a, b, c;
        a = 5;
        b = 0;
        
        try {
             c = a / b;
                   
        System.out.println("c(a/b): " +c);
        }
        catch(Exception e){
            System.out.println("HATA: " +e.toString());
        }
        finally {
            System.out.println("finaly bloğu devreye girdi: ");
        }
    
        System.out.println("Program sonu");
    }
    
}
