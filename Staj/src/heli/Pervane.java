
package heli;

public class Pervane {
    private int uzunluk;
    private int rpm;

    public Pervane(int uzunluk, int rpm) {
        this.uzunluk = uzunluk;
        this.rpm = rpm;
    }
    
    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
