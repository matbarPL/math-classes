
/**
 * Write a description of class Geometria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometria
{
    Figura [] tablicaFigur;
    
    public Geometria(int rozmiar)
    {
        tablicaFigur=new Figura[rozmiar];
    }
    
    public boolean czyjest(Figura f)
    {   
        for (int i=0; i<tablicaFigur.length; i++)
            if (tablicaFigur[i]!=null)
                if (tablicaFigur[i].getClass().getSimpleName()==f.getClass().getSimpleName())
                    if (tablicaFigur[i].equals(f))
                        return true;
        return false;
    }
    
    public void dodajFigure(Figura f)
    {
        for (int i=0; i<tablicaFigur.length ; i++)
            if (tablicaFigur[i]==null && czyjest(f)==false)
                tablicaFigur[i]=f;
            
    }
    
    public void druk()
    {
    for (int i=0; i<tablicaFigur.length && tablicaFigur[i]!=null; i++)
        System.out.println(tablicaFigur[i].toString());
    }
    
    public double sumaObwodow()
    {
        double wynik=0;
        for (int i=0; i<tablicaFigur.length && tablicaFigur[i]!=null; i++)
            wynik+=tablicaFigur[i].obwod();
        return wynik;
    }
    
    public Figura dajFigure(String nazwa)
    {
        Figura figura=new Kolo("koleczko",new Punkt(10,10),10);
        for (int i=0; i<tablicaFigur.length && tablicaFigur[i]!=null; i++)
            if (tablicaFigur[i].dajNazwe().equals(nazwa))
                figura= tablicaFigur[i];
       return figura;
    }
    
    public void utworz()
    {
    Kolo kolo1= new Kolo("k1",new Punkt(1,1), 5);
    dodajFigure(kolo1);
    Kolo kolo2= new Kolo("k2",new Punkt(1,1), 10);
    dodajFigure(kolo2);
    Trojkat trojkat= new Trojkat("t1", new Punkt(1,1), new Punkt(2,2), new Punkt (3,3));
    dodajFigure(trojkat);
    }
    
    public void usunFigure(String nazwa)
    {
        for (int i=0; i<tablicaFigur.length && tablicaFigur[i]!=null; i++)
            if(tablicaFigur[i].dajNazwe().equals(nazwa))
                tablicaFigur[i]=null;
    }
    
    public int liczbaKol()
    {
        int i=0;
        int licznik=0;
        while (i<tablicaFigur.length){
            if (tablicaFigur[i]!=null && tablicaFigur[i] instanceof Kolo)
                    licznik++;
            i++;
        }
        return licznik;
    }
    
}
