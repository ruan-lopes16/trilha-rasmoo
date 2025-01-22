package orientacaoObjetos.exemploInterface;

public abstract class Mamifero extends Animal { // tambem abstrato, pois ainda é muito abrangente

    // comportamento proprio - sem padrao - precisa ser implementado
    public abstract void amamentar();

    // @Override
    @Override
    public void respirar() {
        System.out.println( "Respiração pulmonar" );
    }
}
