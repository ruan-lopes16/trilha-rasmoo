package orientacaoObjetos.bancoRasmoo;

public class TesteConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();      // instanciando/ criando uma nova Conta();
        System.out.println(primeiraConta);      // orientacaoObjetos.bancoRasmoo.Conta@6acbcfc0
        // atribuindo valores ao objeto
        primeiraConta.saldo = 1525.40;
        primeiraConta.agencia = 1;
        primeiraConta.numero = 100;
        primeiraConta.titular = "Ruan";

        // exibindo na tela
        System.out.println("O titular da primeira conta é: " + primeiraConta.titular);
        System.out.println("Agência: " + primeiraConta.agencia + " Número: " + primeiraConta.numero);
        System.out.println("O saldo atual é de: R$" + primeiraConta.saldo);

        System.out.println("----------------------------------------------");
        System.out.println("[segundaConta]");
        Conta segundaConta = new Conta();
        System.out.println(segundaConta);       // orientacaoObjetos.bancoRasmoo.Conta@3d494fbf
        segundaConta.saldo = 500;
        System.out.println("O titular da segunda conta é: " + segundaConta.titular); // retorno 'null' - não atribui valor e é uma referencia - String é considerado como uma CLASSE
        System.out.println("Agência: " + segundaConta.agencia + " Número:" + segundaConta.numero); // ambos 0(zero), pois não atribui valor, portando, recebe o valor default
        System.out.println("O saldo atual é de: R$" + segundaConta.saldo);

        System.out.println("----------------------------------------------");
        // vendo onde estão alocadas
        if (primeiraConta == segundaConta) {
            System.out.println("As duas variáveis apontam para o mesmo local em memória");
        } else {
            System.out.println("São diferentes");
            System.out.println("Local em memória da primeira conta:" + primeiraConta);
            System.out.println("Local em memória da segunda conta:" + segundaConta);
        }

    }
}
