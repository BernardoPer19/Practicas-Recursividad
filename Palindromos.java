
public class Palindromos{

    public boolean esPalindromo(String text){
        return esPalindromo(text, 0, text.length() - 1);
    }

    private boolean esPalindromo(String text, int left,int right){
        boolean res = false ;
        if(text.length() == 1 || left > right){
            res = true;
        }else if(text.charAt(left) == text.charAt(right)){
            res = esPalindromo(text, left +1 , right -1);
            res = true;
        }

        if(left == right ){
         res = true;
        }
        return res;

    }

        

}