public class TextoCambiado {
    public String cadenaCambiada(String texto, String palabra) {
        return cadenaCambiada(texto, palabra, 0, 0, "");
    }

    private String cadenaCambiada(String texto, String palabra, int posPal, int posText, String resultado) {
        // Caso base: Si hemos recorrido todo el texto, devolvemos el resultado final
        if (posText >= texto.length()) {
            return resultado;
        }

        // Construimos la palabra actual comparando letra por letra
        if (posPal < palabra.length() && texto.charAt(posText) == palabra.charAt(posPal)) {
            // Si encontramos una coincidencia, avanzamos en la palabra y el texto
            return cadenaCambiada(texto, palabra, posPal + 1, posText + 1, resultado);
        } else {
            // Si la palabra no coincide, reiniciamos la búsqueda y agregamos el caracter al resultado
            return cadenaCambiada(texto, palabra, 0, posText + 1, resultado + texto.charAt(posText));
        }
    }
}