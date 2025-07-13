public class Excepciones {
    public static void main(String[] args) {
        try {
            int valor1 = 10, valor2 = 0;
            var resultado = valor1 / valor2;
            System.out.println("resultado =" + resultado);
        } catch (Exception e) {
            //esta es mas generica
            System.out.println("Ocurrio un error: " + e);
        }
    }
}