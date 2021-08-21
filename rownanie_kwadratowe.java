
/**
 * Write a description of class rownanie_kwadratowe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rownanie_kwadratowe
{
    private int a;
    private int b;
    private int c;

    
    public rownanie_kwadratowe(int a, int b, int c) //konstruktor
    {
        this.a=a;  //przypisanie polom a,b,c naszej klasy zmiennych parametrycznych zapisanych w konstruktorze
        this.b=b;
        this.c=c;
    }
    
    public String rozwiaz() /*ta metoda nie potrzebuje parametrow jawnych bo bedzie 
    operowala na naszym obiekcie rownanie */
    {
        String rozwiazanie = "";
        double delta;
        delta=b*b-(4*a*c);
        if (a!=0)
        {
            if (delta>0)
            {
                double x1=(-b-Math.sqrt(delta))/(2*a);
                double x2=(-b+Math.sqrt(delta))/(2*a);
                rozwiazanie="Rownanie posiada dwa pierwiastki rzeczywiste: " + x1 + " "+ x2;
            }
            else if (delta==0)
            {
                double x0=-b/(2*a);
                rozwiazanie="Rownanie posiada jedno rozwiazanie rzeczywiste: "+ x0;
            }
            else
            {
                rozwiazanie="Brak rozwiazan rzeczywistych";
            }
        }
        else
        {
            if (b!=0)
            {
                double x0=-c/b;
                rozwiazanie="Rozwiazanie rownania to: " + x0;
            }
            else
            {
                if (c!=0)
                {
                    rozwiazanie="Brak rozwiazan";
                }
                else
                {
                    rozwiazanie="Rownanie tozsamosciowe";
                }
            }
        }
        return rozwiazanie;
    }
    public String toString()
    {
        return "Rownanie kwadratowe: "+a+"x^2+"+b+"x+"+c;
    }
    public void ustawA(int a)
    {
        this.a=a;
    }
    public void ustawB(int b)
    {
        this.b=b;
    }
    public void ustawC(int c)
    {
        this.c=c;
    }
    public static void main(String[] args)
    {
        //new wywoluje konstruktor
        rownanie_kwadratowe rownanie = new rownanie_kwadratowe(1,4,20); //stworzylismy obiekt
        System.out.println(rownanie.rozwiaz());
    }
}