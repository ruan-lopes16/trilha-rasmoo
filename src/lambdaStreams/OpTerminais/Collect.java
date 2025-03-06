package lambdaStreams.OpTerminais;

import lambdaStreams.entity.Client;
import lambdaStreams.entity.Product;
import lambdaStreams.mock.Mock;

import java.util.stream.Collectors;

public class Collect {

    // 1- Filtrar todos os produtos que custam menos de R$500 e concatenar os nomes desses produtos em uma string
    public static void exercise1 () {
        var products = Mock.products();

        var result = products.stream()
                .filter(product -> product.getPrice() < 500) // filtrando produto que custa menos que R$500
                .map(Product::getName) // pegando somente o nome desse produto
                .collect(Collectors.joining(", ")); // para fazer somente em uma String, usa-se 'joining()' e dentro de '()' coloca-se o edelimitador/separação entre os nomes

        System.out.println(result);
    }

    // 2 - Agrupar todos os clientes pelo mês de aniversário e também determinar quantos clientes fazem aniversário em cada mês
    public static void exercise2 () {
        var clients = Mock.clients();

        var result = clients.stream()
                .collect(Collectors.groupingBy(client -> client.getBirthDate().getMonth(), Collectors.counting()));

        System.out.println(result);
    }

    // 3 - Agrupar todos os clientes por idade e coletar os nomes em lista
    public static void exercise3 () {
        var clients = Mock.clients();
        var result = clients.stream()
                .collect(Collectors.groupingBy(Client::getAge, Collectors.mapping(Client::getName, Collectors.toList()))); // para nomes em lista precisa do 'mapping' pra fazer lista

        System.out.println(result);
    }

    // 4 - Agrupar todos os clientes por idade e coletar os nomes em uma string separado por ';'
    public static void exercise4 () {
        var clients = Mock.clients();
        var result = clients.stream()
                .collect(Collectors.groupingBy(Client::getAge, Collectors.mapping(Client::getName, Collectors.joining("-"))));

        System.out.println(result);
    }

    public static void main(String[] args) {
        exercise1();
        System.out.println("-".repeat(170));
        exercise2();
        System.out.println("-".repeat(170));
        exercise3();
        System.out.println("-".repeat(170));
        exercise4();
    }
}