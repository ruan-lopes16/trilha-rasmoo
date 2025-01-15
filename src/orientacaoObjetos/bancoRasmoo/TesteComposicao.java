package orientacaoObjetos.bancoRasmoo;

public class TesteComposicao {
    public static void main(String[] args) {

        Cliente clienteRuan = new Cliente();

        clienteRuan.nome = "Ruan";
        clienteRuan.cpf = "12345678901";
        clienteRuan.profissao = "Programador JAVA";
        clienteRuan.salario = 18000;

        Conta conta = new Conta();
    //  conta.titular = "Ruan"; -> não existe mais
        // como dizer que a conta é do Ruan?
        conta.titular = clienteRuan;    // composição

        System.out.println(conta.titular);      // isso armazena a referência - referencia em memória - orientacaoObjetos.bancoRasmoo.Cliente@5f184fc6
        System.out.println(clienteRuan);    // orientacaoObjetos.bancoRasmoo.Cliente@5f184fc6

        System.out.println("------------------------------------------------");
        System.out.println("Atributos do titular -> Cliente:");
        System.out.println(conta.titular.nome);     // Ruan // exibindo o nome do titular da conta
        System.out.println(conta.titular.cpf);     // 12345678901
        System.out.println(conta.titular.profissao);    // Programador JAVA

    }
}
