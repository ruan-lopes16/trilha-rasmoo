# API

## O que é API?
**API**, ou **Interface de Programação de Aplicações**, é um conjunto de definições e protocolos que permite que diferentes softwares se comuniquem entre si. 
Pense nela como um "garçom" que leva seu pedido (uma solicitação de dados ou uma ação) para a "cozinha" (o servidor ou o software que detém os dados) e traz a "refeição" de volta para você (a resposta com os dados ou o resultado da ação).

---

### Como as APIs Funcionam?
Quando você usa um aplicativo no seu celular, um site no seu navegador ou até mesmo um serviço de streaming, é muito provável que uma API esteja trabalhando nos bastidores. 
Aqui está um exemplo de como funciona:

- **Você faz uma requisição**: Quando você clica em "comprar" em um site de e-commerce, seu navegador (o software cliente) envia uma requisição para a API do site.

- **A API recebe e processa**: A API recebe essa requisição e a traduz para um formato que o servidor do site consegue entender.

- **O servidor processa e responde**: O servidor então processa seu pedido (por exemplo, verifica a disponibilidade do estoque, calcula o frete) e envia a resposta de volta para a API.

- **A API entrega a resposta**: A API, por sua vez, traduz essa resposta para um formato que seu navegador entende e a exibe para você (por exemplo, uma confirmação de compra, um erro de estoque).


### Por Que as APIs São Importantes?
As APIs são fundamentais para o desenvolvimento de softwares modernos por várias razões:

- **Interoperabilidade**: Elas permitem que sistemas e aplicativos diferentes trabalhem juntos, mesmo que tenham sido desenvolvidos em linguagens ou plataformas distintas.

- **Reuso de Código**: Desenvolvedores não precisam criar funcionalidades do zero. Se um serviço já oferece uma API para uma determinada função (como mapas ou pagamentos), eles podem simplesmente integrá-la.

- **Inovação**: Ao disponibilizar dados e funcionalidades através de APIs, empresas podem incentivar desenvolvedores externos a criar novos aplicativos e serviços que se integram aos seus, criando um ecossistema mais rico.

- **Eficiência**: Elas simplificam o processo de desenvolvimento, reduzindo o tempo e o custo necessários para criar e manter aplicações complexas.

- **Modularidade**: Permitem que sistemas sejam construídos em módulos menores e mais gerenciáveis, facilitando a manutenção e a escalabilidade.


### Tipos Comuns de APIs
Existem diferentes tipos de **APIs**, mas as mais comuns hoje em dia são as _APIs Web_, que usam o protocolo _HTTP_ para comunicação. Dentro das APIs Web, destacam-se:

- **APIs REST** (Representational State Transfer): São as mais populares e flexíveis, amplamente utilizadas para construir serviços web. 
- Elas são stateless, o que significa que cada requisição do cliente para o servidor contém todas as informações necessárias para entender a requisição.

- **APIs SOAP** (Simple Object Access Protocol): Mais antigas e mais estruturadas, geralmente usadas em sistemas corporativos que exigem maior segurança e transações mais complexas.
Padrão de comunicação via XML.

- **APIs GraphQL**: Uma alternativa mais recente ao REST que permite aos clientes solicitar exatamente os dados de que precisam, evitando o excesso ou a falta de dados.

Em resumo, as APIs são a espinha dorsal da conectividade digital, permitindo que o vasto mundo de aplicativos e serviços online funcione de forma integrada e eficiente.

---

A principal diferença entre um sistema com API e um sistema sem API reside na **conectividade**, **modularidade** e **flexibilidade**. Para entender melhor, vamos comparar as características de cada um:

### Sistema Sem API (Geralmente Monolítico)
Imagine um sistema construído como um único e grande bloco de código, onde todas as funcionalidades (interface do usuário, lógica de negócios, acesso a dados) estão fortemente acopladas e executadas em um só processo. 
Isso é o que chamamos de arquitetura monolítica.

