
/**
 * Write a description of class Hotel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hotel
{
    Osoba[]tab;
    
    public Hotel(int rozmiar)
    {
        tab=new Osoba[rozmiar];
    }
    
    public void przydzielNumer(Osoba o, int x)
    {
        for (int i=0; i<tab.length; i++){
            if (czyWolnyNumer(i))
                if (i==x)
                    tab[i]=o;
                else
                    tab[i]=null;
        }
    }
    
    public boolean czyWolnyNumer(int x)
    {
        return tab[x]==null;
    }
    
    public boolean czyWolny()
    {
        int i=0;
        while(i<tab.length && tab[i]!=null)
            i++;
        return i<tab.length;
    }
    
    public int ileWolnych()
    {
        int licznik=0;
        for (int i=0;i<tab.length;i++)
            if (tab[i]==null)
                licznik++;
        return licznik;
    }
    
    public boolean czyWynajmuje(String nazwisko)
    {
        boolean jest=false;
        for (int i=0; i<tab.length; i++)
            if (tab[i].nazwisko==nazwisko)
                jest=true;
        return jest;
    }
    
    public void zwolnij(String nazwisko)
    {
        for (int i=0; i<tab.length; i++)
            if (czyWolnyNumer(i)==false)
                if (tab[i].nazwisko==nazwisko)
                    {tab[i]=null;}
    }
    public String toString()
    {
        String napis="";
        for (int i=0; i<tab.length; i++)
            if (tab[i]!=null)
                napis+="Pokój "+i+ " "+ tab[i].toString()+" ";
        return napis;
    }
    
    public void wpisz()
    {
        przydzielNumer(new Osoba("Mateusz","Baryla"),0);
        przydzielNumer(new Osoba("Kasia","Kruk"),1);
        przydzielNumer(new Osoba("Kasia","Kruk"),2);
    }
}