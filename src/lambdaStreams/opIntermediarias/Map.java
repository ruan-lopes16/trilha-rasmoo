package lambdaStreams.opIntermediarias;
import lambdaStreams.entity.Client;
import lambdaStreams.entity.Order;
import lambdaStreams.entity.OrderItem;
import lambdaStreams.entity.Product;
import lambdaStreams.mock.Mock;

import java.util.stream.Collectors;

public class Map {
    // 1 - Retornar uma lista contendo os nomes de todos os clientes
    public static void exercise1(){
        var clients = Mock.clients();

        var result = clients.stream()
                .map(client -> client.getName())
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // 2 - Retornar uma lista contendo os nomes de todos os produtos que custam mais de R$2.500,00
    public static void exercise2() {
        var products = Mock.products();

        var result = products.stream()
                .filter(product -> product.getPrice() > 2500)
                // .map(product -> product.getName())
                .map(Product::getName)  // por referencia de método
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // 3 - Retornar uma lista contendo os nomes de todos os clientes que fizeram pedidos cujo preço total é maior que R$80.000,00
    public static void exercise3 () {
        var orders = Mock.orders();

        var result = orders.stream()
                .filter(order -> order.getPrice() > 80000)
                // .map(order -> order.getClient().getName())   // fazendo travessia
                .map(Order::getClient)
                .map(Client::getName)
                .collect(Collectors.toList());

        System.out.println(result);

    }

    public static void main(String[] args) {
        exercise1();
        System.out.println("-".repeat(170));
        exercise2();
        System.out.println("-".repeat(170));
        exercise3();
    }
}
