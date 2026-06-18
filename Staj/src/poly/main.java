
package poly;

public class main {
    
    public static void hayvaniKonustur(Hayvan hayvan){
        hayvan.sesCikar();
        hayvan.sesCikar();
    }
   
   public static void hayvaniKonustur2(Object object){
       if (object instanceof Kedi kedi){
           kedi.sesCikar();
       }
       else if(object instanceof Kopek kopek){
           kopek.sesCikar();
        }
       else if(object instanceof Kus kus){
           kus.sesCikar();
        }
       else if(object instanceof Hayvan hayvan){
           hayvan.sesCikar();
       }
       
   }    
    public static void main(String[] args) {
        
       
        Kedi kedi1 =new Kedi("Felix");
        Kus kus1= new Kus("Tweety");
        Kopek kopek1=new Kopek("karabaş");
        
        hayvaniKonustur2(kus1);
        hayvaniKonustur2(kopek1);
        hayvaniKonustur2(kedi1);
       
        
        
        /*    
        hayvan1.sesCikar();
        kedi1.sesCikar();
        kus1.sesCikar();
        kopek1.sesCikar();
        */
        
        

// System.out.println(kedi1.getAdi());
    }
    
}
