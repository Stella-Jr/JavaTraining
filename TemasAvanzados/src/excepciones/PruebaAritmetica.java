package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 2);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
// se ejecuta unicamente si detecta el error osino pasa a la siguiente linea
        } finally {
            System.out.println("Se reviso la division entre cero");
// se ejecuta siempre independientemente de si hubo un error o no
        }
    }
}
