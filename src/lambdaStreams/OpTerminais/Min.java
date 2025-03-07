package lambdaStreams.OpTerminais;

import lambdaStreams.entity.OrderItem;
import lambdaStreams.entity.Product;
import lambdaStreams.mock.Mock;

import java.util.Comparator;

public class Min {

    // Retornar o produto mais barato
    public static void exercise1() {
        var products = Mock.products();
        var result = products.stream()
                .min(Comparator.comparing(Product::getPrice));

        result.ifPresent(product -> {
            System.out.println("O produto: " + product.getName() + ", custa R$" + product.getPrice()); // produto em si
        });

        System.out.println(result); // Optional

    }

    // Retornar o cliente que possui a menor quantidade de letras no nome
    public static void exercise2() {
        var clients = Mock.clients();
        var result = clients.stream()
                .min(Comparator.comparing(client -> client.getName().length()));

        result.ifPresent(System.out::println);
        System.out.println(result);
    }

    // Retornar o itemPedido mais barato, dentre todos os pedidos
    public static void exercise3() {
        var orders = Mock.orders();
        var result = orders.stream()
                .flatMap(order -> order.getItems().stream()) // transformando lista em stream
                .min(Comparator.comparing(OrderItem::getPrice));

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
