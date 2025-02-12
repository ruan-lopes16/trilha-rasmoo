package introduction.novidadesJAVA21.switchPM.exercise1;

import java.util.List;

public class Exercicio01 {

    // Altere a implementação abaixo para utilizar o Pattern Matching com Switch

    public static boolean isValidInput(Object input) {
        if (input instanceof String s) {
            return s.length() > 3;
        }

        if (input instanceof Integer i) {
            return i > 0;
        }

        if (input instanceof List<?>) {
            return !l.isEmpty();
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidInput(-2));
    }

}
