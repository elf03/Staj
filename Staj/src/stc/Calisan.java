package stc;


public class Calisan {

    private String isim;
    private static int toplamCalisan=0;
    
    
    public Calisan(String isim) {
        this.isim = isim;
        toplamCalisan++;
    }
    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public static int calisanSayisiniGoster(){
        return toplamCalisan;
    }
    
    
}
