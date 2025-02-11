package introduction.exceptions;

public class SaldoInsuficienteException extends RuntimeException {

    // construtor da exception
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
