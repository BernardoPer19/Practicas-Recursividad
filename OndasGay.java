
public class OndasGay{
    public int Ontas(String cadena){
            
        return Ontas(cadena, 0, -1);
        
    }
    
    private int Ontas(String cadena, int pos, int cont ){
        
        
        if(cadena == ""){
            return  0;
        }else if(pos < cadena.length()-1){
            if(cadena.charAt(pos) == cadena.charAt(pos+1)){
                return  Ontas(cadena,pos + 1, cont) ;
               
            }else{
              return Ontas(cadena,pos + 1, cont + 1) ;
            }
        }
        
        return cont;
        
    }
}
