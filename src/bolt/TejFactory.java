package bolt;

import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;

import java.util.Date;

/**
 * Created by tamasferenc on 2017.02.15..
 */
public class TejFactory
{
    public Tej ujTartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom, long ar)
    {
        return new TartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, zsirtartalom);
    }
    public Tej ujFeltartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom, long ar)
    {
        return new FeltartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, zsirtartalom);
    }

}
