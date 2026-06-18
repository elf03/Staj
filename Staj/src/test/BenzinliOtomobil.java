package test;

public class BenzinliOtomobil extends Otomobil {
    
    private int yakitDurumu;
    
    public BenzinliOtomobil(int yakitDurumu)
    {
        super("kırmızı" ,"normal");
        this.yakitDurumu =yakitDurumu;
        
    }
    
    
    public int getYakitDurumu()
    {
        return yakitDurumu;
    }
    public void setYakitDurumu(int yakitMiktari){
        this.yakitDurumu=yakitMiktari;
    }
   
    
    
    public void depoyuFullDoldur()
    {
     this.yakitDurumu=100;   
    }
}
