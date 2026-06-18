package heli;

public class Helikopter {
   
    int kuyrukNumarası;
    private Motor motor;
    private Pervane pervane;
    private Depo depo;

    public Helikopter(int kuyrukNumarası, Motor motor, Pervane pervane, Depo depo) {
        this.kuyrukNumarası = kuyrukNumarası;
        this.motor = motor;
        this.pervane = pervane;
        this.depo = depo;
    }
    
    public int getKuyrukNumarası() {
        return kuyrukNumarası;
    }

    public void setKuyrukNumarası(int kuyrukNumarası) {
        this.kuyrukNumarası = kuyrukNumarası;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pervane getPervane() {
        return pervane;
    }

    public void setPervane(Pervane pervane) {
        this.pervane = pervane;
    }

    public Depo getDepo() {
        return depo;
    }

    public void setDepo(Depo depo) {
        this.depo = depo;
    }
   
        
            
            
    
    
}