#### **Características** e **Desvantagens**:
- **Isolamento e Dificuldade de Integração**:
    - **Não se comunica facilmente com outros sistemas**: Sem uma API, o sistema é uma "ilha". Para trocar informações com outro software, seria necessário desenvolver integrações complexas e personalizadas para cada caso, ou usar métodos manuais (como exportar/importar arquivos).
    - **Compartilhamento de dados restrito**: Compartilhar dados com parceiros, clientes ou outros departamentos internos é um desafio, exigindo soluções "sob medida" para cada necessidade.

- **Baixa Flexibilidade e Escalabilidade**:
  - **Dificuldade de evolução**: Adicionar novas funcionalidades ou modificar as existentes é um processo lento e arriscado, pois qualquer mudança em uma parte do código pode impactar outras.
  - **Escalabilidade limitada**: Se uma parte do sistema recebe muito tráfego, você precisa escalar o sistema inteiro, mesmo que outras partes não estejam sob demanda. Isso é ineficiente e caro.

- **Manutenção Complexa**:
  - **Difícil de depurar**: Encontrar e corrigir erros pode ser um pesadelo em um código tão grande e interligado.
  - **Dependência tecnológica**: O sistema geralmente é construído com uma única tecnologia ou linguagem, dificultando a adoção de novas tecnologias para partes específicas.

- **Inovação Restrita**:
  - **Inovação lenta**: A dificuldade de integrar-se com serviços externos limita a capacidade de incorporar novas tecnologias ou funcionalidades rapidamente.
  - **Falta de ecossistema**: Não é possível que desenvolvedores externos criem aplicações ou serviços que se conectem ao seu sistema, perdendo oportunidades de crescimento e inovação.

### Sistema Com API (Geralmente Microsserviços ou Arquitetura Distribuída)
Um sistema com API atua como um conjunto de serviços independentes que se comunicam através de interfaces padronizadas. Pense em cada funcionalidade (processar pagamentos, gerenciar usuários, exibir produtos) como um serviço separado, cada um com sua própria API. Isso é a base da arquitetura de microsserviços.

**Características e Vantagens**:
- **Conectividade e Integração Facilitada**:
    - **Comunicação eficiente**: As APIs fornecem uma forma padronizada para que o sistema se comunique com outros softwares, internos ou externos, de forma segura e organizada.
    - **Integração fluida**: É fácil integrar com sistemas de terceiros (como gateways de pagamento, serviços de mapas, redes sociais) e permitir que outros aplicativos consumam seus dados ou funcionalidades.

- **Alta Flexibilidade e Escalabilidade**:
    - **Evolução ágil**: As APIs permitem que diferentes partes do sistema sejam desenvolvidas, testadas e implantadas de forma independente. Isso acelera o ciclo de desenvolvimento e a inovação.
    - **Escalabilidade granular**: Se uma funcionalidade específica (por exemplo, um serviço de login) recebe muito tráfego, você pode escalar apenas essa parte do sistema, otimizando o uso de recursos.

- **Manutenção Simplificada**:
    - **Modularidade**: O sistema é dividido em componentes menores e mais gerenciáveis, facilitando a depuração e a manutenção.
    - **Independência tecnológica**: Diferentes partes do sistema podem ser construídas com as melhores tecnologias para cada caso, sem comprometer o todo.

- **Fomento à Inovação**:
    - **Novos modelos de negócios**: Permite a criação de novos produtos e serviços ao expor funcionalidades do seu sistema para parceiros e desenvolvedores.
    - **Ecossistema vibrante**: Facilita a construção de um ecossistema de aplicações em torno do seu negócio, aumentando o alcance e o valor da sua plataforma.


Em resumo:

Um sistema com API é como um prédio com várias portas bem definidas. Outros prédios (sistemas) podem bater nessas portas para pedir ou entregar coisas de forma organizada e segura. 
Isso o torna flexível, fácil de integrar com outros serviços (como pagamentos online ou mapas), mais simples de atualizar e escalar (se uma parte fica lotada, só ela cresce). 
É ideal para o mundo digital de hoje, onde tudo precisa se comunicar.

