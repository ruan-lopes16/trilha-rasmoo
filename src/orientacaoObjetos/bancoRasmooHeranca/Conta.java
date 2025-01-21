package orientacaoObjetos.bancoRasmooHeranca;

public class Conta {

    // atributos
    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;
    private static int total;

    // construtor
    public Conta( int agencia, int numero, Cliente titular ) {
        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println( "A agência não pode ser 0(zero)!" );
        }
        this.numero = numero;
        this.titular = titular;
        Conta.total++;
    }

    // comportamentos/métodos
    void depositar( double valor ) {
        this.saldo += valor;
        System.out.println( "Deposito de R$" + valor + " realizado com sucesso!" );
    }

    boolean sacar( double valor ) {
        if ( this.saldo >= valor ) {
            this.saldo -= valor;
            // System.out.println( "Saque de R$" + valor + " realizado com sucesso!" );
            return true;

        } else {
            System.out.println( "Verifique seu saldo e tente novamente." );
            return false;

        }
    }

    void transferir( double valor, Conta destino ) {
        boolean conseguiuSacar = this.sacar( valor );
        if ( conseguiuSacar ) {
            destino.depositar( valor );
            System.out.println( "Você recebeu uma transferência de R$" + valor + "!" );
        }
    }

    // getters
    public double getSaldo() {
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

    public static int getTotal(){
        return Conta.total;
    }

    // setters
    public void setAgencia( int agencia ){
        if ( agencia > 0 ){
            this.agencia = agencia;
        }
    }

    public void setTitular( Cliente titular ) {
        this.titular = titular;
    }

    // toString
    @Override
    public String toString() {
        return "Conta{ " +
                "agencia = " + agencia +
                ", numero = " + numero +
                ", titular = " + titular +
                ", saldo = " + saldo +
                " }";
    }
}