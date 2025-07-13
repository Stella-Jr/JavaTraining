public class Matrices {
    public static void main(String[] args) {

        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };
        //CICLO MAS EXTERNO RECORRE LOS RENGLONES
        for (var ren = 0; ren < matriz.length; ren++) {

        //CICLO MAS INTERNO RECORRE LAS COLUMNAS
            for (var col = 0; col < matriz[ren].length; col++) {
                System.out.println("Valor [" + ren + "][" + col + "]= " + matriz[ren][col]);

            }
        }
    }
}

