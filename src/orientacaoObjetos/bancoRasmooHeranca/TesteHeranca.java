package orientacaoObjetos.bancoRasmooHeranca;

public class TesteHeranca {
    public static void main(String[] args) {

        Cliente ruan = new Cliente( "Ruan", "14725836901" );

        // criando uma conta corrente
        ContaCorrente cc = new ContaCorrente( 1298, 8734, ruan );

        cc.depositar(1000);
        System.out.println( "O saldo da CC: R$" + cc.getSaldo() );

        cc.sacar(233.76);
        System.out.println( "O saldo da CC: R$" + cc.getSaldo() );

        // criando conta poupança
        ContaPoupanca cp = new ContaPoupanca( 1298, 4368, ruan );
        System.out.println( "O saldo da CP: R$" + cp.getSaldo() );

        // realizando transferencia de conta corrente para poupanca
        cc.transferir( 500 ,cp );
        System.out.println( "O saldo da CP: R$" + cp.getSaldo() );

        // deposito conta poupança
        cp.depositar(5000);
        System.out.println( "O saldo da CP: R$" + cp.getSaldo() );

    }
}
