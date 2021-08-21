
/**
 * Write a description of class Odcinek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Odcinek
{   
    public Punkt koniec1;
    public Punkt koniec2;
    
    public Odcinek(Punkt koniec1, Punkt koniec2)
    {
    this.koniec1=koniec1;
    this.koniec2=koniec2;
    }
    
    public boolean equals(Object o)
    {Odcinek odcinek=(Odcinek) o;
    return (koniec1.equals(odcinek.koniec1) && koniec2.equals(odcinek.koniec2)) 
    || (koniec2.equals(odcinek.koniec1) && koniec1.equals(odcinek.koniec2));
    }
    
    public double dlugosc()
    {return koniec1.odleglosc(koniec2);}
    
    public String dajWektor()
    {String wynik;
     wynik=(koniec2.dajX()-koniec1.dajX())+","+(koniec2.dajY()-koniec1.dajY());
     return wynik;
    }
    
    public String dajWspolrzedne()
    {
        String wynik;
        wynik=("("+koniec1.dajX()+","+koniec1.dajY()+")-"+"("+koniec2.dajX()+","+koniec2.dajY()+")");
        return wynik;
    }
    
    public boolean jestPionowy()
    {return koniec1.dajX()==koniec2.dajX() && koniec1.dajY()!=koniec2.dajY();}
     
    public double wspolczynnik()
    {double a;
     a=(double)(koniec1.dajY()-koniec2.dajY())/(koniec1.dajX()-koniec2.dajY());
    return a;
    }
    
    public boolean wyzej(Odcinek a)
    {
        if (koniec2.dajY()>a.koniec2.dajY() && koniec2.dajY()>a.koniec1.dajY() || koniec1.dajY()>a.koniec1.dajY() && koniec1.dajY()>a.koniec2.dajY())
            return true;
        return false;
    }
}
