import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;
        // Empezar con la iteracion del menu

        while(!salir){ //logica inversa, hasta que no se ponga un true en salir el ciclo se repite
            System.out.println("""
                    *** Sistema de Administracionn de Cuentas ***
                    MENU: 
                    1.Crear cuenta
                    2.Eliminar cuenta
                    3.Salir
                    Escoje una opcion: \s
                    """);
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 -> System.out.println("CREANDO TU CUENTA...\n");
                case 2 -> System.out.println("ELIMINANDO TU CUENTA... \n");
                case 3 -> {
                    System.out.println("Saliendo del sistema, hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opcion Invalida... \n");


            }

        }


    }
}
