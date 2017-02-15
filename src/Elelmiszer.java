/**
 * Created by tamasferenc on 2017.02.15..
 */
import java.util.Date;

public abstract class Elelmiszer
{
    protected Long vonalkod;
    protected String gyarto;
    protected Date szavatossagiido;

    public Elelmiszer(Long vonalkod, String gyarto, Date szavatossagiido)
    {
        this.vonalkod = vonalkod;
        this.gyarto = gyarto;
        this.szavatossagiido = szavatossagiido;
    }
    public abstract Long getVonalkod();
    public abstract String getGyarto();
    public abstract Date getSzavatossagiido();
    public abstract boolean joMeg();
    public abstract String toString();


}
