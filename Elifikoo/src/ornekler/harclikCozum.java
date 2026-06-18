
package ornekler;

import java.util.Random;

/*babanı n 30000-50000 arası maaşı var %50 zam yapılıyor zamlı maaşın 3/4 ünü 
ev giderlerine ayırıyor sonra kalan paranın %25 ini kendine ayırıyor ve geri kalan parayı 
çocuklarına harçlık için kullanacak babanın  5 tane çocuğu var çocukların yaşları 9,13,14,18,21
çcoukların isimleri arazi,farzi,terazi,niyazi,mütevazi çocuklar yaş sırasına 
göre babadan harçlık almaya gidiyor babanın parası yetiyorsa çocuğa harçlığı veriyor 
çocukların alacakları harçlık miktarı en az 200
en fazla 750 sonra çocuk anneden de harçlık istiyor tekse yaşı %30 çiftse %40  */
public class harclikCozum {
    public static void main(String[] args) {
        System.out.println("ornekler.harclikCozum.main()");
        
        int maas;
        float zamlımaas;
        float evgideri;
        float kendineayrılanpara;
        float harclıkicinayrılanpara;
        float kalanpara;
        float baba_harclık[];
        float anne_harclık[];
        float toplam_harclık[];
        
        String[] adlar = {"arazi","farazi","terazi","niyazi","mütevazi"};
        int [] yaslar = {9,13,14,18,21};
        baba_harclık= new float [adlar.length];
        anne_harclık =new float [adlar.length];
        toplam_harclık = new float[adlar.length];
        
        Random rnd= new Random();
        maas = rnd.nextInt(30000, 50001);
        zamlımaas = (maas+maas*50/100);
        evgideri =(zamlımaas*75/100);
        kalanpara=(zamlımaas-evgideri);
        kendineayrılanpara=(kalanpara*25/100);
        harclıkicinayrılanpara=(kalanpara-kendineayrılanpara);
        
        System.out.println("babanın maaşı: "+maas);
        System.out.println("zamlı Maaş: "+zamlımaas);
        System.out.println("ev gideri ne kadar? : "+evgideri);
        System.out.println("kalan para ne kadar? " + kalanpara);
        System.out.println("babanın kendine ayırdığı para ne kadar? : "+kendineayrılanpara);
        System.out.println("babanın harçlık için ayırdığı para ne kadar? : "+ harclıkicinayrılanpara);
        
           System.out.printf("\n%-20s %-15s %-15s %-15s \n", "Çocuk", "BabaPara", "AnnePara", "ToplamPara");
           
                    


        for (int i = 0; i < adlar.length; i++) {
            int harclik = rnd.nextInt(200,751);
            if (harclıkicinayrılanpara>=harclik){
                baba_harclık[i]=harclik;
                harclıkicinayrılanpara-=harclik;
            }else 
                baba_harclık[i]=0;
            if(yaslar[i]%2==0)
            anne_harclık[i]=harclik*0.4f;
            else 
                anne_harclık[i]=harclik*0.3f;
           toplam_harclık[i]=baba_harclık[i]+anne_harclık[i]; 
           
            System.out.printf("%-20s %-15.2f %15s %15s \n", adlar[i], baba_harclık[i],anne_harclık[i],toplam_harclık[i]);
        }
         
    }
    static double harclikhesapla(int yas,double harclik){
        double sonuc = 0.0;
         if(yas%2==0)
            sonuc=harclik*0.4f;
            else 
                sonuc=harclik*0.3f;
         return sonuc;  
        }
        
    }

