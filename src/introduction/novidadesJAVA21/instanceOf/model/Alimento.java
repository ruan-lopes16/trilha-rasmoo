package introduction.novidadesJAVA21.instanceOf.model;

import java.time.LocalDate;

public final class Alimento extends Produto {
    // atributo
    private LocalDate dataValidade;
    // preco
    // nome

    // construtor
    public Alimento(String  nome, Double preco, LocalDate dataValidade) {
        super(nome, preco);

        this.dataValidade = dataValidade;
    }

    // getter
    public LocalDate getDataValidade() {
        return dataValidade;
    }
}
