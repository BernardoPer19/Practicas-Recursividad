public class Recursivo{

    long  Exponente(int base, int expo){
        long res = 1; 

        if (expo == 0) {
            res = 1;
        }
        else if (expo == 1) {
            res = base;
        }
        else {
            res = base * Exponente(base, expo - 1);
        }

        return res;
    }

}
