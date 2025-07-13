package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        // se crea la lista de productos de tipo snacks
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks(); //muestra los snacks disponibles
        while(!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally {
                System.out.println(); //imprime un salto de linea con cada iteracion
            }

        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elige una opcion:\s  """);
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola,
                                            List<Snack> productos){
        var salir = false;
        switch (opcion){
            case 1 -> comprarSnack (consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Regresa pronto! :D");
                salir = true;
            }
            default -> System.out.println("Opcion invalida :(");
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola,
                                     List<Snack> productos){
        System.out.println("Que snack quieres comprar (id)?");
        var idSnack = Integer.parseInt(consola.nextLine());
        //valida que el snack exista en la lista de snacks
        var snackEncontrado = false;
        for (var snack: Snacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                //agrega el snack a la lista de productos
                productos.add(snack);
                System.out.println("OK... Snack agregado: " + snack);
                snackEncontrado = true;
                break; // hace que termina la sentencia for para que siga a la siguiente linea
            }
        }
        if (!snackEncontrado){
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos){
        var ticket = "***Ticket de Venta ***";
        var total = 0.0;
        for (var producto: productos){
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola){
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se ha agregado correctamente");
        Snacks.mostrarSnacks();
    }
}
