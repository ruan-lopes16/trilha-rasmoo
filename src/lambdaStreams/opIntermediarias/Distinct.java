package lambdaStreams.opIntermediarias;
import lambdaStreams.mock.Mock;

import java.util.stream.Collectors;

public class Distinct {
    // 1 - Retornar uma lista de todos os clientes únicos com base no nome
    public static void exercise1() {
        var clients = Mock.clients();

        var result = clients.stream()
                .distinct() // para funcionar precisa da sobrescrita do equals
                .peek(client -> System.out.println(client.getName())) // pegando somente os nomes
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // 2 - Retornar uma lista contendo os nomes únicos dos produtos que foram adicionados anos pedidos
    public static void exercise2() {
        var orders = Mock.orders();

        var result = orders.stream()
                .flatMap(order -> order.getItems().stream()) // transformando lista de itens em stream
                .map(orderItem -> orderItem.getProduct().getName())
                .distinct().sorted()    // deixando os de listagem única + ordem alfabética
                // .peek(productName -> System.out.println(productName))
                .peek(System.out::println) // ref de metodo
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void main(String[] args) {
        exercise1();
        System.out.println("-".repeat(170));
        exercise2();
    }
}
