package exceptions;

import java.io.FileNotFoundException;

public class TesteCheckedExceptions {
    public static void main(String[] args) {

        try {
            exemploChecked();
        } catch (FileNotFoundException e) {
            System.out.println( "Deu ruim aqui! " + e.getMessage() );
        }
    }

    public static void exemploChecked() throws FileNotFoundException { // significa q o metodo vai lançar exceção mas nao quero tratá-lo
        throw new FileNotFoundException( "Segura a bomba ai! *FileNotFound*." );
    }

    public static void exemploUnchecked() { // compila e da problema na execução
        throw new RuntimeException( "Deu ruim! RuntimeException." );
    }
}
