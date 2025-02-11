package introduction.orientacaoObjetos.exemploInterface;

public class Teste {
    public static void main(String[] args) {
        Salmao salmao = new Salmao();
        salmao.respirar();
        salmao.locomover();

        System.out.println("------------------------");

        Gato gato = new Gato( "Persa" );
        gato.brincar();
        gato.respirar();

        System.out.println("------------------------");

        Cachorro cachorro = new Cachorro( "Pastor Alemão" );
        cachorro.cuidar();
        cachorro.locomover();

        System.out.println("------------------------");
    }
}
