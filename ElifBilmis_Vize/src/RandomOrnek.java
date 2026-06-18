
import java.util.Random;


public class RandomOrnek {
    public static void main(String[] args) {
        
        int max =10;
        int min =5;
        double x =Math.random();
        System.out.println("Math.random(): " + x);
        
        double y =Math.random()*(max-min)+min;
        System.out.println("y: " + y);
        System.out.println("Math.ceil(y): " +(int) Math.ceil(y));
        System.out.println("Math.floor(y): " + (int)Math.floor(y));
        System.out.println("Math.round(y): " + (int)Math.round(y));
        
        System.out.println("\n-----------------");
        Random rnd =new Random();
        System.out.println("rnd.nextInt(): " + rnd.nextInt() );
        System.out.println("rnd.nextInt(50): " + rnd.nextInt(50));
        System.out.println("rnd.nextInt(50 , 100): " + rnd.nextInt(50 , 100));
    }
}
