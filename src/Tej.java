
import java.util.Date;


public abstract class Tej
{
    private long vonalkod;
    final int LITER = 4;
    final int FELLITER = 2;
    final int POHAR = 1;
    final double ZSIROS =3.6;
    final double FELZSIROS = 2.8;
    protected int urtartalom;
    protected String gyarto;
    protected Date szavatossagiido;
    protected double zsirtartalom;
    protected long ar;

    public Tej(long vonalkod,int urtartalom, String gyarto,Date szavatossagiido, double zsirtartalom)
    {
        this.vonalkod = vonalkod;
        this.urtartalom = urtartalom;
        this.gyarto = gyarto;
        this.szavatossagiido = szavatossagiido;
        this.zsirtartalom = zsirtartalom;
        this.ar = ar;
    }

    public long getVonalkod()

    {
        return vonalkod;
    }
    public boolean joMeg() {
        Date now = new Date();
        if (now.before(szavatossagiido)) {
            return true;
        }
        return false;
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
    public long getAr()
    {
        return ar;
    }
    public String toString()
    {
        return ("Űrtartalom: " + getUrtartalom()
                + "\nGyártó: "+ getGyarto() + "\nSzavatossági idő: " + getSzavatossagiido()
                + "\nZsírtartalom: " + getZsirtartalom() + "\nÁr: "+ getAr());
    }


}
