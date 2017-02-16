import java.util.Date;

/**
 * Created by tamasferenc on 2017.02.15..
 */
public abstract class TejFactory
{
    /*public Tej getTej(String tejtipus, long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom)
    {
        if(tejtipus.equalsIgnoreCase("Tartós"))
        {
            return new TartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, zsirtartalom);
        }
        else if(tejtipus.equalsIgnoreCase("Féltartós"))
        {
            return new FeltartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, zsirtartalom);
        }
        return null;
    }*/

    public abstract Tej ujTartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom, long ar);
    public abstract Tej ujFeltartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom, long ar);


}
