
/**
 * Write a description of class Imagen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Imagen extends Electrodomesticos
{
    

    /**
     * Constructor for objects of class Imagen
     */
    
    public Imagen(){
    
    }
    
    public Imagen(String marca, String modelo, String color, String medidas, int precio,int cantidad)
    {
        // initialise instance variables
        super(marca, modelo,  color,  medidas,  precio, cantidad);
        
    }    
    /**
     * Rellena datos en el hashmap.
     */
    public void rellenaImagen()
    {
        rellenaDatos("1","Samsung", "cv3", "blanco" , "50", 1200,2);
        rellenaDatos("2","Samsung", "cv5", "negro" , "30", 600,5);
    }
}    
