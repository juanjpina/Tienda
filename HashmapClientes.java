import java.util.*;

/**
 * Tratamiento de clientes.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashmapClientes
{
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, HashmapClientes> nomClientes = new HashMap<>(); 
    private static String  idC;
    Texto texto = new Texto();
    static String nombre;
    static String apellido;
    static String direccion;
    static String poblacion;
    static int telefono;
    boolean financiacion; 
    /**
     * Constructor de la clase HashmapClientes
     */     
    public HashmapClientes(){}
    
    public HashmapClientes(String nombre, String apellido, String direccion, String poblacion, int telefono )
    {
        this.idC = idC;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellido;
    }

    public String getDireccion()
    {
        return direccion;
    }
    
    public String getPoblacion()
    {
        return poblacion;
    }
    
    public String toString(){
        return "Nombre: " +nombre+ "  Apellidos: " +apellido + "  Direccion: " +direccion+ "  Poblacion: " +poblacion+ "  Telefono: " +telefono;
    }
    
    public void add()
    {
       
        idC = texto.getTexto("Introduce el Id");
        nombre = texto.getTexto("Introduce el nombre");
        apellido = texto.getTexto("Introduce el apellido");
        direccion = texto.getTexto("Introduce la direccion");
        poblacion = texto.getTexto("Introduce la poblacion");
        telefono = texto.getNumero("Introduce el telefono");
        
        if(nomClientes.containsKey(idC))
        {
            System.out.println("El codigo elegido ya existe, elige otro codigo");
        }
        else
        {
        HashmapClientes c = new HashmapClientes(nombre, apellido,direccion, poblacion, telefono);
        nomClientes.put(idC,c);
    }
    }
    
    /**
     * para rellenar automaticamente algunos clientes
     */
    public void addRelleno()
    
    {
        nomClientes.put("10", new HashmapClientes("Juan","Perez","C/Perdida","Bilbao",52288222));
        nomClientes.put("11", new HashmapClientes("Anotnio","Hernanez","C/Perdida","Bilbao",52288222));
        nomClientes.put("12", new HashmapClientes("Jesus","Sanchez","C/Perdida","Bilbao",52288222));
        nomClientes.put("13", new HashmapClientes("Raul","dfsdf","C/Perdida","Bilbao",52288222));
    }
    
    /**
     * Imprime en pantalla todos los clientes
     */
    public void imprimeP()  
    {
        for(Map.Entry<String,HashmapClientes> cx : nomClientes.entrySet())
        {
            String clave = cx.getKey();
            HashmapClientes valores = cx.getValue();
            
            System.out.println("id:" +clave+ " Cliente: " +valores);
        }
    }
    
    /**
     * elimina un cliente.
     */
    public void remove(String idC)
    {
        nomClientes.remove(idC);
    }
    
    /**
     * Modifica un cliente con el id.
     */
    public void modificaCliente()
    {
        idC = texto.getTexto("Introduce el Id");
        nombre = texto.getTexto("Introduce el nombre");
        apellido = texto.getTexto("Introduce el apellido");
        direccion = texto.getTexto("Introduce la direccion");
        poblacion = texto.getTexto("Introduce la poblacion");
        telefono = texto.getNumero("Introduce el telefono");
               
        if(!nomClientes.containsKey(idC))
        {
            System.out.println("El codigo no existe no se puede modificar.");
            
        }
        else{
            HashmapClientes c = new HashmapClientes(nombre, apellido,direccion, poblacion, telefono);
            nomClientes.put(idC,c);
        }
    }
    
    /**
     * Imprime en pantalla la informacion de un cliente
     */
    public static void imprimeCliente(String idC)
    {
        System.out.println("Introduce el id del cliente:");
        idC = sc.next();
        
        if(!nomClientes.containsKey(idC))
        {
            System.out.println("El codigo elegido NO existe");
        }
        else{
            System.out.println("Clave: " + idC + "  Cliente: " + nomClientes.get(idC));
        }
    }
    
    /**
     * Imprime el numero de clientes
     */
    public void numeroClientes()
    {
        System.out.println ("Numero de clientes: " + nomClientes.size());
    }
    
    
    /**
     * Modifica valores de cliente
     */
    public void modificarCliente(String idC){
       for(Map.Entry<String,HashmapClientes> cx : nomClientes.entrySet())
        {
            String clave=cx.getKey();
            HashmapClientes valores=cx.getValue();
            if (idC==clave){
                System.out.println("id:" +clave+ " Cliente: " +valores);      
        }
        }
    }
    
    /**
     * comprueba si existe un elemento.
     */
    public boolean comprueba(String idC)
    {
       int existe=0;
       if(nomClientes.containsKey(idC))
        {
            return true ;
        }
        else{
            return false;
        }
    }
    
    public static String buscaNombre(String idC)
    {
        HashmapClientes c = nomClientes.get(idC);
        return c.getNombre();
    }
    
    public static String buscaApellido(String idC)
    {
        HashmapClientes c = nomClientes.get(idC);
        return c.getApellidos();
    }
    
    public static String buscaDireccion(String idC)
    {
        HashmapClientes c= nomClientes.get(idC);
        return c.getDireccion();
    }
    
    public static String buscaPoblacion(String idC)
    {
        HashmapClientes c=nomClientes.get(idC);
        return c.getPoblacion();
    }

    public String dameidcliente()
    {
        idC = texto.getTexto("introduce el id cliente");
        
        if(!nomClientes.containsKey(idC))
        {
            System.out.println("El codigo elegido NO existe");
        }
        else{
            System.out.println("Clave: " + idC + "  Cliente: " + nomClientes.get(idC));
        }
        return idC;
    }
}    
