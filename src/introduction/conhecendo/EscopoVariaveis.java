package introduction.conhecendo;

public class EscopoVariaveis {
    public static void main(String[] args) {

        if (true) {

            double salario = 1550.25;     // quando sair desse escopo {} -> essa variavel "morre"

            System.out.println("O salário é: R$" + salario);

        }
        // declarando a variavel com mesmo tipo e nome, porem em escopo diferente
        double salario = 1000;
        System.out.println("O salário é: R$" + salario);

        System.out.println("Testando execução");
    }
}
