
package hafta6;

// 5 kişiye ait ad,yaş ve maaş bilgilerini ekrana yazdıran program
public class DizilerDonguler {
    public static void main(String[] args) {
        System.out.println("hafta6.DizilerDonguler.main()");
        
        String [] adlar ={ "Ayşe", "Nida", "Elif", "Sena", "Selim"};
        int yaslar[] = new int[]{ 19,20,18,25,22};
        double [] maaslar = new double[5];
        
        maaslar[0] = 20000.575;
        maaslar[1] = 50000;
        maaslar[2] = 90000;
        maaslar[3] = 30000;
        maaslar[4] = 25000;
        
        for (int i = 0; i < adlar.length; i++) {
         System.out.printf("%-20s %-10d %-10.2f \n " , adlar[i] + " \t " + yaslar[i] + " \t " + maaslar[i] );   
         
        }
        
        
        
    }
    
}
