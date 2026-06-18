package com.yta;
import java.util.LinkedList;
import java.util.List;
public class Main2 {
    
    public static void main(String[] args) {

    List<String> linkList = new LinkedList<>();
    linkList.add("Mercedes");
    linkList.add("BMW");
    linkList.add("Suzuki");
    linkList.add("Honda");

    for (String marka : linkList) {
        System.out.println(marka);
    }

    System.out.println();

    System.out.println(linkList.contains("Opel"));

    linkList.remove("BMW");

    for (String marka : linkList) {
        System.out.println(marka);
    }

    System.out.println(linkList.get(0));

    }
}

