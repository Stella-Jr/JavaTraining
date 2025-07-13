package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks {
    private static final List<Snack> snacks;
    //no se usa constructor, porque este es para crear objetos

    //bloque de tipo estatico inicalizador
    static {
        snacks = new ArrayList<>(); //no se puede asignar una lista distinta pero se puede modificar su contenido
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    public void agregarSnack(Snack snack){
        snacks.add(snack); //esto permite que el usuario pueda agregar un snack
    }

    public void mostrarSnacks() { //esto permitira mostrar el inventario de los snacks disponibles
        var inventarioSnacks = "";
        for (var snack : snacks) {
            inventarioSnacks += snack.toString() + "\n"; //manda a llamar el metodo to.string ya definido
        }
        System.out.println("---Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }

    public List<Snack> getSnacks(){// regresa la lista
        return snacks;
    }


}
