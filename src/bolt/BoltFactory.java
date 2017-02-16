package bolt;

import bolt.aruk.Sajt;
import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;
import bolt.aruk.Szappan;

import java.util.Date;

/**
 * Created by tamasferenc on 2017.02.15..
 */
public class BoltFactory
{
    public Tej ujTartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom, long ar)
    {
        return new TartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, zsirtartalom);
    }
    public Tej ujFeltartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom, long ar)
    {
        return new FeltartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, zsirtartalom);
    }
    public Sajt ujSajt(Long vonalkod, double suly, double zsirtartalom, String gyarto, Date szavatossagiido)
    {
        return new Sajt(vonalkod, suly, zsirtartalom, gyarto, szavatossagiido);
    }
    public Szappan ujSzappan(Long vonalkod, String gyarto, char mosohatas)
    {
        return new Szappan(vonalkod, gyarto, mosohatas);
    }

}
