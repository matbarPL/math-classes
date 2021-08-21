
/**
 * Write a description of class Kolo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kolo extends Figura
{
    Punkt srodek;
    int promien;
    static final double PI=3.14;
    
    public Kolo(String nazwa, Punkt s, int p)
    {
    super(nazwa);
    promien=p;
    srodek=s;
    }
    
    public boolean equals(Object k)
    {
    Kolo kolko= (Kolo) k;
    if ((srodek.equals(kolko.srodek) && promien==kolko.promien) || nazwa==kolko.nazwa)
        return true;
    else 
        return false;
    }
    
    public double obwod()
    {
    return 2*PI*promien;
    }
    
    public boolean zawiera(Kolo k1)
   {
       double odleglosc=k1.srodek.odleglosc(srodek);
       if (promien>(odleglosc+k1.promien))
            return true;
       else
            return false;
   }
    
    public String toString()
    {
        return "kolo "+super.toString()+" "+srodek.toString()+" "+promien;
    }
}