# Criando o projeto

[Spring Initializr](https://start.spring.io/)
Por meio deste conseguimos dizer qual a linguagem que iremos trabalhar, qual o tipo de projeto, versão de spring boot, 
e define os metadatas, tipos dde empacotamento, a versão do java que será usada e por fim as dependências que serão usadas.

### Lombok
[Link Lombok](https://projectlombok.org/download)
Notações usadas para evitar repitação de código (boilderplate)
Com isso, posso deixar apenas os atributos que ao implementar as notações elas faram o seu papel automaticamente,.

@Getter > funções get
@Setter > funções set
@ToSting > toString
@Data > setters, getters e toSting
@NoArgsConstructor > construtor vazio
@AllArgsConstructo > todos os atributos
@Builder > padrão de projeto builder para nossas classes

### Repository
Comunicação entre entidades/classes se comuniquem com banco de dados

### ResponseEntity<>
Partes do ResponseEntity
O ResponseEntity permite que você controle três coisas principais na sua resposta HTTP:

O corpo: O que você realmente quer enviar. Pode ser um objeto, uma lista, uma mensagem de erro, etc.
O status HTTP: O código que informa ao cliente o que aconteceu. Os mais comuns são:

- 200 OK: A requisição foi bem-sucedida.
- 201 Created: Um novo recurso foi criado com sucesso.
- 404 Not Found: O recurso que você pediu não foi encontrado.
- 500 Internal Server Error: Algo deu errado no servidor.
Os cabeçalhos: Informações adicionais sobre a resposta. Por exemplo, o tipo de conteúdo (Content-Type) ou a URL do novo recurso criado (Location).

Exemplo Prático
Sem ResponseEntity, se você pedir um usuário por ID e ele não existir, o Spring pode gerar um erro ou simplesmente retornar null com o status 200 OK, o que não é ideal.
Com ResponseEntity, você pode dizer exatamente o que aconteceu:


```java
// O cliente solicita o usuário com ID 99
@GetMapping("/users/{id}")
public ResponseEntity<User> getUserById(@PathVariable Long id) {

    User user = userService.findById(id);

    if (user != null) {
        // Usuário encontrado. Retorne o usuário com status 200 OK.
        return new ResponseEntity<>(user, HttpStatus.OK); 
    } else {
        // Usuário não encontrado. Retorne apenas o status 404 Not Found, sem corpo.
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
    }
}
```

Nesse exemplo, o cliente que fez a requisição para /users/99 vai receber uma resposta clara e padronizada:
Se o usuário existe, ele recebe o JSON do usuário e o código 200.
Se o usuário não existe, ele recebe o código 404 e um corpo de resposta vazio.
Em resumo, ResponseEntity é a forma correta e padronizada de construir as respostas da sua API, garantindo que o cliente saiba exatamente se a operação foi bem-sucedida ou se houve algum problema, e qual foi ele.

### Controller
Pense em um aplicativo de celular, como o de um banco. Você quer ver seu saldo.

- Você toca no botão "Ver Saldo". Essa é a sua ação.
- O aplicativo precisa responder a essa ação.

A Controller é como um "recepcionista" que fica esperando o que você vai fazer.

Quando você toca no botão "Ver Saldo", a Controller ouve essa sua ação. O trabalho dela é pegar essa sua "ordem" e decidir o que fazer. Ela não vai sozinha no banco buscar seu saldo, mas ela sabe quem faz isso.

Então, ela pega seu pedido e passa para outro lugar (uma parte do código que se conecta com o banco). Depois que esse lugar pega a informação do saldo, ele devolve para a Controller.

A Controller, por fim, pega a informação e mostra na tela do seu celular.

Em resumo, a Controller é o "meio-campo". Ela:

- Recebe o seu pedido (a sua ação no aplicativo).
- Encaminha o pedido para a parte certa do sistema.
- Pega a resposta que vem de volta.
- Entrega a resposta para você, na sua tela.

É ela que gerencia o fluxo de informações, garantindo que suas ações no aplicativo resultem nas respostas corretas.

