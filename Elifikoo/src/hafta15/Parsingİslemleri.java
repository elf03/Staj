
package hafta15;


public class Parsingİslemleri {
    public static void main(String[] args) {
        int x = Integer.parseInt("5");
        System.out.println("int x: "+ x);
        
 
        double y = Double.parseDouble("5.4");
        System.out.println("int y: " + y);
        
        x= Integer.parseInt("10", 16);
        System.out.println("int x(10,16): "+x);
        
        x= Integer.parseInt("A", 16);
        System.out.println("int x(A,16): "+x);
    }
    
}
