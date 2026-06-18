
public class ıncrement {
    public static void main(String[] args) {
        System.out.println("hafta3.ıncrement.main()");
        int sayac = 1;
        
        System.out.println("sayac: " + sayac); //1
        System.out.println("sayac++:" +sayac++);//1 sayac = 2
        System.out.println("sayac:" + sayac); //2
        System.out.println("++sayac: " + ++sayac); //3 sayac=3
        
        System.out.println("sayac--:" + sayac--);//3 sayac=2
        System.out.println("sayac: " + sayac);//2
        
        sayac = 0;
        System.out.println("sayac: " + sayac);
        
        sayac +=5;
        System.out.println("sayac: " + sayac);
        
        sayac*=3; //sayac = sayac*3
        System.out.println("sayac: " + sayac);
        
        //15
        sayac++;
        System.out.println("sayac: " + sayac);//
        
        

        
    }
    
}
