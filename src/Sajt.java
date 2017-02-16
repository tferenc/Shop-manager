import java.util.Date;

/**
 * Created by tamasferenc on 2017.02.15..
 */
public class Sajt
{
    protected double suly;
    protected double zsirtartalom;
    protected Long vonalkod;
    protected String gyarto;
    protected Date szavatossagiido;

    public Sajt(Long vonalkod, double suly, double zsirtartalom, String gyarto, Date szavatossagiido)
    {
        this.vonalkod = vonalkod;

        this.suly = suly;
        this.zsirtartalom = zsirtartalom;
        this.gyarto = gyarto;
        this. szavatossagiido = szavatossagiido;
    }

    public double getSuly() {
        return suly;
    }

    public double getZsirtartalom() {
        return zsirtartalom;
    }

    public Long getVonalkod() {
        return vonalkod;
    }

    public String getGyarto() {
        return gyarto;
    }

    public Date getSzavatossagiido() {
        return szavatossagiido;
    }

    public boolean joMeg()
    {
        Date now = new Date();
        if(now.before(szavatossagiido))
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return("Súly: " + getSuly() + "Zsírtartalom: " + getZsirtartalom() +
                "Gyártó: " + getGyarto() + "Szavatossági idő: " + getSzavatossagiido());
    }
}
