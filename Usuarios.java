import java.util.Iterator;
import java.util.HashMap;
import java.util.*;

/**
 * Array de la clase usuarios
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuarios
{   
    //enum tipo {TECNICOS, CAJEROS,FINANCIACION};
    //tipo t=tipo.TECNICOS;
    public String nombreUsua;
    static HashMap<String,Usuarios> usua = new HashMap<>();
    static Scanner sc= new Scanner(System.in);
    public static String idU;
    Texto texto = new Texto();
    private Categorias cat;
    /**
     * primer constructor
     */
    public Usuarios()
    {     
        
    }
    
    /**
     * segundo constructros. Constructor for objects of class usuarios
     */
    public Usuarios(String nombreUsua, Categorias cat)
    {
        //this.idU=idU;       
        this.nombreUsua = nombreUsua;
        this.cat=cat;
        
    }

    public void cargaUsuarios()
    {
        
        usua.put("1", new Usuarios("Carlos Rodriguez",cat.CAJERO));
        usua.put("2", new Usuarios("María  Carrasco",cat.FINANCIACION));
    }
    
    /**
     * Añade usuarios 
     * 
     * @param  id y nombre
     *  
     */
    public void addUsuarios()
    {
        idU = texto.getTexto("Introduce el id");
        nombreUsua = texto.getTexto("Introduce el nombre");
        String cate=texto.getTexto("Introduce la categoria");
        
        if(usua.containsKey(idU)){
            System.out.println("El codigo esta repetido, no se puede crear un nuevo articulo.");
        }
        else{
        Usuarios c = new Usuarios(nombreUsua,cat);
        usua.put(idU,c);
    }
    }
    
    /**
     * devuelve el numero de usuarios
     */
    public int getNumbero_usuarios()
    {
        return usua.size();
    }
    
    public String getnombreUsua()
    {
        return nombreUsua;
    }
    
    public String toString()
    {
        return " Nombre: " + nombreUsua + cat;
    }
     
    
    public void prinUsuarios()
    {
        
        Iterator<String> it = usua.keySet().iterator();
        while(it.hasNext()){
         String clave  = it.next();
         System.out.println("Clave: " + clave + usua.get(clave));
        }
    }
    
    /**
     * imprime el cliente
     */
    public static void printUsuario(String idU )
    {
        System.out.println("Introduce el id del usuario:");
        idU = sc.next();
        if(!usua.containsKey(idU))
        {
            System.out.println("No existe el usuario");
        }
        else{       
         System.out.println("ID: " + idU + usua.get(idU));
        }
    }
    
    public String dameidusuarioP()
    {
        idU = texto.getTexto("Introduce el id del Usuario");
        if(!usua.containsKey(idU))
        {
            System.out.println("No existe el usuario");
        }
        else{       
         System.out.println("ID: " + usua.get(idU));
        }
        
        
        
        return idU;
    }
    
}
