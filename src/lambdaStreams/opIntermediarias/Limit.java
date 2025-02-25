package lambdaStreams.opIntermediarias;

import lambdaStreams.entity.Order;
import lambdaStreams.mock.Mock;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Limit {
    // 1 - Retornar uma lista com os 2 primeiros pedidos que possuem maior valor total
    public static void exercise1() {
        var orders = Mock.orders();

        var result = orders.stream()
                .sorted(Comparator.comparing(Order::getPrice, Comparator.reverseOrder()))
                .limit(2)
                .peek(order -> System.out.printf("R$%.2f - %s \n", order.getPrice(), order.getClient()))
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // 2 - Retornar uma lista com os 3 primeiros clientes que mais possuem itens no pedido
    public static void exercise2() {
        var orders = Mock.orders();

        var result = orders.stream()
                .sorted(Comparator.comparing(order -> order.getItems().size(), Comparator.reverseOrder()))
                .limit(3)
                .peek(order -> System.out.println("Cliente: "  + order.getClient().getName() + " - quantidade de itens: " + order.getItems().size()))
                .map(Order::getClient)
                .collect(Collectors.toList());;
        System.out.println(result);
    }

    public static void main(String[] args) {
        exercise1();
        System.out.println("-".repeat(170));
        exercise2();
    }
}
