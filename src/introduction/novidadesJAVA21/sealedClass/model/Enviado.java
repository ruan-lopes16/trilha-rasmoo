package introduction.novidadesJAVA21.sealedClass.model;

public final class Enviado extends StatusPedido {
    // construtor vazio(sem parametros), apenas utiliza a descrição de super
    public Enviado() {
        super("Pedido enviado!"); // utiliza super, pois a super(StatusPedido) tem construtor cheio.
    }
}
