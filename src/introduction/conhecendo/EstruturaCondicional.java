package introduction.conhecendo;

public class EstruturaCondicional {
    public static void main(String[] args) {

        // IF ELSE
        double media = 9.8;

        // se media for maior ou igual a 7 = aprovado
        // se não se, media for maior ou igual a 5 = recuperação
        // se não = reprovado

        if(media >= 7) {
            System.out.println("Parabéns!");
            System.out.println("Você está aprovado!");

        } else if (media >= 5) {
            System.out.println("Você está de recuperação.");

        } else {
            System.out.println("Infelizmente você está reprovado.");

        }


        // SWITCH
        int mes = 3;
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;  // encerrando o caso 1 atraves do break

            case 2:
                System.out.println("Fevereiro");
                break;

            case 3:
                System.out.println("Março");
                break;

            case 4:
                System.out.println("Abril");
                break;

            case 5:
                System.out.println("Maio");
                break;

            case 6:
                System.out.println("Junho");
                break;

            case 7:
                System.out.println("Julho");
                break;

            case 8:
                System.out.println("Agosto");
                break;

            case 9:
                System.out.println("Setembro");
                break;

            case 10:
                System.out.println("Outubro");
                break;

            case 11:
                System.out.println("Novembro");
                break;

            case 12:
                System.out.println("Dezembro");
                break;

            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}