Um sistema sem API é como uma fortaleza sem portas. Ele funciona bem isolado, mas para interagir com o mundo exterior, seria preciso derrubar uma parede ou construir uma ponte improvisada toda vez. 
Isso o torna rígido, difícil de integrar, e qualquer mudança pode afetar tudo, dificultando a inovação e o crescimento.

---

## Maturidade de Richardson
Usada para definir/medir o quanto uma API é "sofisticada", "bem feita" ou "aderente" aos princípios **REST**
Essa maturidade é divida em 4 níveis(0 a 3). Cada nível adiciona mais "regras" ou "boas práticas" que tornam a API flexível, mais padronizada e mais fácil de usar.

### Escala Richardson:

#### **Nível 0: "O Grande Serviço Monolítico" (The Swamp of POX - Plain Old XML/HTTP)**
Este é o nível mais básico, quase como um "chamar e esquecer". Pense em um telefone onde você só pode discar um número e esperar uma única resposta.

**O que acontece**: Você envia uma única requisição (geralmente um POST) para um único endereço (URL), e dentro dessa requisição você coloca tudo o que precisa: qual ação quer fazer, quais dados enviar, etc.

**Analogia**: É como ligar para uma central de atendimento e, na mesma ligação, tentar fazer um pedido de pizza, cancelar uma conta e pedir para o técnico vir consertar a internet, tudo em uma única conversa.

Exemplo:

```xml
POST /servicoGeral
Content-Type: application/xml

<pedido>
    <acao>CriarPedido</acao>
    <item>Pizza</item>
    <quantidade>2</quantidade>
    <cliente>João</cliente>
</pedido>
```
Problemas: É difícil de entender o que a API faz sem a documentação, é inflexível e cada nova ação exige uma mudança no conteúdo da requisição.

#### **Nível 1: "Recursos em Foco" (Resources)**
Aqui, a API começa a usar recursos. Um recurso é como um "substantivo" no seu sistema: um cliente, um produto, um pedido. Cada recurso tem seu próprio endereço (URL) único.

**O que acontece**: Você ainda usa o método POST para interagir, mas agora envia suas requisições para URLs específicas que representam "coisas" (recursos) no seu sistema.

**Analogia**: Em vez de ligar para a central de atendimento geral, você liga para "o departamento de vendas" para pedidos de pizza, e para "o departamento financeiro" para cancelar contas. Cada departamento tem seu próprio número.

**Exemplo**:

```xml
POST /pedidos   (para criar um novo pedido)
POST /clientes  (para criar um novo cliente)
```
Melhoria: Já é mais fácil de entender o que você está manipulando, pois os endereços (URLs) começam a fazer sentido.


#### **Nível 2: "Verbos do HTTP e Estados" (HTTP Verbs and Statelessness)**
Este é o nível mais comum para a maioria das APIs REST hoje em dia. Aqui, não usamos apenas URLs para identificar recursos, mas também os métodos (verbos) do HTTP (como GET, POST, PUT, DELETE) para indicar a ação que queremos realizar sobre esses recursos.

- **O que acontece**:
  - **GET**: Para buscar/ler informações (ex: `GET /pedidos/123` para ver o pedido 123).
  - **POST**: Para criar um novo recurso (ex: `POST /pedidos` para criar um novo pedido).
  - **PUT**: Para atualizar um recurso existente (ex: `PUT /pedidos/123` para modificar o pedido 123).
  - **DELETE**: Para remover um recurso (ex: `DELETE /pedidos/123` para apagar o pedido 123).

- **"Sem Estado" (Statelessness)**: Significa que cada requisição que você faz para a API é independente. A API não "lembra" de requisições anteriores. Cada requisição precisa conter todas as informações necessárias para ser processada. 
Isso torna a API mais robusta e escalável.

- **Analogia**: Você vai a um restaurante. Cada vez que você pede algo, você faz um novo pedido completo. O garçom não espera que você se lembre do que pediu há 5 minutos se não houver um contexto para isso. Cada pedido é uma nova interação.

