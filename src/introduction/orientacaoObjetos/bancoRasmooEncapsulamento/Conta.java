package introduction.orientacaoObjetos.bancoRasmooEncapsulamento;

public class Conta {
    //ATRIBUTOS
    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo; // meu atributo saldo, só pode ser acessado pela propria classe -> Conta, ou seja, não consigo declarar diretamente o saldo em uma outra classe
 // private int total;     // pertence ao objeto - atributos de instancia
    private static int total; // static - esse total é da Conta (classe) e não do objeto Conta instanciado(new)

    // CONSTRUTOR
    // mais de um construtor = sobrecarga de contrutores

/*  // irei usar apenas construtor com todos os parametros

    public Conta(){
        // construtor default - sem parametros
    }

    public Conta(int agencia, int numero) { // construtor com 2 parametros
        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            // para tudo, lança um erro
            System.out.println("A agência não pode ser menor ou igual a 0(zero)");
        }
        this.numero = numero;
    } */

    public Conta(int agencia, int numero, Cliente titular) { // construtor com 3 parametros
        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            // para tudo, lança um erro
            System.out.println("A agência não pode ser menor ou igual a 0(zero)");
        }
        this.numero = numero;
        this.titular = titular;
        Conta.total++;
    }

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

    public static int getTotal(){ // static - diz que o metodo pertence a classe e nao ao objeto/instancia
        return Conta.total;
    }

    // setters - metodos que vao atribuir valores - sem retorno(void)

 /* NESSE CASO NAO É PRECISO DO SET - mas fica a nivel de curiosidade

    public void setSaldo(double saldo) {    // inserir valor no saldo
        this.saldo = saldo;
    }*/

    public void setAgencia(int agencia){ // não preciso remover, pois posso alterar em algum momento especifico
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public void setNumero(int numero){ // não preciso remover, pois posso alterar em algum momento especifico
        this.numero = numero;
    }

    public void setTitular(Cliente titular) { // não preciso remover, pois posso alterar em algum momento especifico
        this.titular = titular;
    }
}
