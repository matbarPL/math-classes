
/**
 * Write a description of class TestRownania here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TestRownania
{
   public static void main(String[] args)
   {
       System.out.println("Podaj a, b, c");
       Scanner skaner=new Scanner(System.in);
       int a= skaner.nextInt();
       int b= skaner.nextInt();
       int c= skaner.nextInt();
       rownanie_kwadratowe r =new rownanie_kwadratowe(a, b, c);
       //w zaleznosci od a,b,c tworzony jest obiekt rownanie kwadratowe o polach a,b,c
       System.out.println(r.rozwiaz());
       System.out.println(r);
       
       r.ustawA(100);
       r.ustawB(-20);
       System.out.println(r.rozwiaz());
       System.out.println(r);
       
    }
}