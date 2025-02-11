package introduction.novidadesJAVA21.records;

public record ProdutoRecord(String name, double price) { // posso utilizar sem a criação do construtor compacto
    // construtor compacto
    public ProdutoRecord {
        if (price < 0) {
            throw new IllegalArgumentException("O preço não pode ser menor que 0 (zero)");
        }
    }
}