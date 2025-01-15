package orientacaoObjetos.bancoRasmooEncapsulamento;

public class Conta {
    //ATRIBUTOS
    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo; // meu atributo saldo, só pode ser acessado pela propria classe -> Conta, ou seja, não consigo declarar diretamente o saldo em uma outra classe

    // COMPORTAMENTOS/MÉTODOS

    // métodos sem retorno
    void depositar(double valor) { // void -> somente executa ação - sem retorno

        this.saldo += valor;     // saldo = saldo + valor;
    }

    // métodos com retorno
    boolean sacar(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;     // saldo = saldo - valor
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

    // getters - metodos que vao retornar valores
    public double getSaldo() {      // recupera o saldo
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    // setters - metodos que vao atribuir valores - sem retorno(void)
 /* NESSE CASO NAO É PRECISO DO SET - mas fica a nivel de curiosidade

    public void setSaldo(double saldo) {    // inserir valor no saldo
        this.saldo = saldo;
    }*/

    public void setAgencia(int agencia){
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
