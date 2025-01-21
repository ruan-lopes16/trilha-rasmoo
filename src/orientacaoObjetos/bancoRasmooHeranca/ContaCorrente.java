package orientacaoObjetos.bancoRasmooHeranca;


public class ContaCorrente extends Conta {

    // construtor - recebe os mesmos parametros de sua super(Conta)
    public ContaCorrente( int agencia, int numero, Cliente titular ) {
        super( agencia, numero, titular ); // super - faz referencia a classe pai - super classe -> está chamando o construtor da nossa super classe(Conta)
    }
}
