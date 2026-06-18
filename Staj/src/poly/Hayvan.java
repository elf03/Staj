package poly;


public abstract class Hayvan {
    
    private String adi;

    public Hayvan(String adi) {
        this.adi = adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
    
  
    public abstract void sesCikar();
        
    
}
