package introduction.novidadesJAVA21.sealedClass.model;

public final class Processando extends StatusPedido {
    // construtor vazio(sem parametros), apenas utiliza a descrição de super
    public Processando() {
        super("Pedido em processamento!"); // utiliza super, pois a super(StatusPedido) tem construtor cheio.
    }


}
