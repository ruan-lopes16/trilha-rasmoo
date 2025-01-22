package orientacaoObjetos.bancoRasmooHeranca;

public class ContaPoupanca extends Conta {

    public ContaPoupanca( int agencia, int numero, Cliente titular ) {
        super( agencia, numero, titular );
    }

    // implementando método abstrato
    @Override
    public void gerarExtrato() {
        System.out.println( "Gerando extrato para Conta Poupança..." );
    }
}
