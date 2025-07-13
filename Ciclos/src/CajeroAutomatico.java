import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;
        var saldo = 1000;

        while (!salir) {
            System.out.println("""
                    *** Aplicacion de Cajero Automatico ***
                    Operacion que puedes realizar: 
                    1.Consultar Saldo
                    2.Retirar
                    3.Depositar
                    4.Salir
                    Escoje una opcion:
                    """);
            var opcion = consola.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Tu saldo actual es de: " + saldo + "\n");

                case 2 -> {
                    System.out.println("Ingresa el monto a retirar: ");
                    var retiro = consola.nextInt();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Tu saldo es: " + saldo + "\n");
                    } else {
                        System.out.println("No cuentas con el saldo suficiente");
                    }
                }

                case 3 -> {
                    System.out.println("Ingrese el monto a depositar: ");
                    var deposito = consola.nextInt(); // cambio 1
                    saldo += deposito; // cambio 2
                    System.out.println("Tu saldo es: " + saldo + "\n");
                }

                case 4 -> {
                    System.out.println("Saliendo del sistema, hasta pronto!");
                    salir = true;
                }

                default -> System.out.println("Opcion Invalida. Selecciona otra opcion. \n");
            }
        }
    }
}
