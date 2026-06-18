
package hafta10;


public class JavaMath {
    public static void main(String[] args) {
        double d = -100.675;
        double e = 100.325;
        
        System.out.println("double d: " + d);
        System.out.println("double e: " + e);
        
        System.out.println("Math.abs(d): " + Math.abs(d));
        System.out.println("Math.ceil(d): " + Math.ceil(d));
        System.out.println("Math.ceil(e): " + Math.ceil(e));
        
        
        System.out.println("Math.floor(d): " + Math.floor(d));
        System.out.println("Math.floor(e): " + Math.floor(e));
        
        
        System.out.println("5^3: " +Math.pow(5, 3));
        
        System.out.println("Math.round(d): " + Math.round(d));
        System.out.println("Math.round(e): " + Math.round(e));
        
        System.out.println("ROUND(12.55): " + Math.round(12.55));
        System.out.println("ROUND(12.35): " + Math.round(12.35));
        
        double rnd= Math.random();
        System.out.println("rnd: " + rnd);
        System.out.println("(rnd * 100): " + rnd *100);
        
        double t = (rnd *100);
        int i =(int)t;//TYPE CAST ing işlemi
        System.out.println("(rnd * 100): "+ t);
        System.out.println("(int)(rnd * 100): " + i ); 
        
        System.out.println("(ceil)(t): " + Math.ceil(t)); 
        System.out.println("(floor)(t): " + Math.floor(t)); 
        System.out.println("(round)(t): " + Math.round(t) ); 
        
        
    }
}
