
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Figura 
{
    String nazwa;
    
    public Figura(String n)
    {nazwa=n;}
    
    public String dajNazwe()
    {
    return nazwa;
    }
    
    abstract double obwod();
    
    public String toString()
    {return nazwa;}
    
}