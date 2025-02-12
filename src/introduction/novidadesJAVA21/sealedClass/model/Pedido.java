package introduction.novidadesJAVA21.sealedClass.model;

public class Pedido {
    // atributos
    private int id;
    private String item;
    private StatusPedido status;

    // construtor cheio

    public Pedido(int id, String item, StatusPedido status) {
        this.id = id;
        this.item = item;
        this.status = status;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

}
