
package hafta7;

//ankara antalya bursa bayburt

import javax.xml.transform.Source;

public class DongulerForEach {
    public static void main(String[] args) {
        System.out.println("hafta7.DongulerForEach.main()");
        
        String[] iller = {"Ankara","Antalya","Bursa","Bayburt"};
        
        for(String sehir : iller){
          if(sehir.equals("Antalya"))//sehir == "antalya"
              continue;
                
            System.out.println("Şehir: " +sehir);
        }
        
        
        
        
    }
    
}
