package orientacaoObjetos.bancoRasmoo;

public class TesteMetodo {
    public static void main(String[] args) {

        Conta conta = new Conta();
        System.out.println(conta.saldo);    // default -> 0

        conta.depositar(300);
        System.out.println(conta.saldo);    // 300

        conta.depositar(500);
        System.out.println(conta.saldo);    // 800

        conta.depositar(50.30);
        System.out.println(conta.saldo);    // 850.30
    }
}
