
package hafta6;

//5 kişiye ait ad,yaş ve maaş bilgilerini saklayan ve ekrana yazdıran program

import javax.sound.midi.Soundbank;

public class diziler {
    public static void main(String[] args) {
        System.out.println("hafta6.diziler.main()");
        String[] adlar={"Ahmet", "Ertuğrul", "Selim", "Abdüssamed","Ayşe"};
        int yaslar[] = new int[]{19,29,21,18,20};
        double[] maaslar = new double[5];
        
        maaslar[1] = 555000.675;
        maaslar[0] = 22500;
        maaslar[2] = 37500.55;
        maaslar[3] = 42550;
        maaslar[4] = 15000;
        
        //System.out.println("Ad: " + adlar[0] + "Yaş: " + yaslar[0] + "Maaş: " + maaslar[0] );
        
        System.out.println("\nPERSONEL BİLGİLERİ:("  +adlar.length +")");
        System.out.println("AD\t YAS \t MAAŞ ");
        System.out.println(adlar[0]+"\t" + yaslar[0] +"\t" + maaslar[0]);
        System.out.println(adlar[1]+"\t" + yaslar[1] +"\t" + maaslar[1]);
        System.out.println(adlar[2]+"\t" + yaslar[2] +"\t" + maaslar[2]);
        System.out.println(adlar[3]+"\t" + yaslar[3] +"\t" + maaslar[3]);
        System.out.println(adlar[4]+"\t" + yaslar[4] +"\t" + maaslar[4]);
        
        //Ertuğrul verisini Ali olarak değiştiren ve ekrana yazdıran kod
        
        adlar[1]="Ali";
        System.out.println("yeni değer");
        System.out.println(adlar[1]+"\t" + yaslar[1] +"\t" + maaslar[1]);

        
        
        
        
        
    }//main
    
    
    
}//class
