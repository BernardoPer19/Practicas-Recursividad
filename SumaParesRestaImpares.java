
public class SumaParesRestaImpares{

   public int Sec(int num) {
        if (num < 0) return 1; // Regla inicial en el código original
        return Sec(num, 10);
    }   

    private int Sec(int num, int diviE) {
        if (num == 0) return 0; // Condición base
        
        int digito = num % 10; // Obtiene el último dígito
        int resto = Sec(num / 10, diviE); // Llamada recursiva con el número sin el último dígito
        
        if (digito % 2 == 0) { // Si es par, sumamos
            return resto + digito;
        } else { // Si es impar, restamos
            return resto - digito;
        }
    }

}
