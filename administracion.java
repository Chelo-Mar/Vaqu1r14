
/**
 * Write a description of class administracion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class administracion
{
    private String nombres;
    private String apellidos;
    
    public administracion(){
    
    }
    
    public void setNombre(String nombres){
    this.nombres=nombres;
    }
    
    public String setNombres(){
    return nombres;
    }
    
    public void setApellido(String apellidos){
    this.apellidos=apellidos;
    } 
    
    public String setApellidos(){
    return apellidos;
    }
    
    public void imprimirInformacion(){
    System.out.println("Nombres  :"+nombres);
    System.out.println("Apellidos  :"+apellidos);
    }
}
