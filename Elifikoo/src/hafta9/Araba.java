
package hafta9;


public class Araba {
    int tekersayisi;
    int kapisayisi;
    String marka;
    String renk;
    //araba nesnesinin özellikleri = Attiribute = Fields =Alan
    
    
    //nesnemizin yapabildiği iş ve işlemler
    void calis(){
        System.out.println("hafta9.Araba.calis()" + marka);
    }
    void hizlan(){
        System.out.println("hafta9.Araba.hizlan()" + this.marka);
    }
    
    public static void main(String[] args) {
        System.out.println("hafta9.Araba.main()");
        
        Araba a1,a2,a3;
        
        a1 = new Araba();
        a1.marka = "Mercedes";
        a1.tekersayisi = 6;
        a1.calis();
        
        a2 = new Araba();
        a2.marka = "BMW";
        a2.tekersayisi = 4;
        a2.calis();
         
        a1.hizlan();


    }
}
