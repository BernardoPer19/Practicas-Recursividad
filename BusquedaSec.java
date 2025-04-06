
public class BusquedaSec{

    public boolean Buski(int []Arr, int x ){
        return Buski(Arr, x , 0);
    }

    private boolean Buski(int []Arr, int x, int pos){
        boolean res = false;

        if(pos>= Arr.length){
            return false;
        }else{

            if(x == Arr[pos]){
                res = true;
            }else{
                res = Buski(Arr,  x,  pos+1);
            }
        }

        return res;
    }
}
