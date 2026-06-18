//bu bir açıklama satırıdır
/*çoklu açıklama satırı
classlar içinde işlem yapan yapılara METOD / fonksiyon denir.
*/
public class Program {
    
    static void mesajVer(){
        System.out.println("MERHABA");
        System.out.println("DÜNYA");
    }//mesaj ver
    
    public static void main(String[] abc){
        System.out.println("MAİN METODU ÇALIŞTI");
        mesajVer();
        parametreliMesaj("MİNNOŞ");
    }
    
    static void parametreliMesaj(String msj){
        System.out.println("parametreli metod çalıştı");
        System.out.println(msj);
        //b=10 intin üstünde olursa tanım dışı olur
        int a,b;
        int sonuc;
        a=5;
        b=10;
        sonuc= a + b;
        System.out.println("a: "+a + "b: "+b);
        System.out.println("sonuc(a+b): "+ sonuc);
        
    }
}//class
