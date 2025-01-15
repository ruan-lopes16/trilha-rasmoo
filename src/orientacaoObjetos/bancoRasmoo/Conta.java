package orientacaoObjetos.bancoRasmoo;

public class Conta {
    // o que uma conta teria como caracterista?
    //ATRIBUTOS
    int agencia;
    int numero;

    //String titular;     // String é uma classe - titular é um objeto -> por isso 'null' ao não atribuir valor na instanciação
    Cliente titular;    // referencia/relação entre classe(composição) -> o titular é um Cliente

    double saldo;

    // COMPORTAMENTOS/MÉTODOS

    // métodos sem retorno
    void depositar(double valor) { // void -> somente executa ação - sem retorno
        saldo += valor;     // saldo = saldo + valor;
    }

    // métodos com retorno
    boolean sacar(double valor) {
        if (saldo >= valor){
            saldo -= valor;     // saldo = saldo - valor
            return true;

        } else {
            return false;
        }
    }

    // método com dois parametros
    void transferir(double valor, Conta destino){
        boolean conseguiuSacar = this.sacar(valor); // this = referencia a propria classe -> referência a quem está invocando
        // se eu conseguir sacar o dinheiro da conta atual(conta que invoca transferir) eu realizo a transferencia/deposito
        if (conseguiuSacar) {
            destino.depositar(valor);
        }
    }

}
