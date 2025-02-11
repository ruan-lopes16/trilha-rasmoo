package introduction.orientacaoObjetos.exemploInterface;

public class Gato extends Mamifero implements Estimacao {

    private String raca; // caracteristica propria

    // construtor
    public Gato( String raca ) {
        this.raca = raca;
    }

    // Override - sobrescrita
    @Override
    public void amamentar() {}

    @Override
    public void alimentar() {}

    @Override
    public void locomover() {}

    // implements da interface Estimacao - sobrescrita de metodo
    @Override
    public void brincar() {
        System.out.println( "Brinca com bola de lã" );
    }

    @Override
    public void passear() {}

    // getter e setter
    public String getRaca() {
        return raca;
    }

    public void setRaca( String raca ) {
        this.raca = raca;
    }
}
