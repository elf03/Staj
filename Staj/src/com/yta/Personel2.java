package com.yta;

import java.util.PriorityQueue;
import java.util.Queue;


public class Personel2 implements Comparable<Personel2>{
    
    private int SicilNo;
    private String ad;
    private String soyad;

    public Personel2(int SicilNo, String ad, String soyad) {
        this.SicilNo = SicilNo;
        this.ad = ad;
        this.soyad = soyad;
    }

    public int getSicilNo() {
        return SicilNo;
    }

    public void setSicilNo(int SicilNo) {
        this.SicilNo = SicilNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Personel2{" + "SicilNo=" + SicilNo + ", ad=" + ad + ", soyad=" + soyad + '}';
    }
    
    
   
  @Override
public int compareTo(Personel2 o) {

    if(this.SicilNo < o.SicilNo){
        return -1;
    }
    else if(this.SicilNo > o.SicilNo){
        return 1;
    }
    else{
        return 0;
    }
}
    public static void main(String[] args) {
        
        Queue<Personel2> personelQueue = new PriorityQueue<Personel2>();
        personelQueue.add(new Personel2(123,"Zeki" , "Çalışkan"));
        personelQueue.add(new Personel2(101,"Gökhan" , "Çelik")); 
        personelQueue.add(new Personel2(158,"Ahmet" , "Emre"));
        personelQueue.add(new Personel2(144,"Fatoş" , "Çalışkan"));
          
        
        System.out.println("Queumuzdaki elemanlar: ");
        
        while (personelQueue.isEmpty() == false) {
    System.out.println("Çıkan Eleman: " + personelQueue.poll());
}
        
    }

}



