package arrays.test;
import arrays.model.Produto;

public class TesteArrayReferencia {
    public static void main(String[] args) {

        // |null|null|null|null|
        Produto[] produtos = new Produto[4];

        // System.out.println("primeira posição ao instanciar um array: " + produtos[0].getNome()); // NullPointerException

        produtos[0] = new Produto("IPhone 14", 4000.9); // criando produto - |IPhone 14|null|null|null|

        System.out.println("Primeiro produto: " + produtos[0].getNome());  // IPhone 14
        System.out.println("------------------------------------");

        produtos[1] = new Produto("Notebook AMD", 4000.0);  // |IPhone 14|Notebook AMD|null|null|

        // CRIE MAIS OBJETOS PARA NAO DAR "NULLPOINTEREXCEPTION"

        // tentando acessar atributos de uma posicão NÃO existente no array - tirar comentário para teste
        // System.out.println(produtos[10].getNome());     // ArrayIndexOutOfBoundsException

        // COMO OS DEMAIS PRODUTOS NÃO FORAM INSTANCIADOS, ESTOURARÁ UMA "NullPointerException"
        for ( int i = 0; i < produtos.length; i++ ){
            System.out.println(i + 1 + "° produto: " + produtos[i].getNome() + ", preço R$" + produtos[i].getPreco());
        }
    }
}
