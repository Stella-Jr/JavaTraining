public class ArgumentosVariables {
    public static void main(String[] args) {
        // imprimirNumeros (1, 2, 3, 4, 5); //varargs
        variosParametros("Karla", 10, 20, 30);
    }
//primero van los argumentos no variables y ultimo los que si son variables
    static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);

    }

    static void imprimirNumeros(int... numero) { //argumento variable
//los puntos permiten recibir cualquiier cantidad de numeros pero solo enteros
        for(var i=0; i < numero.length; i++)
            System.out.print(numero[i] + " ");
    }
}
