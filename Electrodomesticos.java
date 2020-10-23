import java.util.*;

/**
 * Write a description of class Electrodomesticos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Electrodomesticos
{ 
    private String marca;
    private String modelo;
    private String color;
    private String medidas;
    private int precio;
    private int cantidad;
    private static String idE;
    static Scanner sc = new Scanner(System.in);
    public static HashMap<String, Electrodomesticos> nomElec = new HashMap<>();
    Texto texto = new Texto();
    public Electrodomesticos(){
    }
    
    public Electrodomesticos (String marca, String modelo, String color, String medidas, int precio,int cantidad)
    {
        this.idE=idE;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.medidas=medidas;
        this.precio=precio;
        this.cantidad=cantidad;
        
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String getMedidas()
    {
        return medidas;
    }
    
    public int getPrecio()
    {
        return precio;
    }
    
    public int getCantidad()
    {
        return cantidad;
    }
    
    public void setMarca(String Marca)
    {
        this.marca=marca;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo=modelo;
    }
    
    public void setColor(String color)
    {
        this.color=color;
    }
    
    public void setMedidas(String medidas)
    {
        this.medidas=medidas;
    }
    
    public void setPrecio(int precio)
    {
        this.precio=precio;
    }
    
    public void setCantidad(int cantidad)
    {
        this.cantidad=cantidad;
    }
    
     public String toString()
    {
        return " Marca: " +marca+
               " Modelo: " +modelo +
               " Color: " +color+ 
               " Medidas: " +medidas+
               " Precio: " +precio+
               " Cantidad: " +cantidad;
    }
    
    public void inicio(){
        addElec("id","marca", "modelo", "color", "medidas", 0,0);
        imprimeP();
    }
    
    /**
     * Añade electrodomestico al hashmap
     */
    public void addElec(String idE, String marca, String modelo, String color, String medidas, int precio,int cantidad)
    {
        
        
        idE = texto.getTexto("Introduce id");
        marca = texto.getTexto("Introduce la marca");
        modelo = texto.getTexto("Introduce el modelo");
        color = texto.getTexto("Introduce el color");
        medidas = texto.getTexto("Introduce las medidas");
        precio = texto.getNumero("Introduce el precio");
        cantidad = texto.getNumero("Introduce la cantidad");
        if(nomElec.containsKey(idE)){
            System.out.println("El codigo esta repetido, no se puede crear un nuevo articulo.");
        }
        else{
        Electrodomesticos c = new Electrodomesticos(marca, modelo, color, medidas, precio,cantidad);       
        nomElec.put(idE,c); 
       }
    }
    
   
    
    /**
     * funcion que modifica las unidades de cada electrodomestico
     */
    public void modificarCantidad(String idE,int cantidad){
        for(Map.Entry<String,Electrodomesticos> cx : nomElec.entrySet())
        {
            String clave=cx.getKey();
            if (clave==idE){
                Electrodomesticos valores=cx.getValue();
                valores.cantidad=valores.cantidad-cantidad;
                nomElec.put(idE,valores);
            }
            
           
        }
    }
    
    /**
     * funcion que devuelva el precio del electrodomestico
     */
    public void getPrecioEleci()
    {
        if(!nomElec.containsKey(idE))
        {
            System.out.println("El codigo introducido no existe");
        }
        else
        {
            System.out.println("id:" +idE+ nomElec.values());
        }
    }
            
    /**
     * Imprime en pantalla todos los electrodomestico
     */
    public void imprimeP()  
    {
        for(Map.Entry<String,Electrodomesticos> cx : nomElec.entrySet())
        {
            String clave=cx.getKey();
            Electrodomesticos valores=cx.getValue();
            
            
            System.out.println("id:" +clave + valores );
        }
    }
    
    /**
     * Imprime en pantalla la informacion de un electrodomestico
     */
    public static void imprimeElectrodo(String idE)
    {   
        //System.out.println("Introduce el id del producto: ");
        //id = sc.next();
        if(!nomElec.containsKey(idE))
        {
            System.out.println("El codigo introducido no existe");
        }
        else
        {
            System.out.println("id:" +idE+ nomElec.get(idE));
        }
    }

    /**
     * Modifica los datos del electrodomestico en el hashmap
     */
    public void modificaDatos(String idE, String marca, String modelo, String color, String medidas, int precio,int cantidad)
    {       
        idE = texto.getTexto("Introduce id");
        marca = texto.getTexto("Introduce la marca");
        modelo = texto.getTexto("Introduce el modelo");
        color = texto.getTexto("Introduce el color");
        medidas = texto.getTexto("Introduce las medidas");
        precio = texto.getNumero("Introduce el precio");
        cantidad = texto.getNumero("Introduce la cantidad"); 
        
        if(!nomElec.containsKey(idE)){
            System.out.println("El codigo no existe, tiene que crear un nuevo articulo.");
        }
        else{
            Electrodomesticos c = new Electrodomesticos(marca, modelo, color, medidas, precio,cantidad);
            nomElec.put(idE,c);
       } 
    }
    
    /**
     * Verifica si existe un id (producto)
     */
    public boolean comprueba(String idE)
    {
        if(nomElec.containsKey(idE))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void texto(int opcionElegida)
    {
        System.out.println("121-Añadir Electrodomestico");
        System.out.println("122-Buscar Electrodomestico");
        System.out.println("123-Listar ElectrodomesticoUsuarios");
        System.out.println("124-Modificar Datos");
        System.out.println("125-Salir");
        opcionElegida = sc.nextInt();
    }

    public void rellenaDatos(String idE, String marca, String modelo, String color, String medidas, int precio,int cantidad)
    {
      Electrodomesticos c = new Electrodomesticos(marca, modelo, color, medidas, precio,cantidad);
      nomElec.put(idE,c);  
    }
    
    /**
     * funcion de prueba para buscar elementos
     */
    public int busca(String idE)
    {
        Electrodomesticos x = nomElec.get(idE);
        
        return x.getPrecio();
    }
    
    /**
     * Funcion que comprueba las unidades del electrodomestico
     * si hay suficientes para la venta.
     * da el resultado del precio y cantidad, total de factura.
     */
    public void buscaUd(String idE, int cantidad)
    {
        Electrodomesticos x = nomElec.get(idE);
        if(cantidad > x.getCantidad()){
            System.out.println("No hay unidades suficientes, hay un Stock de:" + x.getCantidad() );
        }
        else{
            
            
            System.out.println("Total de factura es"+ cantidad*x.getPrecio());
            
            mod(idE,cantidad);
        }
    }
    
    /**
     * /modifica la cantidad de las unidades del producto
     */
    public void mod(String idE,int cantidad)
    {
        Electrodomesticos x = nomElec.get(idE);
        rellenaDatos(idE, x.getMarca(), x.getModelo(), x.getColor(), x.getMedidas(), x.getPrecio(),x.getCantidad()-cantidad);
    }
    
    public static String buscaMarca(String idE)
    {
        Electrodomesticos x = nomElec.get(idE);
        
        return x.getMarca(); 
    }

    public static String buscaModelo(String idE)
    {
        Electrodomesticos x = nomElec.get(idE);
        
        return x.getModelo();
    }

    public static String buscaColor(String idE)
    {
        Electrodomesticos x = nomElec.get(idE);
        
        return x.getColor();
    }

    public static String buscaMedidas(String idE)
    {
        Electrodomesticos x = nomElec.get(idE);
        
        return x.getMedidas();
    }
    
    public int buscaPrecio(String idE)
    {
        Electrodomesticos x = nomElec.get(idE);
        
        return x.getPrecio();
    }

    public String dameidproducto()
    {
        idE=texto.getTexto("Introduce el id del electrodomestico");
        if(!nomElec.containsKey(idE))
        {
            System.out.println("El codigo introducido no existe");
        }
        else
        {
            System.out.println("id:" +idE+ nomElec.get(idE));
        }
        return idE;
    }
}

