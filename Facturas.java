import java.util.*;
import java.time.*;
import java.time.format.*;
/**
 * Write a description of class Facturas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Facturas
{
    HashMap<Integer, Facturas> fra = new HashMap<>(); 
    
    //private Usuarios usuario;
    
    HashmapClientes cli = new HashmapClientes();
    Electrodomesticos electro = new Electrodomesticos();
    Usuarios usuario = new Usuarios();
    Sonido sond = new Sonido();
    public static Scanner sc = new Scanner(System.in);
    Texto texto = new Texto();
    
     
    
    //calendario
    LocalDate fecha = LocalDate.now(); 
    DateTimeFormatter fechaeuropa = DateTimeFormatter.ofPattern("dd-LL-yyyy");
    //Datos de entrada
    String idU;
    static String idE;
    int cantidad;
    int numFra=0;
    int ud;
    int precioTotal;
    String nombreUsua;
    String marca;
    String modelo;
    String color;
    String medidas;
    int precio;
    static String id;
    String nombre;
    String apellidos;
    String direccion;
    String poblacion;
    
    public String idUsuario;
    public String idProducto;
    /**
     * Constructor for objects of class Facturas
     */
    public Facturas(){}
    
    /**
     * constructor
     */
    public Facturas(int cantidad, int precioTotal, String nombreUsua, String marca, String modelo, String color, String medidas, String nombre, 
    String apellidos, String direccion, String poblacion,DateTimeFormatter fechaeuropa)
    {
        
        
        //this.fechaeuropa=fechaeuropa;
        
        this.cantidad=cantidad;
        this.precioTotal = precioTotal;
        this.nombreUsua=nombreUsua;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.medidas=medidas;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.poblacion=poblacion;
        
        
        
        
    }

    /**
     * numero de factura
     */
    public int getnumFra()
    {
        return numFra;
    }
    
    /**
     * devuelve las unidades
     */
    public int getud()
    {
        return ud;
    }
    
    /**
     * devuelve el precio total de la factura
     */
    public int getPrecioTotal()
    {
        return precioTotal;
    }

    public String toString()
    {
        return  " Fecha:" +fecha +
                " Factura num: "+ numFra +
                "\n Cliente:" +nombre+"," + apellidos+
                "\n Direccion:" +direccion +
                " Poblacion:" +poblacion+
                " Unidades:" + cantidad +
                " Precio:" +precio+
                " Precio Total:" +precioTotal+
                " Usuario:" +nombreUsua+
                
                " Marca: " +marca+
                " Modelo:" +modelo+
                " Color:" +color+
                " Medidas:" +medidas;
    }
    
    /**
     * suma 1++ al contador de facturas
     */
    public int fraSuma(){
        return numFra++;
    }
    
    /**
     * funcion que gestiona las facturas
     * -da la fecha
     * -da en numero de factura
     * 
     * 
     */
    public void fraFecha()
    {
        System.out.println("Introduce la fecha: "+ fecha.format(fechaeuropa));
        numFra++;
        System.out.println("Factura numero:" +fraSuma() );          
        
        
        
        
    }
    
    /**
     * funcion que devuelve id usuario
     */
    public String getUsua()
    {
        //System.out.println("Introduce el usuario:");
        //idUsu =sc.next();
        usuario.printUsuario(idU);
        return idU;
    }
    
    /**
     * funcion que devuelve id producto
     */
    public String getElec()
    {
        System.out.println("Introduce el Id del producto:");
        idE = sc.next();
        electro.imprimeElectrodo(idE);
        return idE;
    }
    
    /**
     *funcion que pide
     *-unidades de la venta
     */
    public int fraCant()
    {
        System.out.println("Introduce las unidades de venta:");
        ud = sc.nextInt();
        return ud;
    }
    
    /**
     * Grabar o guardas la venta con sus datos
     */
    public void addFra( int numFra, int cantidad, int precioTotal, String nombreUsua, String marca, String modelo, String color, String medidas, String nombre, String apellidos,
    String direccion, String poblacion,DateTimeFormatter fechaeuropa)
    {
        Facturas c = new Facturas( cantidad, precioTotal, nombreUsua, marca, modelo, color, medidas, nombre, apellidos, direccion, poblacion, fechaeuropa);       
        fra.put(numFra,c); 
    }

    public void anadefac()
    {
        Facturas c = new Facturas(1,  1500, "pepe", "lg", "sdfsdf", "blanco", "50", "jose", "reinosa", "perdidad", "alicante",fechaeuropa);       
        fra.put(1,c);
    }
    
    public void recuperarDatos(String idC, String idU, String idE, int cantidad)
    {
        
        marca = sond.buscaMarca(idE);
        modelo = sond.buscaModelo(idE);
        color = sond.buscaColor(idE);
        medidas = sond.buscaMedidas(idE);
        precio = sond.buscaPrecio(idE);
        //nombreUsua = usuario.buscaUsuario(idU);
        nombre = cli.buscaNombre(idC);
        apellidos = cli.buscaApellido(idC);
        direccion = cli.buscaDireccion(idC);
        poblacion = cli.buscaPoblacion(idC);
        Facturas c = new Facturas(150, 250, nombreUsua, marca, modelo, color, medidas, nombre, apellidos, direccion, poblacion,fechaeuropa);       
        fra.put(numFra,c);
        
    }
   
    public void pintaus()
    {
        Iterator<Integer> it = fra.keySet().iterator();
        while(it.hasNext()){
         int clave  = it.next();
          
         System.out.println("Clave: " + clave + fra.get(clave));
        }
    }
    
    /**
     * prueba clientes
     */
    public void mcli(String idC)
    {
        cli.imprimeCliente(idC);
    }

    public void nnn()
    {
        for(Map.Entry<Integer,Facturas> cx : fra.entrySet())
        {
            int clave=cx.getKey();
            Facturas valores=cx.getValue();
            
            
            System.out.println("id:" +clave + valores );
        }

    }
    
    public int damecantidad()
    {
        cantidad = texto.getNumero("Introduce las unidades");
       
        return cantidad;
    }
    
    
}


