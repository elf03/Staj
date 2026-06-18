
package hafta12;


public class CokBoyutluDizi1 {
 

    public static void main(String[] args) {
        String[] dersler={"Algortima", "Matematik","TDili","Tarih"};
        float[][] notlar;
        //kaç derse ait not olacak n(SATIR)=5,
        //bir derse ait not sayısı (vize,final ,ort) m(SÜTUN)=3
        
        notlar = new float[4][3];
        notlar = new float[dersler.length][3];
        notlar[0][0]=90;
        notlar[0][1]=45;
        notlar[1][0]=35;
        notlar[2][2]=88;
    
  
        for (int i = 0; i < notlar.length; i++) {
            System.out.printf("%-20s" , dersler[i] );
            
            for (int j = 0; j < 3; j++) {
                if(j<2)
                notlar[i][j]=Math.round(Math.random()*100 );
                else{
                      float ort=notlar[i][0] *0.4f + notlar[i][1]*0.6f;
                      notlar[i][2]=Math.round(ort);
                }
                  
                System.out.printf("%-10.2f",notlar[i][j]);
           
            }//for3
            
            System.out.println("");
        
        }//for2 notlar
            
        }//psv
    }//main
    

   

