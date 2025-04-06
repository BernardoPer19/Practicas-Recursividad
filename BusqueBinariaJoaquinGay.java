
public class BusqueBinariaJoaquinGay{

    public boolean JoaquinGeyBi(int x, int []Arr){

        return JoaquinGeyBi(x, Arr, 0, Arr.length-1);

    }

    private boolean JoaquinGeyBi(int x, int []Arr, int li, int ls){

        boolean res = false;
        int medio = (li + ls) / 2;

        if(x == Arr[medio]){
            return true;
        }else{

            if(x >= Arr[medio]){
                res = JoaquinGeyBi(x, Arr, medio + 1, ls);
            }else {
                res = JoaquinGeyBi(x, Arr, li, medio - 1);
            }

        }

        return res;

    }
}
