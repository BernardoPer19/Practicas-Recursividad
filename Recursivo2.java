
public class Recursivo2{
    public int cantDigitos(int numero){
        int res = 1 ;

        if(numero < 9){
            res = 1;
        }else{
            res += cantDigitos(numero/10);
        }

        return res;
    }   

    public int cantDigitos2(int numero){
        int res = 1 ;

        if(numero < 9){
            res = 1;
        }else{
            res = res + cantDigitos(numero/10);
        }

        return res;
    }  

    public int cantDigitos3(int numero){
        int res = 1 ;

        if(numero > 0){
            return 1 + cantDigitos(numero/10);
        }

        return res;
    }  
}
