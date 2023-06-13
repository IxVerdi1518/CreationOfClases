
package clases;

public class Persona {
    public String nombre;
    public String apellido;
    public Persona(){}
    public Persona(String nombre, String apellido){
       this.nombre = nombre;
       this.apellido = apellido;
        System.out.println("Tu nombre es: "+nombre +" y tu apellido es: "+apellido);
    }
    public void ImprimirNombre(){
        System.out.println("Tu nombre es: "+nombre+" y tu apellido es: "+apellido);
    }
    
}
