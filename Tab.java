
/**
 * Write a description of class Tab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tab
{
    int [] tab;
    int n;
    
    Tab(int rozm)
    {
        tab=new int [rozm];
        n=0;
    }
    
    void naKoniec(int x)
    {
        tab[n++]=x;
    }
    
    
    
    public String toString()
    {
        String napis=" ";
        for (int i=0; i<n; i++)
            napis+=tab[i]+";";
        return napis;
    }
    
    public int maxW()
    {
        int m=tab[0];
        for (int i=0; i<n; i++)
            if (tab[i]>m)
                m=tab[i];
        return m;
    }
    
    public void usun(int poz)
    {
        n--;
        while(poz<n)
        {
            tab[poz]=tab[poz+1];
            poz++;
        }
    }
    
    public void dodaj(int x, int poz)
    {
        for(int i=n++; i>poz;i--)
            tab[i]=tab[i-1];
        tab[poz]=x;
    }
    
    public void usunWszystkie(int x)
    {
        for (int i=0; i<n; i++)
            if (tab[i]==x)
                usun(i);
    }
    public void wstaw()
    {
        Tab [] tablica=new Tab[10];
        naKoniec(1);
        naKoniec(2);
        naKoniec(3);
        naKoniec(1);
    }
}
