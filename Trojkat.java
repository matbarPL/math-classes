
/**
 * Write a description of class Trojkat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trojkat extends Figura 
{
   Punkt w1;
   Punkt w2;
   Punkt w3;
   
   public Trojkat(String nazwa, Punkt w1, Punkt w2, Punkt w3) 
   {
    super(nazwa);
    this.w1=w1;
    this.w2=w2;
    this.w3=w3;
    }
    
    public boolean equals(Object t)
    {
    Trojkat trojkat=(Trojkat) t;
    if (w1.equals(trojkat.w1) && w2.equals(trojkat.w2) && w3.equals(trojkat.w3))
        return true;
    else if (w1.equals(trojkat.w2) && w2.equals(trojkat.w3) && w3.equals(trojkat.w1))
        return true;
    else if (w1.equals(trojkat.w3) && w2.equals(trojkat.w2) && w3.equals(trojkat.w1))
        return true;
    else if (w1.equals(trojkat.w3) && w2.equals(trojkat.w1) && w3.equals(trojkat.w2))
        return true;
    else if (w1.equals(trojkat.w2) && w2.equals(trojkat.w1) && w3.equals(trojkat.w3))
        return true;
    else if (w1.equals(trojkat.w1) && w2.equals(trojkat.w3) && w3.equals(trojkat.w2))
        return true;
    else if (trojkat.nazwa==nazwa)
        return true;
    else
        return false;
    }
    
    public double obwod()
    {
    return w1.odleglosc(w2)+w2.odleglosc(w3)+w3.odleglosc(w1);
    }
    
    public String toString()
    {
        return "trojkat "+super.toString()+w1.toString()+w2.toString()+w3.toString();
    }
}