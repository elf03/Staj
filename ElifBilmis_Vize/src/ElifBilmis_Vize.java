
import java.util.Random;


public class ElifBilmis_Vize {

  
    public static void main(String[] args) {
        System.out.println("ElifBilmis_Vize.main()");
        
        
        int maas;
        float zamlıMaas;
        float evGideri;
        float kendineAyrılanPara;
        float harclıkİcinAyrılanPara;
        float kalanPara; 
        float baba_harclık[];
        float anne_harclık[];
        float toplam_harclık[];
        
        String [] adlar={"arazi","mütevazi","farazi","terazi","niyazi"};
        int yaslar[]=new int []{9,13,14,18,23};
        baba_harclık =new float [adlar.length];
        anne_harclık =new float [adlar.length];
        toplam_harclık=new float [adlar.length];
        
        
        int max =750;
        int min =200;
        double x =Math.random();
        System.out.println("Math.random(): " + x);

        
        
        
        Random rnd =new Random();
        maas = rnd.nextInt(30000,50001);
        zamlıMaas = (maas + maas*50/100);
        evGideri =(zamlıMaas- zamlıMaas*75/100);
        kalanPara =(zamlıMaas-evGideri);
        kendineAyrılanPara=(kalanPara*25/100);
        harclıkİcinAyrılanPara=(kalanPara-kendineAyrılanPara);
        
        
        System.out.println("babanın maaşı: "+ maas);
        System.out.println("babanın yeni maaşı: "+ zamlıMaas);
        System.out.println("evin gideri ne kadar: "+ evGideri);
        System.out.println("ev giderinden sonra kalan para ne kadar: " +kalanPara);
        System.out.println("babanın kendine ayırdığı para ne kadar: "+ kendineAyrılanPara);
        System.out.println("harçlık için ayrılan para ne kadar: " + harclıkİcinAyrılanPara);
        
        
        for (int i=0 ; i<yaslar.length; i++) {
            double harclik =rnd.nextInt(200,750);
            System.out.println("ADI: "+ adlar[i] + "BABADAN ALDIĞI HARÇLIK: "+ rnd.nextInt(200,750));
            
        }
        

        
       
        
    }
    
}
