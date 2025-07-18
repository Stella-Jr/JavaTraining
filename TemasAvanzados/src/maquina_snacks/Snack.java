package maquina_snacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    //JAVABEANS DEBE TENER UN CONSTRUCTOR VACIO
    //ENCAPSULAMIENTO
    private static int contadorSnacks = 0;
    private int idSnack;
    private String nombre;
    private double precio;
//atributos privados

    public Snack() {
        this.idSnack = ++Snack.contadorSnacks;
        //esto hace que se incremente cada vez que se agregue un snack para que cada uno tenga su id
    }

    public Snack(String nombre, double precio){
        this(); //esto manda a llamar el constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }//comparaciones de contenido

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }//comparaciones con tipo numericos
}
