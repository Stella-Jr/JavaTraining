import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>(); //no permite que se repitan, mantiene el orden en el que se agregan
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Vick");

        System.out.println("Elementos del set" );
        conjunto.forEach(System.out::println);

        conjunto.remove("Karla");
        System.out.println("\nNuevos elementos del set");
        conjunto.forEach(System.out::println);
    }
}
