package introduction.novidadesJAVA21.sealedClass.model;

public final class Entregue extends StatusPedido {
    // construtor vazio(sem parametros), apenas utiliza a descrição de super
    public Entregue() {
        super("Pedido entregue!");  // utiliza super, pois a super(StatusPedido) tem construtor cheio.
    }
}
