package introduction.novidadesJAVA21.instanceOf.model;

public sealed class Produto permits Eletronico, Alimento {

    // atributos
    private String nome;
    private Double preco;

    // construtor cheio
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // getter
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
