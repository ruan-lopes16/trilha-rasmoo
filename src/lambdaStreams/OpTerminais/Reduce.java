package lambdaStreams.OpTerminais;

import lambdaStreams.entity.Client;
import lambdaStreams.entity.Product;
import lambdaStreams.mock.Mock;

public class Reduce {

    // Retornar a soma das idades de todos os clientes
    public static void exercise1() {
        var clients = Mock.clients();

        var result = clients.stream()
                .map(Client::getAge)
                .reduce((a1, a2) -> a1 + a2); // somando cada idade - função acumuladora
                //.orElse(0); // se não existir nenhum valor, o resultado será 0 (zero)
                // abaixo, uma alternativa para o trecho comentado acima

        result.ifPresent(System.out::println); // se não existir nenhum valor, o resultado será 0 (zero) - sem Optional

        System.out.println(result); // com Optional
    }

    // Retornar a soma dos preços de todos os produtos que custam menos de 500
    public static void exercise2() {
        var products = Mock.products();

        var result = products.stream()
                .map(Product::getPrice)
                .filter(price -> price < 500   )
                // .reduce((p1, p2) -> p1 + p2); // caso sem valor inicial - finalizando o codigo aq, da como saida 'Optional.empty' - ou seja, stream vazia
                .reduce(0.0, (p1, p2) -> p1 + p2 ); // nesse caso não tera mais o 'Optional.empty' e sim o valor 0(zero), pois é o valor inicial/default

    /*    // tratativa - se existir, faça..., se nao, faça...
        result.ifPresentOrElse(System.out::println, () -> {
            System.out.println("Stream vazia!");
        }); */

        System.out.println(result);
    }

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
}
