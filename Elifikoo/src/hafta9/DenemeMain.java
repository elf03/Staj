
package hafta9;

public class DenemeMain {
    public static void main(String[] args) {
        System.out.println("hafta9.DenemeMain.main()");
        
        MetodFonksiyon.mesajver();
        
        int a = 15 ;
        String ad; //tipi String olan ad isminde NESNE/OBJECT tanımlanmıştır
        
        MetodFonksiyon mf; //tipi metod fonksiyon olan mf isminde NESNE/OBJECT tanımlanmıştır
        
        mf = new MetodFonksiyon();//MetodFonksiyon() = NESNE üreten YAPICI metod
        
        mf.mesajver(a);
        mf.mesajver("HAKAN ENEKTARLAR KOLTUĞUN ALTINDA");
        
    }
    
    
    
}
