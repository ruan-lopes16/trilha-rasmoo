package orientacaoObjetos.bancoRasmoo;

public class TesteConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();      // instanciando/ criando uma nova Conta();
        // atribuindo valores ao objeto
        primeiraConta.saldo = 1525.40;
        primeiraConta.agencia = 1;
        primeiraConta.numero = 100;
        primeiraConta.titular = "Ruan";

        // exibindo na tela
        System.out.println("O titular da primeira conta é: " + primeiraConta.titular);
        System.out.println("Agência: " + primeiraConta.agencia + "Número: " + primeiraConta.numero);
        System.out.println("O saldo atual é de: R$" + primeiraConta.saldo);

    }
}
