package orientacaoObjetos.exemploInterface;

public class Cachorro extends Mamifero implements Estimacao, Domestico { // consigo ter mais de 1 implements em minha classe

    // atributos proprios
    private String raca;
    private String porte;

    // construtores - SOBRECARGA*
    public Cachorro( String raca ) {
        this.raca = raca;
    }

    public Cachorro( String raca, String porte ) {
        this.raca = raca;
        this.porte = porte;
    }

    // @Override
    @Override
    public void alimentar() {}

    @Override
    public void respirar() {}

    @Override
    public void locomover() {
        System.out.println( "4 patas" );
    }

    @Override
    public void amamentar() {}

    // implements da interface Estimacao e Domestico - sobrescrita de metodo
    @Override
    public void brincar() {
        System.out.println( "Brinca com bolinha" );
    }

    @Override
    public void passear() {}

    @Override
    public void cuidar() {
        System.out.println( "Levando ao veterinário" );
    }

    // getter e setter
    // raça
    public String getRaca() {
        return raca;
    }
    public void setRaca( String raca ) {
        this.raca = raca;
    }

    // porte
    public String getPorte() {
        return porte;
    }
    public void setPorte( String porte ) {
        this.porte = porte;
    }
}
