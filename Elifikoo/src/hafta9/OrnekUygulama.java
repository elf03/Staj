package hafta9;

//bir öğrenciye ait ad,soyad,vize ve final bilgilerini alıp
//ortalama ve harf notlarını hesaplayan ve ekrana yazdıran program
//ortalama hesaplaması ve harf notu hesaplaması ayrı ayrı fonksiyon olarak yazılacak
public class OrnekUygulama {

    public static void main(String[] args) {
        System.out.println("hafta9.OrnekUygulama.main()");
        String Ad;
        String Soyad;
        String harfNotu = "x";
        float vize;
        float fnl;
        float ortalama;

        Ad = "elif";
        Soyad = "bilmiş";
        vize = 60;
        fnl = 80;
        ortalama = ortalamaHesaplama(vize, fnl);
        System.out.println("vize: " + vize + "fnl: " + fnl + " ortalama: " + ortalama);
        
        harfNotu=harfNotuHesaplama(ortalama);
        System.out.println("HarfNotu: " + harfNotu);

    }

    static float ortalamaHesaplama(float vize, float fnl) {
        return (vize * 0.4f) + (fnl * 0.6f);

    }

    public static String harfNotuHesaplama(float ortalama) {
        String harfNotu = "";

        if (ortalama >= 90 && ortalama <= 100) {
            harfNotu = "AA";
        } else if (ortalama >= 85) {
            harfNotu = "BA";
        } else if (ortalama >= 80) {
            harfNotu = "BB";
        } else if (ortalama >= 75) {
            harfNotu = "CB";
        } else if (ortalama >= 70) {
            harfNotu = "CC";
        } else if (ortalama >= 65) {
            harfNotu = "DC";
        } else if (ortalama >= 60) {
            harfNotu = "DD";
        } else if (ortalama >= 50) {
            harfNotu = "FD";
        } else if (ortalama >= 0) {
            harfNotu = "FD";
        } else
            harfNotu = "??";
        
         return harfNotu;
        

    }
}
