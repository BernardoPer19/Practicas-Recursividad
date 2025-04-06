public class Recursivo3 {
    
    public boolean esPar(int n) {
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return false;
        }
        return esPar(n - 2);
    }
}
    