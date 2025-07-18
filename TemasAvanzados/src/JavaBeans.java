import java.io.Serializable;

// es un estandar para que se pueden crear objetos y para que se puedan crear obejtos sin necesidad de agregar mas variables
public class JavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Karla");
        persona.setApellido("Lara");
        System.out.println("persona = " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());

    }
}


 class Persona implements Serializable {

        private String nombre;
        private String apellido;

        public Persona(){}

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public String getApellido() {
         return apellido;
     }

     public void setApellido(String apellido) {
         this.apellido = apellido;
     }

     @Override
     public String toString() {
         return "Persona{" +
                 "nombre='" + nombre + '\'' +
                 ", apellido='" + apellido + '\'' +
                 '}';
     }
 }
