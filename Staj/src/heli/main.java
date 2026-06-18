package heli;


public class main {
    public static void main(String[] args) {
        
        Motor myMotor = new Motor(700,1000);
        Pervane myPervane =new Pervane(10,2000);
        Depo myDepo = new Depo(200);
        Helikopter sikorsky =new Helikopter (178, myMotor, myPervane,myDepo);
        sikorsky.getMotor().motoruCalis();
        sikorsky.getMotor().motoruKapat();
        
       
        
    }
    
}
