
/**
 * Write a description of class Sonido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sonido extends Electrodomesticos
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Sonido
     */
    public Sonido()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Sonido(String marca, String modelo, String color, String medidas, int precio,int cantidad)
    {
        
        super(marca, modelo,  color,  medidas,  precio, cantidad);
    }

    /**
     * Rellena datos en el hashmap.
     */
    public void rellenaSonido()
    {
        rellenaDatos("12","Yamaha", "GTC-5", "Negro" , "50x60", 3500,1);
        rellenaDatos("13","Sony", "DE-5", "Negro" , "30x20", 500,3);
    }
}
