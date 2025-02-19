package lambdaStreams.opIntermediarias;
import lambdaStreams.mock.Mock;

import java.util.stream.Collectors;

public class FlatMap {
    // 1 - Retornar uma lista contendo os nomes de todos os produtos solicitados pelo cliente de nome 'Ana'
    public static void exercise() {
        var orders = Mock.orders();

        var result = orders.stream()
                .filter(order -> order.getClient().getName().equalsIgnoreCase("ANA"))
                .flatMap(order -> order.getItems().stream())
                .map(orderItem -> orderItem.getProduct().getName())
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void main(String[] args) {
        exercise();
    }
}
