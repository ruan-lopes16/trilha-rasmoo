package orientacaoObjetos.bancoRasmooEncapsulamento;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(1000);
        conta.sacar(675);

    // conta.saldo = -300; // não posso ter saldo negativo - agora não posso acesar mais o saldo diretamente
    //  System.out.println(conta.saldo);

        // metodo atualizado para saldo
        System.out.println(conta.getSaldo());
    }
}
