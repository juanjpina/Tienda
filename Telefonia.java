
/**
 * Write a description of class Telefonia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Telefonia extends Electrodomesticos
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Telefonia
     */
    public Telefonia()
    {
        
    }

    public Telefonia(String marca, String modelo, String color, String medidas, int precio, int cantidad)
    {
        super(marca, modelo, color, medidas, precio, cantidad);
    }

    /**
     * Rellena datos en el hashmap.
     */
    public void rellenaTelefonia()
    {
        rellenaDatos("55","Iphone", "XX", "Blanco" , "5", 1200,10);
        rellenaDatos("56","LG", "DX", "Negro" , "4", 100,3);
    }
}
