package orientacaoObjetos.bancoRasmooEncapsulamento;

public class TesteEncapsulamento {
    public static void main(String[] args) {
/* ANTES
        Cliente cliente = new Cliente();    // instanciando um novo Cliente
        cliente.setNome("Ruan");
        cliente.setCpf("12345678901");
        cliente.setProfissao("DevJr.");
        cliente.setSalario(4000);

        Conta conta = new Conta();  // instanciando uma nova Conta
        conta.depositar(1000);
        conta.sacar(675);
        conta.setAgencia(10);

        conta.setTitular(cliente);  // atribuindo a conta ao cliente

        // verificando referencias em memoria // orientacaoObjetos.bancoRasmooEncapsulamento.Cliente@5f184fc6
        System.out.println(cliente);
        System.out.println(conta.getTitular());

    //  System.out.println(cliente.getNome());  // pegando nome atraves do cliente  // Ruan
        System.out.println(conta.getTitular().getNome());  // pegando nome atraves da conta // Ruan
        System.out.println(conta.getTitular().getProfissao());  // DevJr.

    // conta.saldo = -300; // não posso ter saldo negativo - agora não posso acesar mais o saldo diretamente
    //  System.out.println(conta.saldo);

        // metodo atualizado para saldo
        System.out.println(conta.getSaldo());
*/

        // AGORA
        Conta conta = new Conta(1, 10, new Cliente("Ruan", "12345679801"));
        conta.depositar(1000);
        conta.sacar(500);
        conta.setAgencia(10);

    //  conta.setTitular(new Cliente());    // instanciando Cliente atraves da conta - SEM CONSTRUTOR
        // populando atraves da conta
     // conta.getTitular().setNome("Ruan");
     // conta.getTitular().setCpf("12345678901");
        conta.getTitular().setProfissao("DevJr");
        conta.getTitular().setSalario(4000);

        // exibindo
        System.out.println(conta.getTitular());    // ref em memoria
        System.out.println(conta.getTitular().getNome());   // Ruan
        System.out.println(conta.getTitular().getProfissao());  // DevJr
        System.out.println(conta.getTitular().getSalario());    // 4000
        System.out.println(conta.getSaldo());   // 1000
    }
}
