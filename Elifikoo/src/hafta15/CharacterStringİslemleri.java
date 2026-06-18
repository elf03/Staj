
package hafta15;


public class CharacterStringİslemleri {
    public static void main(String[] args) {
        char ch = 'a';
        char[] adchar = {'A','l','i'};
        String ad = new String(adchar);
        
        for( char c: adchar){
            System.out.print(c);
        }
        System.out.print("\n");
        System.out.println("AD: ".concat(ad));
        
        String s1 = "Ali";
        String s2 = "Calim";
        String s3 = "ali";
        
        System.out.println("s1.compareTo(s3)" + s1.compareTo(s3));
        System.out.println("s1.compareTo(s3)" + s1.compareToIgnoreCase(s3));
        
        System.out.println("s1.compareTo(s2)" + s1.compareTo(s2));
        System.out.println("s2.compareTo(s3)" + s2.compareTo(s3));
          
        //concat = + 
    }
}
