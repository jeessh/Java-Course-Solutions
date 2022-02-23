public class Strings extends Instrument
{
    boolean bow;
       
    
    public Strings(String name, boolean b)
    {
        super(name, "Strings");
        bow = b;
    }
    
    
    public boolean getBow()
    {
        return bow;
    }
}
