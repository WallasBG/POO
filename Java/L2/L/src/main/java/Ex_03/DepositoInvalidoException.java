package Ex_03;

public class DepositoInvalidoException extends RuntimeException {
    public DepositoInvalidoException(String mensagem){
        super(mensagem);
    }
}
