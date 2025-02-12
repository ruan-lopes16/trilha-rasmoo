package introduction.novidadesJAVA21.sealedClass.model;

public final class Pendente extends StatusPedido {
    // construtor vazio(sem parametros), apenas utiliza a descrição de super
    public Pendente() {
        super("Pedido pendente."); // utiliza super, pois a super(StatusPedido) tem construtor cheio.
    }
}
