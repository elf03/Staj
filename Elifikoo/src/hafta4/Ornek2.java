
package hafta4;

/*bir öğrencinin ad soyad vize ve final bilgilerini alarak öğrencinin ortalama notunu(vize%40 + final%60) 
hesaplayan ve bütün bilgileri ekrana yazdıran program.

1 ortalama notu 50 ve daha büyük ise geçti değil ise kaldı yazan program
2 Ortalama notu ve final 50 den büyük eşit ise geçti değilse kaldı yazan program
3 Ortalama notu veya final notu 50 den büyük eşit ise geçti değilse kaldı yazan program
*/ 
public class Ornek2 {
    public static void main(String[] args) {
        System.out.println("hafta4.Ornek2.main()");
        
        String ad = "Elif", soyad = "Bilmiş";
        float vize , fnl, ort;
        
        vize = 60;
        fnl = 80;
        
        System.out.println("ad: " + ad + " soyad: " + soyad + " vize:" + vize + " fnl:" + fnl);
        System.out.printf("Vize: %.2f Final %.2f\n", vize , fnl );
        
        ort = (vize * 0.4f) + (fnl *60/100);
        System.out.println("ORT:" + ort);
        /*
        if(ort>=50){
            System.out.println("GEÇTİ");
        }
        else
            System.out.println("KALDI");
        */
        //VE=AND = && VEYA = OR = ||
        /*if(ort>=50 && fnl>=50){
            System.out.println("GEÇTİ");
        }
        else
            System.out.println("KALDI");
        */
        
        if(ort>=50 || fnl>=50){
            System.out.println("GEÇTİ");
        }
        else
            System.out.println("KALDI");
    }
}