- **Melhoria**: A API se torna muito mais padronizada e intuitiva. Um desenvolvedor que conhece os verbos HTTP pode "adivinhar" o que a API faz sem precisar olhar a documentação em detalhes. É a base da maioria das APIs web.

#### **Nível 3: "Hipermídia como o Motor do Estado da Aplicação" (HATEOAS - Hypermedia As The Engine Of Application State)**
Este é o nível mais avançado e completo da maturidade de Richardson. Aqui, a API não só te dá os dados, mas também te diz o que você pode fazer com esses dados em seguida. Ela inclui "links" na resposta que indicam as ações possíveis.

**O que acontece**: Quando você recebe a informação de um pedido, por exemplo, a API pode incluir links dizendo: "você pode cancelar este pedido aqui", "você pode ver os detalhes do cliente aqui", "você pode adicionar um item aqui".

**Analogia**: Você está navegando em um site. Cada página não só te mostra o conteúdo, mas também tem botões e links que te levam para outras páginas ou te permitem realizar ações (adicionar ao carrinho, finalizar compra, etc.). 
Você não precisa decorar os endereços ou as ações, o próprio site te guia.

**Exemplo**:

```json

{
  "id": "123",
  "status": "pendente",
  "valor": 100.00,
  "items": [
    {"nome": "Pizza", "quantidade": 1}
],
"_links": [
    { "rel": "cancelar", "href": "/pedidos/123/cancelar", "method": "POST" },
    { "rel": "atualizar_status", "href": "/pedidos/123/status", "method": "PUT" },
    { "rel": "cliente", "href": "/clientes/joao123", "method": "GET" }
  ]
}
```
Benefícios: Torna a API "autodescritiva". O cliente (o software que usa a API) pode descobrir as próximas ações sem ter que ter todo o conhecimento prévio da documentação. 
Isso aumenta a flexibilidade e a capacidade da API de evoluir sem quebrar os sistemas que a consomem.

---

## SPRING BOOT
O Spring Boot é uma ferramenta para desenvolvedores Java que:

**Simplifica a configuração**: Faz a maior parte do trabalho chato para você.

**Torna a execução fácil**: Vem com um servidor web embutido, então você só precisa rodar o código.

**Gerencia dependências**: Usa pacotes starter para garantir que as bibliotecas funcionem bem juntas.

Ele é o motivo pelo qual o desenvolvimento de aplicações Java se tornou tão rápido e produtivo, permitindo que os desenvolvedores se concentrem na lógica de negócio e na criação de funcionalidades, em vez de se perderem em configurações e burocracia.

---

## Inversão de Controle (IoC)
A Inversão de Controle (ou IoC, do inglês Inversion of Control) é como se você contratasse uma fábrica especializada para construir o carro para você. 
Você apenas diz: "Eu quero um carro com essas características", e a fábrica (que seria o container IoC) se encarrega de montar tudo, garantindo que as peças se encaixem perfeitamente.

Em vez de seu código ser responsável por criar e gerenciar todos os seus componentes, você "inverte" esse controle, passando a responsabilidade para um "container" ou "fábrica" especializada. 
Seu código se torna mais passivo, apenas recebendo os componentes de que precisa, em vez de criá-los ativamente.

## Injeção de Dependências (DI)
A DI é a forma prática de implementar a Inversão de Controle. É o "método de entrega" das peças.

Voltando à analogia do carro, quando a fábrica (o container IoC) constrói seu carro, ela injetará as peças (o motor, as rodas, o volante) diretamente nos locais onde elas são necessárias. 
O carro (seu código) não precisa se preocupar em ir buscar as peças; elas simplesmente aparecem lá.

No mundo da programação, uma dependência é um objeto que sua classe precisa para funcionar. 
Por exemplo, uma classe  `ServicoDePedidos` pode depender de uma classe `BancoDeDados` para salvar informações.

Existem três formas principais de "injetar" (entregar) essas dependências:

- **Injeção por Construtor**: A dependência é passada para a classe no momento em que ela é criada, através do seu construtor. É a forma mais comum e recomendada.

