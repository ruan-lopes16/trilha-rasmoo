package pacotes.com.rasmoo.curso.banco.exception;

public class SaldoInsuficienteException extends RuntimeException {

    // construtor da exception
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
