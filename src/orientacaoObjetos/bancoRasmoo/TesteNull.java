package orientacaoObjetos.bancoRasmoo;

public class TesteNull {
    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println(conta.agencia);  // 0
        System.out.println(conta.numero);   // 0
        System.out.println(conta.saldo);    // 0
        System.out.println(conta.titular);  // null

/*      conta.titular.nome = "Ruan"; // NullPointerException, estou tentando acessar atributo do Cliente que não foi instanciado
        System.out.println("Nome do titular: " + conta.titular.nome);
*/
        conta.titular = new Cliente(); // criando um titular, já armazenando no atributo conta.titular -> agora consigo trabalhar com o atributos do Cliente
        conta.titular.nome = "Ruan";
        System.out.println("Nome do titular: " + conta.titular.nome);

    }
}
