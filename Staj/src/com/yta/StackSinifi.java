
package com.yta;

import java.util.Stack;


public class StackSinifi {
    

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.add("Elma");
        stack.add("Muz");
        stack.add("Armut");

        System.out.println(stack.peek());

        String cikarilan = stack.pop();
        System.out.println(cikarilan);

        System.out.println(stack.peek());


        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());

        System.out.println("\n- - - - - - -\n");

        Personel p1 = new Personel("Zeki", "Çınar");
        Personel p2 = new Personel("Ayşe", "Demir");
        Personel p3 = new Personel("Hüseyin", "Çalış");

        Stack<Personel> stackPersonel = new Stack<>();

        stackPersonel.add(p1);
        stackPersonel.add(p2);
        stackPersonel.add(p3);

        System.out.println(stackPersonel.peek());
        System.out.println("Çıkan personel :" + stackPersonel.pop());
}
}
