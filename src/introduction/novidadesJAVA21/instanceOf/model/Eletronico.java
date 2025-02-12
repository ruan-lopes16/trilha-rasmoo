package introduction.novidadesJAVA21.instanceOf.model;

public final class Eletronico extends Produto {
    // atributo
    private boolean garantia;
    // preco
    // nome

    // construtor
    public Eletronico(String  nome, Double preco, boolean garantia) {
        super(nome, preco);

        this.garantia = garantia;
    }

    public boolean isGarantia() {
        return garantia;
    }
}
