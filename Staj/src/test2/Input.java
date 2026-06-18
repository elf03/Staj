package test2;
import java.io.FileInputStream;
import java.io.IOException;



public class Input {
    
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
   
        try{
            fileInputStream=new FileInputStream("test.txt");
        
            String metin="";
            int okunan;
            while ((okunan = fileInputStream.read()) !=-1){
                metin = metin +(char) okunan;
            }
            
            
        }catch(Exception e){
               e.printStackTrace();
        }finally{
            try {
                    fileInputStream.close();
            } catch (IOException e) {
                    System.out.println("Dosya I/O hatası oluştu");
                    e.printStackTrace();
            }
        }
        System.out.println("program kapanıyor");
    }
    
}
