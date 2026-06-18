
package hafta12;


public class CokBoyutluDizi2 {
       public static void main(String[] args) {
        String[][] dersler={{"Algortima","AA"},
                            {"Matematik","BB"},
                            {"TDili","CC"},
                            {"Tarih","DD"}
                            };
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
            System.out.printf("%-20s" , dersler[i][0] );
             float ort=0;
            for (int j = 0; j < 3; j++) {
                if(j<2)
                notlar[i][j]=Math.round(Math.random()*100 );
                else{
                      ort=notlar[i][0] *0.4f + notlar[i][1]*0.6f;
                      notlar[i][2]=Math.round(ort);
                }
                  
                System.out.printf("%-10.2f",notlar[i][j]);
           
            }//for3
              dersler[i][1]=hafta9.OrnekUygulama.harfNotuHesaplama(ort);
              System.out.println(dersler[i][1] );
        
        }//for2 notlar
            
        }//psv
    }//main
    

   

