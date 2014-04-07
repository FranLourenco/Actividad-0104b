
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private final int tres = 3;
    private final int dos = 2;
    private final int cero = 0;
    /**
     * Constructor for objects of class NameGenerator
     */
    public String generateStarWarsName(String apellido, String nombre, String apellidoM, String ciudad){
        
        apellido = apellido.substring(cero,tres);
        nombre = nombre.substring(cero,tres);
        apellidoM = apellidoM.substring(cero,dos);
        ciudad = ciudad.substring(cero,tres);
        
        return apellido + nombre + apellidoM + ciudad;
        
    }

   
}
