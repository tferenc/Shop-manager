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
    public Tej ujTartosTej(long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom)
    {
        return new TartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, zsirtartalom);
    }
    public Tej ujFeltartosTej(long vonalkod, int urtartalom, String gyarto, Date szavatossagiido, double zsirtartalom)
    {
        return new FeltartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, zsirtartalom);
    }

    public Tej ujFelzsirosTartosTej(long vonalkod, int urtartalom, String gyarto, Date szavatossagiido)
    {
        return new TartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, Tej.FELZSIROS);
    }

    public Tej ujZsirosTartosTej(long vonalkod, int urtartalom, String gyarto, Date szavatossagiido)
    {
        return new TartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, Tej.ZSIROS);
    }

    public Tej ujFelzsirosFeltartosTej(long vonalkod, int urtartalom, String gyarto, Date szavatossagiido)
    {
        return new FeltartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, Tej.FELZSIROS);
    }

    public Tej ujZsirosFeltartosTej(long vonalkod, int urtartalom, String gyarto, Date szavatossagiido)
    {
        return new FeltartosTej(vonalkod, urtartalom, gyarto, szavatossagiido, Tej.ZSIROS);
    }

    public Tej ujFelzsirosLiteresTartosTej(long vonalkod, String gyarto, Date szavatossagiido)
    {
        return new TartosTej(vonalkod, Tej.LITER, gyarto, szavatossagiido, Tej.FELZSIROS);
    }

    public Tej ujZsirosLiteresTartosTej(long vonalkod, String gyarto, Date szavatossagiido)
    {
        return new TartosTej(vonalkod, Tej.LITER, gyarto, szavatossagiido, Tej.ZSIROS);
    }

    public Tej ujFelzsirosLiteresFeltartosTej(long vonalkod, String gyarto, Date szavatossagiido)
    {
        return new FeltartosTej(vonalkod, Tej.LITER, gyarto, szavatossagiido, Tej.FELZSIROS);
    }

    public Tej ujZsirosLiteresFeltartosTej(long vonalkod, String gyarto, Date szavatossagiido)
    {
        return new FeltartosTej(vonalkod, Tej.LITER, gyarto, szavatossagiido, Tej.ZSIROS);
    }

    public Sajt ujSajt(long vonalkod, double suly, double zsirtartalom, String gyarto, Date szavatossagiido)
    {
        return new Sajt(vonalkod, suly, zsirtartalom, gyarto, szavatossagiido);
    }

    public Szappan ujSzappan(long vonalkod, String gyarto, char mosohatas)
    {
        return new Szappan(vonalkod, gyarto, mosohatas);
    }

    public Szappan ujAMosohatasuSzappan(long vonalkod, String gyarto)
    {
        return new Szappan(vonalkod, gyarto, 'A');
    }
}
