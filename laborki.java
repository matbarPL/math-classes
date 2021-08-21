
/**
 * Write a description of class laborki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laborki
{
    void rownanie(double a, double b, double c)
    {
    double delta;
    delta=Math.pow(b,2)-(4*a*c);
    if (a!=0){
        if (delta>=0){
            System.out.println((-b-Math.sqrt(delta))/2);
            System.out.println((-b+Math.sqrt(delta))/2);
        }
        else{
             System.out.println("Brak rozwiazan");
            }
        }
    else{
        if (b!=0){
            System.out.println(-c/b);
        }
        else{
            if (c!=0){
                System.out.println("Brak rozwiazan");
            }
            else{
                System.out.println("Rownanie tozsamosciowe");
            }
            
        }
    }
    }
    void sumacyfr(int a)
    {
        int pom=0;
        while(a>0){
            pom=pom+a%10;
            a=a/10;
        }
        System.out.println(pom);
    }
    
    void najstarsza(int a)
    {
        int c=0;
        while(a>0){
            c=a%10;
            a=a/10;
        }
        System.out.println(c);
    }
    
    String czy_wystepuje(int k, int c)
    {
        int d=0;
        while (k>0){
            d=k%10;
            if (c==d)
                return "wystepuje";
            else
                k=k/10;
        }
        return "Nie wystepuje";
    }
    
    int najwieksza(int k)
    {
        int c=0,d;
        while(k>0){
            d=k%10;
            k=k/10;
            if (d>c)
                c=d;
        }
        return c;
    }
    
    boolean pierwsza(int k)
    {
        if (k%2==0)
            return true;
        else 
            for(int i=3;i*i<k;i++)
                if (k%i==0)
                    return true;
        return false;
    }
    
    int Euklid(int M, int N)
    {
        while (M!=N)
            if (M>N)
                M-=N;
            else N-=M;
        return M;
    }
    
    long pot(long m, int n)
    {   
        long p=1;
        while (n>0)
            if (n%2==0)
            {
                p*=m;
                n--;
            }
            else
            {
                m*=m;
                n/=2;
            }
        return p;
    }
    
    int odwroc(int k)
    {
        int wynik=0;
        int i=1;
        
        while(k>0)
        {
            wynik=wynik*10+k%10;
            k=k/10;
        }
        return wynik;
    }
            
                    
}