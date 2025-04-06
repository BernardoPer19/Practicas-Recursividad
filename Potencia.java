import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base: ");
        int BASE = scanner.nextInt();
        
        System.out.print("Ingrese el exponente: ");
        int EXPONENTE = scanner.nextInt();

        int resultado = calcularPotencia(BASE, EXPONENTE);
        
        System.out.println(BASE + " elevado a " + EXPONENTE + " es: " + resultado);
        
        scanner.close();
    }

    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        
        return resultado;
    }
}
