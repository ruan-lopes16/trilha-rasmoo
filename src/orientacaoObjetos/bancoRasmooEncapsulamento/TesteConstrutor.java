package orientacaoObjetos.bancoRasmooEncapsulamento;

import java.util.concurrent.ConcurrentLinkedDeque;

public class TesteConstrutor {
    public static void main(String[] args) {
        Cliente ruan = new Cliente("Ruan", "12345678901");      // instanciando Cliente com parametros
        Conta conta = new Conta(2370, 10025, ruan);     // instanciando Conta com 3 parametros

        System.out.println(conta.getAgencia());     // 2370
        System.out.println(conta.getNumero());      // 10025
        // System.out.println(conta.getTitular());     // orientacaoObjetos.bancoRasmooEncapsulamento.Cliente@5f184fc6 - ref de memoria
        System.out.println(conta.getTitular().getNome());       // Ruan
        System.out.println(conta.getTitular().getCpf());        // 12345678901

        System.out.println("--------------------------");

        Cliente rafaella = new Cliente("Rafaella", "321654987");
        Conta conta2 = new Conta(237, 1025);    // instanciando Conta com 2 parametros

        conta2.setTitular(rafaella);    // nesse caso preciso setar o titular

        System.out.println(conta2.getAgencia());     // 237
        System.out.println(conta2.getNumero());      // 1025
        System.out.println(conta2.getTitular().getNome());       // Rafaella
        System.out.println(conta2.getTitular().getCpf());        // 321654987

        System.out.println("--------------------------");

        Conta conta3 = new Conta();     // instanciando Conta default
        Cliente cassio = new Cliente("Cássio", "987654321");

        conta3.setTitular(cassio);  // nesse caso preciso setar o titular

        System.out.println(conta3.getAgencia());    // 0
        System.out.println(conta3.getNumero());     // 0
        System.out.println(conta3.getTitular().getNome());   // Cássio
        System.out.println(conta3.getTitular().getCpf());   // 987654321

    }
}
