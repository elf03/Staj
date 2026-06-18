
package hafta7;

//1 den 50 ye kadar olan sayıları ve toplamlarını ekrana yazdıran program(while)
public class DongulerWhile {
  public static void main(String[] args) {
        System.out.println("hafta7.DongulerWhile.main()");
        int i = 1;
        int t=0;
        while (i<=50) {
            t +=i;// t=t+i;
            System.out.println("i: " + i + " top: "+ t);
            i++;

        }//while
        System.out.println("\n Toplam: "+t);
    }//main

}//class