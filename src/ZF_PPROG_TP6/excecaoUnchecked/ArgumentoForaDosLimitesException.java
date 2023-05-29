package ZF_PPROG_TP6.excecaoUnchecked;

public class ArgumentoForaDosLimitesException extends IllegalArgumentException {

    public ArgumentoForaDosLimitesException() {
        super("Argumento fora dos limites !!!");
    }

    public ArgumentoForaDosLimitesException(String mensagem) {
        super(mensagem);
    }

}