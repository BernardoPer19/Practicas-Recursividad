import java.util.ArrayList;

public class AgregarPalabras {

    public boolean isLetter(char c) {
        return Character.isLetter(c);
    }

    public ArrayList<String> agregadorPalabras(String sentence) {
        ArrayList<String> res = new ArrayList<>();
        agregadorPalabras(sentence, 0, res, "");
        return res;
    }

    private void agregadorPalabras(String sentence, int pos, ArrayList<String> arrWords, String currWord) {

        char character = sentence.charAt(pos);

        if (isLetter(character)) {
            currWord += character; 
        } else {  
            arrWords.add(currWord);
            currWord = "";
        }

        if (pos >= sentence.length()) { 
            if (!currWord.isEmpty()) {  
                arrWords.add(currWord); 
            }
            return;
        }

        agregadorPalabras(sentence, pos + 1, arrWords, currWord);  
    }

}
