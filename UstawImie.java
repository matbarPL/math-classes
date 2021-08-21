
/**
 * Write a description of class UstawImie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UstawImie
{
    public static void main(String args[]){
       Pracownik[] pracownicy= new Pracownik[3]; //tablica przechowujaca elementy typu pracownik
       
       String[] imiona={"Jan","Adam","Barbara"};
       String[] nazwiska={"Kowalski","Nowak","Brzęczyszczykiewicz"};
       int[] lata={20,23,24};
       
       for (int i=0;i<3;i++){
          pracownicy[i]=new Pracownik();
          pracownicy[i].imie=imiona[i];
          pracownicy[i].nazwisko=nazwiska[i];
          pracownicy[i].wiek=lata[i];
          System.out.println(pracownicy[i].imie+" "+pracownicy[i].nazwisko+", "+pracownicy[i].wiek+" lat");
    
        }
    }
}