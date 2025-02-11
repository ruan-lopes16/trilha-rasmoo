package introduction.orientacaoObjetos.bancoRasmoo;

public class TesteMetodoReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(1000);
        System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);    // 1000
        System.out.println("Saldo da segunda conta: R$" + segundaConta.saldo);     // 0

        primeiraConta.transferir(500, segundaConta);
        System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);    // 500
        System.out.println("Saldo da segunda conta: R$" + segundaConta.saldo);     // 500

        primeiraConta.transferir(250, segundaConta);
        System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);    // 250
        System.out.println("Saldo da segunda conta: R$" + segundaConta.saldo);     // 750

        segundaConta.transferir(150, primeiraConta);
        System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);    // 400
        System.out.println("Saldo da segunda conta: R$" + segundaConta.saldo);     // 600

    }
}
