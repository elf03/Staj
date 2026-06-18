package InterfaceOrnek;


public class main {
    
    public static void hgsBilgileriniEkranaYazEgerOtomobilseSunroofAc(IHgs arac){
         System.out.println(arac.hgsBakiyeSorgula() + " " + arac.hgsPlakaGoster());
        
         if(arac instanceof Otomobil){
             Otomobil oto=(Otomobil) arac;
             oto.sunroofAc();
         }
    }
    
    public static void main(String[] args) {
        
        Otomobil myoto1 = new Otomobil("34ZZ001", 100);
        Kamyon mykamyon1 = new Kamyon("34YY002", 200);
        
        hgsBilgileriniEkranaYazEgerOtomobilseSunroofAc(myoto1);
        myoto1.sunroofAc();
        hgsBilgileriniEkranaYazEgerOtomobilseSunroofAc(mykamyon1);
        mykamyon1.sunroofAcma();
    }
}
