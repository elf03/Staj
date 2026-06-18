package test2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;


public class Output {
    
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
   
        try{
            fileOutputStream=new FileOutputStream("test.txt",true);
            fileOutputStream.write(76);
            String metin="Ali Veli";
            byte[] array = metin.getBytes();
            fileOutputStream.write(array);
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Dosya I/O hatası oluştu");
                e.printStackTrace();
            }
        }
        System.out.println("program kapanıyor");
    }
    
}
