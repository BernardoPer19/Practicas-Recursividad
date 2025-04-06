
public class Chinitas{

    String chinitasMafia(int pos){
        String res = "";

        if(pos == 1){
            res = "(-.-)";
        }else{
            res = "(-." + chinitasMafia(pos - 1) + ".-)";
        }

    
        return res;
    }

}
