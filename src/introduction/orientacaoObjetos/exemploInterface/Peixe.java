package introduction.orientacaoObjetos.exemploInterface;

public abstract class Peixe extends Animal { // tambem abstrato, pois ainda é muito abrangente

    // sobrescrita dos comportamentos de Aninal
    @Override
    public void respirar() {
        System.out.println( "Respiração branquial" );
    }

    @Override
    public void locomover() {
        System.out.println( "Nadadeiras" );
    }
}
