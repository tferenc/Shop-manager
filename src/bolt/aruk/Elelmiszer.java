package bolt.aruk;

import bolt.Aru;
import java.util.Date;

public abstract class Elelmiszer extends Aru
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
