package InterfaceOrnek;


public class Kamyon implements IHgs {
int bakiye;
String plaka;

    public Kamyon(String plaka, int bakiye) {
        this.bakiye = bakiye;
        this.plaka = plaka;
    }
    

    @Override
    public int hgsBakiyeSorgula() {
        return this.bakiye;
    }
    @Override
    public String hgsPlakaGoster() {
        return this.plaka;
    }
    
    public String sunroofAcma(){  
    return this.sunroofAcma();
        
    }

    @Override
    public String sunroofAc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }
    

