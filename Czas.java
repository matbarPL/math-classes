
/**
 * Write a description of class Czas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Czas
{
    int g;
    int m;
    int s;
    
    public Czas(int godz, int min, int sek)
    {
        g=godz;
        m=min;
        s=sek;
    }
    
    public Czas plusCzas(Czas c)
    {
        int godz=0;
        int min=0;
        int sek=0;
        godz=c.g+this.g;
        min=c.m+this.m;
        sek=c.s+this.s;
        if (c.s+this.s)>60
            sek=0;
            if (c.m+this.m+1)>60
            min=0;
            
        Czas wynik=new Czas(godz,min,sek);
        return wynik;
    }
}