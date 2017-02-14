
import java.util.Date;


public class Tej
{
    private int urtartalom;
    private String gyarto;
    private Date szavatossagiido;
    private double zsirtartalom;
    private long ar;

    public Tej(int urtartalom, String gyarto,Date szavatossagiido, double zsirtartalom, long ar)
    {
        this.urtartalom = urtartalom;
        this.gyarto = gyarto;
        this.szavatossagiido = szavatossagiido;
        this.zsirtartalom = zsirtartalom;
        this.ar = ar;
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
