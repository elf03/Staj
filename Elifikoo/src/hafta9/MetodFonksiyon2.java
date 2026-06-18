
package hafta9;


public class MetodFonksiyon2 {
    
    public static void main(String[] args) {
        System.out.println("hafta9.MetodFonksiyon2.main()");
        float sonuc;
        sonuc = 10;
        System.out.println("sonuc:" + sonuc);
        
        float f1,f2;
        f1 =22;
        f2 =8;
        sonuc = fnTopla(f1,f2);
        System.out.println("sonuc:" + sonuc );
        
        System.out.println("Ad Soyad: "  + fnBirlestir("ertuğrul " , " duman"));
    }
    
    //Geriye iki sayının toplamını veren/döndüren fonksiyon
    
    static float fnTopla(float s1, float s2){
        System.out.println("hafta9.MetodFonksiyon2.fnTopla()");
        return (s1+s2);
    }
    
    //kişinin ad ve soyad verilerini birleştiren ve geri döndüren fonksiyon
    static String fnBirlestir(String ad, String soyad){
        System.out.println("hafta9.MetodFonksiyon2.fnBirlestir()");
        return ad + "" + soyad;
        
        
    }
}
