package bolt;

import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import java.util.Date;
/**
 * Created by tamasferenc on 2017.02.16..
 */
public class Main
{
    public static void main(String[] args)
    {
        Date date = new Date(2018, 10, 17);
        Tej abauj = new FeltartosTej(4321, Tej.FELLITER, "Abaújtej", date, Tej.FELZSIROS);
        System.out.println(abauj.toString());

        BoltFactory fact = new BoltFactory();
        System.out.println(fact.ujFeltartosTej(1234, Tej.POHAR, "Mizzo", date, Tej.FELZSIROS).toString());

    }
}
