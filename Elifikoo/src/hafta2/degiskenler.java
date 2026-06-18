
package hafta2;


public class degiskenler {
    
    public static void main(String[] args) {
        System.out.println("MERHABA DÜNYA");
        //system.out.println("Byte b1: " + il); //HATA: il değişkeni ERİŞİLEMEZ/TANIMSIZ DURUMDA 
        
        byte b1;
        short s1, s2; //aynı tipteki değişkenler araya virgül konularak aynı satırda tanımlanabilir
        int i1 = 7777, i2 = 12850985; //değişkenlerimizin ilk değerleri tanımlandığı yerde = operatörü ile atanabilir
        long x,y;
        
        //değişken değerlerini yazdırma işlemi 
        //system.out.println("byte b1:" + b1); //HATA: içerisine hiç değer atamamış bir değişken kullanılmaz.
        //b1 =500 // HATA: değişken değer aşım hatası 
        b1 = -128;
        System.out.println("Byte = " +b1);
        
        //s1 = 35000; //HATA: değer aşım hatası
        s1 = -32768; //MIN değeri
        s2 = 32767; //MAX değeri 
        
        System.out.println("SHORT s1:" + s1 + "s2:"+ s2);
        
      System.out.printf("int i1: %d i2 : %d ", i1 ,i2);
      //ONDALIKLI SAYI - VERİ TİPLERİ
      float f1 , f2=12.5f;
      double d1, d2= 12.5;
      
      f1= 48.55f;
      d1= 128980655.987654321;
      
        System.out.println("f1: " + f1 + "f2:" +f2);
        System.out.println("d1: " + d1 + "d2:" +d2);
        
        //METİNSEL KARAKTER VERİ TİPLERİ
        char cinsiyet ='K';
        String ad, soyad = "BİLMİŞ";
        ad = "Elif";
        System.out.println("Ad:" +ad + "\nsoyad: " +soyad);
        System.out.println("cinsiyet: " + cinsiyet);
        
                
    }
    
}
