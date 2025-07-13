package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class ServicioSnackArchivos implements IServicioSnacks{
    private final String NOMBRE_ARCHIVO = "snacks.txt";
    //creamos la lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    //constructor de clase
    public ServicioSnackArchivos() {
        //creamos el archivo
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if (existe) {
                this.snacks = obtenerSnacks();

            } else { //creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();//guarda el archivo en disco
                System.out.println("Se ha creado el archivo");
            }
        }catch(Exception e){
                System.out.println("Error al crear este archivo: " + e.getMessage());
            }
            // si no existe, cargamos algunos snacks inicales
            if (!existe)
                cargarSnacksIniciales();
        }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas", 70));
        this.agregarSnack(new Snack("Refresco", 50));
        this.agregarSnack(new Snack("Sandwich", 120));
    }

    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try{
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea: lineas) {
                String[] lineaSnack = linea.split(",");
                var idSnack = lineaSnack[0];
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                var snack = new Snack(nombre, precio);
                snacks.add(snack);
            }
        }catch (Exception e){
            System.out.println("Error al leer archivo de snacks: " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }


    @Override
    public void agregarSnack(Snack snack) {
        // agregamos el nuevo snack, 1. a la lista en memoria
        this.snacks.add(snack);
        // se guarda el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }
    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            anexar = archivo.exists(); // si ya existe se sobreescribe, si no, se anexa
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close();// se escribe la informacion en el archivo

        }catch (Exception e){
            System.out.println("Error al agregar snack: " + e.getMessage());
        }

    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el Inventario ---");
        // mostramos la lista de snacks en el archivo
        var inventarioSnacks = "";
        for (var snack: this.snacks){
            inventarioSnacks += snack.toString() + "\n";
        } snacks.toString();
        System.out.println(inventarioSnacks);

    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
