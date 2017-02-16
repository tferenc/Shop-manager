package bolt.aruk;

import java.util.Date;


public abstract class Tej extends Elelmiszer
{
    public static final int LITER = 10;
    public static final int FELLITER = 5;
    public static final int POHAR = 2;
    public static final double ZSIROS =3.6;
    public static final double FELZSIROS = 2.8;
    protected int urtartalom;
    protected double zsirtartalom;

    public Tej(long vonalkod,int urtartalom, String gyarto,Date szavatossagiido, double zsirtartalom)
    {
        super(vonalkod, gyarto, szavatossagiido);
        this.urtartalom = urtartalom;
        this.zsirtartalom = zsirtartalom;
    }

    public Long getVonalkod()

    {
        return vonalkod;
    }
    public int getUrtartalom()
    {
        return urtartalom;
    }
    public String getGyarto()
    {
        return gyarto;
    }
    public Date getSzavatossagiido()
    {
        return szavatossagiido;
    }
    public double getZsirtartalom()
    {
        return zsirtartalom;
    }
    public boolean joMeg() {
        Date now = new Date();
        if (now.before(szavatossagiido)) {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return ("Űrtartalom: " + getUrtartalom()
                + "\nGyártó: "+ getGyarto() + "\nSzavatossági idő: " + getSzavatossagiido()
                + "\nZsírtartalom: " + getZsirtartalom());
    }
}