- **Injeção por Propriedade (ou Setter)**: A dependência é "injetada" através de um método setter depois que a classe já foi criada.

- **Injeção por Interface**: A classe implementa uma interface que define o método de injeção.

### Por que isso é importante?

**Menos Acoplamento**: Seu código não fica "amarrado" a outros componentes. Se você precisar trocar o banco de dados, por exemplo, basta avisar o container IoC para injetar um novo, e seu código nem precisa ser modificado.

**Mais Flexibilidade**: Fica muito mais fácil de testar. Em vez de usar um banco de dados real durante os testes, o container pode injetar um "banco de dados falso" (chamado de mock) para simular o comportamento. 
Isso torna os testes mais rápidos e confiáveis.

**Código Mais Limpo**: Seu código se concentra no que realmente importa: a lógica de negócio. 
A responsabilidade de criar e gerenciar as dependências é da fábrica (o container), não sua.

## Pontos de Injeção
*Imagine que você está construindo um robô. Esse robô precisa de uma bateria para funcionar.
O robô não vai fabricar a própria bateria; ele tem um compartimento especial onde a bateria se encaixa. Esse compartimento é o ponto de injeção.
No mundo da programação, um ponto de injeção é simplesmente um local no seu código onde uma dependência (como a bateria do robô) será "entregue" ou "injetada" pelo sistema de **Injeção de Dependências**.
Em vez de sua classe criar a dependência por conta própria, ela apenas "declara" que precisa dela em um desses pontos, e o sistema se encarrega de fornecer o objeto correto.*

Existem três tipos principais de pontos de injeção:

1. **Injeção no Construtor**
Pense no construtor como a "caixa de entrada" principal do seu robô. No momento em que você o monta (cria a classe), você já diz quais peças ele precisa para funcionar.

**Como funciona**: A dependência é passada como um argumento para o construtor da sua classe.

**Vantagem**: É a forma mais recomendada. Garante que a classe sempre terá as dependências necessárias para funcionar, pois sem elas, a classe nem pode ser criada.

```Java
// O construtor aqui é o ponto de injeção
public class Robô {
private Bateria bateria;

    // A Bateria é injetada aqui
    public Robô(Bateria bateria) {
        this.bateria = bateria;
    }
}
```

2. **Injeção por Atributo (ou Campo)**
Essa é como uma "entrada lateral" no seu robô. Em vez de passar a peça na hora da montagem, você tem um espaço pronto para ela, e o sistema injeta a peça diretamente lá.

**Como funciona**: Você usa uma anotação (como @Autowired no Spring) em um atributo (uma variável de instância) da sua classe. O sistema de injeção de dependências encontra essa anotação e automaticamente preenche a variável.

**Vantagem**: É mais simples e rápido de escrever, pois você não precisa criar um construtor ou um método setter para cada dependência.

**Desvantagem**: Torna o código mais difícil de testar e pode violar alguns princípios de design.

```Java
// O atributo `bateria` é o ponto de injeção
public class Robô {
// A anotação @Autowired diz ao Spring para injetar a Bateria aqui
@Autowired
private Bateria bateria;
}
```

3. Injeção por Método Setter
   Pense nisso como um "método de substituição" de peças. Se o seu robô precisa de uma nova bateria, você pode usar um método específico para fazer a troca.

**Como funciona**: A dependência é injetada através de um método setter (um método que define o valor de um atributo).

**Vantagem**: Permite que as dependências sejam alteradas durante o tempo de execução do programa.

**Desvantagem**: Similar à injeção por atributo, pode tornar a dependência opcional, o que pode levar a erros se a dependência não for injetada.

```Java
public class Robô {
private Bateria bateria;

    // O método setBateria() é o ponto de injeção
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
}
```
**Resumindo**:
Os pontos de injeção são os "lugares" no seu código onde você diz: "Eu preciso de um objeto aqui, por favor".

Eles são a forma prática de fazer o seu código receber as dependências de que precisa, em vez de ser responsável por criá-las. Isso torna o código mais flexível, fácil de testar e menos acoplado.

---
