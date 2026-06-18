
package test;


public class Main {
    public static void main(String[] args) {
      /*  
        Otomobil otomobil1 = new Otomobil("yesil","çelik ");
        System.out.println(otomobil1.getRenk() + " " + otomobil1.getCant() + otomobil1.getModel());
        
        Otomobil otomobil2 = new Otomobil("pembe","normal ");
        System.out.println(otomobil2.getRenk() + " " + otomobil2.getCant()+ otomobil2.getModel());
        
         Otomobil otomobil3 = new Otomobil();
        System.out.println(otomobil3.getRenk() + " " + otomobil3.getCant()+ " " + otomobil3.getModel());
        
        ElektrikliOtomobil elektrikliOtomobil =new ElektrikliOtomobil(20,"tesla-c");
        System.out.println(elektrikliOtomobil.getRenk() + " " + elektrikliOtomobil.getCant() + " " + elektrikliOtomobil.getSarjDurumu() + " " + elektrikliOtomobil.getAkuTipi());
   
         BenzinliOtomobil benzinliOtomobil = new BenzinliOtomobil(10);
        System.out.println(benzinliOtomobil.getRenk()+ " " + benzinliOtomobil.getCant() + " " + benzinliOtomobil.getYakitDurumu());
        */
      
      
      ElektrikliOtomobil tesla1 = new ElektrikliOtomobil(40, "tesla-a");
      ElektrikliOtomobil tesla2= new ElektrikliOtomobil(25,"tesla-b");
      
      ElektrikliOtomobil tesla3;
      tesla3=tesla1;
      tesla3.setSarjDurumu(75);
      
      tesla1=tesla2;
      
        if (tesla1==tesla3) 
            System.out.println("Aynı yeri gösteriyorlar");
        else 
            System.out.println("farklı yeri gösteriyorlar");
        
        System.out.println(tesla1.getSarjDurumu());
      
      
    
    }
    
}
