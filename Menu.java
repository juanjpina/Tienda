import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu
{
    private Usuarios usuar;
    private Imagen img;
    private Sonido sond;
    private Hogar hogar;
    private Telefonia telef;
    private Facturas fra;
    private Informatica infor;
    private HashmapClientes cli;
    
    
        public static void main(String[] args){
            
        HashmapClientes cli = new HashmapClientes();
        Imagen img = new Imagen();    
        Usuarios usuar = new Usuarios(); 
        Sonido sond = new Sonido();
        Hogar hogar = new Hogar();
        Informatica infor = new Informatica();
        Telefonia telef = new Telefonia();
        Facturas fra = new Facturas();
    
        Scanner sc = new Scanner(System.in);
        
        String codigo;
        int opcion= 0;
        int opcionElegida = 0;
        String idC="0";
        String idU="0";
        String idE="0";
        // *** variables de clase electrodomesticos y subclases
        String id="x";
        String marca = "xxx";
        String modelo = "xxx";
        String medidas = "x";
        String color = "xxx";
        int precio = 0;
        int cantidad = 0;
        
        
        // *** Rellena los hashmap con datos 
        img.rellenaImagen();
        usuar.cargaUsuarios();
        sond.rellenaSonido();
        hogar.rellenaHogar();
        infor.rellenaInformatica();
        cli.addRelleno();
        
        
        do{
            System.out.println("---MENU PRINCIPAL---");
            System.out.println("1.- Usuarios");
            System.out.println("2.- Electrodomésticos");
            System.out.println("3.- Clientes");
            System.out.println("4.- Reparación Electrodomésticos");
            System.out.println("5.- Venta de Electrodomésticos");
            System.out.println("6.- Devolución de Electrodomésticos");
            System.out.println("7.- Salir");
            
            opcionElegida = sc.nextInt();
            
            //while(opcionElegida > 7 || opcionElegida <1);
                    switch(opcionElegida){               
                    
                        case 1: //usuarios
                    
                                do{
                                    System.out.println("8-Añadir Usuarios");
                                    System.out.println("9-Suprimir Usuarios");
                                    System.out.println("10-Listar Usuarios");
                                    System.out.println("12-salir");
                                    opcionElegida = sc.nextInt();
                              
                                
                           
                                    switch(opcionElegida ){
                                        case 8: //Añadir usuarios
                                                
                                            
                                            
                                           
                                          usuar.addUsuarios();
                                            break;
                                        case 9: // Suprimir Usuarios
                                           usuar.printUsuario(idU);
                                            
                                        break;
                                        case 10: // Listar Usuarios
                                            usuar.prinUsuarios();
                                            break;
                                        case 11: // Salir
                                            System.out.println("Has salido. ");//volver arriba
                                            //main(args);
                                            break; 
                                            
                                        default:
                                            System.out.println("salir");
                                            break;
                                        }
                                 }while(opcionElegida !=12);  
                                 break;
                        
                        case 2: //Electrodomesticos
                                do{
                                    System.out.println("---MENU ELECTRODOMESTICOS---");
                                    System.out.println("12-Imagen");
                                    System.out.println("13-Sonido");
                                    System.out.println("14-Hogar");
                                    System.out.println("15-Informática");
                                    System.out.println("16-Telefoniaa");
                                    System.out.println("17-Inventario");
                                    System.out.println("18-Salir");
                                    opcionElegida = sc.nextInt();
                                    switch(opcionElegida){
                                        case 12: //imagen
                                                do{
                                                    System.out.println("---IMAGEN---");
                                                    System.out.println("121-Añadir Electrodomestico");
                                                    System.out.println("122-Buscar Electrodomestico");
                                                    System.out.println("123-Listar ElectrodomesticoUsuarios");
                                                    System.out.println("124-Modificar Datos");
                                                    System.out.println("125-Salir");
                                                    opcionElegida = sc.nextInt();
                                              
                                                    //opcionElegida = img.texto();
                                           
                                                    switch(opcionElegida ){
                                                        case 121: //Añadir imagen
                                                          img.addElec(id, marca,  modelo,  color,  medidas, precio, cantidad);
                                                            break;  
                                                         
                                                        case 122: // Buscar imagen
                                                             System.out.println("Introduce el ID");
                                                             String x = sc.next();
                                                             System.out.println(x);
                                                             img.imprimeElectrodo(x);
                                                            
                                                        break;
                                                        case 123: // Listar imagen
                                                            img.imprimeP();
                                                            break;
                                                        
                                                        case 124:// modifica datos
                                                             System.out.println("Introduce el ID");
                                                             id = sc.next();
                                                             if(img.comprueba(id))
                                                             {
                                                                 img.imprimeElectrodo(id);                                                                  
                                                                 
                                                                 img.modificaDatos(id, marca, modelo, color,  medidas, precio, cantidad);
                                                                }
                                                             else
                                                             {
                                                                System.out.println("No existe el producto");
                                                                }
                                                             break;
                                                           
                                                        default:
                                                            System.out.println("salir");
                                                            break;
                                                        }
                                                 }while(opcionElegida !=125);  
                                                 break;
                                        case 13: // sonido
                                               do{
                                                    System.out.println("---SONIDO---"); 
                                                    System.out.println("131-Añadir Electrodomestico");
                                                    System.out.println("132-Buscar Electrodomestico");
                                                    System.out.println("133-Listar ElectrodomesticoUsuarios");
                                                    System.out.println("134-Modificar Datos");
                                                    System.out.println("135-Salir");
                                                    opcionElegida = sc.nextInt();
                                              
                                                
                                           
                                                    switch(opcionElegida ){
                                                        case 131: //Añadir sonido
                                                           
                                                            sond.addElec(id, marca,  modelo,  color,  medidas, precio, cantidad);
                                                            break;  
                                                         
                                                        case 132: // Buscar sonido
                                                             System.out.println("Introduce el ID");
                                                             String x = sc.next();
                                                             System.out.println(x);
                                                             sond.imprimeElectrodo(x);
                                                            
                                                        break;
                                                        case 133: // Listar sonido
                                                            sond.imprimeP();
                                                            break;
                                                        
                                                        case 134:// modifica datos sonido
                                                             System.out.println("Introduce el ID");
                                                             id = sc.next();
                                                             if(sond.comprueba(id))
                                                             {
                                                                 sond.imprimeElectrodo(id);                                                                  
                                                                 sond.modificaDatos(id, marca, modelo, color,  medidas, precio, cantidad);
                                                                }
                                                             else
                                                             {
                                                                System.out.println("No existe el producto");
                                                                }
                                                             break;
                                                           
                                                        default:
                                                            System.out.println("salir");
                                                            break;
                                                        }
                                                 }while(opcionElegida !=135);  
                                            break;
                                        case 14:// hogar
                                               do{
                                                    System.out.println("---HOGAR---");
                                                    System.out.println("141-Añadir Electrodomestico");
                                                    System.out.println("142-Buscar Electrodomestico");
                                                    System.out.println("143-Listar ElectrodomesticoUsuarios");
                                                    System.out.println("144-Modificar Datos");
                                                    System.out.println("145-Salir");
                                                    opcionElegida = sc.nextInt();
                                              
                                                
                                           
                                                    switch(opcionElegida ){
                                                        case 141: //Añadir hogar
                                                            hogar.addElec(id, marca,  modelo,  color,  medidas, precio, cantidad);
                                                            break;  
                                                         
                                                        case 142: // Buscar hogar
                                                             System.out.println("Introduce el ID");
                                                             String x = sc.next();
                                                             
                                                             hogar.imprimeElectrodo(x);
                                                            
                                                        break;
                                                        case 143: // Listar hogar
                                                            hogar.imprimeP();
                                                            break;
                                                        
                                                        case 144:// modifica datos hogar
                                                             System.out.println("Introduce el ID");
                                                             id = sc.next();
                                                             if(hogar.comprueba(id))
                                                             {
                                                                 hogar.imprimeElectrodo(id);                                                                  
                                                                 hogar.modificaDatos(id, marca, modelo, color,  medidas, precio, cantidad);
                                                                }
                                                             else
                                                             {
                                                                System.out.println("No existe el producto");
                                                                }
                                                             break;
                                                           
                                                        default:
                                                            System.out.println("salir");
                                                            break;
                                                        }
                                                 }while(opcionElegida !=145);  
                                            break;
                                        
                                        case 15: // INFORMATICA
                                               do{
                                                    System.out.println("---INFORMATICA---");
                                                    System.out.println("151-Añadir Electrodomestico");
                                                    System.out.println("152-Buscar Electrodomestico");
                                                    System.out.println("153-Listar ElectrodomesticoUsuarios");
                                                    System.out.println("154-Modificar Datos");
                                                    System.out.println("155-Salir");
                                                    opcionElegida = sc.nextInt();
                                              
                                                
                                           
                                                    switch(opcionElegida ){
                                                        case 151: //Añadir informatica
                                                           
                                                            infor.addElec(id, marca,  modelo,  color,  medidas, precio, cantidad);
                                                            break;  
                                                         
                                                        case 152: // Buscar informatica
                                                             System.out.println("Introduce el ID");
                                                             String x = sc.next();
                                                             
                                                             infor.imprimeElectrodo(x);
                                                            
                                                        break;
                                                        case 153: // Listar informatica
                                                            infor.imprimeP();
                                                            break;
                                                        
                                                        case 154:// modifica datos informatica
                                                             System.out.println("Introduce el ID");
                                                             id = sc.next();
                                                             if(infor.comprueba(id))
                                                             {
                                                                 infor.imprimeElectrodo(id);                                                                  
                                                                 
                                                                 infor.modificaDatos(id, marca, modelo, color,  medidas, precio, cantidad);
                                                                }
                                                             else
                                                             {
                                                                System.out.println("No existe el producto");
                                                                }
                                                             break;
                                                           
                                                        default:
                                                            System.out.println("salir");
                                                            break;
                                                        }
                                                 }while(opcionElegida !=155);  
                                        break;
                                        
                                        case 16: //TELEFONIA
                                               do{
                                                    System.out.println("---TELEFONIA---");
                                                    System.out.println("161-Añadir Electrodomestico");
                                                    System.out.println("162-Buscar Electrodomestico");
                                                    System.out.println("163-Listar ElectrodomesticoUsuarios");
                                                    System.out.println("164-Modificar Datos");
                                                    System.out.println("165-Salir");
                                                    opcionElegida = sc.nextInt();
                                              
                                                
                                           
                                                    switch(opcionElegida ){
                                                        case 161: //Añadir telefonia
                                                            telef.addElec(id, marca,  modelo,  color,  medidas, precio, cantidad);
                                                            break;  
                                                         
                                                        case 162: // Buscar telefonia
                                                             System.out.println("Introduce el ID");
                                                             String x = sc.next();
                                                             
                                                             telef.imprimeElectrodo(x);
                                                            
                                                        break;
                                                        case 163: // Listar telefonia
                                                            telef.imprimeP();
                                                            break;
                                                        
                                                        case 164:// modifica datos telefonia
                                                             System.out.println("Introduce el ID");
                                                             id = sc.next();
                                                             if(telef.comprueba(id))
                                                             {
                                                                 telef.imprimeElectrodo(id);                                                                  
                                                                 telef.modificaDatos(id, marca, modelo, color,  medidas, precio, cantidad);
                                                                }
                                                             else
                                                             {
                                                                System.out.println("No existe el producto");
                                                                }
                                                             break;
                                                           
                                                        default:
                                                            System.out.println("salir");
                                                            break;
                                                        }
                                                 }while(opcionElegida !=165); 
                                        break;
                                        
                                        case 17:
                                            img.imprimeP();
                                            sond.imprimeP();
                                            hogar.imprimeP();
                                            infor.imprimeP();
                                            telef.imprimeP();
                                            
                                        break;
                                        
                                        default:
                                        break;
                                    }
                        
                                    
                                }while(opcionElegida !=18);
                                break;  
                    
                          case 3: //clientes
                                  do{
                                    System.out.println("16-Añadir cliente");
                                    System.out.println("17-Listar Cliente");
                                    System.out.println("18-Modificar Cliente");
                                    System.out.println("19-listar clientes");
                                    System.out.println("20-Volver Inicio");
                                    opcionElegida = sc.nextInt();
                                    switch(opcionElegida){
                                        case 16: //añadir cliente
                                            /*System.out.println("DNI:");   
                                            id = sc.next();
                                            System.out.println("Nombre");   
                                            String nombre = sc.next();
                                            System.out.println("Apellidos");   
                                            String apellidos = sc.next();
                                            System.out.println("Dirección");   
                                            String direccion = sc.next();
                                            System.out.println("poblacion");   
                                            String poblacion = sc.next();
                                            System.out.println("Teléfono");   
                                            String telefono = sc.next();*/
                                            cli.add();  
                                        break;
                                        case 17: // listar cliente
                                            System.out.println("DNI:");   
                                            id = sc.next();
                                            cli.imprimeCliente(id);
                                        break;
                                        case 18: // modificar cliente
                                            System.out.println("Introduce dni");
                                            id = sc.next();
                                            if(cli.comprueba(id)){
                                                /*cli.imprimeCliente(id);
                                                System.out.println("Nombre");
                                                nombre = sc.next();
                                                System.out.println("Apellidos");   
                                                apellido = sc.next();
                                                System.out.println("Dirección");   
                                                direccion = sc.next();
                                                System.out.println("poblacion");   
                                                poblacion = sc.next();
                                                System.out.println("Teléfono");   
                                                telefono = sc.nextInt();  */                 
                                                cli.modificaCliente();
                                            }
                                            else
                                            {
                                                System.out.println("El DNI no existe.");
                                            }
                                            
                                            
                                            
                                            
                                            
                                        break;
                                        
                                        case 19: // Financioacion
                                            cli.imprimeP();  
                                        break;
                                        
                                        default: //salir
                                        break;
                                    }
                        
                                    
                                }while(opcionElegida !=20);   
                                break;
                          case 4: //Reparacion Electrodomesticos.     
                                do{
                                    System.out.println("21-Añadir Reparación");
                                    System.out.println("22-Suprimir Reparación");
                                    System.out.println("23-Modificar Reparación");
                                    System.out.println("24-Estado Reparación");
                                    System.out.println("25-Salir");
                                    
                                    opcionElegida = sc.nextInt();
                                    switch(opcionElegida){
                                        case 21: //Añadir Reparación
                                            
                                        break;
                                        case 22: // Suprimir Reparación
                                        break;
                                        case 23: // Modificar Reparación
                                        break;
                                        case 24: // Estado Reparación
                                        break;
                                        default: // salir
                                        break;
                                    }
                        
                                    
                                }while(opcionElegida !=25);   
                                break;       
                            case 5: //venta de elelctrodomesticos
                                do{
                                    System.out.println("---FACTURACION");
                                    System.out.println("26-Sonido");
                                    System.out.println("27-n");
                                    System.out.println("29-pinta");
                                    System.out.println("30-Salir");
                                    
                                    opcionElegida = sc.nextInt();
                                    switch(opcionElegida){
                                        case 26: //facturarion sonido
                                            fra.fraFecha();//devuelve fecha
                                            //idU=usuar.buscaUsuarioP();
                                            idC= cli.dameidcliente();
                                            idE=sond.dameidproducto();
                                            cantidad = fra.damecantidad();
                                            sond.buscaUd(idE, cantidad);//comprueba si hay unidades y calcula precio total.
                                           
                                            //fra.recuperarDatos(y, precio, cantidad,   idU,  idC);
                                            
                                            //recuperarDatos(String y, int precio, int cantidad,  String idU, String idC)
                                            
                                        break;
                                        case 27: // prueba de añadir factura
                                            fra.fraFecha();//devuelve fecha
                                            idU=usuar.dameidusuarioP();
                                            idC= cli.dameidcliente();
                                            idE=sond.dameidproducto();
                                            cantidad = fra.damecantidad();
                                            sond.buscaUd(idE, cantidad);//comprueba si hay unidades y calcula precio total.
                                            fra.recuperarDatos( idC, idU,  idE, cantidad);
                                        break;
                                        case 28: // Modificar Reparación
                                        break;
                                        case 29: // Estado Reparación
                                        fra.nnn();
                                        
                                        break;
                                        default: // salir
                                        break;
                                    }
                        
                                    
                                }while(opcionElegida !=30);  
                                break;
                            
                        default:
                        break;
                
            }
        }while(opcionElegida !=7);
    }
}   
