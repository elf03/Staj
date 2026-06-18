package stc;


public class main {
     
    public static void main(String[] args) {
        Calisan personel1=new Calisan("Ali");
        System.out.println(personel1.getIsim());
        
            Calisan personel2=new Calisan("Veli");
        System.out.println(personel2.getIsim());
        
        
            Calisan personel3=new Calisan("Ayse");
        System.out.println(personel3.getIsim());
        
        System.out.println(Calisan.calisanSayisiniGoster());
    }
    
    
}
