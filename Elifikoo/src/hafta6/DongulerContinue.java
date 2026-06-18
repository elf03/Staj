
package hafta6;

//1-100 arasında sayılardan 3 ve 5 e tam bölünmeyen sayıları ekrana yazdıran program
public class DongulerContinue {
    public static void main(String[] args) {
        System.out.println("hafta6.DongulerContinue.main()");
        
        for (int i = 1; i < 101; i++) {
            if(i%3==0 && i%5==0)
                continue;
            System.out.println("sayac: " + i);
            
        }
     
        
    }
    
}
