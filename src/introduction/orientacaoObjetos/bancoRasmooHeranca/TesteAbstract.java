package introduction.orientacaoObjetos.bancoRasmooHeranca;

public class TesteAbstract {
    public static void main(String[] args) {
        Cliente ruan = new Cliente( "Ruan", "147258369" );
     // Conta conta = new Conta( 1678, 4873, ruan);     // não se usa mais criar/instanciar uma Conta, pois Conta é muito genérico

        ContaCorrente cc = new ContaCorrente( 1932, 3521, ruan );
        ContaPoupanca cp = new ContaPoupanca( 1932, 4325, ruan );

     // testando metodo abstrato
        cc.gerarExtrato();
        cp.gerarExtrato();
    }
}
