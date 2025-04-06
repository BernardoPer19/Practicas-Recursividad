import java.util.ArrayList;
public class Recursivo44{
    public static ArrayList<ArrayList<Integer>> generarTriangulo(int n) {
        if (n == 0) {
            return new ArrayList<>(); 
        }
        ArrayList<ArrayList<Integer>> triangulo = generarTriangulo(n - 1); // Llamada recursiva
        ArrayList<Integer> nuevaFila = new ArrayList<>();

        for (int col = 0; col < n; col++) {
            nuevaFila.add(calcularValor(n - 1, col, triangulo)); // Calcula valores recursivos
        }

        triangulo.add(nuevaFila); // Agregar fila a la estructura principal
        return triangulo;
    }

    // Método recursivo para calcular valores del Triángulo de Pascal
    private static int calcularValor(int fila, int col, ArrayList<ArrayList<Integer>> triangulo) {
        if (col == 0 || col == fila) {
            return 1;
        }; // Casos base: bordes siempre son 1
        return triangulo.get(fila - 1).get(col - 1) + triangulo.get(fila - 1).get(col);
    }
}
