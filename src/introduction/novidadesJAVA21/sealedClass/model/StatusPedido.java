package introduction.novidadesJAVA21.sealedClass.model;

public sealed class StatusPedido permits Processando, Pendente, Enviado, Entregue {

    // atributos
    private String descricao;

    // construtor cheio
    public StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
