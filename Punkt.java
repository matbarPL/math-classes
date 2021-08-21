
/**
 * Write a description of class Punkt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punkt
{
    private double x;
    private double y;
    
    public Punkt(double x, double y)
    {
     this.x=x;
     this.y=y;
    }
    
    public double dajX()
    {return x;}
    
    public double dajY()
    {return y;}
    
    public void ustawX()
    {this.x=x;}
    
    public void ustawY()
    {this.y=y;}
    
    public boolean equals(Object o)
    {Punkt punkt= (Punkt) o;
     return this.x==punkt.x && this.y==punkt.y;
    }
    
    public String toString()
    {return "("+x+","+y+")";}
    
    public void przesun(double dx, double dy)
    {x=x+dx;
     y=y+dy;
    }
    
    public double odleglosc(Punkt p)
    {return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));}
}
    
       
  
     
    
    
    
