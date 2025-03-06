# Operação Terminal: forEach
A operação terminal `forEach` é utilizada para iterar sobre cada elemento de uma stream e realizar alguma lógica especificada. 
Essa operação aceita um _Consumer_ como argumento, que é uma função que aceita um único argumento e não retorna nenhum resultado.
É comum utilizar essa operação para os seguintes casos:

- Aplicar alguma lógica de negócio:
    ```java
    var clients = Mock.clients();
    var today = localDate.now();

    clients.stream()
            .filter(client -> client.getBirthDate().getMonth().equals(today.getMonth()))
            .forEach(client -> { 
                // enviar email promocional
            });
    ```

- Modificar um estado externo
    ```java
    var orders = Mock.orders();
    var today = localDate.now();
    var discountedOrders = new ArrayList<Order>();

    orders.stream()
            .filter(order -> order.getClient().getBirthDate().getMonth().equals(today.getMonth()))
            .forEach(order -> {
                order.applyDiscount(10);
            
                discountedOrders.add(order);
            });

    System.out.println(discountedOrders);
    ```
- Conceito geral
    ```java
    var names = Arrays.asList("Pedro", "Ana", "Marcos", "Vanessa");

    names.stream().forEach(System.out::println);
    // Pedro
    // Ana
    // Marcos
    // Vanessa
    ```