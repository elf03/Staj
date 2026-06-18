package com.yta;

import com.yta.Personel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsMain2 {

    public static void main(String[] args) {

        List<Personel> list = new ArrayList<>();
        list.add(new Personel("Necip", "\u00c7\u0131nar"));
        list.add(new Personel("Ayşe", "\u00c7\u0131nar"));
        list.add(new Personel("Zeliha", "\u00c7\u0131nar"));
        list.add(new Personel("Muammer", "\u00c7\u0131nar"));

//        Personel personel = null;
//
//        for (Personel p : list) {
//            if  (p.getIsim().equals("Ayşe")) {
//                personel = p;
//            }
//        }
//        list.remove(personel);
//
//        System.out.println(list);

        // for (int i=0;i<10;)
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Personel p = (Personel) iterator.next();
            if (p.getIsim().equals("Ayşe") || p.getIsim().equals("Zeliha")) {
                iterator.remove();
            }
        }
    }
}