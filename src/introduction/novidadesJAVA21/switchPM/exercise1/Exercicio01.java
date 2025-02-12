package introduction.novidadesJAVA21.switchPM.exercise1;

import java.util.List;

public class Exercicio01 {

    // Altere a implementação abaixo para utilizar o Pattern Matching com Switch

    public static boolean isValidInput(Object input) {

        return switch (input) {
            case Integer integer -> integer > 0;
            case String string -> string.length() > 3;
            case List list -> !list.isEmpty();
            default -> false;
        };

        // antes - sem uso do switch
        /*
        if (input instanceof String s) {
            return s.length() > 3;
        }

        if (input instanceof Integer i) {
            return i > 0;
        }

        if (input instanceof List<?> l) {
            return !l.isEmpty();
        }

        return false;

         */
    }

    public static void main(String[] args) {
        System.out.println(isValidInput(-2)); // false
        System.out.println(isValidInput("Ruan")); // true
        System.out.println(isValidInput(List.of(1, 2, 3))); // false
    }

}
