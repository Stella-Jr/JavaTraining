import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // Listas genericas

        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

//        for (String elemento: miLista){
//             System.out.println("Dia de la semana: " + elemento);
//         }

        // Funciones lamba(funcion anonima de un codigo muy compacto) conocido como programacion funcional
//        miLista.forEach( elemento -> {
//            System.out.println("Elemento: " + elemento);
//         });

        miLista.forEach(System.out::println);
        List<String> nombre = Arrays.asList("Juan", "Pedro", "Yeni");
        System.out.println("\nLista de nombres");
        nombre.forEach(System.out::println);
    }
}
