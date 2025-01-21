package orientacaoObjetos.bancoRasmooHeranca;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Cliente ruan = new Cliente( "Ruan", "1234567890" );
        ContaCorrente cc = new ContaCorrente( 5643, 10032, ruan );
        ContaPoupanca cp = new ContaPoupanca( 5643, 8721, ruan );

        cc.depositar( 1000 );
        cp.depositar( 10000 );
        System.out.println("---------------------------------------------");

        cc.sacar(100);
        cp.sacar(1000);

        cp.transferir( 500, cc ); //
        cc.transferir( 100, cp ); // houve desconto de cc, pois há um 'saque' - sacar() - no qual é descontado R$2
        System.out.println("---------------------------------------------");

        System.out.println( "Saldo CC: R$" + cc.getSaldo() );
        System.out.println( "Saldo CP: R$" + cp.getSaldo() );

        System.out.println(cc);
        System.out.println(cp);
    }
}
