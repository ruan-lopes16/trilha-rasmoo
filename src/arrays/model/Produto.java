package arrays.model;

public class Produto {
    // atributos
    private String nome;
    private double preco;

    // construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // getter
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}
