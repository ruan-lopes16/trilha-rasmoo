package orientacaoObjetos.bancoRasmoo;

public class Conta {
    // o que uma conta teria como caracterista?
    //ATRIBUTOS
    int agencia;
    int numero;
    String titular;     // String é uma classe - titular é um objeto -> por isso 'null' ao não atribuir valor na instanciação
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

}
