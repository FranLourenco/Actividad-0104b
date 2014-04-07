
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
 
    /**
     * Constructor for objects of class NameGenerator
     */
    public String generateStarWarsName(String apellido, String nombre, String apellidoM, String ciudad){
        apellido = apellido.substring(0,3);
        nombre = nombre.substring(0,3);
        apellidoM = apellido.substring(0,3);
        ciudad = ciudad.substring(0,3);
        
        return apellido + nombre + apellidoM + ciudad;
        
    }

   
}
