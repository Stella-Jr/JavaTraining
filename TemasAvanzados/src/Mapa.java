import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();//no se respeta el orden de insercion
        persona.put("nombre" , "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

    }

}
