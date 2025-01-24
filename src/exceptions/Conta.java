package exceptions;

public class Conta {

    // atributos
    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;
    private static int total;

    // construtor
    public Conta( int agencia, int numero, Cliente titular ) {
        if ( agencia > 0 ) {
            this.agencia = agencia;
        } else {
            System.out.println( "A agência não pode ser ser 0(zero)" );
        }
        this.numero = numero;
        this.titular = titular;
        Conta.total++; // incrementa Conta()
    }

    // comportamento/métodos
    void depositar( double valor ) {
        this.saldo += valor;
        System.out.println( "Deposito de R$" + valor + " realizado com sucesso!" );
    }

/*  COMENTAR PARA COMPARAR ANTES E DEPOIS
    boolean sacar( double valor ) {
        if ( this.saldo >= valor ) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println( "Verifique seu saldo e tente novamente" );
            return false;
        }
    } */

    void sacar ( double valor ) {
        if ( this.saldo < valor ) {
            throw new RuntimeException( "Saldo insuficiente!" );    // tudo o que vier após esse erro não será chamado
        }
        // caso passe pela verificação, e não caia na exception, segue o código e executa o proximo comando:
        this.saldo -= valor;
    }

/*
COMENTAR PARA COMPARAR ANTES E DEPOIS
    void transferir( double valor, Conta destino ) {
        boolean conseguiuSacar = this.sacar( valor );

        if ( conseguiuSacar ) {
            destino.depositar( valor );
            System.out.println( "Você recebeu um depósito de R$" + valor );
        }
    } */

    void transferir( double valor, Conta destino ) {
       this.sacar( valor );
       destino.depositar( valor );
       System.out.println( "Você recebeu um depósito de R$" + valor );

    }

    // getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getTotal() {
        return total;
    }

    // setters
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    // toString
    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}

