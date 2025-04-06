import java.util.*;
public class Recursivo4{

    int ocurrencias(int num){
        return ocurrencias(num,  new ArrayList<Integer>(), 1 , 0);
    }

    private int ocurrencias(int num ,ArrayList<Integer> noDuplicados,  int facMulti, int res ){
        if(num<10){ 
            return res;
        }else{
            int dig = num%10;
            if(!noDuplicados.contains(dig)){
                noDuplicados.add(dig);
                res = (facMulti * dig) + res;
                facMulti *= 10;

            }
        }
        return ocurrencias( num/10 ,noDuplicados,   facMulti,  res);
    }
}
