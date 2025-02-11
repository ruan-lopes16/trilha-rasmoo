package introduction.novidadesJAVA21.records;

import java.util.Objects;

public class ProdutoSRecord {
    // atributos
    private String name;
    private double price;

    // construtor
    public ProdutoSRecord(String name, double price) {
        this.name = name;
        if (price < 0) {
            throw new IllegalArgumentException("O preço não pode ser menor que 0 (zero)");
        }
        this.price = price;
    }

    // getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString
    @Override
    public String toString() {
        return "Produto [ nome=" + name + ", preço=" + price + " ]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ProdutoSRecord produto)) return false;
        return Double.compare(price, produto.price) == 0 && Objects.equals(name, produto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
