
package hafta5;

//verilen 2 sayının büyüklük küçüklük ve eşitlik durumunu bulan ve ekrana yazdıran program

import java.util.Scanner;

public class ifornek {
    public static void main(String[] args) {
        System.out.println("hafta5.ifornek.main()");
        
        int s1,s2;
        
        Scanner girdi = new Scanner(System.in);
       
        
        System.out.println("s1: ");
        s1 =girdi.nextInt();
        
        System.out.println("s2: ");
        s2 =girdi.nextInt();
        
        System.out.println("ilk sayıyı girin: " + s1 );
        System.out.println("ikinci sayıyı girin: " + s2 );
        
        
        
        if(s1>s2){
            System.out.println("s1>s2");
        }
        else if(s1<s2)
            System.out.println("s1<s2");
        else
            System.out.println("s1=s2");
                
    }
    
}
