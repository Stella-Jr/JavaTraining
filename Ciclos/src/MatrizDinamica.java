import java.util.Scanner;

public class MatrizDinamica {
    public static void main(String[] args) {

        int renglones, columnas;
        var consola = new Scanner(System.in);

        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print("Valor[" + ren + "][" + col + "]");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        for (var ren = 0; ren < ren; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print("Matriz[" + ren + "][" + col + "] = "
                        + matriz[ren][col]);

            }
        }
    }
}
