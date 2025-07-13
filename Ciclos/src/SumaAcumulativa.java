public class SumaAcumulativa {
    public static void main(String[] args) {

        System.out.println("*** Suma Acumulativa");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        var numero = 1;

        while (numero <= MAXIMO) {
            // imprimir lo que se va a sumar
            System.out.println( "(acumuladorSuma + numero) -> "
                    + acumuladorSuma + " + " + numero);

            //realizar la suma acumulativa
            acumuladorSuma += numero++; //acumuladorSuma = acumuladorSuma + numero

            //imprimir la suma parcial acumulada
            System.out.println("suma acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("suma de los primeros "
                + MAXIMO + " numeros = " + acumuladorSuma);
    }
}

