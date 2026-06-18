package InterfaceOrnek;

public class Otomobil implements IHgs{
    String plaka;
    int bakiye;
    private String sunroofAc;
    
    
    public Otomobil(String plaka,int bakiye){
        this.plaka=plaka;
    }

    @Override
    public int hgsBakiyeSorgula() {
      return this.bakiye;
    }
    @Override
    public String hgsPlakaGoster() {
        return this.plaka;
    }

    @Override
    public String sunroofAc() {
       return this.sunroofAc;

    }

}