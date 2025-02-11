package introduction.orientacaoObjetos.bancoRasmooHeranca;


public class ContaCorrente extends Conta {

    // construtor - recebe os mesmos parametros de sua super(Conta)
    public ContaCorrente( int agencia, int numero, Cliente titular ) {
        super( agencia, numero, titular ); // super - faz referencia a classe pai - super classe -> está chamando o construtor da nossa super classe(Conta)
    }

    // ao realizar saque será cobrado uma taxa - mas já existe o metodo sacar - VAMOS AO POLIMORFISMO
    @Override   // sobrescrita de metodo -> faz referencia ao metodo da classe pai
    boolean sacar( double valor ) {
        double novoValor = valor + 2; // taxa de 2 reais ao sacar
        return super.sacar( novoValor );  // chamando metodo da classe Conta (super)
    }

    // implementando método abstrato
    @Override
    public void gerarExtrato() {
        System.out.println( "Gerando extrato para Conta Corrente..." );
    }
}
