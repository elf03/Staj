
package hafta6;


//1-10 arasındaki sayıları  ve her bir adımdaki toplamlarını ekrana yazdıran program 
public class DongulerFor {
    public static void main(String[] args) {
        System.out.println("hafta6.DongulerFor.main()");
        
        int t=0;
        for (int i = 1; i <= 10; i++) {
            t=t+i;
            System.out.println("i: " + i + " \tTop: " + t);    
        }
        
       
        
    }//main
    
}//class
