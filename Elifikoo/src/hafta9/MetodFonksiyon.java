
package hafta9;


public class MetodFonksiyon {
    
    
    public static void main(String[] args) {
        System.out.println("hafta9.MetodFonksiyon.main()");
        mesajver();
       
        MetodFonksiyon mf1 = new MetodFonksiyon();
        mf1.mesajver("MERHABA");
        mf1.mesajver(99);
    }
            
        
  public static void mesajver(){
        System.out.println("hafta9.MetodFonksiyon.mesajver()");
        int a;
        //float a; hata verir çünkü aynı değer aynı metod içinde tanımlanamaz
    } 
    void yemekye(){
        System.out.println("hafta9.MetodFonksiyon.yemekye()");
    }
    //metod overload = metod aşırı yüklenmesi
    void mesajver(String msj){
        System.out.println("hafta9.MetodFonksiyon.mesajver(msj): " + msj);
    }
    //metod overload = metod aşırı yüklenmesi
    void mesajver(int y){
        System.out.println("hafta9.MetodFonksiyon.mesajver(int y): " + y);
    }
    
    
    
}
