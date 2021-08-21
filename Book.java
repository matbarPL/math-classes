
public class Book
{
    String tytul;
    String autor;
    int strony;
    String sygnatura;
    int wypozyczone=0;
    boolean czyWypozyczona;
    
    Book(String a, String t, int s){
        autor = a;
        tytul = t;
        strony = s;
    }
  
    
    public String getTytul(){
     return tytul;
    }
    public String getAutor(){
        return autor;
    }
    public int getStrony(){
        return strony;
    }
    public void setSygnatura(String sygn){
    sygnatura=sygn;
    
}
public String getSygnatura(){
    return sygnatura;
}
    public void drukuj(){
        System.out.println("Tytul: " + getTytul() + "\nAutor: " + getAutor() + "\nStrony: " + getStrony());
        if (sygnatura==null){
        System.out.println("Sygnatura: ZZZZ");}
        else {
        System.out.println("Sygnatura" + sygnatura);}
        if (wypozyczone==1){
            System.out.println("Ksiazka wypozyczona\n");}
        else 
        System.out.println("Ksiazka dostepna\n");
    }
   
            
public void wypozyczone(){
    wypozyczone=1;
}
public void zwrot(){
    wypozyczone=0;
}
public void wypozycz(){
    if (wypozyczone==1){
    System.out.println("tytul wypozyczony");}
    else {
    System.out.println("OK.");
    wypozyczone=1;}
}
public boolean czyWypozyczona(){
    if(wypozyczone==1){
        return true;}
        else
        return false;}
  public static void main(String[]args){
    Book b1=new Book("Gra o Tron", "George R.R. Martin", 890);
b1.drukuj();
b1.setSygnatura("Sfdsafsa");
b1.czyWypozyczona();
b1.wypozycz();
b1.drukuj();
b1.wypozyczone();
b1.zwrot();
b1.drukuj();
}
}

    