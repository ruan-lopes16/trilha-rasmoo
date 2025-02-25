package lambdaStreams.opIntermediarias;

import lambdaStreams.entity.Client;
import lambdaStreams.entity.OrderItem;
import lambdaStreams.entity.Product;
import lambdaStreams.mock.Mock;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Sorted {
    // 1 - Retornar uma lista contendo os nomes de todos os clientes em ordem alfabética
    public static void exercise1() {
        var clients = Mock.clients();

        var result = clients.stream()
                .map(Client::getName) // primeiro precisa pegar o nome do cliente
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }

    // 2 - Retornar uma lista de produtos ordenados pelo preço de forma decrescente
    public static void exercice2() {
        var products = Mock.products();

        var result = products.stream()
                .sorted(Comparator.comparing(Product::getPrice, Comparator.reverseOrder()))
                .peek(product -> System.out.println(product.getName() + " - " + product.getPrice())) // peek para deixar mais 'clean' a visualização
                .collect(Collectors.toList());
        System.out.println(result);
    }

    // 3 - Retornar uma lista contendo todos os itens referentes ao pedido feito pela cliente 'Ana'
    // Os itens devem estar ordenados de forma crescente pelo preço
    public static void exercise3() {
        var orders = Mock.orders();

        var result = orders.stream()
                .filter(order -> order.getClient().getName().equalsIgnoreCase("ANA"))
                .flatMap(order -> order.getItems().stream()) // transformando stream de lista em stream de string
                .sorted(Comparator.comparing(OrderItem::getPrice))
                .peek(orderItem -> System.out.println(orderItem.getProduct().getName() + ": " + orderItem.getAmount() + " - R$" + orderItem.getPrice()))
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void main(String[] args) {
        exercise1();
        System.out.println("-".repeat(170));
        exercice2();
        System.out.println("-".repeat(170));
        exercise3();
    }
}
