
/**
 * Write a description of class Categorias here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum Categorias
{       CAJERO("caja"), FINANCIACION("financiacion");
    
   private String cat;

   private Categorias (String cat)
   {
    this.cat=cat;
    }
    
   public String getCat()
   {
       return cat;
   }
   
   public String setCat()
   {
       return this.cat=cat;
    }
    
}
