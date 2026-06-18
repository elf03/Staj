
package hafta7;


public class DegiskenGecerlilik {
    public static void main(String[] args) {
        System.out.println("hafta7.DegiskenGecerlilik.main()");
        int x=23; //local
        {
        //float x=500;
            x=55;
            int a=5;//local
            System.out.println("a: " + a);
            a=3;
        }
    //a=3;
    x=99;
    }//main
    
    static void deneme() {
        System.out.println("hafta7.DegiskenGecerlilik.deneme()");
        int x=25;
        float x2 =15000f;
    }
}
