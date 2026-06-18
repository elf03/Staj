
package hafta4;

//Bir sayının negatif veya pozitif olma durumunu kontrol eden ve sonucu ekrana yazdıran program
//eğer pozitif ise sayının karesini alsın ve ekrana yazdırsın

public class kararyapilari {
    
    public static void main(String[] args) {
        System.out.println("hafta4.kararyapilari.main()");
        int s1 = -20;
        
        if(s1>0){
            System.out.println("s1 POZİTİF");
        s1 = s1 * s1;
            System.out.println("s1 karesi:" + s1);
        }
        else{
            System.out.println("s1 NEGATİF");
        }
                        
           
    }
    
}
