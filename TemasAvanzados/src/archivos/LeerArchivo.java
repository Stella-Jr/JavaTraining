package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        //LEER EL ARCHIVO
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            System.out.println("Contenido del archivo: ");
            //ABRIR EL ARCHIVO PARA LECTURA
            var entrada = new BufferedReader(new FileReader(archivo));
            //LEEMOS LINEA A LINEA EL ARCHIVO
            var linea = entrada.readLine();
            //LEEMOS TODAS LAS LINEAS
            while(linea != null){
                System.out.println(linea);
                //ANTES DE TERMINAR EL CICLO, SE MUEVE A LA SIGUIENTE LINEA
                linea = entrada.readLine();
            }
            entrada.close();

        }catch(Exception e){
            System.out.println("Error al leer el archivo: " + e);
        }
    }
}
