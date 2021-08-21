
/**
 * Write a description of class Data here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Data
{
    private int dzien;
    private int miesiac;
    private int rok;
    
    public Data()
    {dzien=24;
     miesiac=10;
     rok=2016;
    }
    
    public Data(int dzien, int miesiac, int rok)
    {
        this.dzien=dzien;
        this.miesiac=miesiac;
        this.rok=rok;
    }
    
    public Data(Data data1)
    {   dzien=data1.dzien;
        miesiac=data1.miesiac;
        rok=data1.rok;
    }
    
    public int dajDzien()
    {return dzien;}
    
    public int dajMiesiac()
    {return miesiac;}
    
    public int dajRok()
    {return rok;}
    
    public void ustawDzienMiesiacRok(int dzien, int miesiac, int rok)
    {   this.dzien=dzien;
        this.miesiac=miesiac;
        this.rok=rok;
    }
    
    public boolean czyWczesniejsza(Data data)
    {   if(rok<data.dajRok())
            return true;
        return false;
    }
        
    public boolean czyPrzestepny()
    {
        if ((rok%4==0 && rok%100!=0) || (rok%400==0))
            return true;
        else
            return false;
    }
    
    public int ileDni()
    {
        int wynik;
        if (miesiac==1 || miesiac==3 || miesiac==5 || miesiac==7 || miesiac==8 || miesiac==10 ||miesiac ==12)
            wynik=31;
        else if (miesiac==2 && czyPrzestepny()==true)
            wynik=29;
        else if (miesiac==2 && czyPrzestepny()==false)
            wynik=28;
        else
            wynik=30;
        return wynik;
    }
    
    public boolean czyPoprawna()
    {
        if (dzien>ileDni() || dzien<0 || miesiac<0 || miesiac>12)
            return false;
        return true;
    }
    
    public void dodajDzien()
    {
        if(dzien<ileDni())
            dzien++;
        else if(miesiac<12)
        {
            dzien=1;
            miesiac++;
        }
        else
        {
                dzien=1;
                miesiac=1;
                rok++;
        }
        
    }
    public Data plusDzien()
    {
        Data data=new Data();
        if(dzien<ileDni())
        {
            data.dzien=dzien+1; 
            data.miesiac=miesiac;
            data.rok=rok;
        }
        else
        {   
            data.dzien=1;
            if(miesiac==12)
            {
                data.dzien=1;
                data.miesiac=1;
                data.rok=data.rok+1;
            }
        }
        
        return data;
                
    }
}
        
    