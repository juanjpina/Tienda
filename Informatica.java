
/**
 * Write a description of class Informatica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Informatica extends Electrodomesticos
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Informatica
     */
    public Informatica()
    {
    
    }
    
    public Informatica(String marca, String modelo, String color, String medidas, int precio,int cantidad)
    {
        
        super(marca, modelo,  color,  medidas,  precio, cantidad);
    
        
    }

    /**
     * Rellena datos en el hashmap.
     */
    public void rellenaInformatica()
    {
        rellenaDatos("33","Dell", "NGS-5", "Blanco" , "xx", 1200,22);
        rellenaDatos("34","Dell", "MON-125", "Negro" , "25", 100,3);
    }
}
