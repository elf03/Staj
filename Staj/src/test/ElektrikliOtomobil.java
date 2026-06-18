package test;

public class ElektrikliOtomobil extends Otomobil {
    
    private int sarjDurumu;
    private String motorAkuTipi;
            
            
    public ElektrikliOtomobil(int sarjDurumu, String akuTipi)
    {
        super("mavi","çelik");
        this.sarjDurumu = sarjDurumu;
        this.motorAkuTipi= akuTipi;
    }
    
    public ElektrikliOtomobil()
    {
        this(15,"tesla-b");
    }
    
    public String getAkuTipi(){
        return this.motorAkuTipi;
    }
    
    public void  setAkuTipi(String akuTipi){
        this.motorAkuTipi= akuTipi;
    }
    
    public int getSarjDurumu(){
        return sarjDurumu;
    }
   public void setSarjDurumu(int sarjMiktari){
       this.sarjDurumu=sarjMiktari;
   }
    
    
    public void fullSarjEt()
    {
     this.sarjDurumu=100;   
    }
            
}
