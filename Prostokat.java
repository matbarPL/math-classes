
/**
 * Write a description of class Prostokat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prostokat extends Figura
{
    Punkt w1,w2,w3,w4;
    
    public Prostokat(String nazwa, Punkt w1, Punkt w2, Punkt w3, Punkt w4)
    {
        super(nazwa);
        this.w1=w1;
        this.w2=w2;
        this.w3=w3;
        this.w4=w4;
    }
    
    public double obwod()
    {
    return w1.odleglosc(w2)+w2.odleglosc(w3)+w3.odleglosc(w4)+w4.odleglosc(w1);
    }
}