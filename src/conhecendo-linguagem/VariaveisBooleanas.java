public class VariaveisBooleanas {
    public static void main(String[] args) {

        boolean usuarioAtivo = true;
        int idadePedro = 28;

        // Operadores de Igualdade
        // == -> igual          idadePedro == 25 -> false
        // != -> diferente      idadePedro != 25 -> true

        // Operadores Relacionais
        // >    idadePedro > 25 -> true
        // >=   idadePedro >= 28 -> true
        // <    idadePedro < 30 -> true
        // <=   idadePedro <= 25 -> false

        // Operadores Lógicos
        // && -> e      true && true = true // true && false = false    // E - ambas as condições precisam ser verdadeiras para validar
        // || -> ou     false || true = true    // OU sempre busca pelo menos um verdadeiro para validar a condição
        //              idadePedro == 25 || idadePedro == 28 -> true


        System.out.println(usuarioAtivo);   // true
        System.out.println(idadePedro > 20);    // true
        System.out.println(idadePedro == 30);   // false

        System.out.println(usuarioAtivo == true && idadePedro < 30);    // true
        System.out.println(usuarioAtivo == false && idadePedro == 28);  // false

        System.out.println(usuarioAtivo == false || idadePedro == 28);  // true
    }
}
