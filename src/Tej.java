
import java.util.Date;


public abstract class Tej extends Elelmiszer
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
        super(vonalkod, gyarto, szavatossagiido);
        this.urtartalom = urtartalom;
        this.zsirtartalom = zsirtartalom;
    }

    public Long getVonalkod()

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
