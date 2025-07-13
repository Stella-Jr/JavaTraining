public class NumerosInversos {
    public static void main(String[] args) {

        System.out.println("*** Numeros Inversos***");

        var contador = 10;
        do{
            // se saca el salto de linea para que mande a imprimir en una misma linea
            System.out.print(contador-- + " ");
        } while (contador > 0);
    }
}
