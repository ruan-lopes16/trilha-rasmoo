package introduction.arrays.model;

public class Produto implements Comparable<Produto> { // Comparando produtos da classe Produto
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

    // equals
    @Override
    public boolean equals(Object ref) { // recebe um objeto como parâmetro, com a intenção de comparar se o objeto atual é igual ao que foi passado.

        Produto produto = (Produto) ref; // cast

        if (this.nome != produto.getNome()) {
        // se o nome for diferente do nome q estamos passamos como parametro...
            return false;
        } else {
            return true;
        }
    }

    // sobreescrevendo método de Comparable<>
    @Override
    public int compareTo(Produto outroProduto) {
        return this.nome.compareTo(outroProduto.getNome());     // comparando NOME dos Produtos criados
    }
}
