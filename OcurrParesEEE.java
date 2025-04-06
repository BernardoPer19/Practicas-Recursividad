public class OcurrParesEEE {

    public String ocurrPares(String cad) {
        return ocurrPares(cad, 0, "");
    }

    private String ocurrPares(String cad, int pos, String res) {
        // Condición base: si hemos procesado todos los caracteres, devolvemos el resultado
        if (pos >= cad.length()) {
            return res;
        }

        // Obtener el carácter en la posición actual
        char c = cad.charAt(pos);

        // Verificar si la posición actual y la siguiente son iguales
        if (pos < cad.length() - 1 && cad.charAt(pos) == cad.charAt(pos + 1)) {
            // Si la posición es impar, saltamos ambos caracteres (no los agregamos al resultado)
            if (pos % 2 != 0) {
                return ocurrPares(cad, pos + 2, res); // Salta ambos caracteres
            }
        }

        // Si no encontramos repetición o estamos en una posición par, agregamos el carácter al resultado
        return ocurrPares(cad, pos + 1, res + c);
    }
}
