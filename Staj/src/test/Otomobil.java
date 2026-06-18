package test;

public class Otomobil {
    
    private String renk;
    private String cant;
    private String model = "audi";
    private int en =2;
    private int boy =3;
    
    //constructor1
    public Otomobil(String renk,String cant)
    {
        this.renk= renk;
        this.cant =cant;
    }
    //constructor2
    public Otomobil()
    {
        this("mavi","normal");
    }
    
    public void setRenk(String rnk)
    {
        this.renk=rnk;
    }
    public String getRenk()
    {
        return this.renk;
    }
      public void setCant(String cnt)
    {
        this.cant=cnt;
    }
    public String getCant()
    {
        return this.cant;
    }
    public String getModel()
    {
        String model ="opel";
        return this.model;
    }
    public int getEn()
    {
        return this.en;
    }
    
    public int getBoy()
    {
        return this.boy;
    }
}
