import java.util.Date;

/**
 * Created by tamasferenc on 2017.02.15..
 */
public class TejFactory
{
    public Tej getTej(String tejtipus, long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom)
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
    }
}
