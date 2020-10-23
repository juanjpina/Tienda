import java.util.Scanner;
/**
 * Write a description of class Texto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Texto
{
    Scanner sc;
    /**
     * Constructor for objects of class Texto
     */
    public Texto()
    {
        sc = new Scanner(System.in);
    }
    
    public String getTexto(String pregunta)
    {
        String t1 ="";
        while(t1.equals(""))
        {
            System.out.println(pregunta);
            t1 = sc.nextLine();
            if(!t1.matches("^[A-Za-z0-9 ]*$"))
            {
                t1="";
            }
        }
        return t1;
    }
    
    public int getNumero(String pregunta)
    {
        String t1 ="";
        
        while(t1.equals(""))
        {
            System.out.println(pregunta);
            t1 = sc.next();
            if(!t1.matches("[0-9]"))
            {
                t1="";
            }
        }
        
        return Integer.parseInt(t1);
    }
}
