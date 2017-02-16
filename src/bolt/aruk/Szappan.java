package bolt.aruk;

/**
 * Created by tamasferenc on 2017.02.16..
 */
public class Szappan
{
    protected Long vonalkod;
    protected String gyarto;
    protected char mosohatas;

    public Szappan(Long vonalkod, String gyarto, char mosohatas)
    {
        this.vonalkod = vonalkod;
        this.gyarto = gyarto;
        this.mosohatas = mosohatas;
    }
}
