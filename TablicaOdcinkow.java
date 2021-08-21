
/**
 * Write a description of class TablicaOdcinkow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TablicaOdcinkow
{
    private int liczbaElementow;
    private Odcinek[]tablica;
    
    public TablicaOdcinkow(int rozmiarTablicy)
    {
        liczbaElementow=0;
        tablica= new Odcinek[rozmiarTablicy];
    }
    
    public void dodaj(Odcinek other)
    {
        if(liczbaElementow<tablica.length)
            tablica[liczbaElementow++]=other;
        else
            System.out.println("Brak miejsca w tablicy");
    }
    
    public void wpisz()
    {
        dodaj(new Odcinek(new Punkt(1,3),new Punkt(2,6)));
        dodaj(new Odcinek(new Punkt(2,2), new Punkt(4,4)));
        dodaj(new Odcinek(new Punkt(-2,2),new Punkt(-3,4)));
    }
    
    public String toString()
    {
        String napis=" ";
        for (int i=0; i<tablica.length && tablica[i]!=null ; i++)
            napis+=tablica[i].dajWspolrzedne()+";";
        return napis;
    }
    public int dlugosc()
    {
        return tablica.length;
    }
    
    public String najwyzszy()
    {
        Odcinek najwyzszy=tablica[0];
        int i=0;
        while (i<tablica.length-1 && tablica[i+1]!=null)
            {
            if (tablica[i+1].wyzej(najwyzszy))
                najwyzszy=tablica[i+1];
            i++;
            }
        return najwyzszy.dajWspolrzedne();
    }
}