
package hafta7;

// 2 adet sayı ve işlem tipine göre(+,-,*...) istenilen sonucu hesaplayan ve ekrana yazdıran
public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("hafta7.SwitchCase.main()");
        int s1, s2;
        String islem;
        s1 = 10;
        s2 = 3;
        islem = "?";
        System.out.printf("s1:%d \ns2:%d \nislem: %s\n",s1, s2, islem);

        switch (islem) {
            case "+":
                System.out.println("Sonuç: " + (s1 + s2));
                break;
            case "-":
                System.out.println("Sonuç: " + (s1 - s2));
                break;
           
            case "*":
                System.out.println("Sonuç: " + (s1 * s2));
                break;
            case "/":
                System.out.println("Sonuç: " + (s1 /s2));
                break;
            case "%":
                System.out.println("Sonuç: " + (s1 % s2));
                break;
            default:{
                //throw new AssertionError();
                System.out.println("HATALI bir işlem seçtiniz");
            }//default
                
        }//switch

    }//main

}//class